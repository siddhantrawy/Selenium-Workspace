package com.icolor.webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		System.out.println(elements.size()); // Count of hyperlinks on a webpage 
		
		// Print all hyperlinks text
		for(WebElement element : elements) {
			System.out.println(element.getText());
		}
		
		driver.quit();
		
	}

}
