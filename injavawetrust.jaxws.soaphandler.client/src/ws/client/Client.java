package ws.client;

import java.net.MalformedURLException;

import ws.service.MessageWriterImplService;

//1- run the WebServicePublisher
//2- test Client.java

public class Client {
	
	public static void main(String[] args) throws MalformedURLException {

		MessageWriterImplService s = new MessageWriterImplService();
		String msg = s.getMessageWriterImplPort().getWelcomeMessage("levent", "erguder");
		System.out.println(msg);

	}
}
