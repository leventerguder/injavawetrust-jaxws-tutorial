/**
 * AirportLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public class AirportLocator extends org.apache.axis.client.Service implements NET.webserviceX.www.Airport {

    public AirportLocator() {
    }


    public AirportLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AirportLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for airportSoap
    private java.lang.String airportSoap_address = "http://www.webservicex.net/airport.asmx";

    public java.lang.String getairportSoapAddress() {
        return airportSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String airportSoapWSDDServiceName = "airportSoap";

    public java.lang.String getairportSoapWSDDServiceName() {
        return airportSoapWSDDServiceName;
    }

    public void setairportSoapWSDDServiceName(java.lang.String name) {
        airportSoapWSDDServiceName = name;
    }

    public NET.webserviceX.www.AirportSoap getairportSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(airportSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getairportSoap(endpoint);
    }

    public NET.webserviceX.www.AirportSoap getairportSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            NET.webserviceX.www.AirportSoapStub _stub = new NET.webserviceX.www.AirportSoapStub(portAddress, this);
            _stub.setPortName(getairportSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setairportSoapEndpointAddress(java.lang.String address) {
        airportSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (NET.webserviceX.www.AirportSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                NET.webserviceX.www.AirportSoapStub _stub = new NET.webserviceX.www.AirportSoapStub(new java.net.URL(airportSoap_address), this);
                _stub.setPortName(getairportSoapWSDDServiceName());
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
        if ("airportSoap".equals(inputPortName)) {
            return getairportSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.webserviceX.NET", "airport");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.webserviceX.NET", "airportSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("airportSoap".equals(portName)) {
            setairportSoapEndpointAddress(address);
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
