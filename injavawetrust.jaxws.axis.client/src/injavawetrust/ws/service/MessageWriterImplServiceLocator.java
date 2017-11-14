/**
 * MessageWriterImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package injavawetrust.ws.service;

public class MessageWriterImplServiceLocator extends org.apache.axis.client.Service implements injavawetrust.ws.service.MessageWriterImplService {

    public MessageWriterImplServiceLocator() {
    }


    public MessageWriterImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MessageWriterImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MessageWriterImpl
    private java.lang.String MessageWriterImpl_address = "http://localhost:8080/injavawetrust.jaxws.axis/services/MessageWriterImpl";

    public java.lang.String getMessageWriterImplAddress() {
        return MessageWriterImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MessageWriterImplWSDDServiceName = "MessageWriterImpl";

    public java.lang.String getMessageWriterImplWSDDServiceName() {
        return MessageWriterImplWSDDServiceName;
    }

    public void setMessageWriterImplWSDDServiceName(java.lang.String name) {
        MessageWriterImplWSDDServiceName = name;
    }

    public injavawetrust.ws.service.MessageWriterImpl getMessageWriterImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MessageWriterImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMessageWriterImpl(endpoint);
    }

    public injavawetrust.ws.service.MessageWriterImpl getMessageWriterImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            injavawetrust.ws.service.MessageWriterImplSoapBindingStub _stub = new injavawetrust.ws.service.MessageWriterImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getMessageWriterImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMessageWriterImplEndpointAddress(java.lang.String address) {
        MessageWriterImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (injavawetrust.ws.service.MessageWriterImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                injavawetrust.ws.service.MessageWriterImplSoapBindingStub _stub = new injavawetrust.ws.service.MessageWriterImplSoapBindingStub(new java.net.URL(MessageWriterImpl_address), this);
                _stub.setPortName(getMessageWriterImplWSDDServiceName());
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
        if ("MessageWriterImpl".equals(inputPortName)) {
            return getMessageWriterImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.ws.injavawetrust", "MessageWriterImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.ws.injavawetrust", "MessageWriterImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MessageWriterImpl".equals(portName)) {
            setMessageWriterImplEndpointAddress(address);
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
