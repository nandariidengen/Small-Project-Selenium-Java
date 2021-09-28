package com.smallproject.dominicparks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	WebDriver webdriver;

	public ContactUsPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(css = ".nav_toggle")
	private WebElement iconbar;
	
	@FindBy(xpath = "//a[.='Contact']")
	private WebElement contact;
	
	@FindBy(css = ".contact_type_input")
	private WebElement subject;
	
	@FindBy(xpath = "//li[contains(.,'Customer service')]")
	private WebElement custservice;
	
	@FindBy(id = "message")
	private WebElement message;
	
	@FindBy(id = "fileUpload")
	private WebElement uploadphoto;
	
	@FindBy(id = "submitMessage")
	private WebElement submitmessage;
	
	public void clickToggle() {
		iconbar.click();
	}
	
	public void clickContact() {
		contact.click();
	}
	
	public void clickSubject() {
		subject.click();
	}
	
	public void selectSubject() {
		custservice.click();
	}
	
	public void setMessage(String messages) {
		message.sendKeys(messages);
	}
	
	public void uploadPhoto() {
		String projectLoc = System.getProperty("user.dir");
		String path = projectLoc + "//lib//photo//kamarkotor.jpg";
		uploadphoto.sendKeys(path);
	}
	
	public void clickSendMessage() {
		submitmessage.click();
	}
	
	
	

}
