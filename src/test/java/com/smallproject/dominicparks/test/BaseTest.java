package com.smallproject.dominicparks.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver;
	
	
	@Before
	public void setup() {
//		FluentWait wait = new FluentWait(driver);
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"//lib//driver//Chromedriver.exe");
		driver = new ChromeDriver();
//		wait.until(ExpectedConditions.alertIsPresent());
		driver.get("http://qa.cilsy.id:8080/en/");
		
	}
	
	@After
	public void close() {
		driver.close();
		
	}
}
