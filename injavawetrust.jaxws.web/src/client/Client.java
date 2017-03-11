package client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import model.Employee;
import service.EmployeeService;

public class Client {

	private static String WEB_SERVICE_WSDL_URL = "http://localhost:8080/injavawetrust.jaxws.web/employeeServiceWS?wsdl";

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL(WEB_SERVICE_WSDL_URL);
		QName qname = new QName("http://service/", "EmployeeServiceImplService");
		Service service = Service.create(url, qname);

		EmployeeService employeeService = service.getPort(EmployeeService.class);
		// add employees
		employeeService.addEmployee(new Employee(1, "Levent", "Erguder", 1000));
		employeeService.addEmployee(new Employee(2, "Burak", "Okumus", 30000));
		employeeService.addEmployee(new Employee(3, "Recep", "Bostanci", 2000));
		employeeService.addEmployee(new Employee(4, "Ozkan", "Ozbas", 10000));

		// getEmployee
		Employee employee = employeeService.getEmployee(2);
		System.out.println("getEmployee :");
		System.out.println(employee);
		System.out.println();

		// getEmployeesWithWrapper
		List<Employee> employees = employeeService.getEmployeesWithWrapper().getEmployees();
		System.out.println("getEmployeesWithWrapper :");
		employees.stream().forEach(System.out::println);
		System.out.println();

		// getEmployeesWithArray
		List<Employee> employees2 = Arrays.asList(employeeService.getEmployeesWithArray());
		System.out.println("getEmployeesWithArray :");
		employees2.stream().forEach(System.out::println);

	}
}
