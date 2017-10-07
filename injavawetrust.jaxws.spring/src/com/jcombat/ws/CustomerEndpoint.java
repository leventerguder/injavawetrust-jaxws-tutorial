package com.jcombat.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.jcombat.entity.Customer;
import com.jcombat.services.customers.CustomerService;

/*
 * http://localhost:8080/injavawetrust.jaxws.spring/customer?wsdl
*/
//@WebService(serviceName = "customerService")
@WebService
@Service
public class CustomerEndpoint extends SpringBeanAutowiringSupport {

	@Autowired
	private CustomerService service;

	@WebMethod(exclude = true)
	public void setService(CustomerService service) {
		this.service = service;
	}

	@WebMethod(operationName = "getCustomer")
	public Customer getCustomerById(String customerId) {
		Customer customer = service.getCustomerById(customerId);
		return customer;
	}

}