package com.smallproject.dominicparks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {
	WebDriver webdriver;

	public FooterPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//p[.='Language']")
	private WebElement language;
	
	@FindBy(xpath = "//div[@class='current']")
	private WebElement dpdlanguange;
	
	@FindBy(xpath = "//a[contains(.,'English')]")
	private WebElement english;
	
	@FindBy(xpath = "//li[@class='selected']//parent::span")
	private WebElement indonesian;
	
	@FindBy(xpath = "//p[.='About']")
	private WebElement about;
	
	@FindBy(xpath = "///div[@class='row margin-lr-0 footer-about-hotel']/p[1]")
	private WebElement descabout;
	
	@FindBy(xpath = "//p[.='payment accepted']")
	private WebElement payment;
	
	@FindBy(css = ".footer-payment-block")
	private WebElement footerpayment;
	
	@FindBy(xpath = "//p[.='GET NOTIFICATIONS']")
	private WebElement notification;
	
	@FindBy(id = "newsletter-input")
	private WebElement emailnotif;
	
	@FindBy(xpath = "//span[.='Subscribe']")
	private WebElement btnSubscribe;
	
	@FindBy(xpath = "///p[.='Follow us on']")
	private WebElement followus;
	
	@FindBy(xpath = "//li[@class='facebook']//parent::a")
	private WebElement facebook;
	
	@FindBy(css = ".twitter")
	private WebElement twitter;
	
	@FindBy(xpath = "//li[@class='google-plus']//parent::a")
	private WebElement googleplus;
	
	@FindBy(xpath = "//p[.='Explore']")
	private WebElement explore;
	
	@FindBy(xpath = "//a[.='Policies']")
	private WebElement policies;
	
	@FindBy(css = "[title='Kebijakan privasi dan hukum']")
	private WebElement kebijakan;
	
	@FindBy(xpath = "//a[.='Syarat pemakaian']")
	private WebElement syaratpemakaian;
	
	@FindBy(xpath = "//ul[@class='footer-navigation-section']//a[.='Tentang kami']")
	private WebElement aboutus;
	
	@FindBy(xpath = "//a[.='Pembayaran']")
	private WebElement pembayaran;
	
	public void clickLanguage() {
		dpdlanguange.click();
	}
	
	public void selectLanguage() {
		indonesian.click();
	}
	
	public void setEmailNotification(String email) {
		emailnotif.sendKeys(email);
	}
	
	public void clickSubscribe() {
		btnSubscribe.click();
	}
	
	public void clickFacebook() {
		facebook.click();
	}
	
	public void clickTwitter() {
		twitter.click();
	}
	
	public void clickGooglePlus() {
		googleplus.click();
	}
	
	public void clickPoliciesFooter() {
		policies.click();
	}
	
	public void clickKebijakanFooter() {
//		kebijakan.click();
		Actions actions = new Actions(webdriver);
		actions.moveToElement(kebijakan).click().build().perform();
	}
	
	public void clickSyaratPemakaian() {
		syaratpemakaian.click();
	}
	
	public void clickAboutUs() {
		aboutus.click();
	}
	
	public void clickPembayaran() {
		pembayaran.click();
	}
	
	public boolean isDisplayed() {
		language.isDisplayed();
//		dpdlanguange.isDisplayed();
//		english.isDisplayed();
//		indonesian.isDisplayed();
		about.isDisplayed();
		descabout.isDisplayed();
		payment.isDisplayed();
		footerpayment.isDisplayed();
		notification.isDisplayed();
		followus.isDisplayed();
		facebook.isDisplayed();
		twitter.isDisplayed();
		googleplus.isDisplayed();
		explore.isDisplayed();
		policies.isDisplayed();
		syaratpemakaian.isDisplayed();
		aboutus.isDisplayed();
		pembayaran.isDisplayed();
		return true;
	}
	
	
}
