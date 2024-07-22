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
 * <p>Clase Java para Practice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Practice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{edu.upc.dmag}AbstractContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="practice_for_content" type="{edu.upc.dmag}Content"/&gt;
 *           &lt;element name="practice_for_goal" type="{edu.upc.dmag}Goal"/&gt;
 *           &lt;element name="practice_for_action" type="{edu.upc.dmag}action"/&gt;
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
@XmlType(name = "Practice", propOrder = {
    "practiceForContent",
    "practiceForGoal",
    "practiceForAction"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class Practice
    extends AbstractContent
{

    @XmlElement(name = "practice_for_content")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content practiceForContent;
    @XmlElement(name = "practice_for_goal")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Goal practiceForGoal;
    @XmlElement(name = "practice_for_action")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Action practiceForAction;

    /**
     * Obtiene el valor de la propiedad practiceForContent.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getPracticeForContent() {
        return practiceForContent;
    }

    /**
     * Define el valor de la propiedad practiceForContent.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setPracticeForContent(Content value) {
        this.practiceForContent = value;
    }

    /**
     * Obtiene el valor de la propiedad practiceForGoal.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Goal getPracticeForGoal() {
        return practiceForGoal;
    }

    /**
     * Define el valor de la propiedad practiceForGoal.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setPracticeForGoal(Goal value) {
        this.practiceForGoal = value;
    }

    /**
     * Obtiene el valor de la propiedad practiceForAction.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Action getPracticeForAction() {
        return practiceForAction;
    }

    /**
     * Define el valor de la propiedad practiceForAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setPracticeForAction(Action value) {
        this.practiceForAction = value;
    }

}
