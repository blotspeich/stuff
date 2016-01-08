package com.catalyst.spacedout.services.impl;

import org.junit.Before;
import org.junit.Test;

import com.catalyst.spacedout.daos.CustomerDao;
import com.catalyst.spacedout.entities.Customer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CustomerServiceImplTest {

	private CustomerServiceImpl target;
	private CustomerDao mockCustomerDao;
	public Customer customer;
	
	@Before
	public void setup(){
		target = new CustomerServiceImpl();
		mockCustomerDao = mock(CustomerDao.class);
		target.setCustomerDao(mockCustomerDao);
	}
	
	@Test
	public void testAddCustomer(){
		Customer customer = new Customer();
		target.addCustomer(customer);
		verify(mockCustomerDao, times(1)).addCustomer(customer);
	}
}
