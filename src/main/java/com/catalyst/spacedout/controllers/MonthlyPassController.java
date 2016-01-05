package com.catalyst.spacedout.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.spacedout.entities.MonthlyPass;
import com.catalyst.spacedout.services.MonthlyPassService;

@RestController
public class MonthlyPassController {

	@Autowired
	private MonthlyPassService monthlyPassService;
	
	public void setMonthlyPassService(MonthlyPassService monthlyPassService) {
		this.monthlyPassService = monthlyPassService;
	}
	
	@RequestMapping(value="/monthlyPass", method=RequestMethod.GET)
	public List<MonthlyPass> getMonthlyPass() {
		return monthlyPassService.getMonthlyPass();
	}
	
	@RequestMapping(value="/monthlyPass", method=RequestMethod.POST)
	public void addMonthlyPass(@RequestBody MonthlyPass monthlyPass){
		monthlyPassService.addMonthlyPass(monthlyPass);
	}
	
	@RequestMapping(value="/monthlyPass/{passId}", method=RequestMethod.PUT)
	public void updateMonthlyPass(@PathVariable Integer passId, @RequestBody MonthlyPass monthlyPass){
		monthlyPass.setPassId(passId);
		monthlyPassService.updateMonthlyPass(monthlyPass);
	}
	
	@RequestMapping(value="/monthlyPass/{passId}", method=RequestMethod.DELETE)
	public void deleteMonthlyPass(@PathVariable Integer passId){
		monthlyPassService.deleteMonthlyPass(passId);
	}
}
