package com.craftsvilla.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class EmbroideredSareesPage extends BasePage
{
	public EmbroideredSareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//img[contains(@src,'CV-35964-MCRAF85932967230-1526628970')]")
	private WebElement product1;
	
	@FindBy(xpath="//img[contains(@src,'CV-35964-MCRAF43247284860-1526628970')]")
	private WebElement product2;
	
	public void chooseProduct1()
	{
		verifyElementPresent(product1);
		product1.click();
	}
	
	public void chooseProduct2()
	{
		verifyElementPresent(product2);
		product2.click();
	}

}