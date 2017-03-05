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
	public EmployeeListWrapper getEmployeeWrapper();

	@WebMethod
	public Employee[] getEmployeeArray();

}
