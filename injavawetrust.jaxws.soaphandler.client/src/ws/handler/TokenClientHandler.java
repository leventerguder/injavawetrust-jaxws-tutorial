package ws.handler;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class TokenClientHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext context) {

		System.out.println("TokentClientHandler # handleMessage...");

		try {
			SOAPMessage soapMsg = context.getMessage();
			SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
			SOAPHeader soapHeader = soapEnv.getHeader();

			// add the property to the header
			QName qname = new QName("http://service.ws.injavawetrust/", "TOKEN");
			
			// Create a new HeaderElement in order to place the new property
			SOAPHeaderElement soapHeaderElement = soapHeader.addHeaderElement(qname);

			soapHeaderElement.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
			soapHeaderElement.addTextNode("RANDOM");
			soapMsg.saveChanges();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return true;
	}
	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return false;
	}

	@Override
	public void close(MessageContext context) {
		
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

}
