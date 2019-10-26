
package com.quanganh9x.springwsclient.endpoint.comment;

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
 *         &lt;element name="comment" type="{http://quanganh9x.com/soap}xmlcomment"/>
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
    "comment"
})
@XmlRootElement(name = "getCommentRes")
public class GetCommentRes {

    @XmlElement(required = true)
    protected Xmlcomment comment;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Xmlcomment }
     *     
     */
    public Xmlcomment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Xmlcomment }
     *     
     */
    public void setComment(Xmlcomment value) {
        this.comment = value;
    }

}
