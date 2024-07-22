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
 * <p>Clase Java para PerformingRequirement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PerformingRequirement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{edu.upc.dmag}Requirement"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="performing_concept" type="{edu.upc.dmag}Content"/&gt;
 *         &lt;element name="performed_action" type="{edu.upc.dmag}action"/&gt;
 *         &lt;element name="performed_concept" type="{edu.upc.dmag}Content"/&gt;
 *         &lt;element name="performed_abstract_action" type="{edu.upc.dmag}AbstractAction"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformingRequirement", propOrder = {
    "performingConcept",
    "performedAction",
    "performedConcept",
    "performedAbstractAction"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class PerformingRequirement
    extends Requirement
{

    @XmlElement(name = "performing_concept")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content performingConcept;
    @XmlElement(name = "performed_action")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Action performedAction;
    @XmlElement(name = "performed_concept")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content performedConcept;
    @XmlElement(name = "performed_abstract_action")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected AbstractAction performedAbstractAction;

    /**
     * Obtiene el valor de la propiedad performingConcept.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getPerformingConcept() {
        return performingConcept;
    }

    /**
     * Define el valor de la propiedad performingConcept.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setPerformingConcept(Content value) {
        this.performingConcept = value;
    }

    /**
     * Obtiene el valor de la propiedad performedAction.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Action getPerformedAction() {
        return performedAction;
    }

    /**
     * Define el valor de la propiedad performedAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setPerformedAction(Action value) {
        this.performedAction = value;
    }

    /**
     * Obtiene el valor de la propiedad performedConcept.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getPerformedConcept() {
        return performedConcept;
    }

    /**
     * Define el valor de la propiedad performedConcept.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setPerformedConcept(Content value) {
        this.performedConcept = value;
    }

    /**
     * Obtiene el valor de la propiedad performedAbstractAction.
     * 
     * @return
     *     possible object is
     *     {@link AbstractAction }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public AbstractAction getPerformedAbstractAction() {
        return performedAbstractAction;
    }

    /**
     * Define el valor de la propiedad performedAbstractAction.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractAction }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setPerformedAbstractAction(AbstractAction value) {
        this.performedAbstractAction = value;
    }

}
