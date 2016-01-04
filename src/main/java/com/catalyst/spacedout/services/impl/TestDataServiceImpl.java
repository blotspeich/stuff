package com.catalyst.spacedout.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.spacedout.daos.TestDataDao;
import com.catalyst.spacedout.entities.TestData;
import com.catalyst.spacedout.services.TestDataService;

@Service
public class TestDataServiceImpl implements TestDataService {

	@Autowired
	TestDataDao testDataDao;
	
	
	public void setTestDataDao(TestDataDao testDataDao) {
		this.testDataDao = testDataDao;
	}


	@Override
	public List<TestData> getTestData() {
		return testDataDao.getTestData();
	}

}
