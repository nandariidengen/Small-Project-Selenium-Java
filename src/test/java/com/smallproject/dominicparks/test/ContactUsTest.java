package com.smallproject.dominicparks.test;

import org.junit.Test;

import com.smallproject.dominicparks.pages.ContactUsPage;

public class ContactUsTest extends BaseTest {
	
	@Test
	public void sendMessage() throws InterruptedException {
		ViewOrderHistoryTest historyorder = new ViewOrderHistoryTest();
		historyorder.driver=this.driver;
		historyorder.confirmationOrder();
		
		ContactUsPage contact = new ContactUsPage(driver);
		contact.clickToggle();
		contact.clickContact();
		contact.clickSubject();
		contact.selectSubject();
		contact.setMessage("Kamar kotor");
		contact.uploadPhoto();
		contact.clickSendMessage();
	}

}
