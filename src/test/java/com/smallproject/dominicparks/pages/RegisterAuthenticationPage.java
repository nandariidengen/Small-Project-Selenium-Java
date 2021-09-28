package com.smallproject.dominicparks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class RegisterAuthenticationPage {
	WebDriver webdriver;

	public RegisterAuthenticationPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(id ="email_create")
	private WebElement emailaddress;
	
	@FindBy(id = "SubmitCreate")
	private WebElement createaccount;
	
	@FindBy(xpath = "//div[@id='create_account_error']")
	private WebElement errormessage;
	
	@FindBy(id = "id_gender2")
	private WebElement title;
	
	@FindBy(id = "customer_firstname")
	private WebElement firstname;
	
	@FindBy(id = "customer_lastname")
	private WebElement lastname;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(id = "days")
	private WebElement days;
	
	@FindBy(id = "months")
	private WebElement months;
	
	@FindBy(id = "years")
	private WebElement years;
	
	@FindBy(id = "newsletter")
	private WebElement newsletter;
	
	@FindBy(id = "submitAccount")
	private WebElement submit;
	
	@FindBy(id = "user_info_acc")
	private WebElement user;
	
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logout;
	
	public void getErrorMessage() {
		String expected = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
		String actual = errormessage.getText();
		Assert.assertEquals(expected, actual);
		
	}
	
	public void setEmail(String email) {
		 emailaddress.sendKeys(email);
	}
	
	public void checkBoxTitle() {
		title.click();
	}
	
	public void setFirstname(String firstName) {
		firstname.sendKeys(firstName);
	}
	
	public void setLastname(String lastName) {
		lastname.sendKeys(lastName);
	}
	
	public void setPassword(String passwd) {
		password.sendKeys(passwd);
	}
	public void clickCreate() {
		createaccount.click();
	}
	
	public void setDay() {
		Select day = new Select(days);
		day.selectByValue("13");
	}
	
	public void setMonth() {
		Select month = new Select(months);
		month.selectByValue("7");
	}
	
	public void setYears() {
		Select year = new Select(years);
		year.selectByValue("1999");
	}
	
	public void clickCheckboxSignup() {
		newsletter.click();
	}
	
	public void clickRegister() {
		submit.click();
	}
	
	public void clickUser() {
		user.click();
	}
	
	public void clickLogout() {
		logout.click();
	}
	
	public boolean isDisplayed() {
		firstname.isDisplayed();
		lastname.isDisplayed();
		email.isDisplayed();
		password.isDisplayed();
		days.isDisplayed();
		months.isDisplayed();
		years.isDisplayed();
		newsletter.isDisplayed();
		submit.isDisplayed();
		return true;
	}

}
