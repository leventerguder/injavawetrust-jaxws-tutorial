package ws.service;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(endpointInterface = "ws.service.MessageWriter")
@HandlerChain(file="ws/config/handler-server-config.xml")
public class MessageWriterImpl implements MessageWriter {

	@Override
	public String getWelcomeMessage(String name, String surname) {
		return "Welcome , " + name + " " + surname + ". This message is sent by MessageWriterImpl#getWelcomeMessage.";
	}

}
