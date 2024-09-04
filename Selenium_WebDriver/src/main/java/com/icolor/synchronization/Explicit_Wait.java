package com.icolor.synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
		
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait declaration
		
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='uid']"))).sendKeys("mngr588183");
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys("genajaj");
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='btnLogin']"))).click();
		driver.quit();
	}

}
