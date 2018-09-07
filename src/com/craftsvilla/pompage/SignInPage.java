package com.craftsvilla.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.craftsvilla.generic.BasePage;

public class SignInPage extends BasePage
{
	@FindBy(id="emailId")
	private WebElement email;
	
	@FindBy(id="continueBtn")
	private WebElement continueBtn;
	
	@FindBy(id="set-password")
	private WebElement setpassword;
	
//	@FindBy(id="loginCheck")
//	private WebElement logininwelcome;
	
	@FindBy(id="userRegister")
	private WebElement registerBtn;
	
	public SignInPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setEmail(String emailAddress)
	{
		verifyElementPresent(email);
		email.sendKeys(emailAddress);
	}
	
	public void clickContinue()
	{
		verifyElementPresent(continueBtn);
		continueBtn.click();
	}
	
	public void setPassword(String pwd)
	{
		verifyElementPresent(setpassword);
		setpassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		verifyElementPresent(logininwelcome);
		logininwelcome.click();
	}
	
	public void clickOnRegister()
	{
		verifyElementPresent(registerBtn);
		registerBtn.click();
	}
	
	public void waitForHomePage(String title)
	{
		
	WebDriverWait w=new WebDriverWait(driver,10);
	w.until(ExpectedConditions.titleIs(title));
	}
	
/*	public void getLoginMessage()
	{
		verifyElementPresent(loginMsg);
		String message=loginMsg.getText();
	}*/
}