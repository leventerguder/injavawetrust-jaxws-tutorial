package publisher;

import javax.xml.ws.Endpoint;

import service.TraceWriterImpl;

public class WebServicePublisher {

	private static String WEB_SERVICE_URL = "http://localhost:8888/injavawetrust/trace.writer?wsdl";

	public static void main(String[] args) {
		Endpoint.publish(WEB_SERVICE_URL, new TraceWriterImpl());
		System.out.println("Web Service is started.");
	}

}
