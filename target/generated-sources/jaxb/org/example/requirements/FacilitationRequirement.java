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
 * <p>Clase Java para FacilitationRequirement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacilitationRequirement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{edu.upc.dmag}Requirement"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="facilitating_action" type="{edu.upc.dmag}action" minOccurs="0"/&gt;
 *           &lt;element name="facilitating_concept" type="{edu.upc.dmag}Content" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="facilitated_action" type="{edu.upc.dmag}action"/&gt;
 *           &lt;element name="facilitated_concept" type="{edu.upc.dmag}Content"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="action_not_to_compromise" type="{edu.upc.dmag}action" minOccurs="0"/&gt;
 *         &lt;element name="concept_not_to_compromise" type="{edu.upc.dmag}Content" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilitationRequirement", propOrder = {
    "facilitatingAction",
    "facilitatingConcept",
    "facilitatedAction",
    "facilitatedConcept",
    "actionNotToCompromise",
    "conceptNotToCompromise"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class FacilitationRequirement
    extends Requirement
{

    @XmlElement(name = "facilitating_action")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Action facilitatingAction;
    @XmlElement(name = "facilitating_concept")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content facilitatingConcept;
    @XmlElement(name = "facilitated_action")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Action facilitatedAction;
    @XmlElement(name = "facilitated_concept")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content facilitatedConcept;
    @XmlElement(name = "action_not_to_compromise")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Action actionNotToCompromise;
    @XmlElement(name = "concept_not_to_compromise")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content conceptNotToCompromise;

    /**
     * Obtiene el valor de la propiedad facilitatingAction.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Action getFacilitatingAction() {
        return facilitatingAction;
    }

    /**
     * Define el valor de la propiedad facilitatingAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setFacilitatingAction(Action value) {
        this.facilitatingAction = value;
    }

    /**
     * Obtiene el valor de la propiedad facilitatingConcept.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getFacilitatingConcept() {
        return facilitatingConcept;
    }

    /**
     * Define el valor de la propiedad facilitatingConcept.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setFacilitatingConcept(Content value) {
        this.facilitatingConcept = value;
    }

    /**
     * Obtiene el valor de la propiedad facilitatedAction.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Action getFacilitatedAction() {
        return facilitatedAction;
    }

    /**
     * Define el valor de la propiedad facilitatedAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setFacilitatedAction(Action value) {
        this.facilitatedAction = value;
    }

    /**
     * Obtiene el valor de la propiedad facilitatedConcept.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getFacilitatedConcept() {
        return facilitatedConcept;
    }

    /**
     * Define el valor de la propiedad facilitatedConcept.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setFacilitatedConcept(Content value) {
        this.facilitatedConcept = value;
    }

    /**
     * Obtiene el valor de la propiedad actionNotToCompromise.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Action getActionNotToCompromise() {
        return actionNotToCompromise;
    }

    /**
     * Define el valor de la propiedad actionNotToCompromise.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setActionNotToCompromise(Action value) {
        this.actionNotToCompromise = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptNotToCompromise.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getConceptNotToCompromise() {
        return conceptNotToCompromise;
    }

    /**
     * Define el valor de la propiedad conceptNotToCompromise.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setConceptNotToCompromise(Content value) {
        this.conceptNotToCompromise = value;
    }

}
