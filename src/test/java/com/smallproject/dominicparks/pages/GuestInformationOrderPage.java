package com.smallproject.dominicparks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuestInformationOrderPage {
	WebDriver webdriver;

	public GuestInformationOrderPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(css = "#collapse-guest-info div:nth-of-type(1) > .col-sm-9")
	private WebElement nameguest;
	
	@FindBy(css = "#collapse-guest-info div:nth-of-type(2) > .col-sm-9")
	private WebElement emailguest;
	
	@FindBy(css = "#collapse-guest-info div:nth-of-type(3) > .col-sm-9")
	private WebElement mobilephoneguest;
	
	@FindBy(xpath = "//div[@id='collapse-guest-info']//a[contains(.,'Proceed')]")
	private WebElement btnproceed;
	
	public String getNameGuest() {
		return nameguest.getText();
	}
	
	public String getEmailGuest() {
		return emailguest.getText();
	}
	
	public String getMobilePhone() {
		return mobilephoneguest.getText();
	}
	public void clickProceedGuest() {
		btnproceed.click();
	}
	
	public boolean isDisplayed() {
		nameguest.isDisplayed();
		emailguest.isDisplayed();
		mobilephoneguest.isDisplayed();
		return true;
	}

}
