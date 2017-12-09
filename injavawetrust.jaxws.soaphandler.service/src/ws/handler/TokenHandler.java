package ws.handler;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPFaultException;

public class TokenHandler implements SOAPHandler<SOAPMessageContext> {

	private final String validTokenValue = "token12345";

	@Override
	public boolean handleMessage(SOAPMessageContext context) {

		// Standard property: message direction, true for outbound messages,
		// false for inbound.
		Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		// if this is an incoming message from the client
		if (!outbound) {
			System.out.println("TokenHandler#handleMessage working...");
			try {
				// Get the SOAPMessage , SOAPEnvelope and SOAPHeader
				SOAPMessage soapMsg = context.getMessage();
				SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
				SOAPHeader soapHeader = soapEnv.getHeader();

				Iterator<?> headerIterator = soapHeader.extractHeaderElements(SOAPConstants.URI_SOAP_ACTOR_NEXT);

				if (headerIterator == null || !headerIterator.hasNext()) {
					generateSOAPErrorMessage(soapMsg, "No SOAP header.");

				}

				Node propertyNode = (Node) headerIterator.next();

				String tokenValueFromClient = null;

				if (propertyNode != null) {
					tokenValueFromClient = propertyNode.getValue();

				}
				System.out.println(tokenValueFromClient);
				if (validTokenValue.equals(tokenValueFromClient)) {
					System.out.println("Valid Token");
					soapMsg.writeTo(System.out);
				} else {
					generateSOAPErrorMessage(soapMsg, "Invalid Token.");
				}

			} catch (SOAPException | SOAPFaultException | IOException e) {
				e.printStackTrace();
				//return false if someting wrong
				return false;
			}

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

	private void generateSOAPErrorMessage(SOAPMessage msg, String reason) throws SOAPException {
		SOAPBody soapBody = msg.getSOAPPart().getEnvelope().getBody();
		SOAPFault soapFault = soapBody.addFault();
		soapFault.setFaultString(reason);
		throw new SOAPFaultException(soapFault);
	}
}
