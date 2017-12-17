package com.test.automation.uiAutomation.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement SignIn;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement LoginEmailAdress;
	
	@FindBy(xpath="//*[@id='passwd']")
	WebElement LoginPassword;
	
	@FindBy(xpath="//*[@id='SubmitLogin']")
	WebElement SubmitButton;
	
	public Homepage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void LoginToApplication(String email,String Password){
		SignIn.click();
		LoginEmailAdress.sendKeys(email);
		LoginPassword.sendKeys(Password);
		SubmitButton.click();
		
		
		
	}

}
