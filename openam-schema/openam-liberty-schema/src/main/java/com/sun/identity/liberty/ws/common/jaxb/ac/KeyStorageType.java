//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.common.jaxb.ac;


/**
 * Java content class for KeyStorageType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/liberty/lib-arch-authentication-context.xsd line 701)
 * <p>
 * <pre>
 * &lt;complexType name="KeyStorageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="medium" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="memory"/>
 *             &lt;enumeration value="smartcard"/>
 *             &lt;enumeration value="token"/>
 *             &lt;enumeration value="MobileDevice"/>
 *             &lt;enumeration value="MobileAuthCard"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface KeyStorageType {


    /**
     * Gets the value of the medium property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getMedium();

    /**
     * Sets the value of the medium property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setMedium(java.lang.String value);

}
