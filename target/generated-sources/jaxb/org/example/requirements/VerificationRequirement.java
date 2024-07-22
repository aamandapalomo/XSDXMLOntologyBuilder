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
 * <p>Clase Java para VerificationRequirement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VerificationRequirement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{edu.upc.dmag}Requirement"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="verified_content" type="{edu.upc.dmag}Content"/&gt;
 *         &lt;element name="verified_event" type="{edu.upc.dmag}Event"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationRequirement", propOrder = {
    "verifiedContent",
    "verifiedEvent"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class VerificationRequirement
    extends Requirement
{

    @XmlElement(name = "verified_content")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Content verifiedContent;
    @XmlElement(name = "verified_event")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Event verifiedEvent;

    /**
     * Obtiene el valor de la propiedad verifiedContent.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Content getVerifiedContent() {
        return verifiedContent;
    }

    /**
     * Define el valor de la propiedad verifiedContent.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setVerifiedContent(Content value) {
        this.verifiedContent = value;
    }

    /**
     * Obtiene el valor de la propiedad verifiedEvent.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Event getVerifiedEvent() {
        return verifiedEvent;
    }

    /**
     * Define el valor de la propiedad verifiedEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setVerifiedEvent(Event value) {
        this.verifiedEvent = value;
    }

}
