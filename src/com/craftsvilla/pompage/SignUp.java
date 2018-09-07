package com.craftsvilla.pompage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.craftsvilla.generic.BasePage;

public class SignUp extends BasePage
{
	public SignUp(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[@class='facebookSignInBtn']")
	WebElement facebookbtn;
	
	//utilization
	
	public void clickOnFacebook()
	{
		verifyElementPresent(facebookbtn);
		facebookbtn.click();
	}
		
}
