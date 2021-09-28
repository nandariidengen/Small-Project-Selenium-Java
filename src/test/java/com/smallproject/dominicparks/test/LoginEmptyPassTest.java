package com.smallproject.dominicparks.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.smallproject.dominicparks.pages.HomePage;
import com.smallproject.dominicparks.pages.LoginAuthenticationPage;

public class LoginEmptyPassTest extends BaseTest {
	
	@Test
	public void loginEmptypass() throws InterruptedException {
		HomePage homepage = new HomePage(driver);
		homepage.getTitleHomePage();
		assertTrue(homepage.isDisplayed());
		homepage.clickUserLogin();
		
		LoginAuthenticationPage loginpage = new LoginAuthenticationPage(driver);
		Thread.sleep(2000);
		loginpage.setEmail("tiarad@gmail.com");
		loginpage.setPassword("");
		loginpage.clickSignIn();
		loginpage.getErrorMessage();
	}
}
