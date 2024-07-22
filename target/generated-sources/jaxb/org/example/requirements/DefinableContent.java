//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.04.05 a las 09:40:32 AM CEST 
//


package org.example.requirements;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DefinableContent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DefinableContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="general_content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="component_content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="actor" type="{edu.upc.dmag}Actor"/&gt;
 *         &lt;element name="means_for" type="{edu.upc.dmag}Means_For"/&gt;
 *         &lt;element name="property" type="{edu.upc.dmag}ContentProperty"/&gt;
 *         &lt;element name="requirement" type="{edu.upc.dmag}GeneralizedRequirement"/&gt;
 *         &lt;element name="risk" type="{edu.upc.dmag}Risk"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefinableContent", propOrder = {
    "generalContent",
    "componentContent",
    "actor",
    "meansFor",
    "property",
    "requirement",
    "risk"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
public class DefinableContent {

    @XmlElement(name = "general_content")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    protected String generalContent;
    @XmlElement(name = "component_content")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    protected String componentContent;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    protected Actor actor;
    @XmlElement(name = "means_for")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    protected MeansFor meansFor;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    protected ContentProperty property;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    protected GeneralizedRequirement requirement;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    protected Risk risk;

    /**
     * Obtiene el valor de la propiedad generalContent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    public String getGeneralContent() {
        return generalContent;
    }

    /**
     * Define el valor de la propiedad generalContent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    public void setGeneralContent(String value) {
        this.generalContent = value;
    }

    /**
     * Obtiene el valor de la propiedad componentContent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    public String getComponentContent() {
        return componentContent;
    }

    /**
     * Define el valor de la propiedad componentContent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    public void setComponentContent(String value) {
        this.componentContent = value;
    }

    /**
     * Obtiene el valor de la propiedad actor.
     * 
     * @return
     *     possible object is
     *     {@link Actor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    public Actor getActor() {
        return actor;
    }

    /**
     * Define el valor de la propiedad actor.
     * 
     * @param value
     *     allowed object is
     *     {@link Actor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    public void setActor(Actor value) {
        this.actor = value;
    }

    /**
     * Obtiene el valor de la propiedad meansFor.
     * 
     * @return
     *     possible object is
     *     {@link MeansFor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    public MeansFor getMeansFor() {
        return meansFor;
    }

    /**
     * Define el valor de la propiedad meansFor.
     * 
     * @param value
     *     allowed object is
     *     {@link MeansFor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    public void setMeansFor(MeansFor value) {
        this.meansFor = value;
    }

    /**
     * Obtiene el valor de la propiedad property.
     * 
     * @return
     *     possible object is
     *     {@link ContentProperty }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    public ContentProperty getProperty() {
        return property;
    }

    /**
     * Define el valor de la propiedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentProperty }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    public void setProperty(ContentProperty value) {
        this.property = value;
    }

    /**
     * Obtiene el valor de la propiedad requirement.
     * 
     * @return
     *     possible object is
     *     {@link GeneralizedRequirement }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    public GeneralizedRequirement getRequirement() {
        return requirement;
    }

    /**
     * Define el valor de la propiedad requirement.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralizedRequirement }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    public void setRequirement(GeneralizedRequirement value) {
        this.requirement = value;
    }

    /**
     * Obtiene el valor de la propiedad risk.
     * 
     * @return
     *     possible object is
     *     {@link Risk }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    public Risk getRisk() {
        return risk;
    }

    /**
     * Define el valor de la propiedad risk.
     * 
     * @param value
     *     allowed object is
     *     {@link Risk }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-04-05T09:40:31+02:00")
    public void setRisk(Risk value) {
        this.risk = value;
    }

}
