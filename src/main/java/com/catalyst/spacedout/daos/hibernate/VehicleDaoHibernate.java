package com.catalyst.spacedout.daos.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.spacedout.daos.VehicleDao;
import com.catalyst.spacedout.entities.Vehicle;

@Repository
@Transactional
public class VehicleDaoHibernate implements VehicleDao {

	@PersistenceContext
	private EntityManager em;
	
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public List<Vehicle> getVehicle(){
		return em.createQuery("SELECT t FROM Vehicle t", Vehicle.class).getResultList();
	}
}
