package com.smallproject.dominicparks.test;

import org.junit.Test;

import com.smallproject.dominicparks.pages.GuestInformationOrderPage;
import com.smallproject.dominicparks.pages.OrderPage;
import com.smallproject.dominicparks.pages.PaymentInformationOrderPage;

import junit.framework.Assert;

public class PaymentByBankWireTest extends BaseTest {
	
	@Test
	public void orderProceed() throws InterruptedException {
		AddToCartTest addcart = new AddToCartTest();
		addcart.driver=this.driver;
		addcart.addToCart();
		
		OrderPage orderpage = new OrderPage(driver);
		Thread.sleep(3000);
		String actualRoomPrice = orderpage.getTotalRoomsPrice();

		String expectedRoomPrice = orderpage.getTotalFinal();

		Assert.assertEquals(expectedRoomPrice, actualRoomPrice);
		orderpage.clickProceed();
		
		GuestInformationOrderPage guestinformation = new GuestInformationOrderPage(driver);

		guestinformation.isDisplayed();
		guestinformation.clickProceedGuest();
		
		PaymentInformationOrderPage payment = new PaymentInformationOrderPage(driver);
		payment.clickReadTerms();
		Thread.sleep(3000);
		payment.clickCloseTerms();
		payment.clickCheckbox();
		Thread.sleep(3000);
		payment.clickPayByBankWire();
		payment.clickConfirmOrder();
	}

}
