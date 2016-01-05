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
		return em.createQuery("SELECT v FROM Vehicle v", Vehicle.class).getResultList();
	}

	@Override
	public void addVehicle(Vehicle vehicle) {
		em.persist(vehicle);		
	}

	@Override
	public void updateVehicle(Vehicle vehicle) {
		em.merge(vehicle);
	}

	@Override
	public void deleteVehicle(Integer vehicleId) {
		Vehicle vehicle = getVehicleById(vehicleId);
		em.remove(vehicle);
	}
	
	public Vehicle getVehicleById(Integer vehicleId){
		return em.createQuery("SELECT v FROM Vehicle v WHERE v.vehicleId = :ID", Vehicle.class).setParameter("vehicleId", vehicleId).getSingleResult();
	}	
}
