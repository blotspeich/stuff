package com.catalyst.spacedout.daos.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.spacedout.daos.MonthlyPassDao;
import com.catalyst.spacedout.entities.MonthlyPass;

@Repository
@Transactional
public class MonthlyPassDaoHibernate implements MonthlyPassDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void setEm(EntityManager em){
		this.em = em;
	}

	@Override
	public List<MonthlyPass> getMonthlyPass() {
		return em.createQuery("SELECT m FROM MonthlyPass m", MonthlyPass.class).getResultList();
	}

	@Override
	public void addMonthlyPass(MonthlyPass monthlyPass) {
		em.persist(monthlyPass);
	}

	@Override
	public void updateMonthlyPass(MonthlyPass monthlyPass) {
		em.merge(monthlyPass);
	}

	@Override
	public void deleteMonthlyPass(Integer passId) {
		MonthlyPass monthlyPass = getMonthlyPassById(passId);
		em.remove(monthlyPass);
	}
	
	public MonthlyPass getMonthlyPassById(Integer passId){
		return em.createQuery("SELECT m FROM MonthlyPass m WHERE m.passId = :passId", MonthlyPass.class).setParameter("passId", passId).getSingleResult();
	}
}
