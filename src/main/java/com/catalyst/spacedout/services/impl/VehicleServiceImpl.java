package com.catalyst.spacedout.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.spacedout.daos.VehicleDao;
import com.catalyst.spacedout.entities.Vehicle;
import com.catalyst.spacedout.services.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleDao vehicleDao;
	
	public void setVehicleDao(VehicleDao vehicleDao) {
		this.vehicleDao = vehicleDao;
	}
	
	@Override
	public List<Vehicle> getVehicle() {
		return vehicleDao.getVehicle();
	}

	@Override
	public void addVehicle(Vehicle vehicle) {
		vehicleDao.addVehicle(vehicle);
	}

	@Override
	public void updateVehicle(Vehicle vehicle) {
		vehicleDao.updateVehicle(vehicle);
	}

	@Override
	public void deleteVehicle(Integer vehicleId) {
		vehicleDao.deleteVehicle(vehicleId);
	}
}