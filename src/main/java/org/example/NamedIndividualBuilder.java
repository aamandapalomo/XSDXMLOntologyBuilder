package org.example;

import ch.qos.logback.core.BasicStatusManager;
import org.apache.xerces.dom.PSVIElementNSImpl;
import org.apache.xerces.impl.xs.*;
import org.apache.xerces.xs.ElementPSVI;
import org.apache.xerces.xs.XSElementDeclaration;
import org.apache.xerces.xs.XSModelGroup;
import org.semanticweb.owlapi.model.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xmlet.xsdparser.core.XsdParser;
import uk.ac.manchester.cs.owl.owlapi.*;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.util.*;

public class NamedIndividualBuilder {
    private static int counter = 0;

    private final int id = counter++;

    private final OWLDataFactory df = new OWLDataFactoryImpl();
    final Map<String, List<Object>> data_properties = new LinkedHashMap<>();
    final Map<String, List<NamedIndividualBuilder>> object_properties = new LinkedHashMap<>();

    private final Map<Object, List<Object>> structure = new LinkedHashMap<>();
    private final String namespace;
    private final String className;
    private String nameOfBuild;
    private OWLNamedIndividual owLNamedIndividual;
    private final Set<String> choiceNames;

    public NamedIndividualBuilder(String namespace, String className, XsdParser parserInstance){
        this.namespace = namespace;
        this.className = className;
        this.choiceNames = new HashSet<>();
    }

    public String getClassName() {
        return className;
    }

