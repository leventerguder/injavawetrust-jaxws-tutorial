package ws.publisher;

import javax.xml.ws.Endpoint;

import ws.service.MessageWriterImpl;

public class WebServicePublisher {

	private static String WEB_SERVICE_URL = "http://localhost:8888/injavawetrust/hello.jaxws";

	public static void main(String[] args) {
		Endpoint.publish(WEB_SERVICE_URL, new MessageWriterImpl());
		System.out.println("Web Service is started.");
	}
}