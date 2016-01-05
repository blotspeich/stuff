package com.catalyst.spacedout.services;

import java.util.List;

import com.catalyst.spacedout.entities.Vehicle;

public interface VehicleService {

	public List<Vehicle> getVehicle();
	
	void addVehicle (Vehicle vehicle);
	
	void updateVehicle (Vehicle vehicle);
	
	void deleteVehicle (Integer vehicleId);
}
