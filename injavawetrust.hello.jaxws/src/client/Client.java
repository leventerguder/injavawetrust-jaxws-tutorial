package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import service.MessageWriter;

//1- run the WebServicePublisher
//2- test Client.java

public class Client {

	private static String WEB_SERVICE_WSDL_URL = "http://localhost:8888/injavawetrust/hello.jaxws?wsdl";

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL(WEB_SERVICE_WSDL_URL);

		QName qname = new QName("http://service/", "MessageWriterImplService");
		Service service = Service.create(url, qname);

		MessageWriter hello = service.getPort(MessageWriter.class);

		String welcomeMessage = hello.getWelcomeMessage("Levent");
		System.out.println(welcomeMessage);
	}
}
