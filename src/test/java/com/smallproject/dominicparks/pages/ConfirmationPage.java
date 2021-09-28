package com.smallproject.dominicparks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
	WebDriver webdriver;

	public ConfirmationPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(xpath = "//h2/i")
	private WebElement successMessage;

	@FindBy(xpath = "//span[@id='layer_cart_product_title']")
	private WebElement productTitle;

	@FindBy(id = "layer_cart_product_time_duration")
	private WebElement time;

	@FindBy(id = "layer_cart_product_quantity")
	private WebElement roomquantity;

	@FindBy(id = "layer_cart_product_price")
	private WebElement totalcartcost;

	@FindBy(css = ".ajax_block_products_total")
	private WebElement totalroomscost;

	@FindBy(xpath = "//span[@class='ajax_block_cart_total']")
	private WebElement total;

	@FindBy(xpath = "//span[contains(.,'Proceed to checkout')]")
	private WebElement btnCheckoutProcess;

	public String getProductTitle() {
		return productTitle.getText();
	}

	public String getRoomPrice() {
		return totalcartcost.getText();
	}

	public String getTotalCost() {
		return totalroomscost.getText();
	}

	public void clickProceedCheckout() {
		btnCheckoutProcess.click();
	}

	public boolean isDisplayed() {
		successMessage.isDisplayed();
		time.isDisplayed();
		roomquantity.isDisplayed();
		total.isDisplayed();
		return true;
	}

}
