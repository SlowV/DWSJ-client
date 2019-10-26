
package com.quanganh9x.springwsclient.endpoint.place;

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
 *         &lt;element name="place" type="{http://quanganh9x.com/soap}xmlplace"/>
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
    "place"
})
@XmlRootElement(name = "getPlaceRes")
public class GetPlaceRes {

    @XmlElement(required = true)
    protected Xmlplace place;

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link Xmlplace }
     *     
     */
    public Xmlplace getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link Xmlplace }
     *     
     */
    public void setPlace(Xmlplace value) {
        this.place = value;
    }

}
