package com.smallproject.dominicparks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditSlipPage {
	WebDriver driver;

	public CreditSlipPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[.='My credit slips']")
	private WebElement lblcreditslip;
	
	@FindBy(xpath = "//p[@class='alert alert-warning']")
	private WebElement warningmessage;
	
	@FindBy(xpath = "//a[contains(.,'Back to your account')]//parent::span")
	private WebElement btnback;
	
	public void clickCreditSlip() {
		lblcreditslip.click();
	}
	
	public void clickBack() {
		btnback.click();
	}
	
	public boolean isDisplayed() {
		return warningmessage.isDisplayed();
	}
	
	

}
