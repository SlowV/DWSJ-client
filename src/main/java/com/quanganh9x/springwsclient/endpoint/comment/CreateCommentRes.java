/**
 * CreateCommentRes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.quanganh9x.springwsclient.endpoint.comment;

public class CreateCommentRes  implements java.io.Serializable {
    private com.quanganh9x.springwsclient.endpoint.comment.Xmlcomment comment;

    public CreateCommentRes() {
    }

    public CreateCommentRes(
           com.quanganh9x.springwsclient.endpoint.comment.Xmlcomment comment) {
           this.comment = comment;
    }


    /**
     * Gets the comment value for this CreateCommentRes.
     * 
     * @return comment
     */
    public com.quanganh9x.springwsclient.endpoint.comment.Xmlcomment getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this CreateCommentRes.
     * 
     * @param comment
     */
    public void setComment(com.quanganh9x.springwsclient.endpoint.comment.Xmlcomment comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCommentRes)) return false;
        CreateCommentRes other = (CreateCommentRes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCommentRes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://quanganh9x.com/soap", ">createCommentRes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "xmlcomment"));
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