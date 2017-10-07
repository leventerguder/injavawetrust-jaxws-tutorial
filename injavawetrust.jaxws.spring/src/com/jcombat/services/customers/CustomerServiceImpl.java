package com.jcombat.services.customers;

import org.springframework.stereotype.Component;

import com.jcombat.entity.Customer;

@Component
public class CustomerServiceImpl implements CustomerService {

	public Customer getCustomerById(String customerId) {
		Customer customer = new Customer();
		customer.setId(1000);
		customer.setName("Levent");
		return customer;
	}
}