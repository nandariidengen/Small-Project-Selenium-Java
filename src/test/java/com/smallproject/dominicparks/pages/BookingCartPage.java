package com.smallproject.dominicparks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingCartPage {
	WebDriver webdriver;

	public BookingCartPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//span[@class='cross']")
	private WebElement btnclose;
	
	@FindBy(xpath = "//div[@class='shopping_cart']")
	private WebElement cart;
	
	@FindBy(xpath = "//span[@class='remove_link']/a[1]")
	private WebElement btnremove;
	
	public void clickCloseCheckout() {
		btnclose.click();
	}
	
	public void hoverToCart() {
		Actions action = new Actions(webdriver);
		action.moveToElement(cart).build().perform();
	}
	
	public void clickRemove() {
		btnremove.click();
	}
	
	

}
