package com.smallproject.dominicparks.test;

import org.junit.Test;

import com.smallproject.dominicparks.pages.AddressPage;

public class UpdateAddressTest extends BaseTest {
	
	@Test
	public void updateAddress() throws InterruptedException {
		LoginTest logintest = new LoginTest();
		logintest.driver=this.driver;
		logintest.login();
		
		AddressPage address = new AddressPage(driver);
		address.clickMyAddresses();
		address.clickUpdate();
		address.setCity("Makassar");
		address.setUpdateState();
		address.clickSaveAddres();
	}

}
