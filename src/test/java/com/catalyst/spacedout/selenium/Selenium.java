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

public class Selenium {
	
private WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/");
	}
	
	@Test
	public void addPassTestValid(){
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("navbarAddButton"))).click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("priceInput"))).sendKeys("33.99");
		driver.findElement(By.id("vehicleIdInput")).sendKeys("1");
		driver.findElement(By.id("customerIdInput")).sendKeys("1");
		driver.findElement(By.id("expirationInput")).sendKeys("02/16/2016");
		driver.findElement(By.id("addPassSubmitButton")).click();
		
		assertTrue(new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.className("toast-success")))
				.isDisplayed());
		
	}
	
	@Test
	public void addCustomerTestValid(){
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("navbarAddButton"))).click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("firstNameInput"))).sendKeys("Maeve");
		driver.findElement(By.id("lastNameInput")).sendKeys("Lotspeich");
		driver.findElement(By.id("phoneNumberInput")).sendKeys("5555555555");
		driver.findElement(By.id("emailInput")).sendKeys("m@gmail.com");
		driver.findElement(By.id("addCustomerSubmitButton")).click();
		
		assertTrue(new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.className("toast-success")))
				.isDisplayed());
		
	}
	
	@Test
	public void addVehicleTestValid(){
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("navbarAddButton"))).click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("makeInput"))).sendKeys("Mazda");
		driver.findElement(By.id("modelInput")).sendKeys("Miata");
		driver.findElement(By.id("licenseNumberInput")).sendKeys("5555555555");
		driver.findElement(By.id("licenseStateInput")).sendKeys("AK");
		driver.findElement(By.id("colorInput")).sendKeys("Hot Pink");
		driver.findElement(By.id("addVehicleSubmitButton")).click();
		
		assertTrue(new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.className("toast-success")))
				.isDisplayed());
	}
	
	@Test
	public void deletePassTestValid(){
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("navbarDeleteButton"))).click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("deletePassInput"))).sendKeys("1");
		driver.findElement(By.id("deletePassSubmitButton")).click();
		
		assertTrue(new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.className("toast-success")))
				.isDisplayed());
	}
	
	@After
	public void closeDriver(){
		driver.close();
		driver.quit();
	}
		

}
