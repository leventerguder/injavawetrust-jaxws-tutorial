package publisher;

import org.apache.cxf.frontend.ServerFactoryBean;

import service.HelloWorld;
import service.HelloWorldImpl;

public class CXFWebServicePublisher {

	public static void main(String args[]) throws Exception {

		HelloWorldImpl helloworldImpl = new HelloWorldImpl();
		ServerFactoryBean svrFactory = new ServerFactoryBean();
		svrFactory.setServiceClass(HelloWorld.class);
		svrFactory.setAddress("http://localhost:9000/Hello");
		svrFactory.setServiceBean(helloworldImpl);
		svrFactory.create();

		System.out.println("CXF Web Service is publishing...");
	}
}
