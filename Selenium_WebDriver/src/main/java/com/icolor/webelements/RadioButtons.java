package com.icolor.webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/");
		
		driver.findElement(By.id("btn2")).click();
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		if(driver!=null)
			driver.quit();
	}

}
