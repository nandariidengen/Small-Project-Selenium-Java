package com.smallproject.dominicparks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {
	WebDriver webdriver;

	public AddressPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath ="//span[.='Add my first address']")
	private WebElement firstaddress;
	
	@FindBy(css = ".page-subheading")
	private WebElement headerAddres;

	@FindBy(id = "firstname")
	private WebElement firstname;

	@FindBy(id = "lastname")
	private WebElement lastname;

	@FindBy(xpath = "//input[@id='company']")
	private WebElement company;

	@FindBy(id = "address1")
	private WebElement address;

	@FindBy(id = "postcode")
	private WebElement postcode;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "id_state")
	private WebElement states;

	@FindBy(id = "id_country")
	private WebElement countrys;

	@FindBy(id = "phone")
	private WebElement homephone;

	@FindBy(id = "phone_mobile")
	private WebElement mobilephone;

	@FindBy(id = "submitAddress")
	private WebElement submitAddress;
	
	@FindBy(xpath = "//ul[@class='last_item item box']//span[contains(.,'Kend')]")
	private WebElement firstName;
	
	@FindBy(xpath = "//span[contains(.,'Blesfor')]")
	private WebElement lastName;
	
	@FindBy(xpath = "//span[contains(.,'PT. Dika')]")
	private WebElement companys;
	
	@FindBy(xpath = "//span[contains(.,'Back to your account')]")
	private WebElement back;
	
	@FindBy(xpath = "//span[.='My addresses']")
	private WebElement lbladdress;
	
	@FindBy(xpath = "//span[.='Update']")
	private WebElement update;

	public void clickAddFirstAddres() {
		firstaddress.click();
	}
	
	public void clickMyAddresses() {
		lbladdress.click();
	}
	
	public void clickUpdate() {
		update.click();
	}
	
	public String getHeaderAddress() {
		return headerAddres.getText();
	}

	public void setFirstname(String firstName) {
		firstname.clear();
		firstname.sendKeys(firstName);
	}
	
	public void setLastname(String lastName) {
		lastname.clear();
		lastname.sendKeys(lastName);
	}

	public void setCompany(String Company) {
		company.sendKeys(Company);
	}

	public void setAddress(String Address) {
		address.sendKeys(Address);
	}

	public void setPostalCode(String postalcode) {
		postcode.sendKeys(postalcode);
	}

	public void setCity(String City) {
		city.clear();
		city.sendKeys(City);
	}
	
	public void setState() {
		Select state = new Select(states);
		state.selectByValue("233");
	}
	
	public void setUpdateState() {
		Select state = new Select(states);
		state.selectByValue("257");
	}

	public void setCountry() {
		Select country = new Select(countrys);
		country.selectByValue("111");
	}

	public void setHomephone(String Homephone) {
		homephone.sendKeys(Homephone);
	}

	public void setMobilePhone(String mobilePhone) {
		mobilephone.sendKeys(mobilePhone);
	}

	public void clickSaveAddres() {
		submitAddress.click();
	}
	
	public String getFirtsname() {
		return firstName.getText();
	}
	
	public String getLastname() {
		return lastName.getText();
	}
	
	public void clickBackAccount() {
		back.click();
	}

	public boolean isDisplayed() {
		firstaddress.isDisplayed();
		headerAddres.isDisplayed();
		firstname.isDisplayed();
		lastname.isDisplayed();
		company.isDisplayed();
		address.isDisplayed();
		postcode.isDisplayed();
		city.isDisplayed();
		states.isDisplayed();
		countrys.isDisplayed();
		homephone.isDisplayed();
		mobilephone.isDisplayed();
		submitAddress.isDisplayed();
		firstName.isDisplayed();
		lastName.isDisplayed();
		companys.isDisplayed();
		back.isDisplayed();
		lbladdress.isDisplayed();
		update.isDisplayed();
		return true;
	}

}
