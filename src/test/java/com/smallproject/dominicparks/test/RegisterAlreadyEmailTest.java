package com.smallproject.dominicparks.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.smallproject.dominicparks.pages.HomePage;
import com.smallproject.dominicparks.pages.RegisterAuthenticationPage;

public class RegisterAlreadyEmailTest extends BaseTest {
	
	@Test
	public void alreadyEmail() throws InterruptedException {
		HomePage homepage = new HomePage(driver);
		homepage.getTitleHomePage();
		assertTrue(homepage.isDisplayed());
		homepage.clickUserLogin();
		
		RegisterAuthenticationPage register = new RegisterAuthenticationPage(driver);
		register.setEmail("one@gmail.com");
		register.clickCreate();
		Thread.sleep(2000);
		register.getErrorMessage();
		System.out.println("Passed");
		
				
	}

}
