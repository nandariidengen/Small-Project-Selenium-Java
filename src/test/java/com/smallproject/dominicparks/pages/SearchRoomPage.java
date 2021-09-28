package com.smallproject.dominicparks.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchRoomPage {
	WebDriver webdriver;

	public SearchRoomPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(id = "hotel_location")
	private WebElement hotellocation;

	@FindBy(id = "id_hotel_button")
	private WebElement btnSelectHotel;

	@FindBy(css = ".search_result_li")
	private WebElement hotelName;

	@FindBy(id = "check_in_time")
	private WebElement checkin;

	@FindBy(className = "ui-state-default")
	private List<WebElement> dateCheckin;

	@FindBy(id = "check_out_time")
	private WebElement checkout;

	@FindBy(className = "ui-state-default")
	private List<WebElement> dateCheckout;

	@FindBy(xpath = "//span[.='Search Now']")
	private WebElement btnSearch;

	public void setLocationHotel(String location) {
		hotellocation.sendKeys(location);
	}

	public void clickSelectHotel() {
		btnSelectHotel.click();
	}

	public void selectHotel() {
		hotelName.click();
	}

	public void clickCheckin() {
		checkin.click();
	}

	public void clickDateCheckin(int index) {
		dateCheckin.get(index).click();
	}

	public void clickCheckout() {
		checkout.click();
	}

	public void clickDateCheckout(int index) {
		dateCheckout.get(index).click();;
	}

	public void clickSearch() {
		btnSearch.click();
	}

}
