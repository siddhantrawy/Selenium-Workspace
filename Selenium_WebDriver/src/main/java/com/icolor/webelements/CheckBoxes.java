package com.icolor.webelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/");
		
		driver.findElement(By.id("btn2")).click();
		WebElement c1=driver.findElement(By.id("checkbox1"));		
		WebElement c2=driver.findElement(By.id("checkbox2"));	
		WebElement c3=driver.findElement(By.id("checkbox3"));
		
		System.out.println("Checkboxes are Selected: "+c1.isSelected()+"\t"+c2.isSelected()+"\t"+c3.isSelected());
		
		c1.click();
		c2.click();
		c3.click();
		System.out.println("Checkboxes are Selected: "+c1.isSelected()+"\t"+c2.isSelected()+"\t"+c3.isSelected());
	
		List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of checkboxes: "+checkboxes.size());
		
		for (int i = 0; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}
		System.out.println("Checkboxes are Selected: "+c1.isSelected()+"\t"+c2.isSelected()+"\t"+c3.isSelected());
		
		for (WebElement webElement : checkboxes) {
			webElement.click();
		}
		System.out.println("Checkboxes are Selected: "+c1.isSelected()+"\t"+c2.isSelected()+"\t"+c3.isSelected());
		
		if(driver != null)
			driver.quit();

	}

}
