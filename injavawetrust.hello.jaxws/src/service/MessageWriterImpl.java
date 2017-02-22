package service;

import javax.jws.WebService;

@WebService(endpointInterface = "service.MessageWriter")
public class MessageWriterImpl implements MessageWriter {

	@Override
	public String getWelcomeMessage(String name) {
		return "Welcome , " + name + ". This message is sent by MessageWriterImpl#getWelcomeMessage.";
	}

}
