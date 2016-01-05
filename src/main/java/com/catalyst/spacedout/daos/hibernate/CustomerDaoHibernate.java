package com.catalyst.spacedout.daos.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.spacedout.daos.CustomerDao;
import com.catalyst.spacedout.entities.Customer;

@Repository
@Transactional
public class CustomerDaoHibernate implements CustomerDao {

	@PersistenceContext
	private EntityManager em;
	
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public List<Customer> getCustomer() {
		return em.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
	}
	
	@Override
	public void addCustomer(Customer customer) {
		em.persist(customer);
	}
	
	@Override
	public void updateCustomer(Customer customer) {
		em.merge(customer);
	}
	
	@Override
	public void deleteCustomer(Integer customerId) {
		Customer customer = getCustomerById(customerId);
		em.remove(customer);
	}
	
	public Customer getCustomerById(Integer customerId){
		return em.createQuery("SELECT c FROM Customer c WHERE c.customerId = :ID", Customer.class).setParameter("customerId", customerId).getSingleResult();
	}
}
