package com.qa;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTextWithoutSendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pom45\\OneDrive\\Desktop\\Software Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.cssSelector("input#email"));
		
		WebElement password = driver.findElement(By.cssSelector("input#pass"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].value='urvi@123',arguments[1].value='Urvi'", email , password);
	

	}
}
