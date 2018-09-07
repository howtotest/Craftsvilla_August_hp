package com.craftsvilla.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class CartPage extends BasePage
{
	@FindBy(id="address-email")
	private WebElement emailAddress;
	
	@FindBy(id="address-first-name")
	private WebElement firstname;
	
	public CartPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setEmail(String email)
	{
		verifyElementPresent(emailAddress);
		emailAddress.sendKeys(email);
	}
	
	public void setFirstName(String fname)
	{
		verifyElementPresent(firstname);
		firstname.sendKeys(fname);
	}

}
