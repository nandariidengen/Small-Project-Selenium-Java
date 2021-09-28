package com.smallproject.dominicparks.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderHistoryPage {
	WebDriver driver;

	public OrderHistoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "price")
	private WebElement totalprice;
	
	@FindBy(className = "color-myaccount")
	private WebElement orderreference;
	
	@FindBy(xpath = "//tr[@class='first_item ']//span[@class='footable-toggle']")
	private WebElement detailorder;
	
	@FindBy(xpath = "//div[@class='footable-row-detail-inner']//span[contains(.,'Details')]")
	private WebElement details;
	
	@FindBy(css = ".address > li:nth-of-type(2) > .col-sm-9")
	private WebElement namecustomer;
	
	@FindBy(css = ".address > li:nth-of-type(3) > .col-sm-9")
	private WebElement emailcustomer;
	
	@FindBy(css = ".address > li:nth-of-type(4) > .col-sm-9")
	private WebElement mobilephonecustomer;
	
	@FindBy(xpath = "//select[@name='id_product']")
	private WebElement roomtype;
	
	@FindBy(name = "msgText")
	private WebElement message;
	
	@FindBy(xpath = "//span[.='Send']")
	private WebElement btnsend;
	
	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement successmessage;
	
	@FindBy(xpath = "//span[contains(.,'Back to Your Account')]")
	private WebElement btnback;
	
	public String getTotalPrice() {
		return totalprice.getText();
	}
	
	public String getReferences() {
		return orderreference.getText();
	}
	
	public void clickPlusSign() {
		detailorder.click();
	}
	
	public void clickDetails() {
		details.click();
	}
	
	public String getNameCustDetail() {
		return namecustomer.getText();
	}
	
	public String getEmailCustDetail() {
		return emailcustomer.getText();
	}
	
	public String getMobilePhoneCustDetail() {
		return mobilephonecustomer.getText();
	}
	
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	public void clickRoomType() {
		Select room = new Select(roomtype);
		room.selectByValue("0");
	}
	
	public void setMessage(String messages) {
		 message.sendKeys(messages);
	}
	
	public void clickSave() {
		btnsend.click();
	}
	
	public void clickBackAccount() {
		btnback.click();
	}
	
	public boolean isDisplayed() {
		return successmessage.isDisplayed();
	}

}
