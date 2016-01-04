package com.catalyst.spacedout.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.spacedout.entities.Customer;
import com.catalyst.spacedout.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@RequestMapping(value="customer", method=RequestMethod.GET)
	public List<Customer> getCustomer() {
		return customerService.getCustomer();
	}
}
