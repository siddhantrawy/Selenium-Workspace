package com.pom.hybrid.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestBase {

	static WebDriver driver = null;
	static Properties properties = null;

	public TestBase() {
		properties = new Properties();

		try {
			FileInputStream input = new FileInputStream(
					"D:\\Selenium Workspace\\Selenium_Hybrid_Project\\src\\main\\java\\com\\pom\\hybrid\\config\\Config.properties");
			properties.load(input);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void initialization() {
		
		if(properties.getProperty("browser").equals("Chrome"))
			driver = new ChromeDriver();
		
		if(properties.getProperty("browser").equals("Safari"))
			driver = new SafariDriver();
		;
		if(properties.getProperty("browser").equals("Edge"))
			driver = new EdgeDriver();
		
		if(properties.getProperty("browser").equals("FireFox"))
			driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("url");	
	}

}
