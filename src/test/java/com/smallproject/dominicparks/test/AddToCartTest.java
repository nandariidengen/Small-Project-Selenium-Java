package com.smallproject.dominicparks.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.smallproject.dominicparks.pages.ConfirmationPage;
import com.smallproject.dominicparks.pages.RoomsPage;

import junit.framework.Assert;

public class AddToCartTest extends BaseTest {

	@Test
	public void addToCart() throws InterruptedException {
		RoomSearchTest roomsearch = new RoomSearchTest();
		roomsearch.driver=this.driver;
		roomsearch.room();
		
		RoomsPage roomspage = new RoomsPage(driver);
		roomspage.clickPrice();
//		roomspage.clickHighestPrice(3);
		roomspage.clickLowestPrice(0);
		Thread.sleep(3000);
		roomspage.clickBookNow(0);
		roomspage.switchFrame();
		driver.getWindowHandle();

		ConfirmationPage confirmationpage = new ConfirmationPage(driver);
		Thread.sleep(2000);
		String expectedPrice = confirmationpage.getRoomPrice();

		String actualPrice = confirmationpage.getTotalCost();

		confirmationpage.clickProceedCheckout();
		assertTrue(roomspage.isDisplayed());
		Assert.assertEquals(expectedPrice, actualPrice);
	}
}
