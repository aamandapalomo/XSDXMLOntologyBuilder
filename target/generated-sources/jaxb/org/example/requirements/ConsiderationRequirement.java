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
 * <p>Clase Java para ConsiderationRequirement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsiderationRequirement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{edu.upc.dmag}Requirement"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="considered_event" type="{edu.upc.dmag}Event"/&gt;
 *           &lt;element name="considered_concept" type="{edu.upc.dmag}Content"/&gt;
 *           &lt;element name="considered_action" type="{edu.upc.dmag}action"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsiderationRequirement", propOrder = {
    "consideredEvent",
    "consideredConcept",
    "consideredAction"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class ConsiderationRequirement
    extends Requirement
{

    @XmlElement(name = "considered_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Event consideredEvent;
    @XmlElement(name = "considered_concept")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content consideredConcept;
    @XmlElement(name = "considered_action")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Action consideredAction;

    /**
     * Obtiene el valor de la propiedad consideredEvent.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Event getConsideredEvent() {
        return consideredEvent;
    }

    /**
     * Define el valor de la propiedad consideredEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setConsideredEvent(Event value) {
        this.consideredEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad consideredConcept.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getConsideredConcept() {
        return consideredConcept;
    }

    /**
     * Define el valor de la propiedad consideredConcept.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setConsideredConcept(Content value) {
        this.consideredConcept = value;
    }

    /**
     * Obtiene el valor de la propiedad consideredAction.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Action getConsideredAction() {
        return consideredAction;
    }

    /**
     * Define el valor de la propiedad consideredAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setConsideredAction(Action value) {
        this.consideredAction = value;
    }

}
