package com.catalyst.spacedout.services.impl;

import org.junit.Before;
import org.junit.Test;

import com.catalyst.spacedout.daos.MonthlyPassDao;
import com.catalyst.spacedout.entities.MonthlyPass;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class MonthlyPassServiceImplTest {

	private MonthlyPassServiceImpl target;
	private MonthlyPassDao mockMonthlyPassDao;
	public MonthlyPass monthlyPass;
	
	@Before
	public void setup(){
		target = new MonthlyPassServiceImpl();
		mockMonthlyPassDao = mock(MonthlyPassDao.class);
		target.setMonthlyPassDao(mockMonthlyPassDao);
	}
	
	@Test
	public void testAddMonthlyPass(){
		MonthlyPass monthlyPass = new MonthlyPass();
		target.addMonthlyPass(monthlyPass);
		verify(mockMonthlyPassDao, times(1)).addMonthlyPass(monthlyPass);
	}
}
