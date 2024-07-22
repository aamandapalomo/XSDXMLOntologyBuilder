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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ComponentContent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComponentContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{edu.upc.dmag}AbstractContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="parent_component" type="{edu.upc.dmag}ComponentContent" minOccurs="0"/&gt;
 *           &lt;element name="parent_storage" type="{edu.upc.dmag}StorageComponentContent" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="implicit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="can_only_communicate_over_secure_channel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="goal" type="{edu.upc.dmag}Goal" minOccurs="0"/&gt;
 *         &lt;element name="secure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="intended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="critical" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="safety_related" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="security_related" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="unauthorized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="expired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reused" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="safety_impacting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="cloning_resistant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="modification_resistant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="user-generated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentContent", propOrder = {
    "parentComponent",
    "parentStorage",
    "implicit",
    "canOnlyCommunicateOverSecureChannel",
    "goal",
    "secure",
    "intended",
    "critical",
    "safetyRelated",
    "securityRelated",
    "unauthorized",
    "expired",
    "reused",
    "safetyImpacting",
    "encrypted",
    "cloningResistant",
    "modificationResistant",
    "userGenerated",
    "sensitive"
})
@XmlSeeAlso({
    StorageComponentContent.class,
    AccessComponent.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class ComponentContent
    extends AbstractContent
{

    @XmlElement(name = "parent_component")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected ComponentContent parentComponent;
    @XmlElement(name = "parent_storage")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected StorageComponentContent parentStorage;
    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean implicit;
    @XmlElement(name = "can_only_communicate_over_secure_channel", defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean canOnlyCommunicateOverSecureChannel;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Goal goal;
    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean secure;
    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean intended;
    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean critical;
    @XmlElement(name = "safety_related", defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean safetyRelated;
    @XmlElement(name = "security_related", defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean securityRelated;
    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean unauthorized;
    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean expired;
    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean reused;
    @XmlElement(name = "safety_impacting", defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean safetyImpacting;
    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean encrypted;
    @XmlElement(name = "cloning_resistant", defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean cloningResistant;
    @XmlElement(name = "modification_resistant", defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean modificationResistant;
    @XmlElement(name = "user-generated", defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean userGenerated;
    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected Boolean sensitive;

    /**
     * Obtiene el valor de la propiedad parentComponent.
     * 
     * @return
     *     possible object is
     *     {@link ComponentContent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public ComponentContent getParentComponent() {
        return parentComponent;
    }

    /**
     * Define el valor de la propiedad parentComponent.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentContent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setParentComponent(ComponentContent value) {
        this.parentComponent = value;
    }

    /**
     * Obtiene el valor de la propiedad parentStorage.
     * 
     * @return
     *     possible object is
     *     {@link StorageComponentContent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public StorageComponentContent getParentStorage() {
        return parentStorage;
    }

    /**
     * Define el valor de la propiedad parentStorage.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageComponentContent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setParentStorage(StorageComponentContent value) {
        this.parentStorage = value;
    }

    /**
     * Obtiene el valor de la propiedad implicit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isImplicit() {
        return implicit;
    }

    /**
     * Define el valor de la propiedad implicit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setImplicit(Boolean value) {
        this.implicit = value;
    }

    /**
     * Obtiene el valor de la propiedad canOnlyCommunicateOverSecureChannel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isCanOnlyCommunicateOverSecureChannel() {
        return canOnlyCommunicateOverSecureChannel;
    }

    /**
     * Define el valor de la propiedad canOnlyCommunicateOverSecureChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setCanOnlyCommunicateOverSecureChannel(Boolean value) {
        this.canOnlyCommunicateOverSecureChannel = value;
    }

    /**
     * Obtiene el valor de la propiedad goal.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Goal getGoal() {
        return goal;
    }

    /**
     * Define el valor de la propiedad goal.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setGoal(Goal value) {
        this.goal = value;
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
     * Obtiene el valor de la propiedad intended.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isIntended() {
        return intended;
    }

    /**
     * Define el valor de la propiedad intended.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setIntended(Boolean value) {
        this.intended = value;
    }

    /**
     * Obtiene el valor de la propiedad critical.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isCritical() {
        return critical;
    }

    /**
     * Define el valor de la propiedad critical.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setCritical(Boolean value) {
        this.critical = value;
    }

    /**
     * Obtiene el valor de la propiedad safetyRelated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isSafetyRelated() {
        return safetyRelated;
    }

    /**
     * Define el valor de la propiedad safetyRelated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setSafetyRelated(Boolean value) {
        this.safetyRelated = value;
    }

    /**
     * Obtiene el valor de la propiedad securityRelated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isSecurityRelated() {
        return securityRelated;
    }

    /**
     * Define el valor de la propiedad securityRelated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setSecurityRelated(Boolean value) {
        this.securityRelated = value;
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
     * Obtiene el valor de la propiedad expired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isExpired() {
        return expired;
    }

    /**
     * Define el valor de la propiedad expired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setExpired(Boolean value) {
        this.expired = value;
    }

    /**
     * Obtiene el valor de la propiedad reused.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isReused() {
        return reused;
    }

    /**
     * Define el valor de la propiedad reused.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setReused(Boolean value) {
        this.reused = value;
    }

    /**
     * Obtiene el valor de la propiedad safetyImpacting.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isSafetyImpacting() {
        return safetyImpacting;
    }

    /**
     * Define el valor de la propiedad safetyImpacting.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setSafetyImpacting(Boolean value) {
        this.safetyImpacting = value;
    }

    /**
     * Obtiene el valor de la propiedad encrypted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * Define el valor de la propiedad encrypted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setEncrypted(Boolean value) {
        this.encrypted = value;
    }

    /**
     * Obtiene el valor de la propiedad cloningResistant.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isCloningResistant() {
        return cloningResistant;
    }

    /**
     * Define el valor de la propiedad cloningResistant.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setCloningResistant(Boolean value) {
        this.cloningResistant = value;
    }

    /**
     * Obtiene el valor de la propiedad modificationResistant.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isModificationResistant() {
        return modificationResistant;
    }

    /**
     * Define el valor de la propiedad modificationResistant.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setModificationResistant(Boolean value) {
        this.modificationResistant = value;
    }

    /**
     * Obtiene el valor de la propiedad userGenerated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isUserGenerated() {
        return userGenerated;
    }

    /**
     * Define el valor de la propiedad userGenerated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setUserGenerated(Boolean value) {
        this.userGenerated = value;
    }

    /**
     * Obtiene el valor de la propiedad sensitive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public Boolean isSensitive() {
        return sensitive;
    }

    /**
     * Define el valor de la propiedad sensitive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public void setSensitive(Boolean value) {
        this.sensitive = value;
    }

}
