package service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.jws.WebService;
import model.Employee;
import model.EmployeeListWrapper;

@WebService(endpointInterface = "service.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	public static List<Employee> employees = new ArrayList<Employee>();

	@Override
	public void addEmployee(Employee employee) {
		System.out.println("EmployeeServiceImpl#addEmployee is invoked.");
		if(getEmployee(employee.getId())==null){
			//eliminate duplicate records
			employees.add(employee);	
		}
	}

	@Override
	public Employee getEmployee(int id) {
		System.out.println("EmployeeServiceImpl#getEmployee is invoked.");
// Old way		
//		Employee foundEmployeeById = null;
//		for (Employee employee : employees) {
//			if (employee.getId()==id) {
//				foundEmployeeById = employee;
//				break;
//			}
//		}
//		return foundEmployeeById;
		//
		Predicate<Employee> predicate = (Employee e) -> e.getId() == id;
		return employees.stream().filter(predicate).findAny().orElse(null);
	}

	@Override
	// java.util.List is an interface, and JAXB can't handle interfaces.
	public EmployeeListWrapper getEmployeesWithWrapper() {
		System.out.println("EmployeeServiceImpl#getEmployeesWithWrapper is invoked.");
		EmployeeListWrapper wrapper = new EmployeeListWrapper();
		wrapper.setEmployees(employees);
		return wrapper;
	}

	@Override
	// We can use Array instead of List
	public Employee[] getEmployeesWithArray() {
		System.out.println("EmployeeServiceImpl#getEmployeesWithArray is invoked.");
		return employees.toArray(new Employee[employees.size()]);
	}

}
