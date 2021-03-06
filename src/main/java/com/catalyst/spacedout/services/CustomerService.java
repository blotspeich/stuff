package com.catalyst.spacedout.services;

import java.util.List;

import com.catalyst.spacedout.entities.Customer;

public interface CustomerService {

	public List<Customer> getCustomer();
	
	void addCustomer (Customer customer);
	
	void updateCustomer (Customer customer);
	
	void deleteCustomer (Integer customerId);
}
