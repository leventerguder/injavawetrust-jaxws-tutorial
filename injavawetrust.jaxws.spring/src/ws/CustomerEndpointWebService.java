package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import domain.Customer;
import service.CustomerService;

/*
 * http://localhost:8080/injavawetrust.jaxws.spring/customer?wsdl
*/
//@WebService(serviceName = "customerService")
@WebService
@Service
public class CustomerEndpointWebService extends SpringBeanAutowiringSupport {

	@Autowired
	private CustomerService service;

	@WebMethod(operationName = "getCustomer")
	public Customer getCustomerById(String customerId) {
		Customer customer = service.getCustomerById(customerId);
		return customer;
	}

}