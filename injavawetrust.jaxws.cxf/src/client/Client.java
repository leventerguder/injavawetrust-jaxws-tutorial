package client;

import org.apache.cxf.frontend.ClientProxyFactoryBean;

import service.HelloWorld;

public final class Client {

	private static String URL = "http://localhost:9000/Hello";

	public static void main(String args[]) throws Exception {

		ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
		factory.setAddress(URL);
		
		HelloWorld client = factory.create(HelloWorld.class);
		
		System.out.println("Invoke sayHi()....");
		System.out.println(client.sayHi("Levent"));

	}

}
