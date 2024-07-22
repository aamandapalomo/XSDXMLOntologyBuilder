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
 * <p>Clase Java para Content complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Content"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="assurance" type="{edu.upc.dmag}Assurance"/&gt;
 *         &lt;element name="general_content" type="{edu.upc.dmag}GeneralContent"/&gt;
 *         &lt;element name="abstract_process" type="{edu.upc.dmag}AbstractProcess"/&gt;
 *         &lt;element name="process" type="{edu.upc.dmag}Process"/&gt;
 *         &lt;element name="access_component" type="{edu.upc.dmag}AccessComponent"/&gt;
 *         &lt;element name="component_content" type="{edu.upc.dmag}ComponentContent"/&gt;
 *         &lt;element name="storage_component_content" type="{edu.upc.dmag}StorageComponentContent"/&gt;
 *         &lt;element name="actor" type="{edu.upc.dmag}Actor"/&gt;
 *         &lt;element name="means_for" type="{edu.upc.dmag}Means_For"/&gt;
 *         &lt;element name="property" type="{edu.upc.dmag}ContentProperty"/&gt;
 *         &lt;element name="requirement" type="{edu.upc.dmag}GeneralizedRequirement"/&gt;
 *         &lt;element name="risk" type="{edu.upc.dmag}Risk"/&gt;
 *         &lt;element name="capacity" type="{edu.upc.dmag}Capacity"/&gt;
 *         &lt;element name="hazard" type="{edu.upc.dmag}Hazard"/&gt;
 *         &lt;element name="content_implementation" type="{edu.upc.dmag}ContentImplementation"/&gt;
 *         &lt;element name="author" type="{edu.upc.dmag}Author"/&gt;
 *         &lt;element name="device" type="{edu.upc.dmag}Device"/&gt;
 *         &lt;element name="information_for" type="{edu.upc.dmag}Information_For"/&gt;
 *         &lt;element name="policy" type="{edu.upc.dmag}Policy"/&gt;
 *         &lt;element name="abstract_practice" type="{edu.upc.dmag}AbstractPractice"/&gt;
 *         &lt;element name="practice" type="{edu.upc.dmag}Practice"/&gt;
 *         &lt;element name="compliance_content" type="{edu.upc.dmag}Compliance"/&gt;
 *         &lt;element name="regulation_application" type="{edu.upc.dmag}RegulationApplication"/&gt;
 *         &lt;element name="objective" type="{edu.upc.dmag}Objective"/&gt;
 *         &lt;element name="regulation" type="{edu.upc.dmag}Regulation"/&gt;
 *         &lt;element name="phase_information" type="{edu.upc.dmag}PhaseInformation"/&gt;
 *         &lt;element name="analysis" type="{edu.upc.dmag}Analysis"/&gt;
 *         &lt;element name="documentation" type="{edu.upc.dmag}Documentation"/&gt;
 *         &lt;element name="trade_off" type="{edu.upc.dmag}TradeOff"/&gt;
 *         &lt;element name="abstract_decision" type="{edu.upc.dmag}AbstractDecision"/&gt;
 *         &lt;element name="decision" type="{edu.upc.dmag}Decision"/&gt;
 *         &lt;element name="abstract_vulnerability" type="{edu.upc.dmag}AbstractVulnerability"/&gt;
 *         &lt;element name="vulnerability" type="{edu.upc.dmag}Vulnerability"/&gt;
 *         &lt;element name="principle" type="{edu.upc.dmag}Principle"/&gt;
 *         &lt;element name="explanation_of" type="{edu.upc.dmag}ExplanationOff"/&gt;
 *         &lt;element name="verification" type="{edu.upc.dmag}Verification"/&gt;
 *         &lt;element name="evidence" type="{edu.upc.dmag}Evidence"/&gt;
 *         &lt;element name="usage" type="{edu.upc.dmag}Usage"/&gt;
 *         &lt;element name="threat" type="{edu.upc.dmag}Threat"/&gt;
 *         &lt;element name="skill" type="{edu.upc.dmag}Skill"/&gt;
 *         &lt;element name="record" type="{edu.upc.dmag}Record"/&gt;
 *         &lt;element name="role" type="{edu.upc.dmag}Role"/&gt;
 *         &lt;element name="password" type="{edu.upc.dmag}Password"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Content", propOrder = {
    "assurance",
    "generalContent",
    "abstractProcess",
    "process",
    "accessComponent",
    "componentContent",
    "storageComponentContent",
    "actor",
    "meansFor",
    "property",
    "requirement",
    "risk",
    "capacity",
    "hazard",
    "contentImplementation",
    "author",
    "device",
    "informationFor",
    "policy",
    "abstractPractice",
    "practice",
    "complianceContent",
    "regulationApplication",
    "objective",
    "regulation",
    "phaseInformation",
    "analysis",
    "documentation",
    "tradeOff",
    "abstractDecision",
    "decision",
    "abstractVulnerability",
    "vulnerability",
    "principle",
    "explanationOf",
    "verification",
    "evidence",
    "usage",
    "threat",
    "skill",
    "record",
    "role",
    "password"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class Content {

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Assurance assurance;
    @XmlElement(name = "general_content")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected GeneralContent generalContent;
    @XmlElement(name = "abstract_process")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected AbstractProcess abstractProcess;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Process process;
    @XmlElement(name = "access_component")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected AccessComponent accessComponent;
    @XmlElement(name = "component_content")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected ComponentContent componentContent;
    @XmlElement(name = "storage_component_content")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected StorageComponentContent storageComponentContent;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Actor actor;
    @XmlElement(name = "means_for")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected MeansFor meansFor;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected ContentProperty property;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected GeneralizedRequirement requirement;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Risk risk;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Capacity capacity;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Hazard hazard;
    @XmlElement(name = "content_implementation")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected ContentImplementation contentImplementation;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Author author;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Device device;
    @XmlElement(name = "information_for")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected InformationFor informationFor;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Policy policy;
    @XmlElement(name = "abstract_practice")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected AbstractPractice abstractPractice;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Practice practice;
    @XmlElement(name = "compliance_content")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Compliance complianceContent;
    @XmlElement(name = "regulation_application")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected RegulationApplication regulationApplication;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Objective objective;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Regulation regulation;
    @XmlElement(name = "phase_information")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected PhaseInformation phaseInformation;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Analysis analysis;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Documentation documentation;
    @XmlElement(name = "trade_off")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected TradeOff tradeOff;
    @XmlElement(name = "abstract_decision")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected AbstractDecision abstractDecision;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Decision decision;
    @XmlElement(name = "abstract_vulnerability")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected AbstractVulnerability abstractVulnerability;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Vulnerability vulnerability;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Principle principle;
    @XmlElement(name = "explanation_of")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected ExplanationOff explanationOf;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Verification verification;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Evidence evidence;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Usage usage;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Threat threat;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Skill skill;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Record record;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Role role;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Password password;

    /**
     * Obtiene el valor de la propiedad assurance.
     * 
     * @return
     *     possible object is
     *     {@link Assurance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Assurance getAssurance() {
        return assurance;
    }

    /**
     * Define el valor de la propiedad assurance.
     * 
     * @param value
     *     allowed object is
     *     {@link Assurance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setAssurance(Assurance value) {
        this.assurance = value;
    }

    /**
     * Obtiene el valor de la propiedad generalContent.
     * 
     * @return
     *     possible object is
     *     {@link GeneralContent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public GeneralContent getGeneralContent() {
        return generalContent;
    }

    /**
     * Define el valor de la propiedad generalContent.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralContent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setGeneralContent(GeneralContent value) {
        this.generalContent = value;
    }

    /**
     * Obtiene el valor de la propiedad abstractProcess.
     * 
     * @return
     *     possible object is
     *     {@link AbstractProcess }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public AbstractProcess getAbstractProcess() {
        return abstractProcess;
    }

    /**
     * Define el valor de la propiedad abstractProcess.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractProcess }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setAbstractProcess(AbstractProcess value) {
        this.abstractProcess = value;
    }

    /**
     * Obtiene el valor de la propiedad process.
     * 
     * @return
     *     possible object is
     *     {@link Process }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Process getProcess() {
        return process;
    }

    /**
     * Define el valor de la propiedad process.
     * 
     * @param value
     *     allowed object is
     *     {@link Process }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setProcess(Process value) {
        this.process = value;
    }

    /**
     * Obtiene el valor de la propiedad accessComponent.
     * 
     * @return
     *     possible object is
     *     {@link AccessComponent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public AccessComponent getAccessComponent() {
        return accessComponent;
    }

    /**
     * Define el valor de la propiedad accessComponent.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessComponent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setAccessComponent(AccessComponent value) {
        this.accessComponent = value;
    }

    /**
     * Obtiene el valor de la propiedad componentContent.
     * 
     * @return
     *     possible object is
     *     {@link ComponentContent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public ComponentContent getComponentContent() {
        return componentContent;
    }

    /**
     * Define el valor de la propiedad componentContent.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentContent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setComponentContent(ComponentContent value) {
        this.componentContent = value;
    }

    /**
     * Obtiene el valor de la propiedad storageComponentContent.
     * 
     * @return
     *     possible object is
     *     {@link StorageComponentContent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public StorageComponentContent getStorageComponentContent() {
        return storageComponentContent;
    }

    /**
     * Define el valor de la propiedad storageComponentContent.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageComponentContent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setStorageComponentContent(StorageComponentContent value) {
        this.storageComponentContent = value;
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
     * Obtiene el valor de la propiedad meansFor.
     * 
     * @return
     *     possible object is
     *     {@link MeansFor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setRisk(Risk value) {
        this.risk = value;
    }

    /**
     * Obtiene el valor de la propiedad capacity.
     * 
     * @return
     *     possible object is
     *     {@link Capacity }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Capacity getCapacity() {
        return capacity;
    }

    /**
     * Define el valor de la propiedad capacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Capacity }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setCapacity(Capacity value) {
        this.capacity = value;
    }

    /**
     * Obtiene el valor de la propiedad hazard.
     * 
     * @return
     *     possible object is
     *     {@link Hazard }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Hazard getHazard() {
        return hazard;
    }

    /**
     * Define el valor de la propiedad hazard.
     * 
     * @param value
     *     allowed object is
     *     {@link Hazard }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setHazard(Hazard value) {
        this.hazard = value;
    }

    /**
     * Obtiene el valor de la propiedad contentImplementation.
     * 
     * @return
     *     possible object is
     *     {@link ContentImplementation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public ContentImplementation getContentImplementation() {
        return contentImplementation;
    }

    /**
     * Define el valor de la propiedad contentImplementation.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentImplementation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setContentImplementation(ContentImplementation value) {
        this.contentImplementation = value;
    }

    /**
     * Obtiene el valor de la propiedad author.
     * 
     * @return
     *     possible object is
     *     {@link Author }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Author getAuthor() {
        return author;
    }

    /**
     * Define el valor de la propiedad author.
     * 
     * @param value
     *     allowed object is
     *     {@link Author }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setAuthor(Author value) {
        this.author = value;
    }

    /**
     * Obtiene el valor de la propiedad device.
     * 
     * @return
     *     possible object is
     *     {@link Device }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Device getDevice() {
        return device;
    }

    /**
     * Define el valor de la propiedad device.
     * 
     * @param value
     *     allowed object is
     *     {@link Device }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setDevice(Device value) {
        this.device = value;
    }

    /**
     * Obtiene el valor de la propiedad informationFor.
     * 
     * @return
     *     possible object is
     *     {@link InformationFor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public InformationFor getInformationFor() {
        return informationFor;
    }

    /**
     * Define el valor de la propiedad informationFor.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationFor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setInformationFor(InformationFor value) {
        this.informationFor = value;
    }

    /**
     * Obtiene el valor de la propiedad policy.
     * 
     * @return
     *     possible object is
     *     {@link Policy }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Policy getPolicy() {
        return policy;
    }

    /**
     * Define el valor de la propiedad policy.
     * 
     * @param value
     *     allowed object is
     *     {@link Policy }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setPolicy(Policy value) {
        this.policy = value;
    }

    /**
     * Obtiene el valor de la propiedad abstractPractice.
     * 
     * @return
     *     possible object is
     *     {@link AbstractPractice }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public AbstractPractice getAbstractPractice() {
        return abstractPractice;
    }

    /**
     * Define el valor de la propiedad abstractPractice.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractPractice }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setAbstractPractice(AbstractPractice value) {
        this.abstractPractice = value;
    }

    /**
     * Obtiene el valor de la propiedad practice.
     * 
     * @return
     *     possible object is
     *     {@link Practice }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Practice getPractice() {
        return practice;
    }

    /**
     * Define el valor de la propiedad practice.
     * 
     * @param value
     *     allowed object is
     *     {@link Practice }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setPractice(Practice value) {
        this.practice = value;
    }

    /**
     * Obtiene el valor de la propiedad complianceContent.
     * 
     * @return
     *     possible object is
     *     {@link Compliance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Compliance getComplianceContent() {
        return complianceContent;
    }

    /**
     * Define el valor de la propiedad complianceContent.
     * 
     * @param value
     *     allowed object is
     *     {@link Compliance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setComplianceContent(Compliance value) {
        this.complianceContent = value;
    }

    /**
     * Obtiene el valor de la propiedad regulationApplication.
     * 
     * @return
     *     possible object is
     *     {@link RegulationApplication }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public RegulationApplication getRegulationApplication() {
        return regulationApplication;
    }

    /**
     * Define el valor de la propiedad regulationApplication.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulationApplication }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setRegulationApplication(RegulationApplication value) {
        this.regulationApplication = value;
    }

    /**
     * Obtiene el valor de la propiedad objective.
     * 
     * @return
     *     possible object is
     *     {@link Objective }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Objective getObjective() {
        return objective;
    }

    /**
     * Define el valor de la propiedad objective.
     * 
     * @param value
     *     allowed object is
     *     {@link Objective }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setObjective(Objective value) {
        this.objective = value;
    }

    /**
     * Obtiene el valor de la propiedad regulation.
     * 
     * @return
     *     possible object is
     *     {@link Regulation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Regulation getRegulation() {
        return regulation;
    }

    /**
     * Define el valor de la propiedad regulation.
     * 
     * @param value
     *     allowed object is
     *     {@link Regulation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setRegulation(Regulation value) {
        this.regulation = value;
    }

    /**
     * Obtiene el valor de la propiedad phaseInformation.
     * 
     * @return
     *     possible object is
     *     {@link PhaseInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public PhaseInformation getPhaseInformation() {
        return phaseInformation;
    }

    /**
     * Define el valor de la propiedad phaseInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setPhaseInformation(PhaseInformation value) {
        this.phaseInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad analysis.
     * 
     * @return
     *     possible object is
     *     {@link Analysis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Analysis getAnalysis() {
        return analysis;
    }

    /**
     * Define el valor de la propiedad analysis.
     * 
     * @param value
     *     allowed object is
     *     {@link Analysis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setAnalysis(Analysis value) {
        this.analysis = value;
    }

    /**
     * Obtiene el valor de la propiedad documentation.
     * 
     * @return
     *     possible object is
     *     {@link Documentation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Documentation getDocumentation() {
        return documentation;
    }

    /**
     * Define el valor de la propiedad documentation.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setDocumentation(Documentation value) {
        this.documentation = value;
    }

    /**
     * Obtiene el valor de la propiedad tradeOff.
     * 
     * @return
     *     possible object is
     *     {@link TradeOff }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public TradeOff getTradeOff() {
        return tradeOff;
    }

    /**
     * Define el valor de la propiedad tradeOff.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeOff }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setTradeOff(TradeOff value) {
        this.tradeOff = value;
    }

    /**
     * Obtiene el valor de la propiedad abstractDecision.
     * 
     * @return
     *     possible object is
     *     {@link AbstractDecision }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public AbstractDecision getAbstractDecision() {
        return abstractDecision;
    }

    /**
     * Define el valor de la propiedad abstractDecision.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractDecision }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setAbstractDecision(AbstractDecision value) {
        this.abstractDecision = value;
    }

    /**
     * Obtiene el valor de la propiedad decision.
     * 
     * @return
     *     possible object is
     *     {@link Decision }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Decision getDecision() {
        return decision;
    }

    /**
     * Define el valor de la propiedad decision.
     * 
     * @param value
     *     allowed object is
     *     {@link Decision }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setDecision(Decision value) {
        this.decision = value;
    }

    /**
     * Obtiene el valor de la propiedad abstractVulnerability.
     * 
     * @return
     *     possible object is
     *     {@link AbstractVulnerability }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public AbstractVulnerability getAbstractVulnerability() {
        return abstractVulnerability;
    }

    /**
     * Define el valor de la propiedad abstractVulnerability.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractVulnerability }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setAbstractVulnerability(AbstractVulnerability value) {
        this.abstractVulnerability = value;
    }

    /**
     * Obtiene el valor de la propiedad vulnerability.
     * 
     * @return
     *     possible object is
     *     {@link Vulnerability }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Vulnerability getVulnerability() {
        return vulnerability;
    }

    /**
     * Define el valor de la propiedad vulnerability.
     * 
     * @param value
     *     allowed object is
     *     {@link Vulnerability }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setVulnerability(Vulnerability value) {
        this.vulnerability = value;
    }

    /**
     * Obtiene el valor de la propiedad principle.
     * 
     * @return
     *     possible object is
     *     {@link Principle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Principle getPrinciple() {
        return principle;
    }

    /**
     * Define el valor de la propiedad principle.
     * 
     * @param value
     *     allowed object is
     *     {@link Principle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setPrinciple(Principle value) {
        this.principle = value;
    }

    /**
     * Obtiene el valor de la propiedad explanationOf.
     * 
     * @return
     *     possible object is
     *     {@link ExplanationOff }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public ExplanationOff getExplanationOf() {
        return explanationOf;
    }

    /**
     * Define el valor de la propiedad explanationOf.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplanationOff }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setExplanationOf(ExplanationOff value) {
        this.explanationOf = value;
    }

    /**
     * Obtiene el valor de la propiedad verification.
     * 
     * @return
     *     possible object is
     *     {@link Verification }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Verification getVerification() {
        return verification;
    }

    /**
     * Define el valor de la propiedad verification.
     * 
     * @param value
     *     allowed object is
     *     {@link Verification }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setVerification(Verification value) {
        this.verification = value;
    }

    /**
     * Obtiene el valor de la propiedad evidence.
     * 
     * @return
     *     possible object is
     *     {@link Evidence }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Evidence getEvidence() {
        return evidence;
    }

    /**
     * Define el valor de la propiedad evidence.
     * 
     * @param value
     *     allowed object is
     *     {@link Evidence }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setEvidence(Evidence value) {
        this.evidence = value;
    }

    /**
     * Obtiene el valor de la propiedad usage.
     * 
     * @return
     *     possible object is
     *     {@link Usage }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Usage getUsage() {
        return usage;
    }

    /**
     * Define el valor de la propiedad usage.
     * 
     * @param value
     *     allowed object is
     *     {@link Usage }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setUsage(Usage value) {
        this.usage = value;
    }

    /**
     * Obtiene el valor de la propiedad threat.
     * 
     * @return
     *     possible object is
     *     {@link Threat }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Threat getThreat() {
        return threat;
    }

    /**
     * Define el valor de la propiedad threat.
     * 
     * @param value
     *     allowed object is
     *     {@link Threat }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setThreat(Threat value) {
        this.threat = value;
    }

    /**
     * Obtiene el valor de la propiedad skill.
     * 
     * @return
     *     possible object is
     *     {@link Skill }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Skill getSkill() {
        return skill;
    }

    /**
     * Define el valor de la propiedad skill.
     * 
     * @param value
     *     allowed object is
     *     {@link Skill }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setSkill(Skill value) {
        this.skill = value;
    }

    /**
     * Obtiene el valor de la propiedad record.
     * 
     * @return
     *     possible object is
     *     {@link Record }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Record getRecord() {
        return record;
    }

    /**
     * Define el valor de la propiedad record.
     * 
     * @param value
     *     allowed object is
     *     {@link Record }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setRecord(Record value) {
        this.record = value;
    }

    /**
     * Obtiene el valor de la propiedad role.
     * 
     * @return
     *     possible object is
     *     {@link Role }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Role getRole() {
        return role;
    }

    /**
     * Define el valor de la propiedad role.
     * 
     * @param value
     *     allowed object is
     *     {@link Role }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setRole(Role value) {
        this.role = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link Password }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Password getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link Password }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setPassword(Password value) {
        this.password = value;
    }

}
