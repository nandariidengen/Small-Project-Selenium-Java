package com.smallproject.dominicparks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformationOrderPage {
	WebDriver webdriver;

	public PaymentInformationOrderPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(id = "tc_link")
	private WebElement terms;
	
	@FindBy(id = "cms")
	private WebElement termsdesc;
	
	@FindBy(xpath = " //a[@class='fancybox-item fancybox-close']")
	private WebElement btncloseterms;
	
	@FindBy(id = "cgv")
	private WebElement checkbox;
	
	@FindBy(xpath = "//a[contains(.,'Pay by bank wire (order processing will be longer)')]")
	private WebElement bankwire;
	
	@FindBy(xpath = "//div[@class='box cheque-box']")
	private WebElement descbankwire;
	
	@FindBy(xpath = "//span[contains(.,'I confirm my order')]")
	private WebElement confirmorder;
	
	public void clickReadTerms() {
		terms.click();
	}
	
	public void clickCloseTerms() {
		btncloseterms.click();
	}
	
	public void clickCheckbox() {
		checkbox.click();
	}
	
	public void clickPayByBankWire() {
		bankwire.click();
	}
	
	public void clickConfirmOrder() {
		confirmorder.click();
	}
	
	public boolean isDisplayed() {
		termsdesc.isDisplayed();
		descbankwire.isDisplayed();
		return true;
	}
	
	
	

}
