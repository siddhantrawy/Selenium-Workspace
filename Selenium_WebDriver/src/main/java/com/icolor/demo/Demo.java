
package com.icolor.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        // Launch Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.example.com");

        // Find the search input field
        WebElement searchInput = driver.findElement(By.name("q"));

        // Enter the search query
        searchInput.sendKeys("Selenium WebDriver");

        // Click the search button
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();

        // Wait for 5 seconds to allow the search results to load
        Thread.sleep(5000);

        // Get the search results
        WebElement searchResults = driver.findElement(By.id("res"));

        // Print the search results
        System.out.println(searchResults.getText());

        // Close the browser
        driver.quit();
    }
}



