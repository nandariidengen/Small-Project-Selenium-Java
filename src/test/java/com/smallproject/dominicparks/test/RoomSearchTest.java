package com.smallproject.dominicparks.test;

import org.junit.Test;

import com.smallproject.dominicparks.pages.AccountPage;
import com.smallproject.dominicparks.pages.SearchRoomPage;

public class RoomSearchTest extends BaseTest{

	@Test
	public void room() throws InterruptedException {
		LoginTest logintest = new LoginTest();
		logintest.driver=this.driver;
		logintest.login();

		AccountPage accountpage = new AccountPage(driver);
		accountpage.isDisplayed();
		Thread.sleep(2000);
		accountpage.clickIconBar();
		accountpage.clickHome();

		SearchRoomPage searchHotel = new SearchRoomPage(driver);
		searchHotel.setLocationHotel("DefCity, Aceh, Indonesia");
		searchHotel.clickSelectHotel();
		searchHotel.selectHotel();
		searchHotel.clickCheckin();
		searchHotel.clickDateCheckin(28);
		searchHotel.clickCheckout();
		searchHotel.clickDateCheckout(30);
		searchHotel.clickSearch();
	}

}
