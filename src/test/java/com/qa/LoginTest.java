package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pom45\\OneDrive\\Desktop\\Software testing\\Driver\\chromedriver.exe");		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
		
		WebElement email = driver.findElement(By.id("email"));
	
		WebElement password = driver.findElement(By.id("pass"));
		
		WebElement button = driver.findElement(By.name("login"));
		
		email.sendKeys("urvi@gmail.com");
		password.sendKeys("test123");
		button.click();
		
	}

}