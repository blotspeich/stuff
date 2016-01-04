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
		return em.createQuery("SELECT t FROM Customer t", Customer.class).getResultList();
	}

}
