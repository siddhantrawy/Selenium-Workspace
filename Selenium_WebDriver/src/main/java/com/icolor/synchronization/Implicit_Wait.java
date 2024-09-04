package com.icolor.synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Wait up to 10 seconds
		driver.get("https://demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr588183");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("genajaj");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		driver.quit();		
	}
}
