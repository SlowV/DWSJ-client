
package com.quanganh9x.springwsclient.endpoint.rating;

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
 *         &lt;element name="rating" type="{http://quanganh9x.com/soap}xmlrating"/>
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
    "rating"
})
@XmlRootElement(name = "createRatingRes")
public class CreateRatingRes {

    @XmlElement(required = true)
    protected Xmlrating rating;

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link Xmlrating }
     *     
     */
    public Xmlrating getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Xmlrating }
     *     
     */
    public void setRating(Xmlrating value) {
        this.rating = value;
    }

}
