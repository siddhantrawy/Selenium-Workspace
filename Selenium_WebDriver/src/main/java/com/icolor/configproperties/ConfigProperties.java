package com.icolor.configproperties;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ConfigProperties {

	public static void main(String[] args) {

		WebDriver driver = null;
		Properties properties = null;

		try {
			properties = new Properties();
			FileInputStream input = new FileInputStream(
					"D:\\Selenium Workspace\\Selenium_WebDriver\\src\\main\\java\\com\\icolor\\configproperties\\Config.properties");
			properties.load(input);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		if(properties.getProperty("browser").equals("Chrome")) {
			driver =  new ChromeDriver();
		}
		
		else if(properties.getProperty("browser").equals("FireFox")) {
			driver =  new FirefoxDriver();
		}
		
		else if(properties.getProperty("browser").equals("Edge")) {
			driver =  new EdgeDriver();
		}
		
		else if(properties.getProperty("browser").equals("Safari")) {
			driver =  new SafariDriver();
		}
		else {
			System.out.println("Driver name not found.");
		}
		
		driver.get(properties.getProperty("url"));
		driver.findElement(By.xpath(properties.getProperty("username_xpath"))).sendKeys(properties.getProperty("username"));
		driver.findElement(By.xpath(properties.getProperty("password_xpath"))).sendKeys(properties.getProperty("password"));
		driver.findElement(By.xpath(properties.getProperty("login_xpath"))).click();
		
		if(driver != null)
			driver.quit();
		}
}
