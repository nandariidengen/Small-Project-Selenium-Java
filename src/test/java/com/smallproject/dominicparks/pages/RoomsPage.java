package com.smallproject.dominicparks.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomsPage {
	WebDriver webdriver;

	public RoomsPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(id = "price_ftr")
	private WebElement sortprice;

	@FindBy(className = "sort_result")
	private List<WebElement> highestprice;
	
	@FindBy(xpath = "//a[.='Price : Lowest First']")
	private List<WebElement> lowestprice;

	@FindBy(className = "rm_heading")
	private List<WebElement> roomName;

	@FindBy(xpath = "//span[.='Book Now']")
	private List<WebElement> bookNow;

	public void clickPrice() {
		sortprice.click();
	}

	public void clickHighestPrice(int index) {
		highestprice.get(index).click();
	}
	
	public void clickLowestPrice(int index) {
		lowestprice.get(index).click();
	}

	public String getRoomName(int index) {
		return roomName.get(index).getText();
	}

	public void clickBookNow(int index) {
		bookNow.get(index).click();
	}

	public void switchFrame() {
		webdriver.getWindowHandle();
	}

	public boolean isDisplayed() {
		return true;
	}

}
