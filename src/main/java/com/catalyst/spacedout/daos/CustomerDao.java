package com.catalyst.spacedout.daos;

import java.util.List;

import com.catalyst.spacedout.entities.Customer;

public interface CustomerDao {

	public List<Customer> getCustomer();
	
	void addCustomer(Customer customer);
	
	void updateCustomer(Customer customer);
	
	void deleteCustomer(Integer customerId);
}
