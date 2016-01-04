package com.catalyst.spacedout.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.spacedout.entities.TestData;
import com.catalyst.spacedout.services.TestDataService;

@RestController
public class TestDataController {

	@Autowired
	private TestDataService testDataService;
	
	
	public void setTestDataService(TestDataService testDataService) {
		this.testDataService = testDataService;
	}


	@RequestMapping(value="testdata", method=RequestMethod.GET)
	public List<TestData> getTestData() {
		return testDataService.getTestData();
	}
}
