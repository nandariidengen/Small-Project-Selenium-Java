package com.smallproject.dominicparks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	WebDriver driver;

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user_info_acc")
	private WebElement userlogout;
	
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutt;
	
	public void clickUser() {
		userlogout.click();
	}
	
	public void clickLogout() {
		logoutt.click();
	}
	
	
	
	
	
	
	
	
}
