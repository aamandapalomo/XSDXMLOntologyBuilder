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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para action complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="action"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="input" type="{edu.upc.dmag}Content" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="input_event" type="{edu.upc.dmag}Event" minOccurs="0"/&gt;
 *           &lt;element name="related_action" type="{edu.upc.dmag}action" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="output" type="{edu.upc.dmag}Content" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="when" type="{edu.upc.dmag}When" minOccurs="0"/&gt;
 *         &lt;element name="action_type"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="accessing"/&gt;
 *               &lt;enumeration value="communicating"/&gt;
 *               &lt;enumeration value="verifying"/&gt;
 *               &lt;enumeration value="pairing"/&gt;
 *               &lt;enumeration value="controlling"/&gt;
 *               &lt;enumeration value="validating"/&gt;
 *               &lt;enumeration value="monitoring"/&gt;
 *               &lt;enumeration value="reacting"/&gt;
 *               &lt;enumeration value="assessment"/&gt;
 *               &lt;enumeration value="managing"/&gt;
 *               &lt;enumeration value="handling"/&gt;
 *               &lt;enumeration value="analysing"/&gt;
 *               &lt;enumeration value="publishing"/&gt;
 *               &lt;enumeration value="reducing"/&gt;
 *               &lt;enumeration value="recording"/&gt;
 *               &lt;enumeration value="authenticating"/&gt;
 *               &lt;enumeration value="exchaning information"/&gt;
 *               &lt;enumeration value="exchanging clinical information"/&gt;
 *               &lt;enumeration value="exchanging identification information"/&gt;
 *               &lt;enumeration value="exchanging technical information"/&gt;
 *               &lt;enumeration value="removing"/&gt;
 *               &lt;enumeration value="protecting"/&gt;
 *               &lt;enumeration value="configuring"/&gt;
 *               &lt;enumeration value="determining"/&gt;
 *               &lt;enumeration value="resolving"/&gt;
 *               &lt;enumeration value="restricting usage"/&gt;
 *               &lt;enumeration value="securing"/&gt;
 *               &lt;enumeration value="allocating resources"/&gt;
 *               &lt;enumeration value="maintaining"/&gt;
 *               &lt;enumeration value="reviewing"/&gt;
 *               &lt;enumeration value="assigning"/&gt;
 *               &lt;enumeration value="engineering"/&gt;
 *               &lt;enumeration value="executing"/&gt;
 *               &lt;enumeration value="training"/&gt;
 *               &lt;enumeration value="updating"/&gt;
 *               &lt;enumeration value="processing"/&gt;
 *               &lt;enumeration value="deleting"/&gt;
 *               &lt;enumeration value="rectifying"/&gt;
 *               &lt;enumeration value="logging"/&gt;
 *               &lt;enumeration value="auditing"/&gt;
 *               &lt;enumeration value="preventing"/&gt;
 *               &lt;enumeration value="detecting"/&gt;
 *               &lt;enumeration value="granting"/&gt;
 *               &lt;enumeration value="change state"/&gt;
 *               &lt;enumeration value="withdrawing"/&gt;
 *               &lt;enumeration value="using"/&gt;
 *               &lt;enumeration value="provisioning"/&gt;
 *               &lt;enumeration value="bootstraping"/&gt;
 *               &lt;enumeration value="backing up"/&gt;
 *               &lt;enumeration value="decommissioning"/&gt;
 *               &lt;enumeration value="testing"/&gt;
 *               &lt;enumeration value="mitigating"/&gt;
 *               &lt;enumeration value="receiving"/&gt;
 *               &lt;enumeration value="restoring"/&gt;
 *               &lt;enumeration value="resetting"/&gt;
 *               &lt;enumeration value="locking"/&gt;
 *               &lt;enumeration value="blocking"/&gt;
 *               &lt;enumeration value="searching"/&gt;
 *               &lt;enumeration value="requesting"/&gt;
 *               &lt;enumeration value="sanitizing"/&gt;
 *               &lt;enumeration value="revoking"/&gt;
 *               &lt;enumeration value="stopping"/&gt;
 *               &lt;enumeration value="viewing"/&gt;
 *               &lt;enumeration value="authorizing"/&gt;
 *               &lt;enumeration value="installing"/&gt;
 *               &lt;enumeration value="falling back"/&gt;
 *               &lt;enumeration value="reporting"/&gt;
 *               &lt;enumeration value="ensuring"/&gt;
 *               &lt;enumeration value="deterring"/&gt;
 *               &lt;enumeration value="disclosing"/&gt;
 *               &lt;enumeration value="achieving"/&gt;
 *               &lt;enumeration value="assuring"/&gt;
 *               &lt;enumeration value="collecting"/&gt;
 *               &lt;enumeration value="identification"/&gt;
 *               &lt;enumeration value="checking"/&gt;
 *               &lt;enumeration value="rebuilding"/&gt;
 *               &lt;enumeration value="deploying"/&gt;
 *               &lt;enumeration value="supporting"/&gt;
 *               &lt;enumeration value="registering"/&gt;
 *               &lt;enumeration value="accepting"/&gt;
 *               &lt;enumeration value="treating as"/&gt;
 *               &lt;enumeration value="naming"/&gt;
 *               &lt;enumeration value="tracking"/&gt;
 *               &lt;enumeration value="masking"/&gt;
 *               &lt;enumeration value="replacing"/&gt;
 *               &lt;enumeration value="reinstalling"/&gt;
 *               &lt;enumeration value="aligning"/&gt;
 *               &lt;enumeration value="integrating"/&gt;
 *               &lt;enumeration value="inventoring"/&gt;
 *               &lt;enumeration value="staffing"/&gt;
 *               &lt;enumeration value="migrating"/&gt;
 *               &lt;enumeration value="enumeration"/&gt;
 *               &lt;enumeration value="throttling"/&gt;
 *               &lt;enumeration value="caching"/&gt;
 *               &lt;enumeration value="storing"/&gt;
 *               &lt;enumeration value="reusing"/&gt;
 *               &lt;enumeration value="signing"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="unauthorized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="remote_action" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="secure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="in_the_field" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "action", propOrder = {
    "name",
    "input",
    "inputEvent",
    "relatedAction",
    "output",
    "when",
    "actionType",
    "unauthorized",
    "remoteAction",
    "secure",
    "inTheField"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class Action {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected String name;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected List<Content> input;
    @XmlElement(name = "input_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Event inputEvent;
    @XmlElement(name = "related_action")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Action relatedAction;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected List<Content> output;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected When when;
    @XmlElement(name = "action_type", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected String actionType;
    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean unauthorized;
    @XmlElement(name = "remote_action", defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean remoteAction;
    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean secure;
    @XmlElement(name = "in_the_field", defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean inTheField;

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
     * Gets the value of the input property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the input property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Content }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public List<Content> getInput() {
        if (input == null) {
            input = new ArrayList<Content>();
        }
        return this.input;
    }

    /**
     * Obtiene el valor de la propiedad inputEvent.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Event getInputEvent() {
        return inputEvent;
    }

    /**
     * Define el valor de la propiedad inputEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setInputEvent(Event value) {
        this.inputEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedAction.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Action getRelatedAction() {
        return relatedAction;
    }

    /**
     * Define el valor de la propiedad relatedAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setRelatedAction(Action value) {
        this.relatedAction = value;
    }

    /**
     * Gets the value of the output property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the output property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Content }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public List<Content> getOutput() {
        if (output == null) {
            output = new ArrayList<Content>();
        }
        return this.output;
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
     * Obtiene el valor de la propiedad actionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public String getActionType() {
        return actionType;
    }

    /**
     * Define el valor de la propiedad actionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Obtiene el valor de la propiedad unauthorized.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isUnauthorized() {
        return unauthorized;
    }

    /**
     * Define el valor de la propiedad unauthorized.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setUnauthorized(Boolean value) {
        this.unauthorized = value;
    }

    /**
     * Obtiene el valor de la propiedad remoteAction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isRemoteAction() {
        return remoteAction;
    }

    /**
     * Define el valor de la propiedad remoteAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setRemoteAction(Boolean value) {
        this.remoteAction = value;
    }

    /**
     * Obtiene el valor de la propiedad secure.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isSecure() {
        return secure;
    }

    /**
     * Define el valor de la propiedad secure.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setSecure(Boolean value) {
        this.secure = value;
    }

    /**
     * Obtiene el valor de la propiedad inTheField.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isInTheField() {
        return inTheField;
    }

    /**
     * Define el valor de la propiedad inTheField.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setInTheField(Boolean value) {
        this.inTheField = value;
    }

}
