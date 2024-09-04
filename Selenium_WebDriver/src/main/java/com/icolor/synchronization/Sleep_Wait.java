package com.icolor.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sleep_Wait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
		Thread.sleep(3000); // Wait for 3 seconds
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr588183");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("genajaj");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(5000); // Wait for 5 seconds
		driver.quit();

	}

}
