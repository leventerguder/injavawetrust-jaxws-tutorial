package service;

import java.util.ArrayList;

import javax.jws.WebService;

import model.Employee;
import model.EmployeeListWrapper;

@WebService(endpointInterface = "service.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	private static ArrayList<Employee> employees = new ArrayList<Employee>();

	@Override
	public void addEmployee(Employee employee) {
		System.out.println(employee);
		employees.add(employee);
	}

	@Override
	//java.util.List is an interface, and JAXB can't handle interfaces.
	public EmployeeListWrapper getEmployeeWrapper() {
		EmployeeListWrapper wrapper = new EmployeeListWrapper();
		wrapper.setEmployees(employees);
		return wrapper;
	}

	@Override
	//We can use Array instead of List
	public Employee[] getEmployeeArray() {
		return employees.toArray(new Employee[employees.size()]);
	}

}
