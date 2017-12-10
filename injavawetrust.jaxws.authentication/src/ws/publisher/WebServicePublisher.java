package ws.publisher;

import javax.xml.ws.Endpoint;

import ws.service.OrderWSImpl;

public class WebServicePublisher {

	private static String WEB_SERVICE_URL = "http://localhost:8888/injavawetrust/orderws";

	public static void main(String[] args) {
		Endpoint.publish(WEB_SERVICE_URL, new OrderWSImpl());
		System.out.println("Web Service is started.");
	}
}