package com.catalyst.spacedout.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.spacedout.daos.MonthlyPassDao;
import com.catalyst.spacedout.entities.MonthlyPass;
import com.catalyst.spacedout.services.MonthlyPassService;

@Service
public class MonthlyPassServiceImpl implements MonthlyPassService {

	@Autowired
	MonthlyPassDao monthlyPassDao;
	
	public void setMonthlyPassDao(MonthlyPassDao monthlyPassDao){
		this.monthlyPassDao = monthlyPassDao;
	}

	@Override
	public List<MonthlyPass> getMonthlyPass() {
		return monthlyPassDao.getMonthlyPass();
	}

	@Override
	public void addMonthlyPass(MonthlyPass monthlyPass) {
		monthlyPassDao.addMonthlyPass(monthlyPass);
	}

	@Override
	public void updateMonthlyPass(MonthlyPass monthlyPass) {
		monthlyPassDao.updateMonthlyPass(monthlyPass);
	}

	@Override
	public void deleteMonthlyPass(Integer passId) {
		monthlyPassDao.deleteMonthlyPass(passId);
	}
}
