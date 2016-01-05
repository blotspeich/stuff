package com.catalyst.spacedout.daos;

import java.util.List;

import com.catalyst.spacedout.entities.MonthlyPass;

public interface MonthlyPassDao {

	public List<MonthlyPass> getMonthlyPass();
	
	void addMonthlyPass(MonthlyPass monthlyPass);
	
	void updateMonthlyPass(MonthlyPass monthlyPass);
	
	void deleteMonthlyPass(Integer passId);
}
