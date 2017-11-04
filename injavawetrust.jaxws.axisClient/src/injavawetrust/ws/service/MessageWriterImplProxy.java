package injavawetrust.ws.service;

public class MessageWriterImplProxy implements injavawetrust.ws.service.MessageWriterImpl {
  private String _endpoint = null;
  private injavawetrust.ws.service.MessageWriterImpl messageWriterImpl = null;
  
  public MessageWriterImplProxy() {
    _initMessageWriterImplProxy();
  }
  
  public MessageWriterImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initMessageWriterImplProxy();
  }
  
  private void _initMessageWriterImplProxy() {
    try {
      messageWriterImpl = (new injavawetrust.ws.service.MessageWriterImplServiceLocator()).getMessageWriterImpl();
      if (messageWriterImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)messageWriterImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)messageWriterImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (messageWriterImpl != null)
      ((javax.xml.rpc.Stub)messageWriterImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public injavawetrust.ws.service.MessageWriterImpl getMessageWriterImpl() {
    if (messageWriterImpl == null)
      _initMessageWriterImplProxy();
    return messageWriterImpl;
  }
  
  public java.lang.String getWelcomeMessage(java.lang.String name, java.lang.String surname) throws java.rmi.RemoteException{
    if (messageWriterImpl == null)
      _initMessageWriterImplProxy();
    return messageWriterImpl.getWelcomeMessage(name, surname);
  }
  
  
}