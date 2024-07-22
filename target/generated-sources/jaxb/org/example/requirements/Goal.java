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
 * <p>Clase Java para Goal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Goal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="GoalToChange" type="{edu.upc.dmag}GoalToChangeType"/&gt;
 *         &lt;element name="GoalToAvoidEvent" type="{edu.upc.dmag}GoalToAvoidEventType"/&gt;
 *         &lt;element name="GoalToEnsureProperty" type="{edu.upc.dmag}GoalToEnsurePropertyType"/&gt;
 *         &lt;element name="GoalToConsiderContent" type="{edu.upc.dmag}GoalToConsiderContentType"/&gt;
 *         &lt;element name="EnsuringProperty" type="{edu.upc.dmag}ContentProperty"/&gt;
 *         &lt;element name="ConsideredContent" type="{edu.upc.dmag}Content"/&gt;
 *         &lt;element name="GoalToAlert" type="{edu.upc.dmag}GoalToAlertType"/&gt;
 *         &lt;element name="GoalToAutoPerformAction" type="{edu.upc.dmag}GoalToAutoPerformActionType"/&gt;
 *         &lt;element name="GoalToAllowAction" type="{edu.upc.dmag}GoalToAllowActionType"/&gt;
 *         &lt;element name="GoalToProhibitAction" type="{edu.upc.dmag}GoalToProhibitActionType"/&gt;
 *         &lt;element name="GoalToComplyWithRequirements" type="{edu.upc.dmag}GoalToComplyWithRequirementsType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Goal", propOrder = {
    "goalToChange",
    "goalToAvoidEvent",
    "goalToEnsureProperty",
    "goalToConsiderContent",
    "ensuringProperty",
    "consideredContent",
    "goalToAlert",
    "goalToAutoPerformAction",
    "goalToAllowAction",
    "goalToProhibitAction",
    "goalToComplyWithRequirements"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class Goal {

    @XmlElement(name = "GoalToChange")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected GoalToChangeType goalToChange;
    @XmlElement(name = "GoalToAvoidEvent")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected GoalToAvoidEventType goalToAvoidEvent;
    @XmlElement(name = "GoalToEnsureProperty")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected GoalToEnsurePropertyType goalToEnsureProperty;
    @XmlElement(name = "GoalToConsiderContent")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected GoalToConsiderContentType goalToConsiderContent;
    @XmlElement(name = "EnsuringProperty")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected ContentProperty ensuringProperty;
    @XmlElement(name = "ConsideredContent")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content consideredContent;
    @XmlElement(name = "GoalToAlert")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected GoalToAlertType goalToAlert;
    @XmlElement(name = "GoalToAutoPerformAction")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected GoalToAutoPerformActionType goalToAutoPerformAction;
    @XmlElement(name = "GoalToAllowAction")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected GoalToAllowActionType goalToAllowAction;
    @XmlElement(name = "GoalToProhibitAction")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected GoalToProhibitActionType goalToProhibitAction;
    @XmlElement(name = "GoalToComplyWithRequirements")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected GoalToComplyWithRequirementsType goalToComplyWithRequirements;

    /**
     * Obtiene el valor de la propiedad goalToChange.
     * 
     * @return
     *     possible object is
     *     {@link GoalToChangeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public GoalToChangeType getGoalToChange() {
        return goalToChange;
    }

    /**
     * Define el valor de la propiedad goalToChange.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalToChangeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setGoalToChange(GoalToChangeType value) {
        this.goalToChange = value;
    }

    /**
     * Obtiene el valor de la propiedad goalToAvoidEvent.
     * 
     * @return
     *     possible object is
     *     {@link GoalToAvoidEventType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public GoalToAvoidEventType getGoalToAvoidEvent() {
        return goalToAvoidEvent;
    }

    /**
     * Define el valor de la propiedad goalToAvoidEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalToAvoidEventType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setGoalToAvoidEvent(GoalToAvoidEventType value) {
        this.goalToAvoidEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad goalToEnsureProperty.
     * 
     * @return
     *     possible object is
     *     {@link GoalToEnsurePropertyType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public GoalToEnsurePropertyType getGoalToEnsureProperty() {
        return goalToEnsureProperty;
    }

    /**
     * Define el valor de la propiedad goalToEnsureProperty.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalToEnsurePropertyType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setGoalToEnsureProperty(GoalToEnsurePropertyType value) {
        this.goalToEnsureProperty = value;
    }

    /**
     * Obtiene el valor de la propiedad goalToConsiderContent.
     * 
     * @return
     *     possible object is
     *     {@link GoalToConsiderContentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public GoalToConsiderContentType getGoalToConsiderContent() {
        return goalToConsiderContent;
    }

    /**
     * Define el valor de la propiedad goalToConsiderContent.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalToConsiderContentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setGoalToConsiderContent(GoalToConsiderContentType value) {
        this.goalToConsiderContent = value;
    }

    /**
     * Obtiene el valor de la propiedad ensuringProperty.
     * 
     * @return
     *     possible object is
     *     {@link ContentProperty }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public ContentProperty getEnsuringProperty() {
        return ensuringProperty;
    }

    /**
     * Define el valor de la propiedad ensuringProperty.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentProperty }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setEnsuringProperty(ContentProperty value) {
        this.ensuringProperty = value;
    }

    /**
     * Obtiene el valor de la propiedad consideredContent.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getConsideredContent() {
        return consideredContent;
    }

    /**
     * Define el valor de la propiedad consideredContent.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setConsideredContent(Content value) {
        this.consideredContent = value;
    }

    /**
     * Obtiene el valor de la propiedad goalToAlert.
     * 
     * @return
     *     possible object is
     *     {@link GoalToAlertType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public GoalToAlertType getGoalToAlert() {
        return goalToAlert;
    }

    /**
     * Define el valor de la propiedad goalToAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalToAlertType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setGoalToAlert(GoalToAlertType value) {
        this.goalToAlert = value;
    }

    /**
     * Obtiene el valor de la propiedad goalToAutoPerformAction.
     * 
     * @return
     *     possible object is
     *     {@link GoalToAutoPerformActionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public GoalToAutoPerformActionType getGoalToAutoPerformAction() {
        return goalToAutoPerformAction;
    }

    /**
     * Define el valor de la propiedad goalToAutoPerformAction.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalToAutoPerformActionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setGoalToAutoPerformAction(GoalToAutoPerformActionType value) {
        this.goalToAutoPerformAction = value;
    }

    /**
     * Obtiene el valor de la propiedad goalToAllowAction.
     * 
     * @return
     *     possible object is
     *     {@link GoalToAllowActionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public GoalToAllowActionType getGoalToAllowAction() {
        return goalToAllowAction;
    }

    /**
     * Define el valor de la propiedad goalToAllowAction.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalToAllowActionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setGoalToAllowAction(GoalToAllowActionType value) {
        this.goalToAllowAction = value;
    }

    /**
     * Obtiene el valor de la propiedad goalToProhibitAction.
     * 
     * @return
     *     possible object is
     *     {@link GoalToProhibitActionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public GoalToProhibitActionType getGoalToProhibitAction() {
        return goalToProhibitAction;
    }

    /**
     * Define el valor de la propiedad goalToProhibitAction.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalToProhibitActionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setGoalToProhibitAction(GoalToProhibitActionType value) {
        this.goalToProhibitAction = value;
    }

    /**
     * Obtiene el valor de la propiedad goalToComplyWithRequirements.
     * 
     * @return
     *     possible object is
     *     {@link GoalToComplyWithRequirementsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public GoalToComplyWithRequirementsType getGoalToComplyWithRequirements() {
        return goalToComplyWithRequirements;
    }

    /**
     * Define el valor de la propiedad goalToComplyWithRequirements.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalToComplyWithRequirementsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setGoalToComplyWithRequirements(GoalToComplyWithRequirementsType value) {
        this.goalToComplyWithRequirements = value;
    }

}
