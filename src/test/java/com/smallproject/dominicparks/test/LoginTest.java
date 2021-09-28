package com.smallproject.dominicparks.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.smallproject.dominicparks.pages.HomePage;
import com.smallproject.dominicparks.pages.LoginAuthenticationPage;

public class LoginTest extends BaseTest {


	@Test
	public void login() throws InterruptedException {
		
		HomePage homepage = new HomePage(driver);
		homepage.getTitleHomePage();
		homepage.scrollDown();
		homepage.swipeRight();
		homepage.swipeLeft();
		homepage.scrollUp();
		assertTrue(homepage.isDisplayed());
		homepage.clickUserLogin();

		LoginAuthenticationPage loginpage = new LoginAuthenticationPage(driver);
		Thread.sleep(2000);
		loginpage.setEmail("tiarade@gmail.com");
		loginpage.setPassword("12345");
		loginpage.clickSignIn();
	}
}
