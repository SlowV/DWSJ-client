/**
 * Xmlcomment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.quanganh9x.springwsclient.endpoint.user;

public class Xmlcomment  implements java.io.Serializable {
    private int id;

    private java.lang.String content;

    private com.quanganh9x.springwsclient.endpoint.user.Xmluser user;

    private com.quanganh9x.springwsclient.endpoint.user.Xmlplace place;

    private java.util.Date createdAt;

    private java.util.Date updatedAt;

    public Xmlcomment() {
    }

    public Xmlcomment(
           int id,
           java.lang.String content,
           com.quanganh9x.springwsclient.endpoint.user.Xmluser user,
           com.quanganh9x.springwsclient.endpoint.user.Xmlplace place,
           java.util.Date createdAt,
           java.util.Date updatedAt) {
           this.id = id;
           this.content = content;
           this.user = user;
           this.place = place;
           this.createdAt = createdAt;
           this.updatedAt = updatedAt;
    }


    /**
     * Gets the id value for this Xmlcomment.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Xmlcomment.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the content value for this Xmlcomment.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this Xmlcomment.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the user value for this Xmlcomment.
     * 
     * @return user
     */
    public com.quanganh9x.springwsclient.endpoint.user.Xmluser getUser() {
        return user;
    }


    /**
     * Sets the user value for this Xmlcomment.
     * 
     * @param user
     */
    public void setUser(com.quanganh9x.springwsclient.endpoint.user.Xmluser user) {
        this.user = user;
    }


    /**
     * Gets the place value for this Xmlcomment.
     * 
     * @return place
     */
    public com.quanganh9x.springwsclient.endpoint.user.Xmlplace getPlace() {
        return place;
    }


    /**
     * Sets the place value for this Xmlcomment.
     * 
     * @param place
     */
    public void setPlace(com.quanganh9x.springwsclient.endpoint.user.Xmlplace place) {
        this.place = place;
    }


    /**
     * Gets the createdAt value for this Xmlcomment.
     * 
     * @return createdAt
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }


    /**
     * Sets the createdAt value for this Xmlcomment.
     * 
     * @param createdAt
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * Gets the updatedAt value for this Xmlcomment.
     * 
     * @return updatedAt
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }


    /**
     * Sets the updatedAt value for this Xmlcomment.
     * 
     * @param updatedAt
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xmlcomment)) return false;
        Xmlcomment other = (Xmlcomment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.place==null && other.getPlace()==null) || 
             (this.place!=null &&
              this.place.equals(other.getPlace()))) &&
            ((this.createdAt==null && other.getCreatedAt()==null) || 
             (this.createdAt!=null &&
              this.createdAt.equals(other.getCreatedAt()))) &&
            ((this.updatedAt==null && other.getUpdatedAt()==null) || 
             (this.updatedAt!=null &&
              this.updatedAt.equals(other.getUpdatedAt())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getId();
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getPlace() != null) {
            _hashCode += getPlace().hashCode();
        }
        if (getCreatedAt() != null) {
            _hashCode += getCreatedAt().hashCode();
        }
        if (getUpdatedAt() != null) {
            _hashCode += getUpdatedAt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Xmlcomment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "xmlcomment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "xmluser"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("place");
        elemField.setXmlName(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "place"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "xmlplace"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdAt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "createdAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedAt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "updatedAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
