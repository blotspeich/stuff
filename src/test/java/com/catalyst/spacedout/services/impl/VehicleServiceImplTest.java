package com.catalyst.spacedout.services.impl;

import org.junit.Before;
import org.junit.Test;

import com.catalyst.spacedout.daos.VehicleDao;
import com.catalyst.spacedout.entities.Vehicle;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class VehicleServiceImplTest {

	private VehicleServiceImpl target;
	private VehicleDao mockVehicleDao;
	public Vehicle vehicle;
	
	@Before
	public void setup(){
		target = new VehicleServiceImpl();
		mockVehicleDao = mock(VehicleDao.class);
		target.setVehicleDao(mockVehicleDao);		
	}
	
	@Test
	public void testAddVehicle(){
		Vehicle vehicle = new Vehicle();
		target.addVehicle(vehicle);
		verify(mockVehicleDao, times(1)).addVehicle(vehicle);
	}
}
