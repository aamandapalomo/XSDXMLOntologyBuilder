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
 * <p>Clase Java para DocumentationRequirement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentationRequirement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{edu.upc.dmag}Requirement"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="documented_content" type="{edu.upc.dmag}Content"/&gt;
 *           &lt;element name="documented_action" type="{edu.upc.dmag}action"/&gt;
 *           &lt;element name="documented_actor" type="{edu.upc.dmag}Actor"/&gt;
 *           &lt;element name="documented_event" type="{edu.upc.dmag}Event"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="document_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recipient" type="{edu.upc.dmag}Actor" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentationRequirement", propOrder = {
    "documentedContent",
    "documentedAction",
    "documentedActor",
    "documentedEvent",
    "documentName",
    "recipient"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class DocumentationRequirement
    extends Requirement
{

    @XmlElement(name = "documented_content")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content documentedContent;
    @XmlElement(name = "documented_action")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Action documentedAction;
    @XmlElement(name = "documented_actor")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Actor documentedActor;
    @XmlElement(name = "documented_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Event documentedEvent;
    @XmlElement(name = "document_name")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected String documentName;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Actor recipient;

    /**
     * Obtiene el valor de la propiedad documentedContent.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getDocumentedContent() {
        return documentedContent;
    }

    /**
     * Define el valor de la propiedad documentedContent.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setDocumentedContent(Content value) {
        this.documentedContent = value;
    }

    /**
     * Obtiene el valor de la propiedad documentedAction.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Action getDocumentedAction() {
        return documentedAction;
    }

    /**
     * Define el valor de la propiedad documentedAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setDocumentedAction(Action value) {
        this.documentedAction = value;
    }

    /**
     * Obtiene el valor de la propiedad documentedActor.
     * 
     * @return
     *     possible object is
     *     {@link Actor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Actor getDocumentedActor() {
        return documentedActor;
    }

    /**
     * Define el valor de la propiedad documentedActor.
     * 
     * @param value
     *     allowed object is
     *     {@link Actor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setDocumentedActor(Actor value) {
        this.documentedActor = value;
    }

    /**
     * Obtiene el valor de la propiedad documentedEvent.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Event getDocumentedEvent() {
        return documentedEvent;
    }

    /**
     * Define el valor de la propiedad documentedEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setDocumentedEvent(Event value) {
        this.documentedEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad documentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Define el valor de la propiedad documentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setDocumentName(String value) {
        this.documentName = value;
    }

    /**
     * Obtiene el valor de la propiedad recipient.
     * 
     * @return
     *     possible object is
     *     {@link Actor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Actor getRecipient() {
        return recipient;
    }

    /**
     * Define el valor de la propiedad recipient.
     * 
     * @param value
     *     allowed object is
     *     {@link Actor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setRecipient(Actor value) {
        this.recipient = value;
    }

}
