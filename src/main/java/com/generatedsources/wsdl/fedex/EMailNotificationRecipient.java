
package com.generatedsources.wsdl.fedex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMailNotificationRecipient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMailNotificationRecipient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EMailNotificationRecipientType" type="{http://fedex.com/ws/track/v10}EMailNotificationRecipientType" minOccurs="0"/&gt;
 *         &lt;element name="EMailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NotificationEventsRequested" type="{http://fedex.com/ws/track/v10}EMailNotificationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Format" type="{http://fedex.com/ws/track/v10}EMailNotificationFormatType"/&gt;
 *         &lt;element name="Localization" type="{http://fedex.com/ws/track/v10}Localization" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMailNotificationRecipient", propOrder = {
    "eMailNotificationRecipientType",
    "eMailAddress",
    "notificationEventsRequested",
    "format",
    "localization"
})
public class EMailNotificationRecipient {

    @XmlElement(name = "EMailNotificationRecipientType")
    @XmlSchemaType(name = "string")
    protected EMailNotificationRecipientType eMailNotificationRecipientType;
    @XmlElement(name = "EMailAddress", required = true)
    protected String eMailAddress;
    @XmlElement(name = "NotificationEventsRequested")
    @XmlSchemaType(name = "string")
    protected List<EMailNotificationEventType> notificationEventsRequested;
    @XmlElement(name = "Format", required = true)
    @XmlSchemaType(name = "string")
    protected EMailNotificationFormatType format;
    @XmlElement(name = "Localization")
    protected Localization localization;

    /**
     * Gets the value of the eMailNotificationRecipientType property.
     * 
     * @return
     *     possible object is
     *     {@link EMailNotificationRecipientType }
     *     
     */
    public EMailNotificationRecipientType getEMailNotificationRecipientType() {
        return eMailNotificationRecipientType;
    }

    /**
     * Sets the value of the eMailNotificationRecipientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailNotificationRecipientType }
     *     
     */
    public void setEMailNotificationRecipientType(EMailNotificationRecipientType value) {
        this.eMailNotificationRecipientType = value;
    }

    /**
     * Gets the value of the eMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailAddress() {
        return eMailAddress;
    }

    /**
     * Sets the value of the eMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailAddress(String value) {
        this.eMailAddress = value;
    }

    /**
     * Gets the value of the notificationEventsRequested property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationEventsRequested property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationEventsRequested().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMailNotificationEventType }
     * 
     * 
     */
    public List<EMailNotificationEventType> getNotificationEventsRequested() {
        if (notificationEventsRequested == null) {
            notificationEventsRequested = new ArrayList<EMailNotificationEventType>();
        }
        return this.notificationEventsRequested;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link EMailNotificationFormatType }
     *     
     */
    public EMailNotificationFormatType getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailNotificationFormatType }
     *     
     */
    public void setFormat(EMailNotificationFormatType value) {
        this.format = value;
    }

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link Localization }
     *     
     */
    public Localization getLocalization() {
        return localization;
    }

    /**
     * Sets the value of the localization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Localization }
     *     
     */
    public void setLocalization(Localization value) {
        this.localization = value;
    }

}
