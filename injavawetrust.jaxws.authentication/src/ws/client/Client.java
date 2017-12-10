package ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.AuthenticationException;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.BindingProvider;

import ws.exception.OrderWSException;
import ws.model.Order;
import ws.service.OrderWS;

//1- run the WebServicePublisher
//2- test Client.java

public class Client {
	private static String WEB_SERVICE_WSDL_URL = "http://localhost:8888/injavawetrust/orderws?wsdl";

	public static void main(String[] args) throws MalformedURLException, AuthenticationException, OrderWSException {

		//Trace SOAP message
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");

		URL url = new URL(WEB_SERVICE_WSDL_URL);
		QName qname = new QName("http://service.ws/", "OrderWSImplService");
		Service service = Service.create(url, qname);

		OrderWS orderWS = service.getPort(OrderWS.class);

		Map<String, Object> requestContext = ((BindingProvider) orderWS).getRequestContext();
		Map<String, List<String>> requestHeaders = new HashMap<String, List<String>>();
		//
		requestHeaders.put("username", Arrays.asList("admin"));
		//requestHeaders.put("password", Arrays.asList("12345"));
		requestHeaders.put("password", Arrays.asList("123456"));
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);

		System.out.println("Order100");
		Order order100 = orderWS.getOrder("Order-100");
		System.out.println(order100);

		System.out.println("All Orders ...");
		for (Order order : orderWS.getOrders()) {
			System.out.println(order);
		}
	}
}
