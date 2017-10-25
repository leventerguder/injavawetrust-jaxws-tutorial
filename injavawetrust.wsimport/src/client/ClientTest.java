package client;

import injavawetrust.ws.service.MessageWriter;
import injavawetrust.ws.service.MessageWriterImplService;

public class ClientTest {

	public static void main(String[] args) {
		MessageWriterImplService service = new MessageWriterImplService();
		MessageWriter messageWriter = service.getMessageWriterImplPort();
		String message = messageWriter.getWelcomeMessage("levent", "erguder");
		System.out.println(message);
	}
}

// 1) run , injavawetrust.hello.jaxws project WebServicePublisher.java
