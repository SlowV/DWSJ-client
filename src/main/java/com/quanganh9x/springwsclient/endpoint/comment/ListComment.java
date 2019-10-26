
package com.quanganh9x.springwsclient.endpoint.comment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="placeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "placeId"
})
@XmlRootElement(name = "listComment")
public class ListComment {

    protected int placeId;

    /**
     * Gets the value of the placeId property.
     * 
     */
    public int getPlaceId() {
        return placeId;
    }

    /**
     * Sets the value of the placeId property.
     * 
     */
    public void setPlaceId(int value) {
        this.placeId = value;
    }

}
