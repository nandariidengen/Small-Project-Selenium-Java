package com.smallproject.dominicparks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	WebDriver webdriver;

	public AccountPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(xpath = "//span[.='Add my first address']")
	private WebElement addAddress;

	@FindBy(xpath = "//span[.='Order history and details']")
	private WebElement orderDetails;

	@FindBy(xpath = "//a[.='My credit slips']")
	private WebElement creditSlip;

	@FindBy(xpath = "//a[.='My addresses']")
	private WebElement myAddress;

	@FindBy(xpath = "//a[.='My personal information']")
	private WebElement personalInformation;

	@FindBy(xpath = "//span[contains(.,'Home')]")
	private WebElement btnHome;

	@FindBy(css = ".nav_toggle")
	private WebElement iconbar;

	@FindBy(xpath = "//a[.='Home']")
	private WebElement home;

	public void clickBackHome() {
		btnHome.click();
	}

	public void clickIconBar() {
		iconbar.click();
	}

	public void clickHome() {
		home.click();
	}

	public boolean isDisplayed() {
//		addAddress.isDisplayed();
		orderDetails.isDisplayed();
		creditSlip.isDisplayed();
		myAddress.isDisplayed();
		personalInformation.isDisplayed();
		return true;
	}

}
