package com.icolor.pagefactory.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver = null;
	
	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Locators
	By loc1 = By.xpath("//input[@placeholder='Username']");
	By loc2 = By.xpath("//input[@placeholder='Password']");
	By loc3 = By.xpath("//button[@type='submit']");
	
	// Action Methods
	public void setUserName(String user) {
		driver.findElement(loc1).sendKeys(user);
	}
	
	public void setPassword(String password) {
		driver.findElement(loc2).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(loc3).click();
	}

}
