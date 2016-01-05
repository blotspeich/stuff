package com.catalyst.spacedout.services;

import java.util.List;

import com.catalyst.spacedout.entities.MonthlyPass;

public interface MonthlyPassService {

	public List<MonthlyPass> getMonthlyPass();
	
	void addMonthlyPass (MonthlyPass monthlyPass);
	
	void updateMonthlyPass (MonthlyPass monthlyPass);
	
	void deleteMonthlyPass (Integer passId);
}
