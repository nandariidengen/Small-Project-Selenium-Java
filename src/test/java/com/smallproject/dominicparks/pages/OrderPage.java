package com.smallproject.dominicparks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	WebDriver webdriver;

	public OrderPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(xpath = "//span[.='Rooms & Price Summary']")
	private WebElement headerRoomsAndPrice;
	
	@FindBy(xpath = "//div[@class='room-xs-info']/p[@class='product-name']")
	private WebElement roomname;

	@FindBy(xpath = "hotel-location")
	private WebElement location;

	@FindBy(xpath = "//p[.='16 Sep, Thu']")
	private WebElement checkin;

	@FindBy(xpath = "//p[.='17 Sep, Fri']")
	private WebElement checkout;

	@FindBy(xpath = "//p[.='ROOMS']//following-sibling::p")
	private WebElement rooms;

	@FindBy(xpath = "//p[contains(.,'02 Adults, 02 Child')]")
	private WebElement guest;

	@FindBy(xpath = "//div[@class='total_price_block']//span[@class='room_type_current_price']")
	private WebElement totalroomsprice;

	@FindBy(xpath = "//span[.='Final Total']//following-sibling::span")
	private WebElement totalfinal;
	
	@FindBy(xpath = "//div[@class='col-sm-12 proceed_btn_block']/a[contains(.,'Proceed')]")
	private WebElement btnproceed;

	public void clickProceed() {
		btnproceed.click();
	}

	public String getTotalRoomsPrice() {
		return totalroomsprice.getText();
	}

	public String getTotalFinal() {
		return totalfinal.getText();
	}
	
	public String getRoomName() {
		return roomname.getText();
	}
	
	public boolean isDisplayed() {
		headerRoomsAndPrice.isDisplayed();
		location.isDisplayed();
		checkin.isDisplayed();
		checkout.isDisplayed();
		rooms.isDisplayed();
		guest.isDisplayed();
		return true;
	}

}
