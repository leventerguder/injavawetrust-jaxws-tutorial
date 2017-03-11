package model;

import java.util.List;

public class EmployeeListWrapper {

	private List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "EmployeeListWrapper [employees=" + employees + "]";
	}
	
}
