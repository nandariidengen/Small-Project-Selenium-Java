package com.smallproject.dominicparks.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.smallproject.dominicparks.pages.OrderConfirmationPage;
import com.smallproject.dominicparks.pages.OrderHistoryPage;

import junit.framework.Assert;

public class ViewOrderHistoryTest extends BaseTest {

	@Test
	public void confirmationOrder() throws InterruptedException {
		PaymentByBankWireTest payment = new PaymentByBankWireTest();
		payment.driver = this.driver;
		payment.orderProceed();

		OrderConfirmationPage orderconfirmation = new OrderConfirmationPage(driver);
		orderconfirmation.clickOrderHistory();

		String expectedOrderReference = orderconfirmation.getOrderReference();
		System.out.println(expectedOrderReference);

		OrderHistoryPage orderhistory = new OrderHistoryPage(driver);
		String actualOrderReference = orderhistory.getReferences();
		System.out.println(actualOrderReference);
		orderhistory.clickPlusSign();
		orderhistory.clickDetails();
		orderhistory.scrollDown();
		Thread.sleep(2000);
		orderhistory.clickRoomType();
		orderhistory.setMessage("Good");
		orderhistory.clickSave();
		Thread.sleep(2000);
		assertTrue(orderhistory.isDisplayed());

		Assert.assertEquals(expectedOrderReference, actualOrderReference);
		orderhistory.clickBackAccount();
	}

}
