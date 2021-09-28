package com.smallproject.dominicparks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {
	WebDriver webdriver;

	public OrderConfirmationPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement successmessage; 
	
	@FindBy(css = ".bold")
	private WebElement orderreferences;
	
	@FindBy(xpath = "//p[@class='product-name']")
	private WebElement roomdesc;
	
	@FindBy(xpath = "//td[.='The Hotel Prime']")
	private WebElement hotelname;
	
	@FindBy(xpath = "//span[@class='product_original_price ']")
	private WebElement unitprice;
	
	@FindBy(xpath = "//td[5]/p[contains(.,'1')]")
	private WebElement room;
	
	@FindBy(xpath = "//p[contains(.,'16-09-2021')]")
	private WebElement checkindate;
	
	@FindBy(xpath = "//p[contains(.,'17-09-2021')]")
	private WebElement checkoutdate;
	
	@FindBy(xpath = "//td[@class='cart_total text-left']")
	private WebElement totalprice;
	
	@FindBy(css = "tr:nth-of-type(3) > [colspan='2']")
	private WebElement dueamount;
	
	@FindBy(xpath = "//a[.='View your order history']")
	private WebElement history;
	
	public String getOrderReference() {
		return orderreferences.getText();
	}
	
	public String getDueAmount() {
		return dueamount.getText();
	}
	
	public void clickOrderHistory() {
		history.click();
	}
	
	public boolean isDisplayed() {
		successmessage.isDisplayed();
		hotelname.isDisplayed();
		room.isDisplayed();
		checkindate.isDisplayed();
		checkoutdate.isDisplayed();
		totalprice.isDisplayed();
		dueamount.isDisplayed();
		return true;
	}
	
	

}
