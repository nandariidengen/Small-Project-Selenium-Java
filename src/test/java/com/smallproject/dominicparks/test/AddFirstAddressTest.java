package com.smallproject.dominicparks.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.smallproject.dominicparks.pages.AddressPage;

public class AddFirstAddressTest extends BaseTest {
	
	@Test
	public void addFirstAddres() throws InterruptedException {
		LoginTest login = new LoginTest();
		login.driver=this.driver;
		login.login();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		AddressPage addresspage = new AddressPage(driver);
		addresspage.clickAddFirstAddres();
		addresspage.setFirstname("Kend");
		addresspage.setLastname("Blesfor");
		addresspage.setCompany("PT. Dika");
		addresspage.setAddress("Aceh");
		addresspage.setPostalCode("75117");
		addresspage.setCity("Aceh");
		addresspage.setState();
		addresspage.setCountry();
		addresspage.setHomephone("042323068");
		addresspage.setMobilePhone("0811424916");
		addresspage.clickSaveAddres();
		
	}

}
