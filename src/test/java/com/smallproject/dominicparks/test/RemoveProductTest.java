package com.smallproject.dominicparks.test;

import org.junit.Test;

import com.smallproject.dominicparks.pages.BookingCartPage;
import com.smallproject.dominicparks.pages.RoomsPage;

public class RemoveProductTest extends BaseTest {

	@Test
	public void deleteCart() throws InterruptedException {
		RoomSearchTest roomsearch = new RoomSearchTest();
		roomsearch.driver=this.driver;
		roomsearch.room();
		
		RoomsPage roomspage = new RoomsPage(driver);
		roomspage.clickPrice();
		roomspage.clickHighestPrice(3);
		Thread.sleep(3000);
		roomspage.clickBookNow(0);
		roomspage.switchFrame();
		
		BookingCartPage cart = new BookingCartPage(driver);
		Thread.sleep(2000);
		cart.clickCloseCheckout();
		cart.hoverToCart();
		cart.clickRemove();
	}
}
