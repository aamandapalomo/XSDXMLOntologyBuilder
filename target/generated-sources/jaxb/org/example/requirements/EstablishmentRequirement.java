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
 * <p>Clase Java para EstablishmentRequirement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EstablishmentRequirement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{edu.upc.dmag}Requirement"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="established_document" type="{edu.upc.dmag}Documentation"/&gt;
 *           &lt;element name="established_content" type="{edu.upc.dmag}Content"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="trigger_event" type="{edu.upc.dmag}Event" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstablishmentRequirement", propOrder = {
    "establishedDocument",
    "establishedContent",
    "triggerEvent"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class EstablishmentRequirement
    extends Requirement
{

    @XmlElement(name = "established_document")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Documentation establishedDocument;
    @XmlElement(name = "established_content")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content establishedContent;
    @XmlElement(name = "trigger_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Event triggerEvent;

    /**
     * Obtiene el valor de la propiedad establishedDocument.
     * 
     * @return
     *     possible object is
     *     {@link Documentation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Documentation getEstablishedDocument() {
        return establishedDocument;
    }

    /**
     * Define el valor de la propiedad establishedDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setEstablishedDocument(Documentation value) {
        this.establishedDocument = value;
    }

    /**
     * Obtiene el valor de la propiedad establishedContent.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getEstablishedContent() {
        return establishedContent;
    }

    /**
     * Define el valor de la propiedad establishedContent.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setEstablishedContent(Content value) {
        this.establishedContent = value;
    }

    /**
     * Obtiene el valor de la propiedad triggerEvent.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Event getTriggerEvent() {
        return triggerEvent;
    }

    /**
     * Define el valor de la propiedad triggerEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setTriggerEvent(Event value) {
        this.triggerEvent = value;
    }

}
