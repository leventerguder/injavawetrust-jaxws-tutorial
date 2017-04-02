package service;

public class HelloWorldImpl implements HelloWorld {
	
	@Override
	public String sayHi(String username) {
		System.out.println("sayHi is called !");
		return "Hello, " + username;
	}
}