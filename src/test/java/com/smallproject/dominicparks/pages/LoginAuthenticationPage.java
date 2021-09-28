package com.smallproject.dominicparks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LoginAuthenticationPage {
	WebDriver webdriver;

	public LoginAuthenticationPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(id = "email")
	private WebElement inputEmail;
	
	@FindBy(id = "passwd")
	private WebElement inputPassword;
	
	@FindBy(id = "SubmitLogin")
	private WebElement btnSignIn;
	
	@FindBy(xpath = "//li[.='Password is required.']")
	private WebElement passrequired;
	
	public void setEmail(String email) {
		inputEmail.sendKeys(email);
	}
	
	public void setPassword(String password) {
		inputPassword.sendKeys(password);
	}
	
	public void clickSignIn() {
		btnSignIn.click();
	}
	public void getErrorMessage() {
	String expected = "Password is required.";
	String actual = passrequired.getText();
	Assert.assertEquals(expected, actual);
	}
}
