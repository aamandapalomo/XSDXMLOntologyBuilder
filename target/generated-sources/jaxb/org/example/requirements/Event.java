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
 * <p>Clase Java para Event complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Event"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="general_event" type="{edu.upc.dmag}GeneralEvent"/&gt;
 *           &lt;element name="change_event" type="{edu.upc.dmag}ChangeEvent"/&gt;
 *           &lt;element name="content_identification_event" type="{edu.upc.dmag}ContentIdentificationEvent"/&gt;
 *           &lt;element name="failure_event" type="{edu.upc.dmag}FailureEvent"/&gt;
 *           &lt;element name="success_event" type="{edu.upc.dmag}SuccessEvent"/&gt;
 *           &lt;element name="action_performed_event" type="{edu.upc.dmag}ActionPerformedEvent"/&gt;
 *           &lt;element name="disclosure_event" type="{edu.upc.dmag}DisclosureEvent"/&gt;
 *           &lt;element name="safety_related_incident" type="{edu.upc.dmag}SafetyRelatedIncident"/&gt;
 *           &lt;element name="security_related_incident" type="{edu.upc.dmag}SecurityRelatedIncident"/&gt;
 *           &lt;element name="compromission_event" type="{edu.upc.dmag}CompromissionEvent"/&gt;
 *           &lt;element name="corruption_event" type="{edu.upc.dmag}CorruptionEvent"/&gt;
 *           &lt;element name="attack_event" type="{edu.upc.dmag}AttackEvent"/&gt;
 *           &lt;element name="decommissioning_event" type="{edu.upc.dmag}DecommissioningEvent"/&gt;
 *           &lt;element name="out_of_boundaries_event" type="{edu.upc.dmag}OutOfBoundariesEvent"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event", propOrder = {
    "generalEvent",
    "changeEvent",
    "contentIdentificationEvent",
    "failureEvent",
    "successEvent",
    "actionPerformedEvent",
    "disclosureEvent",
    "safetyRelatedIncident",
    "securityRelatedIncident",
    "compromissionEvent",
    "corruptionEvent",
    "attackEvent",
    "decommissioningEvent",
    "outOfBoundariesEvent"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class Event {

    @XmlElement(name = "general_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected GeneralEvent generalEvent;
    @XmlElement(name = "change_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected ChangeEvent changeEvent;
    @XmlElement(name = "content_identification_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected ContentIdentificationEvent contentIdentificationEvent;
    @XmlElement(name = "failure_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected FailureEvent failureEvent;
    @XmlElement(name = "success_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected SuccessEvent successEvent;
    @XmlElement(name = "action_performed_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected ActionPerformedEvent actionPerformedEvent;
    @XmlElement(name = "disclosure_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected DisclosureEvent disclosureEvent;
    @XmlElement(name = "safety_related_incident")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected SafetyRelatedIncident safetyRelatedIncident;
    @XmlElement(name = "security_related_incident")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected SecurityRelatedIncident securityRelatedIncident;
    @XmlElement(name = "compromission_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected CompromissionEvent compromissionEvent;
    @XmlElement(name = "corruption_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected CorruptionEvent corruptionEvent;
    @XmlElement(name = "attack_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected AttackEvent attackEvent;
    @XmlElement(name = "decommissioning_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected DecommissioningEvent decommissioningEvent;
    @XmlElement(name = "out_of_boundaries_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected OutOfBoundariesEvent outOfBoundariesEvent;

    /**
     * Obtiene el valor de la propiedad generalEvent.
     * 
     * @return
     *     possible object is
     *     {@link GeneralEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public GeneralEvent getGeneralEvent() {
        return generalEvent;
    }

    /**
     * Define el valor de la propiedad generalEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setGeneralEvent(GeneralEvent value) {
        this.generalEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad changeEvent.
     * 
     * @return
     *     possible object is
     *     {@link ChangeEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public ChangeEvent getChangeEvent() {
        return changeEvent;
    }

    /**
     * Define el valor de la propiedad changeEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setChangeEvent(ChangeEvent value) {
        this.changeEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad contentIdentificationEvent.
     * 
     * @return
     *     possible object is
     *     {@link ContentIdentificationEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public ContentIdentificationEvent getContentIdentificationEvent() {
        return contentIdentificationEvent;
    }

    /**
     * Define el valor de la propiedad contentIdentificationEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentIdentificationEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setContentIdentificationEvent(ContentIdentificationEvent value) {
        this.contentIdentificationEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad failureEvent.
     * 
     * @return
     *     possible object is
     *     {@link FailureEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public FailureEvent getFailureEvent() {
        return failureEvent;
    }

    /**
     * Define el valor de la propiedad failureEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setFailureEvent(FailureEvent value) {
        this.failureEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad successEvent.
     * 
     * @return
     *     possible object is
     *     {@link SuccessEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public SuccessEvent getSuccessEvent() {
        return successEvent;
    }

    /**
     * Define el valor de la propiedad successEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setSuccessEvent(SuccessEvent value) {
        this.successEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad actionPerformedEvent.
     * 
     * @return
     *     possible object is
     *     {@link ActionPerformedEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public ActionPerformedEvent getActionPerformedEvent() {
        return actionPerformedEvent;
    }

    /**
     * Define el valor de la propiedad actionPerformedEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionPerformedEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setActionPerformedEvent(ActionPerformedEvent value) {
        this.actionPerformedEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad disclosureEvent.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public DisclosureEvent getDisclosureEvent() {
        return disclosureEvent;
    }

    /**
     * Define el valor de la propiedad disclosureEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setDisclosureEvent(DisclosureEvent value) {
        this.disclosureEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad safetyRelatedIncident.
     * 
     * @return
     *     possible object is
     *     {@link SafetyRelatedIncident }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public SafetyRelatedIncident getSafetyRelatedIncident() {
        return safetyRelatedIncident;
    }

    /**
     * Define el valor de la propiedad safetyRelatedIncident.
     * 
     * @param value
     *     allowed object is
     *     {@link SafetyRelatedIncident }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setSafetyRelatedIncident(SafetyRelatedIncident value) {
        this.safetyRelatedIncident = value;
    }

    /**
     * Obtiene el valor de la propiedad securityRelatedIncident.
     * 
     * @return
     *     possible object is
     *     {@link SecurityRelatedIncident }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public SecurityRelatedIncident getSecurityRelatedIncident() {
        return securityRelatedIncident;
    }

    /**
     * Define el valor de la propiedad securityRelatedIncident.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityRelatedIncident }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setSecurityRelatedIncident(SecurityRelatedIncident value) {
        this.securityRelatedIncident = value;
    }

    /**
     * Obtiene el valor de la propiedad compromissionEvent.
     * 
     * @return
     *     possible object is
     *     {@link CompromissionEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public CompromissionEvent getCompromissionEvent() {
        return compromissionEvent;
    }

    /**
     * Define el valor de la propiedad compromissionEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link CompromissionEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setCompromissionEvent(CompromissionEvent value) {
        this.compromissionEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad corruptionEvent.
     * 
     * @return
     *     possible object is
     *     {@link CorruptionEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public CorruptionEvent getCorruptionEvent() {
        return corruptionEvent;
    }

    /**
     * Define el valor de la propiedad corruptionEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link CorruptionEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setCorruptionEvent(CorruptionEvent value) {
        this.corruptionEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad attackEvent.
     * 
     * @return
     *     possible object is
     *     {@link AttackEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public AttackEvent getAttackEvent() {
        return attackEvent;
    }

    /**
     * Define el valor de la propiedad attackEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link AttackEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setAttackEvent(AttackEvent value) {
        this.attackEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad decommissioningEvent.
     * 
     * @return
     *     possible object is
     *     {@link DecommissioningEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public DecommissioningEvent getDecommissioningEvent() {
        return decommissioningEvent;
    }

    /**
     * Define el valor de la propiedad decommissioningEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link DecommissioningEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setDecommissioningEvent(DecommissioningEvent value) {
        this.decommissioningEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad outOfBoundariesEvent.
     * 
     * @return
     *     possible object is
     *     {@link OutOfBoundariesEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public OutOfBoundariesEvent getOutOfBoundariesEvent() {
        return outOfBoundariesEvent;
    }

    /**
     * Define el valor de la propiedad outOfBoundariesEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link OutOfBoundariesEvent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setOutOfBoundariesEvent(OutOfBoundariesEvent value) {
        this.outOfBoundariesEvent = value;
    }

}
