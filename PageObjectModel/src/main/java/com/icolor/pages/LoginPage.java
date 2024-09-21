package com.icolor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver = null;
	
	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
//	@FindBy(xpath = "//input[@placeholder='Username']")	
//	WebElement loc1;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Username']")	
	WebElement loc1;
	
	
	@FindBy(xpath = "//input[@placeholder='Password']")	
	WebElement loc2;
	
	@FindBy(xpath = "//button[@type='submit']")	
	WebElement loc3;
	
	// Action Methods
	public void setUserName(String user) {
		loc1.sendKeys(user);
	}
	
	public void setPassword(String password) {
		loc2.sendKeys(password);
	}
	
	public void clickLogin() {
		loc3.click();
	}

}
