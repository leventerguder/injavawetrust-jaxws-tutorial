package service;

import domain.Customer;

public interface CustomerService {
	public Customer getCustomerById(String customerId);
}