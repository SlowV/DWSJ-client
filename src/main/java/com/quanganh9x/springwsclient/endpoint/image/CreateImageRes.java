
package com.quanganh9x.springwsclient.endpoint.image;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="image" type="{http://quanganh9x.com/soap}xmlimage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "image"
})
@XmlRootElement(name = "createImageRes")
public class CreateImageRes {

    @XmlElement(required = true)
    protected Xmlimage image;

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Xmlimage }
     *     
     */
    public Xmlimage getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Xmlimage }
     *     
     */
    public void setImage(Xmlimage value) {
        this.image = value;
    }

}
