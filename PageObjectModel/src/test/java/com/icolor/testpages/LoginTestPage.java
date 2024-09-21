package com.icolor.testpages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icolor.pages.LoginPage;

public class LoginTestPage {
	
	WebDriver driver = null;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void loginTest() {
		com.icolor.pages.LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName("Admin");
		loginPage.setPassword("admin@123");
		loginPage.clickLogin();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
