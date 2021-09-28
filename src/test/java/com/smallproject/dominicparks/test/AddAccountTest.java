package com.smallproject.dominicparks.test;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.smallproject.dominicparks.pages.HomePage;
import com.smallproject.dominicparks.pages.RegisterAuthenticationPage;



public class AddAccountTest extends BaseTest {
	
	@Test
	public void register() throws InterruptedException {
		HomePage homepage = new HomePage(driver);
		homepage.getTitleHomePage();
		homepage.scrollDown();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage.swipeRight();
		homepage.swipeLeft();
		homepage.scrollUp();
		assertTrue(homepage.isDisplayed());
		homepage.clickUserLogin();

		RegisterAuthenticationPage register = new RegisterAuthenticationPage(driver);
		register.setEmail("tiaradeng@gmail.com");
		register.clickCreate();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		register.checkBoxTitle();
		register.setFirstname("Kend");
		register.setLastname("Blesfor");
		register.setPassword("12345");
		register.setDay();
		register.setMonth();
		register.setYears();
		register.clickCheckboxSignup();
		register.isDisplayed();
		register.clickRegister();
		
//		register.clickUser();
//		register.clickLogout();
	}

}
