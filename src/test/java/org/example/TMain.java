package org.example;

import jakarta.xml.bind.*;
import org.example.ontology.*;
import org.xmlet.xsdparser.core.XsdParser;
import org.xmlet.xsdparser.xsdelements.*;

import java.io.FileNotFoundException;
import java.util.*;

import static org.example.ComplexTypesExtractor.getComplexTypes;
import static org.example.XSDSchemaToOntologySchema.*;

public class TMain {
    public static <XsdNamedElements> void main(String[] args) throws JAXBException, FileNotFoundException {
        String filePath = "src/main/resources/input/RequirementsSchemas.xsd";
        XsdParser parserInstance1 = new XsdParser(filePath);
        ObjectFactory objectFactory = new ObjectFactory();
        RDFType root = objectFactory.createRDFType();

        List<XsdSchema> schemaList = parserInstance1.getResultXsdSchemas().toList();
        XsdSchema schema = schemaList.get(0);
        initialize_ontology(objectFactory, root);
        initialize_classes(schema, objectFactory, root);

        Map<String, XsdComplexType> complexTypes = getComplexTypes(schema);

        for (Map.Entry<String, XsdComplexType> entry : complexTypes.entrySet()) {
            String clave = entry.getKey();
            XsdComplexType complexType = entry.getValue();

            if (complexType.getXsdChildElement() == null) {
                if (complexType.getComplexContent().getXsdExtension().getXsdChildElement() instanceof XsdSequence sequence) {
                    List<XsdAbstractElement> elements_list = complexType.getComplexContent().getXsdExtension().getXsdChildElement().getXsdElements().toList();
                    for (XsdAbstractElement element : elements_list) {
                        if (element instanceof XsdChoice choice) {
                            create_choice(choice, clave, objectFactory, root);
                        }
                    }
                } else{
                    var element = complexType.getComplexContent().getXsdExtension().getXsdChildElement();
                    if (element instanceof XsdChoice choice) {
                        create_choice(choice, clave, objectFactory, root);
                    } else {
                        if (element instanceof XsdElement xsdelem && xsdelem.getXsdSimpleType() != null){
                            create_simpletype(xsdelem, clave, objectFactory, root);
                        }
                    }

                }
            } else {
                if (complexType.getXsdChildElement() instanceof XsdSequence sequence) {
                    List<XsdAbstractElement> elements_list = complexType.getXsdChildElement().getXsdElements().toList();
                    for (XsdAbstractElement element : elements_list) {
                        if (element instanceof XsdChoice choice) {
                            create_choice(choice, clave, objectFactory, root);
                        } else {
                            if (element instanceof XsdElement xsdelem && xsdelem.getXsdSimpleType() != null){
                                create_simpletype(xsdelem, clave, objectFactory, root);

                            }
                        }
                    }
                } else {
                    var element = complexType.getXsdChildElement();
                    if (element instanceof XsdChoice choice) {
                        create_choice(choice, clave, objectFactory, root);
                    }
                }
            }
        }
        calling_marshall(objectFactory, root);
    }
}
