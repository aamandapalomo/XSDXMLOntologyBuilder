//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.05.09 a las 09:10:52 AM CEST 
//


package org.example.requirements;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnsuringRequirement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EnsuringRequirement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{edu.upc.dmag}Requirement"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ensured_concept" type="{edu.upc.dmag}Content"/&gt;
 *         &lt;element name="ensured_action" type="{edu.upc.dmag}action"/&gt;
 *         &lt;element name="compliance_with_standard" type="{edu.upc.dmag}Standard"/&gt;
 *         &lt;element name="ensured_property" type="{edu.upc.dmag}ContentProperty"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnsuringRequirement", propOrder = {
    "ensuredConcept",
    "ensuredAction",
    "complianceWithStandard",
    "ensuredProperty"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class EnsuringRequirement
    extends Requirement
{

    @XmlElement(name = "ensured_concept")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content ensuredConcept;
    @XmlElement(name = "ensured_action")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Action ensuredAction;
    @XmlElement(name = "compliance_with_standard")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Standard complianceWithStandard;
    @XmlElement(name = "ensured_property")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected ContentProperty ensuredProperty;

    /**
     * Obtiene el valor de la propiedad ensuredConcept.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getEnsuredConcept() {
        return ensuredConcept;
    }

    /**
     * Define el valor de la propiedad ensuredConcept.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setEnsuredConcept(Content value) {
        this.ensuredConcept = value;
    }

    /**
     * Obtiene el valor de la propiedad ensuredAction.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Action getEnsuredAction() {
        return ensuredAction;
    }

    /**
     * Define el valor de la propiedad ensuredAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setEnsuredAction(Action value) {
        this.ensuredAction = value;
    }

    /**
     * Obtiene el valor de la propiedad complianceWithStandard.
     * 
     * @return
     *     possible object is
     *     {@link Standard }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Standard getComplianceWithStandard() {
        return complianceWithStandard;
    }

    /**
     * Define el valor de la propiedad complianceWithStandard.
     * 
     * @param value
     *     allowed object is
     *     {@link Standard }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setComplianceWithStandard(Standard value) {
        this.complianceWithStandard = value;
    }

    /**
     * Obtiene el valor de la propiedad ensuredProperty.
     * 
     * @return
     *     possible object is
     *     {@link ContentProperty }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public ContentProperty getEnsuredProperty() {
        return ensuredProperty;
    }

    /**
     * Define el valor de la propiedad ensuredProperty.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentProperty }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setEnsuredProperty(ContentProperty value) {
        this.ensuredProperty = value;
    }

}
