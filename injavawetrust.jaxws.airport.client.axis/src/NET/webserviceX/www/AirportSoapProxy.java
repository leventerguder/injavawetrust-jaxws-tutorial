package NET.webserviceX.www;

public class AirportSoapProxy implements NET.webserviceX.www.AirportSoap {
  private String _endpoint = null;
  private NET.webserviceX.www.AirportSoap airportSoap = null;
  
  public AirportSoapProxy() {
    _initAirportSoapProxy();
  }
  
  public AirportSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initAirportSoapProxy();
  }
  
  private void _initAirportSoapProxy() {
    try {
      airportSoap = (new NET.webserviceX.www.AirportLocator()).getairportSoap();
      if (airportSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)airportSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)airportSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (airportSoap != null)
      ((javax.xml.rpc.Stub)airportSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public NET.webserviceX.www.AirportSoap getAirportSoap() {
    if (airportSoap == null)
      _initAirportSoapProxy();
    return airportSoap;
  }
  
  public java.lang.String getAirportInformationByISOCountryCode(java.lang.String countryAbbrviation) throws java.rmi.RemoteException{
    if (airportSoap == null)
      _initAirportSoapProxy();
    return airportSoap.getAirportInformationByISOCountryCode(countryAbbrviation);
  }
  
  public java.lang.String getAirportInformationByCityOrAirportName(java.lang.String cityOrAirportName) throws java.rmi.RemoteException{
    if (airportSoap == null)
      _initAirportSoapProxy();
    return airportSoap.getAirportInformationByCityOrAirportName(cityOrAirportName);
  }
  
  public java.lang.String getAirportInformationByCountry(java.lang.String country) throws java.rmi.RemoteException{
    if (airportSoap == null)
      _initAirportSoapProxy();
    return airportSoap.getAirportInformationByCountry(country);
  }
  
  public java.lang.String getAirportInformationByAirportCode(java.lang.String airportCode) throws java.rmi.RemoteException{
    if (airportSoap == null)
      _initAirportSoapProxy();
    return airportSoap.getAirportInformationByAirportCode(airportCode);
  }
  
  
}