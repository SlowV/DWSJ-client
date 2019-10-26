/**
 * Xmlplace.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.quanganh9x.springwsclient.endpoint.image;

public class Xmlplace  implements java.io.Serializable {
    private int id;

    private java.lang.String name;

    private java.lang.String description;

    private com.quanganh9x.springwsclient.endpoint.image.Xmlrating[] ratings;

    private com.quanganh9x.springwsclient.endpoint.image.Xmlplace[] places;

    private com.quanganh9x.springwsclient.endpoint.image.Xmlimage[] images;

    private java.util.Date createdAt;

    private java.util.Date updatedAt;

    public Xmlplace() {
    }

    public Xmlplace(
           int id,
           java.lang.String name,
           java.lang.String description,
           com.quanganh9x.springwsclient.endpoint.image.Xmlrating[] ratings,
           com.quanganh9x.springwsclient.endpoint.image.Xmlplace[] places,
           com.quanganh9x.springwsclient.endpoint.image.Xmlimage[] images,
           java.util.Date createdAt,
           java.util.Date updatedAt) {
           this.id = id;
           this.name = name;
           this.description = description;
           this.ratings = ratings;
           this.places = places;
           this.images = images;
           this.createdAt = createdAt;
           this.updatedAt = updatedAt;
    }


    /**
     * Gets the id value for this Xmlplace.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Xmlplace.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Xmlplace.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Xmlplace.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this Xmlplace.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Xmlplace.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the ratings value for this Xmlplace.
     * 
     * @return ratings
     */
    public com.quanganh9x.springwsclient.endpoint.image.Xmlrating[] getRatings() {
        return ratings;
    }


    /**
     * Sets the ratings value for this Xmlplace.
     * 
     * @param ratings
     */
    public void setRatings(com.quanganh9x.springwsclient.endpoint.image.Xmlrating[] ratings) {
        this.ratings = ratings;
    }

    public com.quanganh9x.springwsclient.endpoint.image.Xmlrating getRatings(int i) {
        return this.ratings[i];
    }

    public void setRatings(int i, com.quanganh9x.springwsclient.endpoint.image.Xmlrating _value) {
        this.ratings[i] = _value;
    }


    /**
     * Gets the places value for this Xmlplace.
     * 
     * @return places
     */
    public com.quanganh9x.springwsclient.endpoint.image.Xmlplace[] getPlaces() {
        return places;
    }


    /**
     * Sets the places value for this Xmlplace.
     * 
     * @param places
     */
    public void setPlaces(com.quanganh9x.springwsclient.endpoint.image.Xmlplace[] places) {
        this.places = places;
    }

    public com.quanganh9x.springwsclient.endpoint.image.Xmlplace getPlaces(int i) {
        return this.places[i];
    }

    public void setPlaces(int i, com.quanganh9x.springwsclient.endpoint.image.Xmlplace _value) {
        this.places[i] = _value;
    }


    /**
     * Gets the images value for this Xmlplace.
     * 
     * @return images
     */
    public com.quanganh9x.springwsclient.endpoint.image.Xmlimage[] getImages() {
        return images;
    }


    /**
     * Sets the images value for this Xmlplace.
     * 
     * @param images
     */
    public void setImages(com.quanganh9x.springwsclient.endpoint.image.Xmlimage[] images) {
        this.images = images;
    }

    public com.quanganh9x.springwsclient.endpoint.image.Xmlimage getImages(int i) {
        return this.images[i];
    }

    public void setImages(int i, com.quanganh9x.springwsclient.endpoint.image.Xmlimage _value) {
        this.images[i] = _value;
    }


    /**
     * Gets the createdAt value for this Xmlplace.
     * 
     * @return createdAt
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }


    /**
     * Sets the createdAt value for this Xmlplace.
     * 
     * @param createdAt
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * Gets the updatedAt value for this Xmlplace.
     * 
     * @return updatedAt
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }


    /**
     * Sets the updatedAt value for this Xmlplace.
     * 
     * @param updatedAt
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xmlplace)) return false;
        Xmlplace other = (Xmlplace) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.ratings==null && other.getRatings()==null) || 
             (this.ratings!=null &&
              java.util.Arrays.equals(this.ratings, other.getRatings()))) &&
            ((this.places==null && other.getPlaces()==null) || 
             (this.places!=null &&
              java.util.Arrays.equals(this.places, other.getPlaces()))) &&
            ((this.images==null && other.getImages()==null) || 
             (this.images!=null &&
              java.util.Arrays.equals(this.images, other.getImages()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getRatings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRatings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(Xmlplace.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "xmlplace"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "ratings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "xmlrating"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("places");
        elemField.setXmlName(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "places"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "xmlplace"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("images");
        elemField.setXmlName(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "images"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "xmlimage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