    public NamedIndividualBuilder(String namespace, ElementPSVI psviElem, XsdParser parserInstance) throws ParserConfigurationException, IOException, SAXException {
        this(namespace, psviElem.getTypeDefinition().getName(), parserInstance);

        boolean isTheOneOfInterest = false;
        if (((PSVIElementNSImpl)psviElem).getElementsByTagName("name").getLength() > 0 && ((PSVIElementNSImpl)psviElem).getElementsByTagName("name").item(0).getTextContent().contains("Requirement that the medical it-net risk manager shall establish a medical it-net risk manag file")){
            isTheOneOfInterest = true;
        }

        XSElementDeclaration decl = psviElem.getElementDeclaration();

        if (decl.getTypeDefinition() instanceof XSComplexTypeDecl xsComplexTypeDecl){
            var particle = xsComplexTypeDecl.getParticle();
            particle.getAnnotations();
            if (xsComplexTypeDecl.getParticle().getTerm() instanceof XSModelGroupImpl xsModelGroup){
                if (xsModelGroup.getCompositor() == XSModelGroup.COMPOSITOR_CHOICE) {
                    var choiceName = getAppInfoValue(xsModelGroup);
                    for (XSParticleDecl xsParticleDecl: xsModelGroup.fParticles) {
                        if (xsParticleDecl.fValue instanceof XSElementDecl xsElementDecl1) {
                            var nodeList = getChildrenByTagNameNS((PSVIElementNSImpl) psviElem, xsElementDecl1.fTargetNamespace, xsElementDecl1.fName);
                            for (Node child_node : nodeList) {
                                NamedIndividualBuilder namedIndividualBuilder = new NamedIndividualBuilder(
                                        namespace,
                                        (ElementPSVI) (child_node),
                                        parserInstance
                                );
                                addObjectProperty(choiceName, namedIndividualBuilder);
                                addToChoiceProperty(choiceName);
                            }
                        }
                    }
                } else {
                    for (XSParticleDecl childParticle : xsModelGroup.fParticles) {
                        if (childParticle.fValue instanceof XSElementDecl xsElementDecl) {
                            populateWithParticle(namespace, (PSVIElementNSImpl) psviElem, childParticle, xsElementDecl, parserInstance);
                        } else if (childParticle.fValue instanceof XSModelGroupImpl xsModelGroup1) {
                            if (xsModelGroup1.getCompositor() == XSModelGroup.COMPOSITOR_CHOICE){

                                var choiceName = getAppInfoValue(xsModelGroup1);
                                for (XSParticleDecl xsParticleDecl: xsModelGroup1.fParticles) {
                                    if (xsParticleDecl.fValue instanceof XSElementDecl xsElementDecl1) {
                                        var nodeList = getChildrenByTagNameNS((PSVIElementNSImpl) psviElem, xsElementDecl1.fTargetNamespace, xsElementDecl1.fName);
                                        for (Node child_node : nodeList) {
                                            NamedIndividualBuilder namedIndividualBuilder = new NamedIndividualBuilder(
                                                    namespace,
                                                    (ElementPSVI) (child_node),
                                                    parserInstance
                                            );
                                            addObjectProperty(choiceName, namedIndividualBuilder);
                                            addToChoiceProperty(choiceName);
                                        }
                                    }
                                }

                            } else {
                                if (psviElem.getTypeDefinition().getBaseType() != null && !psviElem.getTypeDefinition().getBaseType().getNamespace().equals("http://www.w3.org/2001/XMLSchema")) {
                                    for (var particleFromExtension : xsModelGroup1.getParticles()) {
                                        if (particleFromExtension instanceof XSParticleDecl particleFromExtensionDecl) {
                                            if (particleFromExtensionDecl.fValue instanceof XSElementDecl xsElementDecl) {
                                                populateWithParticle(namespace, (PSVIElementNSImpl) psviElem, particleFromExtensionDecl, xsElementDecl, parserInstance);
                                            } else if (particleFromExtensionDecl.fValue instanceof XSModelGroupImpl xsModelGroup2) {
                                                populateWithModelGroup(namespace, (PSVIElementNSImpl) psviElem, childParticle, xsModelGroup2, parserInstance);
                                            }
                                        }
                                    }

                                } else {
                                    populateWithModelGroup(namespace, (PSVIElementNSImpl) psviElem, childParticle, xsModelGroup1, parserInstance);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void populateWithModelGroup(String namespace, PSVIElementNSImpl psviElem, XSParticleDecl childParticle, XSModelGroupImpl xsModelGroup, XsdParser parserInstance) throws ParserConfigurationException, IOException, SAXException {
        if (xsModelGroup.getCompositor() == XSModelGroup.COMPOSITOR_CHOICE) {
            var choiceName = getAppInfoValue(xsModelGroup);
            for (XSParticleDecl xsParticleDecl: xsModelGroup.fParticles) {
                if (xsParticleDecl.fValue instanceof XSElementDecl xsElementDecl1) {
                    var nodeList = getChildrenByTagNameNS(psviElem, xsElementDecl1.fTargetNamespace, xsElementDecl1.fName);
                    for (Node child_node : nodeList) {
                        NamedIndividualBuilder namedIndividualBuilder = new NamedIndividualBuilder(
                                namespace,
                                (ElementPSVI) (child_node),
                                parserInstance
                        );
                        addObjectProperty(choiceName, namedIndividualBuilder);
                        addToChoiceProperty(choiceName);
                    }
                }
            }
        } else {
            for (XSParticleDecl xsParticleDecl : xsModelGroup.fParticles) {
                if (xsParticleDecl.fValue instanceof XSElementDecl xsElementDecl1) {
                    var nodeList = getChildrenByTagNameNS(psviElem, xsElementDecl1.fTargetNamespace, xsElementDecl1.fName);
                    for (Node node : nodeList) {
                        if (childParticle.fValue instanceof XSModelGroupImpl modelGroup) {
                            populateWithModelGroup(namespace, (PSVIElementNSImpl) node, childParticle, modelGroup, parserInstance);
                        } else {
                            populateWithParticle(namespace, (PSVIElementNSImpl) node, xsParticleDecl, xsElementDecl1, parserInstance);
                        }
                    }
                }
            }
        }
    }

    private void addToChoiceProperty(String choiceName) {
        choiceNames.add(choiceName);
    }

    private void populateWithParticle(String namespace, PSVIElementNSImpl psviElem, XSParticleDecl childParticle, XSElementDecl xsElementDecl, XsdParser parserInstance) throws ParserConfigurationException, IOException, SAXException {
        String childElementName = xsElementDecl.fName;
        String childElementNamespace = xsElementDecl.fTargetNamespace;
        String childElementTypeName = xsElementDecl.fType.getName();
        String childElementTypeNamespace = xsElementDecl.fType.getNamespace();

        if (childElementTypeNamespace.equalsIgnoreCase("http://www.w3.org/2001/XMLSchema")) {
            if (childElementTypeName.equalsIgnoreCase("string")) {
                var children_of_type = getChildrenByTagNameNS(psviElem, childElementNamespace, childElementName);
                for (Node child_node: children_of_type) {
                    addDataProperty(
                            child_node.getLocalName(),
                            child_node.getFirstChild().getNodeValue()
                    );
                }
            } else if (childElementTypeName.equalsIgnoreCase("integer")) {
                var children_of_type = getChildrenByTagNameNS(psviElem, childElementNamespace, childElementName);
                for (Node child_node: children_of_type) {
                    addDataProperty(
                            child_node.getLocalName(),
                            Integer.parseInt(child_node.getFirstChild().getNodeValue())
                    );
                }
            }
        } else if (childParticle.fValue instanceof XSElementDecl xsElementDecl1 && !
                xsElementDecl1.fType.getNamespace().equals("http://www.w3.org/2001/XMLSchema")) {
            var children_of_type = getChildrenByTagNameNS(psviElem, childElementNamespace, childElementName);
            for (Node child_node: children_of_type) {
                 if (xsElementDecl1.fType.getBaseType().getName().equals("string")){
                    addDataProperty(child_node.getLocalName(), child_node.getFirstChild().getNodeValue());
                } else {
                    NamedIndividualBuilder namedIndividualBuilder = new NamedIndividualBuilder(
                            namespace,
                            (ElementPSVI) child_node,
                            parserInstance
                    );
                    addObjectProperty(child_node.getLocalName(), namedIndividualBuilder);
                }
            }
        }  else if (childParticle.fValue instanceof XSElementDecl xsElementDecl1 && !
                xsElementDecl1.fType.getNamespace().equals("http://www.w3.org/2001/XMLSchema")) {
            var children_of_type = getChildrenByTagNameNS(psviElem, childElementNamespace, childElementName);
            for (Node child_node: children_of_type) {
                NamedIndividualBuilder namedIndividualBuilder = new NamedIndividualBuilder(
                        namespace,
                        (ElementPSVI) child_node,
                        parserInstance
                );
                addObjectProperty(child_node.getLocalName(), namedIndividualBuilder);
            }
        } else if (childParticle.fValue instanceof XSModelGroupImpl xsModelGroup){
            populateWithModelGroup(namespace, psviElem, childParticle, xsModelGroup, parserInstance);
        }
    }

    private static List<Node> getChildrenByTagNameNS(PSVIElementNSImpl psviElem, String childElementNamespace, String childElementName) {
        var tentativeResult = psviElem.getElementsByTagNameNS(childElementNamespace, childElementName);
        List<Node> result = new ArrayList<>();
        for (int i=0; i<tentativeResult.getLength(); i++){
            var tentativeNode = tentativeResult.item(i);
            if (tentativeNode.getParentNode() == psviElem){
                result.add(tentativeNode);
            }
        }
        return result;
    }

    private String getAppInfoValue(XSModelGroupImpl xsModelGroup) throws ParserConfigurationException, IOException, SAXException {
        var annotationString = xsModelGroup.getAnnotation().getAnnotationString();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(annotationString));
        Document document = builder.parse(is);
        return document.getDocumentElement().getElementsByTagName("xs:appinfo").item(0).getTextContent();
    }

    void addDataProperty(String name, Object value){
        data_properties.putIfAbsent(name, new ArrayList<>());
        data_properties.get(name).add(value);
        structure.putIfAbsent(name, new ArrayList<>());
        structure.get(name).add(value);
    }

    private void addObjectProperty(String name, NamedIndividualBuilder value){
        object_properties.putIfAbsent(name, new ArrayList<>());
        object_properties.get(name).add(value);
        structure.putIfAbsent(name, new ArrayList<>());
        structure.get(name).add(value.structure);
    }

    private AddAxiom buildDataPropertyInteger(OWLDataProperty property, OWLOntology ontology, OWLDataFactory df, OWLIndividual individual, int value){
        OWLLiteral literal = df.getOWLLiteral(String.valueOf(value), OWL2Datatype.XSD_INT);
        return new AddAxiom(ontology, df.getOWLDataPropertyAssertionAxiom(property, individual, literal));
    }

    private AddAxiom buildDataPropertyString(OWLDataProperty property, OWLOntology ontology, OWLDataFactory df, OWLIndividual individual, String value){
        OWLLiteral literal = df.getOWLLiteral(String.valueOf(value));
        return new AddAxiom(ontology, df.getOWLDataPropertyAssertionAxiom(property, individual, literal));
    }

    public void build(OWLOntology model, CreationContext creationContext){
        if (creationContext.getInstanceName(structure) != null){
            setNameOfBuild(namespace+creationContext.getInstanceName(structure));
            return;
        }
        String individualName = getName(creationContext);
        creationContext.addInstanceName(structure, individualName);

        OWLNamedIndividual individual = df.getOWLNamedIndividual(namespace+individualName);
        setNameOfBuild(namespace+individualName);
        setOwLNamedIndividual(individual);

        List<OWLAxiomChange> axioms = new ArrayList<>();
        OWLClass clazz = df.getOWLClass(namespace+className);
        axioms.add(new AddAxiom(model, df.getOWLClassAssertionAxiom(clazz, individual)));


        for(var dataPropertyMapEntry : data_properties.entrySet()){
            for (var dataPropertyEntry: dataPropertyMapEntry.getValue()) {
                var property = df.getOWLDataProperty(namespace + dataPropertyMapEntry.getKey());
                if (dataPropertyEntry instanceof Integer integerValue) {
                    axioms.add(buildDataPropertyInteger(property, model, df, individual, integerValue));
                } else if (dataPropertyEntry instanceof String stringValue) {
                    axioms.add(buildDataPropertyString(property, model, df, individual, stringValue));
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }

        build_children(model, creationContext);

        for(var objectPropertyMapEntry : object_properties.entrySet()){
            for(var objectPropertyEntry: objectPropertyMapEntry.getValue()) {
                OWLObjectPropertyExpression propertyExpression = new OWLObjectPropertyImpl(IRI.create(namespace, objectPropertyMapEntry.getKey()));
                OWLNamedIndividual to = objectPropertyEntry.getOwLNamedIndividual();
                axioms.add(buildObjectProperty(propertyExpression, individual, to, model, df));
            }
        }

        for(OWLAxiomChange axiomChange: axioms) {
            model.applyChanges(axiomChange);
        }

    }

    private AddAxiom buildObjectProperty(OWLObjectPropertyExpression property, OWLIndividual from, OWLIndividual to, OWLOntology ontology, OWLDataFactory df){
        var axiom = df.getOWLObjectPropertyAssertionAxiom(property, from, to/*, annotations*/);
        return new AddAxiom(ontology, axiom);
    }

    private void build_children(OWLOntology model, CreationContext creationContext) {
        for (var mapEntry: object_properties.entrySet()){
            for (var entry: mapEntry.getValue()) {
                entry.build(model, creationContext);
            }
        }
    }

    private String getName(CreationContext creationContext) {
        String tentativeIndividualName = this.className.replaceAll("Type","")+"Instance";

        int count = 0;
        while(creationContext.instanceNameIsUsed(tentativeIndividualName+ count)){
            count++;
        }
        tentativeIndividualName += count;

        return tentativeIndividualName;
    }

    public String getNameOfBuild() {
        if (nameOfBuild == null){
            throw new IllegalArgumentException();
        }
        return nameOfBuild;
    }

    public void setNameOfBuild(String nameOfBuild) {
        this.nameOfBuild = nameOfBuild;
    }

    public void setOwLNamedIndividual(OWLNamedIndividual owLNamedIndividual) {
        this.owLNamedIndividual = owLNamedIndividual;
    }

    public OWLNamedIndividual getOwLNamedIndividual() {
        if (owLNamedIndividual == null) {
            owLNamedIndividual = df.getOWLNamedIndividual(getNameOfBuild());

        }
        return owLNamedIndividual;
    }

    public static Map<String, Map<String, NamedIndividualBuilder>> getAllInstancesMap(List<NamedIndividualBuilder> roots) {
        Map<String, Map<String, NamedIndividualBuilder>> allInstances = new HashMap<>();
        if (roots == null) {
            return allInstances;
        }

        for (NamedIndividualBuilder root : roots) {
            root.addToMap(allInstances);
        }

        return allInstances;
    }

    private void addToMap(Map<String, Map<String, NamedIndividualBuilder>> allInstances) {
        for (List<NamedIndividualBuilder> childList : object_properties.values()) {
            for (NamedIndividualBuilder child : childList) {
                child.addToMap(allInstances);
            }
        }

        if(className.toLowerCase().contains("requirement")){return;}
        if(data_properties.get("name")==null){return;}
        String nameOfBuild = (String) data_properties.get("name").getFirst();

        if(!allInstances.containsKey(className)){
           allInstances.put(className, new HashMap<>());
        }
        allInstances.get(className).put(nameOfBuild, this);

    }

}
