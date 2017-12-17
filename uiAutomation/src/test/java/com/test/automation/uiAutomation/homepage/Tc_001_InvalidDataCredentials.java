package com.test.automation.uiAutomation.homepage;

import javax.sql.rowset.WebRowSet;
import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.uiActions.Homepage;

public class Tc_001_InvalidDataCredentials {
	
	
	Homepage homepage;
	
	 WebDriver driver;
	 
	@BeforeTest
	public void setUp(){
		driver= new FirefoxDriver();
		System.setProperty("webdriver.firefox.marionette",System.getProperty("use.dir")+ "/uiAutomation/Drivers/geckodriver.exe");
		driver.get("http://automationpractice.com/index.php");
		}
	
	@Test
	public void InvalidDataCredentials(){
		
		homepage=new Homepage(driver);
	    homepage.LoginToApplication("test@email.com", "password123");
	Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='center_column']/div[1]/ol/li")).getText(),"Authentication failed.");
	}
	
	
	@AfterTest
	public void endTest(){
		driver.close();
		
	}

}
