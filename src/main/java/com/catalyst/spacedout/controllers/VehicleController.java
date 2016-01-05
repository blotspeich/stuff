package com.catalyst.spacedout.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.spacedout.entities.Vehicle;
import com.catalyst.spacedout.services.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;
	
	public void setVehicleService(VehicleService vehicleService){
		this.vehicleService = vehicleService;
	}
	
	@RequestMapping(value="/vehicle", method=RequestMethod.GET)
	public List<Vehicle> getVehicle(){
		return vehicleService.getVehicle();
	}
	
	@RequestMapping(value="/vehicle", method=RequestMethod.POST)
	public void addVehicle(@RequestBody Vehicle vehicle){
		vehicleService.addVehicle(vehicle);
	}
	
	@RequestMapping(value="/vehicle/{vehicleId}", method=RequestMethod.PUT)
	public void updateVehicle(@PathVariable Integer vehicleId, @RequestBody Vehicle vehicle){
		vehicle.setVehicleId(vehicleId);
		vehicleService.updateVehicle(vehicle);
	}
	
	@RequestMapping(value="/vehicle/{vehicleId}", method=RequestMethod.DELETE)
	public void deleteVehicle(@PathVariable Integer vehicleId){
		vehicleService.deleteVehicle(vehicleId);
	}
}
