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
 * <p>Clase Java para Decision complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Decision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{edu.upc.dmag}AbstractContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="author" type="{edu.upc.dmag}Author" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="regarding" type="{edu.upc.dmag}Content" minOccurs="0"/&gt;
 *           &lt;element name="regarding_action" type="{edu.upc.dmag}action" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="based_on_content" type="{edu.upc.dmag}Content" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Decision", propOrder = {
    "author",
    "regarding",
    "regardingAction",
    "basedOnContent"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class Decision
    extends AbstractContent
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Author author;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content regarding;
    @XmlElement(name = "regarding_action")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Action regardingAction;
    @XmlElement(name = "based_on_content")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content basedOnContent;

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
     * Obtiene el valor de la propiedad regarding.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getRegarding() {
        return regarding;
    }

    /**
     * Define el valor de la propiedad regarding.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setRegarding(Content value) {
        this.regarding = value;
    }

    /**
     * Obtiene el valor de la propiedad regardingAction.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Action getRegardingAction() {
        return regardingAction;
    }

    /**
     * Define el valor de la propiedad regardingAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setRegardingAction(Action value) {
        this.regardingAction = value;
    }

    /**
     * Obtiene el valor de la propiedad basedOnContent.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getBasedOnContent() {
        return basedOnContent;
    }

    /**
     * Define el valor de la propiedad basedOnContent.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setBasedOnContent(Content value) {
        this.basedOnContent = value;
    }

}
