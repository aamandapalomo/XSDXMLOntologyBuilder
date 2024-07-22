package org.example;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.xerces.xs.ElementPSVI;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultUndirectedGraph;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xmlet.xsdparser.core.XsdParser;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.alg.clique.BronKerboschCliqueFinder;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class XSDSchemaAndXMLToOntology {
    private static Model schemaModel = ModelFactory.createDefaultModel();
    private static Model xmlModel = ModelFactory.createDefaultModel();
    private static int counter = 0;

    //public static Map<String, Map<String, String>> merged_map;

    public static NamedIndividualBuilder _mergeMultipleIndividuals(Set<NamedIndividualBuilder> individuals, Map<NamedIndividualBuilder, NamedIndividualBuilder> merged_map) {
        if (individuals.isEmpty()) return null;
        int minLength = Integer.MAX_VALUE;
        NamedIndividualBuilder shortestIndividual = null;

        for (NamedIndividualBuilder individual : individuals) {
            List<Object> names = individual.data_properties.get("name");
            if (names != null && !names.isEmpty()) {
                for (Object nameObj : names) {
                    if (nameObj instanceof String name) {
                        if (name.length() < minLength) {
                            minLength = name.length();
                            shortestIndividual = individual;
                        }
                    }
                }
            }
        }
        if (shortestIndividual == null) return null;
        NamedIndividualBuilder merged = new NamedIndividualBuilder("http://xmlns.com/foaf/0.1/", shortestIndividual.data_properties.get("name").get(0).toString(), null);
        merged.data_properties.putAll(shortestIndividual.data_properties);

        for (NamedIndividualBuilder individual : individuals) {
            individual.object_properties.forEach((key, values) -> {
                merged.object_properties.putIfAbsent(key, new ArrayList<>());
                merged.object_properties.get(key).addAll(values);
            });
            merged_map.put(individual, merged);
        }
        return merged;
    }

    public static void transform(File xmlFile, String xsdFilePath, OutputStream finalResultoutputStream) throws IOException {
        File tempFile = File.createTempFile("generatedOntologySchema-", ".xml");
        tempFile.deleteOnExit();

        try (FileOutputStream outputStream = new FileOutputStream(tempFile)) {
            XSDSchemaToOntologySchema.transform(xsdFilePath, outputStream);
        }

        XsdParser parserInstance = new XsdParser(xsdFilePath);
        final OWLOntologyManager manager = OWLManager.createConcurrentOWLOntologyManager();

        CreationContext creationContext = new CreationContext();
        try {
            final OWLOntology ontology = manager.loadOntologyFromOntologyDocument(tempFile);

            Document doc = getDocument(xmlFile);

            Element documentElement = doc.getDocumentElement();
            NodeList nodeList = documentElement.getChildNodes();
            List<NamedIndividualBuilder> builderList = new ArrayList<>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                if (nodeList.item(i) instanceof ElementPSVI element) {
                    builderList.add(new NamedIndividualBuilder(
                            "http://xmlns.com/foaf/0.1/",
                            element,
                            parserInstance
                    ));
                }
                ;
            }

            List<NamedIndividualBuilder> roots = builderList;

            Map<String, Map<String, NamedIndividualBuilder>> allInstances = NamedIndividualBuilder.getAllInstancesMap(roots);
            Map<String, Map<String, NamedIndividualBuilder>> filteredInstances = allInstances.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue().size() < 16)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            calling_llama cal = new calling_llama();
            Map<String, Map<String, NamedIndividualBuilder>> result_map = new HashMap<>();
            Map<NamedIndividualBuilder, NamedIndividualBuilder> merged_map = new HashMap<>();

            Map<String, Map<String, NamedIndividualBuilder>> preprocessedAllInstances = new HashMap<>();

            for (Map.Entry<String, Map<String, NamedIndividualBuilder>> entry : filteredInstances.entrySet()) {
                String outerKey = entry.getKey();
                Map<String, NamedIndividualBuilder> innerMap = entry.getValue();
                Map<String, NamedIndividualBuilder> cleanedInnerMap = new HashMap<>();

                for (Map.Entry<String, NamedIndividualBuilder> innerEntry : innerMap.entrySet()) {
                    String cleanedKey = innerEntry.getKey().replace("\n", " ").replaceAll("\\s+", " ").trim();

                    cleanedInnerMap.put(cleanedKey, innerEntry.getValue());
                }

                preprocessedAllInstances.put(outerKey, cleanedInnerMap);
            }
            for (Map.Entry<String, Map<String, NamedIndividualBuilder>> entry : preprocessedAllInstances.entrySet()) {
                Graph<String, DefaultEdge> undirectedGraph = new DefaultUndirectedGraph<>(DefaultEdge.class);
                List<String> keys_fil = new ArrayList<>(entry.getValue().keySet());

                if (!result_map.containsKey(entry.getKey())) {
                    result_map.put(entry.getKey(), new HashMap<>());
                }

                if (entry.getValue().size() == 1) {
                    String key = entry.getValue().keySet().iterator().next();
                    NamedIndividualBuilder builder = entry.getValue().get(key);
                    Map<String, NamedIndividualBuilder> newMap = new HashMap<>();
                    newMap.put(key, builder);
                    String singleInstance = keys_fil.getFirst();
                    undirectedGraph.addVertex(singleInstance);
                }
                for (int i = 0; i < keys_fil.size(); i++) {
                    for (int j = i + 1; j < keys_fil.size(); j++) {
                        String firstInstance = keys_fil.get(i);
                        String secondInstance = keys_fil.get(j);

                        String question = "Can I merge instances " + firstInstance + " and " + secondInstance + "?";

                        boolean resp = Boolean.parseBoolean(cal.question_text(question));
                        undirectedGraph.addVertex(firstInstance);
                        undirectedGraph.addVertex(secondInstance);
                        System.out.println(entry.getKey());
                        if (resp) {
                            undirectedGraph.addEdge(firstInstance, secondInstance);
                        }
                    }
                }
                BronKerboschCliqueFinder<String, DefaultEdge> cliqueFinder = new BronKerboschCliqueFinder<>(undirectedGraph);
                Iterator<Set<String>> cliques = cliqueFinder.iterator();
                System.out.println("Maximal cliques for instance " + entry.getKey() + " : ");

                Set<String> firstClique = cliques.next();
                System.out.println("First clique: " + firstClique);

                List<String> mergedNodes = new ArrayList<>(firstClique);
                Set<NamedIndividualBuilder> buildersToMerge = new HashSet<>();

                for (String node : mergedNodes) {
                    buildersToMerge.add(entry.getValue().get(node));
                    System.out.println("Nodes_to_merge: " + node);
                }

                NamedIndividualBuilder build_merg = _mergeMultipleIndividuals(buildersToMerge, merged_map);
                String merge_name = build_merg.getClassName();
                if (build_merg != null) {
                    result_map.get(entry.getKey()).put(merge_name, build_merg);
                }

                if (cliques.hasNext()) {
                    while (cliques.hasNext()) {
                        Set<String> clique = cliques.next();
                        System.out.println("Other clique: " + clique);

                        boolean canMerge = true;
                        Set<NamedIndividualBuilder> otherbuildersToMerge = new HashSet<>();
                        for (String node : clique) {
                            if (mergedNodes.contains(node)) {
                                canMerge = false;
                                System.out.println("Cannot merge: " + node);
                            } else {
                                otherbuildersToMerge.add(entry.getValue().get(node));
                            }
                        }

                        NamedIndividualBuilder anot_build_merg = _mergeMultipleIndividuals(otherbuildersToMerge, merged_map);
                        String merge_anot_name = anot_build_merg.getClassName();
                        if (build_merg != null) {
                            result_map.get(entry.getKey()).put(merge_anot_name, anot_build_merg);
                        }
                        mergedNodes = new ArrayList<>(clique);
                    }
                }
                System.out.println();
            }
            for (Map<String, NamedIndividualBuilder> entry : allInstances.values()) {
                for (NamedIndividualBuilder named : entry.values()) {
                    for (var name_to_entryset : named.object_properties.entrySet()) {
                        named.object_properties.put(name_to_entryset.getKey(), name_to_entryset.getValue().stream().map(it -> {
                            return merged_map.getOrDefault(it, it);
                        }).toList());
                    }
                }
            }
            builderList.forEach(it -> it.build(ontology, creationContext));
            ontology.saveOntology(finalResultoutputStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Document getDocument(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        dbf.setValidating(true);
        dbf.setAttribute("http://apache.org/xml/features/validation/schema", Boolean.TRUE);
        dbf.setAttribute(
                "http://apache.org/xml/properties/dom/document-class-name",
                "org.apache.xerces.dom.PSVIDocumentImpl"
        );
        DocumentBuilder db = dbf.newDocumentBuilder();
        db.getSchema();

        return db.parse(xmlFile);
    }

    public static boolean validateDom(File xmlFile, File xsdFile) throws IOException, SAXException, ParserConfigurationException {
        //SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/XML/XMLSchema/v1.1");
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(xsdFile);

        Validator validator = schema.newValidator();

        // DOMSource
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document doc = db.parse(xmlFile);
        DOMSource source = new DOMSource(doc);
        //source.setSystemId(systemId);
        try {
            validator.validate(source);
            return true;
        } catch (Exception e) {
            System.out.println(xmlFile.getName() + " is not valid because ");
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean validateFile(File xmlFile, File xsdFile) throws SAXException, IOException {
        // 1. Lookup a factory for the W3C XML Schema language
        //SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/XML/XMLSchema/v1.1");
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        // 2. Compile the schema.
        Schema schema = factory.newSchema(xsdFile);

        // 3. Get a validator from the schema.
        Validator validator = schema.newValidator();

        // 4. Parse the document you want to check.
        Source source = new StreamSource(xmlFile);

        // 5. Check the document
        try {
            validator.validate(source);
            return true;
        } catch (SAXException ex) {
            System.out.println(xmlFile.getName() + " is not valid because ");
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
