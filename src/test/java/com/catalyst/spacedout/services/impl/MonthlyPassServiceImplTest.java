package com.catalyst.spacedout.services.impl;

import org.junit.Before;
import org.junit.Test;

import com.catalyst.spacedout.daos.MonthlyPassDao;
import com.catalyst.spacedout.entities.MonthlyPass;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

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
	
	@Test
	public void testDeleteMonthlyPass() {
		target.deleteMonthlyPass(1);
		verify(mockMonthlyPassDao, times(1)).deleteMonthlyPass(1);
	}
	
	@Test
	public void testGetMonthlyPasses(){
		int expected = 1;
		List<MonthlyPass>actualMonthlyPassList = new ArrayList<MonthlyPass>();
		MonthlyPass m = new MonthlyPass();
		actualMonthlyPassList.add(m);
		when(mockMonthlyPassDao.getMonthlyPass()).thenReturn(actualMonthlyPassList);
		assertEquals(expected, target.getMonthlyPass().size());
	}
	
	@Test
	public void testUpdateMonthlyPassValid(){
		MonthlyPass m = new MonthlyPass();
		m.setPassPrice(333.99);
		target.updateMonthlyPass(m);
		verify(mockMonthlyPassDao, times(1)).updateMonthlyPass(m);
	}
}
