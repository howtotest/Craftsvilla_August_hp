package com.craftsvilla.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.craftsvilla.generic.BasePage;

public class HomePage extends BasePage  //Extends is relationship between 2 classes
{
	//initialization any number of pages-only thing changes is the HomePage part.  This is called a Constructor
	public HomePage(WebDriver driver)
	{
		super(driver);  //to handle superclass constructors
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(xpath="//span[text()='Sign In']") //no id so use span text
	private WebElement signIn;
	
	@FindBy(xpath="//span[text()='Cart ']")
	private WebElement Cart;
	
	@FindBy(xpath="//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']")
	private WebElement sarees;
	
	@FindBy(xpath="//a[contains(@href,'/mens-fashion/?')]")
	private WebElement mensFashion;
	
	@FindBy(xpath="a//[contains(@href,'/womens-clothing/?']")
	private WebElement womensClothing;
	
	@FindBy(xpath="//i[@class='icon first_arrow hidden-xs']")
	private WebElement account;
	
/*	@FindBy(xpath="a//[contains(@href,'hidden-xs user-name']")
    private WebElement userAccount;*/
	
	@FindBy(xpath="*[@id='loginLogoutResponse']")
	private WebElement loginlogout;
	
	@FindBy(xpath="//a[@href='https://cvaccount.craftsvilla.com/customer/account/logout']")
	private WebElement logoutBtn;
	
	
	
	//utilization
	public void clickOnSignIn()  //this is a method
	{
		verifyElementPresent(signIn);
		signIn.click();
	}
	
	public void clickOnCart()
	{
		verifyElementPresent(Cart);
		Cart.click();
	}
	
	public void goToSarees()
	{
		verifyElementPresent(sarees);
		mouseHover(driver,sarees);
	}
	
	public void gotoMensFashion()
	{
		verifyElementPresent(mensFashion);
		mouseHover(driver,mensFashion);
	}
	
	public void gotoWomensClothing()
	{
		verifyElementPresent(womensClothing);
		mouseHover(driver,womensClothing);
	}
	
	public void gotoAccount()
	{
		verifyElementPresent(account);
		mouseHover(driver,account);
	}
	
/*   public void clickUserAccount()
	{
		verifyElementPresent(userAccount);
		userAccount.click();		
	}*/
	
	public void clickOnLogout()
	{
		verifyElementPresent(logoutBtn);
		logoutBtn.click();
	}

	
}
