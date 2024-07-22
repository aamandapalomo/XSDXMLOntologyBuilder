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
 * <p>Clase Java para GoalToConsiderContentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GoalToConsiderContentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contentToConsider" type="{edu.upc.dmag}Content"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoalToConsiderContentType", propOrder = {
    "contentToConsider"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class GoalToConsiderContentType {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content contentToConsider;

    /**
     * Obtiene el valor de la propiedad contentToConsider.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getContentToConsider() {
        return contentToConsider;
    }

    /**
     * Define el valor de la propiedad contentToConsider.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setContentToConsider(Content value) {
        this.contentToConsider = value;
    }

}
