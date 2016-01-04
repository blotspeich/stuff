package com.catalyst.spacedout.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.spacedout.daos.CustomerDao;
import com.catalyst.spacedout.entities.Customer;
import com.catalyst.spacedout.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Override
	public List<Customer> getCustomer() {
		return customerDao.getCustomer();
	}
}
