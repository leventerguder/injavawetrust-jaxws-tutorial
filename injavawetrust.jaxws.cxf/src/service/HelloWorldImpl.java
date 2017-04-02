package service;

public class HelloWorldImpl implements HelloWorld {

	public String sayHi(String text) {
		System.out.println("sayHi is called !");
		return "Hello, " + text;
	}
}
