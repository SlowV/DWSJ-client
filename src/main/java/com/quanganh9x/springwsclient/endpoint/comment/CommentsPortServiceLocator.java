/**
 * CommentsPortServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.quanganh9x.springwsclient.endpoint.comment;

public class CommentsPortServiceLocator extends org.apache.axis.client.Service implements com.quanganh9x.springwsclient.endpoint.comment.CommentsPortService {

    public CommentsPortServiceLocator() {
    }


    public CommentsPortServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CommentsPortServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CommentsPortSoap11
    private java.lang.String CommentsPortSoap11_address = "http://34.83.241.129:8080/ws";

    public java.lang.String getCommentsPortSoap11Address() {
        return CommentsPortSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CommentsPortSoap11WSDDServiceName = "CommentsPortSoap11";

    public java.lang.String getCommentsPortSoap11WSDDServiceName() {
        return CommentsPortSoap11WSDDServiceName;
    }

    public void setCommentsPortSoap11WSDDServiceName(java.lang.String name) {
        CommentsPortSoap11WSDDServiceName = name;
    }

    public com.quanganh9x.springwsclient.endpoint.comment.CommentsPort getCommentsPortSoap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CommentsPortSoap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCommentsPortSoap11(endpoint);
    }

    public com.quanganh9x.springwsclient.endpoint.comment.CommentsPort getCommentsPortSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.quanganh9x.springwsclient.endpoint.comment.CommentsPortSoap11Stub _stub = new com.quanganh9x.springwsclient.endpoint.comment.CommentsPortSoap11Stub(portAddress, this);
            _stub.setPortName(getCommentsPortSoap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCommentsPortSoap11EndpointAddress(java.lang.String address) {
        CommentsPortSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.quanganh9x.springwsclient.endpoint.comment.CommentsPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.quanganh9x.springwsclient.endpoint.comment.CommentsPortSoap11Stub _stub = new com.quanganh9x.springwsclient.endpoint.comment.CommentsPortSoap11Stub(new java.net.URL(CommentsPortSoap11_address), this);
                _stub.setPortName(getCommentsPortSoap11WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CommentsPortSoap11".equals(inputPortName)) {
            return getCommentsPortSoap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://quanganh9x.com/soap", "CommentsPortService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://quanganh9x.com/soap", "CommentsPortSoap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CommentsPortSoap11".equals(portName)) {
            setCommentsPortSoap11EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
