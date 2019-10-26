/**
 * GetRatingRes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.quanganh9x.springwsclient.endpoint.rating;

public class GetRatingRes  implements java.io.Serializable {
    private com.quanganh9x.springwsclient.endpoint.rating.Xmlrating rating;

    public GetRatingRes() {
    }

    public GetRatingRes(
           com.quanganh9x.springwsclient.endpoint.rating.Xmlrating rating) {
           this.rating = rating;
    }


    /**
     * Gets the rating value for this GetRatingRes.
     * 
     * @return rating
     */
    public com.quanganh9x.springwsclient.endpoint.rating.Xmlrating getRating() {
        return rating;
    }


    /**
     * Sets the rating value for this GetRatingRes.
     * 
     * @param rating
     */
    public void setRating(com.quanganh9x.springwsclient.endpoint.rating.Xmlrating rating) {
        this.rating = rating;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRatingRes)) return false;
        GetRatingRes other = (GetRatingRes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rating==null && other.getRating()==null) || 
             (this.rating!=null &&
              this.rating.equals(other.getRating())));
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
        if (getRating() != null) {
            _hashCode += getRating().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRatingRes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://quanganh9x.com/soap", ">getRatingRes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "xmlrating"));
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
