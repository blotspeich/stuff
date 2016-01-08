package com.catalyst.spacedout.selenium;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddPass {
	
private WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/");
	}
	
	@Test
	public void addPassTest(){
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("navbarAddButton"))).click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("priceInput"))).sendKeys("33.99");
		driver.findElement(By.id("vehicleIdInput")).sendKeys("1");
		driver.findElement(By.id("customerIdInput")).sendKeys("1");
		driver.findElement(By.id("expirationInput")).sendKeys("02/16/2016");
		driver.findElement(By.id("addPassSubmitButton")).click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("navbarViewButton"))).click();
		
		new WebDriverWait(driver, 3000).until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver d) {
				return d.findElement(By.id("Current_Passes")).getAttribute("value").equals("Current Passes");
			}
		});
		
		boolean passIsPresent = false;
		List<WebElement> passes = new ArrayList<>();
		passes.addAll(driver.findElements(By.className("ng-binding")));
		for(int i=0; i<passes.size(); i++){
			if(passes.get(i).getAttribute("value").equals("33.99")){
				passIsPresent = true;
			}
		}
		assertTrue(passIsPresent);
	}
	
	@After
	public void closeDriver(){
		driver.close();
		driver.quit();
	}
		

}
