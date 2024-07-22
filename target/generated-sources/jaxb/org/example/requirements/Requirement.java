//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.05.09 a las 09:10:52 AM CEST 
//


package org.example.requirements;

import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Requirement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Requirement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="note_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actor" type="{edu.upc.dmag}Actor"/&gt;
 *         &lt;element name="using" type="{edu.upc.dmag}using_type" minOccurs="0"/&gt;
 *         &lt;element name="related_event" type="{edu.upc.dmag}Event" minOccurs="0"/&gt;
 *         &lt;element name="condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="when" type="{edu.upc.dmag}When" minOccurs="0"/&gt;
 *         &lt;element name="prior_to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="goal" type="{edu.upc.dmag}Goal" minOccurs="0"/&gt;
 *         &lt;element name="trigger_implemented_asset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requirement_origin" type="{edu.upc.dmag}RequirementOrigins" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="invalidating_CVE" type="{edu.upc.dmag}CVE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Requirement", propOrder = {
    "name",
    "noteName",
    "actor",
    "using",
    "relatedEvent",
    "condition",
    "when",
    "priorTo",
    "goal",
    "triggerImplementedAsset",
    "requirementOrigin",
    "invalidatingCVE"
})
@XmlSeeAlso({
    DocumentationRequirement.class,
    PublishRequirement.class,
    EnsuringRequirement.class,
    DesignGoalRequirement.class,
    ProvisioningDesignGoalRequirement.class,
    AvoidingEventDesignRequirement.class,
    DefinitionRequirement.class,
    MaintenanceRequirement.class,
    ImplementationRequirement.class,
    CommunicationRequirement.class,
    VerificationRequirement.class,
    ValidationRequirement.class,
    IdentificationRequirement.class,
    MonitoringRequirement.class,
    MitigationRequirement.class,
    FollowingRequirement.class,
    ManagingRequirement.class,
    EstablishmentRequirement.class,
    EvaluationRequirement.class,
    ConsiderationRequirement.class,
    PerformingRequirement.class,
    ProhibitedPerformingRequirement.class,
    ConfirmationRequirement.class,
    CollaborationRequirement.class,
    ImplementCommunicationRequirement.class,
    ProhibitedImplementationRequirement.class,
    OrganizationPropertyRequirement.class,
    OrganizationRequirement.class,
    OrganizationControlRequirement.class,
    ArchivalRequirement.class,
    DeterminationRequirement.class,
    InformationCollectionRequirement.class,
    DemonstrationRequirement.class,
    FacilitationRequirement.class,
    ProtectionRequirement.class,
    DefenceAgainstRequirement.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class Requirement {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected String name;
    @XmlElement(name = "note_name")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected String noteName;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Actor actor;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected UsingType using;
    @XmlElement(name = "related_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Event relatedEvent;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected String condition;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected When when;
    @XmlElement(name = "prior_to")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected String priorTo;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Goal goal;
    @XmlElement(name = "trigger_implemented_asset")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected String triggerImplementedAsset;
    @XmlElement(name = "requirement_origin")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected List<RequirementOrigins> requirementOrigin;
    @XmlElement(name = "invalidating_CVE")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected List<CVE> invalidatingCVE;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad noteName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public String getNoteName() {
        return noteName;
    }

    /**
     * Define el valor de la propiedad noteName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setNoteName(String value) {
        this.noteName = value;
    }

    /**
     * Obtiene el valor de la propiedad actor.
     * 
     * @return
     *     possible object is
     *     {@link Actor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setActor(Actor value) {
        this.actor = value;
    }

    /**
     * Obtiene el valor de la propiedad using.
     * 
     * @return
     *     possible object is
     *     {@link UsingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public UsingType getUsing() {
        return using;
    }

    /**
     * Define el valor de la propiedad using.
     * 
     * @param value
     *     allowed object is
     *     {@link UsingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setUsing(UsingType value) {
        this.using = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedEvent.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Event getRelatedEvent() {
        return relatedEvent;
    }

    /**
     * Define el valor de la propiedad relatedEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setRelatedEvent(Event value) {
        this.relatedEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad condition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public String getCondition() {
        return condition;
    }

    /**
     * Define el valor de la propiedad condition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Obtiene el valor de la propiedad when.
     * 
     * @return
     *     possible object is
     *     {@link When }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public When getWhen() {
        return when;
    }

    /**
     * Define el valor de la propiedad when.
     * 
     * @param value
     *     allowed object is
     *     {@link When }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setWhen(When value) {
        this.when = value;
    }

    /**
     * Obtiene el valor de la propiedad priorTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public String getPriorTo() {
        return priorTo;
    }

    /**
     * Define el valor de la propiedad priorTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setPriorTo(String value) {
        this.priorTo = value;
    }

    /**
     * Obtiene el valor de la propiedad goal.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Goal getGoal() {
        return goal;
    }

    /**
     * Define el valor de la propiedad goal.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setGoal(Goal value) {
        this.goal = value;
    }

    /**
     * Obtiene el valor de la propiedad triggerImplementedAsset.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public String getTriggerImplementedAsset() {
        return triggerImplementedAsset;
    }

    /**
     * Define el valor de la propiedad triggerImplementedAsset.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setTriggerImplementedAsset(String value) {
        this.triggerImplementedAsset = value;
    }

    /**
     * Gets the value of the requirementOrigin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the requirementOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequirementOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequirementOrigins }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public List<RequirementOrigins> getRequirementOrigin() {
        if (requirementOrigin == null) {
            requirementOrigin = new ArrayList<RequirementOrigins>();
        }
        return this.requirementOrigin;
    }

    /**
     * Gets the value of the invalidatingCVE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the invalidatingCVE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvalidatingCVE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CVE }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public List<CVE> getInvalidatingCVE() {
        if (invalidatingCVE == null) {
            invalidatingCVE = new ArrayList<CVE>();
        }
        return this.invalidatingCVE;
    }

}
