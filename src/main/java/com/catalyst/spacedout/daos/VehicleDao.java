package com.catalyst.spacedout.daos;

import java.util.List;

import com.catalyst.spacedout.entities.Vehicle;

public interface VehicleDao {

	public List<Vehicle> getVehicle();
	
	void addVehicle(Vehicle vehicle);
	
	void updateVehicle(Vehicle vehicle);
	
	void deleteVehicle(Integer vehicleId);
}
