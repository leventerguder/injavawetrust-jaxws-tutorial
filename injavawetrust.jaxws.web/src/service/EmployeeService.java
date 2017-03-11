package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import model.Employee;
import model.EmployeeListWrapper;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface EmployeeService {

	@WebMethod
	public void addEmployee(@WebParam(name = "employee") Employee employee);

	@WebMethod
	public Employee getEmployee(@WebParam(name = "id") int id);

	@WebMethod
	public EmployeeListWrapper getEmployeesWithWrapper();

	@WebMethod
	public Employee[] getEmployeesWithArray();

}
