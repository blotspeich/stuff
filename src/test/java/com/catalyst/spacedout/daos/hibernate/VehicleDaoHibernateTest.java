package com.catalyst.spacedout.daos.hibernate;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import com.catalyst.spacedout.daos.hibernate.VehicleDaoHibernate;
import com.catalyst.spacedout.entities.Vehicle;

public class VehicleDaoHibernateTest {
	private VehicleDaoHibernate target;
	
	private EntityManager mockEm;
	
	@Before
	public void setup(){
		target = new VehicleDaoHibernate();
		mockEm = mock(EntityManager.class);
		target.setEm(mockEm);
	}
	
	@Test
	public void testAdd() {
		
		Vehicle vehicle = new Vehicle();
		Vehicle actual = target.addVehicle(vehicle);
		
		assertEquals(vehicle, actual);
	}
}
