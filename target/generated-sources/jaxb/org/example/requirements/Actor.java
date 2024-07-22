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
 * <p>Clase Java para Actor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Actor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{edu.upc.dmag}AbstractContent"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="responsible_of_content" type="{edu.upc.dmag}Content" minOccurs="0"/&gt;
 *         &lt;element name="responsible_of_documentation" type="{edu.upc.dmag}Documentation" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Actor", propOrder = {
    "responsibleOfContent",
    "responsibleOfDocumentation"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class Actor
    extends AbstractContent
{

    @XmlElement(name = "responsible_of_content")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content responsibleOfContent;
    @XmlElement(name = "responsible_of_documentation")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Documentation responsibleOfDocumentation;

    /**
     * Obtiene el valor de la propiedad responsibleOfContent.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getResponsibleOfContent() {
        return responsibleOfContent;
    }

    /**
     * Define el valor de la propiedad responsibleOfContent.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setResponsibleOfContent(Content value) {
        this.responsibleOfContent = value;
    }

    /**
     * Obtiene el valor de la propiedad responsibleOfDocumentation.
     * 
     * @return
     *     possible object is
     *     {@link Documentation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Documentation getResponsibleOfDocumentation() {
        return responsibleOfDocumentation;
    }

    /**
     * Define el valor de la propiedad responsibleOfDocumentation.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setResponsibleOfDocumentation(Documentation value) {
        this.responsibleOfDocumentation = value;
    }

}
