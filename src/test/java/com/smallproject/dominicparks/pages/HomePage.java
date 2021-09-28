package com.smallproject.dominicparks.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public HomePage() {

	}

	@FindBy(css = ".nav_toggle")
	private WebElement toggle;

	@FindBy(css = ".shopping_cart")
	private WebElement shoppingcart;

	@FindBy(xpath = "//h1[@class='header-hotel-name']")
	private WebElement hotelName;

	@FindBy(xpath = "//p[@class='header-hotel-desc']")
	private WebElement descHotel;

	@FindBy(className = "home_block_heading")
	private WebElement headingHome;

	@FindBy(className = "home_block_description")
	private WebElement descHome;

	@FindBy(className = "interiorbox")
	private WebElement picture;

	@FindBy(className = "amenity_img_secondary")
	private WebElement roompic;

	@FindBy(css = ".icon-angle-right")
	private WebElement iconright;

	@FindBy(css = ".icon-angle-left")
	private WebElement iconleft;

	@FindBy(css = ".user_login")
	private WebElement signIn;

	public void getTitleHomePage() {
		String expectedTitle = "Sekolah QA";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
	}

	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000)", "");
	}

	public void swipeRight() {
		iconright.click();
	}

	public void swipeLeft() {
		iconleft.click();
	}

	public void clickUserLogin() {
		signIn.click();
	}

	public boolean isDisplayed() {
		shoppingcart.isDisplayed();
		toggle.isDisplayed();
		hotelName.isDisplayed();
		descHotel.isDisplayed();
		headingHome.isDisplayed();
		descHome.isDisplayed();
		picture.isDisplayed();
		roompic.isDisplayed();
		return true;
	}

}
