package service;

import org.springframework.stereotype.Service;
import domain.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public Customer getCustomerById(String customerId) {
		Customer customer = new Customer();
		customer.setId(1000);
		customer.setName("Levent");
		return customer;
	}
}