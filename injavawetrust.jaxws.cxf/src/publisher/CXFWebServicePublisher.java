package publisher;

import org.apache.cxf.frontend.ServerFactoryBean;

import service.HelloWorld;
import service.HelloWorldImpl;

public class CXFWebServicePublisher {

	private static String URL = "http://localhost:9000/Hello";
	
	public static void main(String args[]) throws Exception {

		ServerFactoryBean serverFactory = new ServerFactoryBean();
		HelloWorldImpl helloworldImpl = new HelloWorldImpl();
		
		serverFactory.setServiceClass(HelloWorld.class);
		serverFactory.setAddress(URL);
		serverFactory.setServiceBean(helloworldImpl);
		serverFactory.create();

		System.out.println("CXF Web Service is publishing...");
	}
}
