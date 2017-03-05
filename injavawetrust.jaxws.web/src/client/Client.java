package client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import model.Employee;
import service.EmployeeService;

//1- run the WebServicePublisher
//2- test Client.java

public class Client {
	private static String WEB_SERVICE_WSDL_URL = "http://localhost:8080/injavawetrust.jaxws.web/employeeServiceWS?wsdl";

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL(WEB_SERVICE_WSDL_URL);
		QName qname = new QName("http://service/", "EmployeeServiceImplService");
		Service service = Service.create(url, qname);

		EmployeeService employeeService = service.getPort(EmployeeService.class);

		employeeService.addEmployee(new Employee(1, "Levent", "Erguder", 1000));
		employeeService.addEmployee(new Employee(2, "Levent", "Erguder", 1000));
		employeeService.addEmployee(new Employee(3, "Levent", "Erguder", 1000));

		System.out.println(employeeService.getEmployeeWrapper().getEmployees());

	}
}
