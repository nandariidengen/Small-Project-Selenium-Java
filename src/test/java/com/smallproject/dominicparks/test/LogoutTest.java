package com.smallproject.dominicparks.test;

import org.junit.Test;

import com.smallproject.dominicparks.pages.LogoutPage;

public class LogoutTest extends BaseTest{
	
	@Test
	public void logout() throws InterruptedException {
		LoginTest login = new LoginTest();
		login.driver=this.driver;
		login.login();
		
		LogoutPage logout = new LogoutPage(driver);
		logout.clickUser();
		logout.clickLogout();
	}

}
