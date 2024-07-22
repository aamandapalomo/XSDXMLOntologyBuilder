package org.example;

import org.xmlet.xsdparser.xsdelements.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexTypesExtractor {
    public static Map<String, XsdComplexType> getComplexTypes(XsdSchema schema) {
        List<XsdElement> elements = schema.getChildrenElements().toList();
        Map<String, XsdComplexType> result = new HashMap<String, XsdComplexType>();
        for (XsdElement element : elements) {
            addComplexTypesFromElement(element, result);
        }
        return result;
    }

    static void addComplexTypesFromElement(XsdElement element, Map<String, XsdComplexType> result) {
        if (element.getXsdComplexType() != null) {
            if (result.containsKey(element.getXsdComplexType().getName())) {
                return;
            }
            result.put(element.getXsdComplexType().getName(), element.getXsdComplexType());
            addComplexTypesFromComplexType(element.getXsdComplexType(), result);
        }
    }

    static void addComplexTypesFromComplexType(XsdComplexType xsdComplexType, Map<String, XsdComplexType> result) {
        if (xsdComplexType.getXsdChildElement() != null) {
            for (XsdAbstractElement abstractElement : xsdComplexType.getXsdChildElement().getXsdElements().toList()) {
                if (abstractElement instanceof XsdElement element) {
                    addComplexTypesFromElement(element, result);
                } else if (abstractElement instanceof XsdChoice choiceElement) {
                    for (XsdElement element : choiceElement.getChildrenElements().toList()) {
                        addComplexTypesFromElement(element, result);
                    }
                }
            }
            if (xsdComplexType.getChildAsSequence() != null) {
                for (XsdElement element : xsdComplexType.getChildAsSequence().getChildrenElements().toList()) {
                    addComplexTypesFromElement(element, result);
                }
            }

            if (xsdComplexType.getChildAsChoice() != null) {
                for (XsdElement element : xsdComplexType.getChildAsChoice().getChildrenElements().toList()) {
                    addComplexTypesFromElement(element, result);
                }
            }
        }

        if (xsdComplexType.getComplexContent() != null) {
            if (xsdComplexType.getComplexContent().getXsdExtension() != null && xsdComplexType.getComplexContent().getXsdExtension().getXsdChildElement() != null) {
                for (XsdAbstractElement abstractElement : xsdComplexType.getComplexContent().getXsdExtension().getXsdChildElement().getXsdElements().toList()) {
                    if (xsdComplexType.getComplexContent().getXsdExtension().getBase() != null){
                        if (xsdComplexType.getComplexContent().getXsdExtension().getBase() instanceof XsdComplexType complexType) {
                            result.put(complexType.getName(), complexType);
                            addComplexTypesFromComplexType(complexType, result);
                        }
                    }
                    if (abstractElement instanceof XsdElement element) {
                        addComplexTypesFromElement(element, result);
                    } else if (abstractElement instanceof XsdChoice choiceElement) {
                        for (XsdElement element : choiceElement.getChildrenElements().toList()) {
                            addComplexTypesFromElement(element, result);
                        }
                    }
                }
            }
        }
    }
}