package com.craftsvilla.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class ProductDescription extends BasePage
{
	@FindBy(xpath="//span[text()='Add to Cart']")
	private WebElement addTocart;
	
	@FindBy(id="buynow")
	private WebElement buyNow;
	
	public ProductDescription(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddToCart()
	{
		verifyElementPresent(addTocart);
		addTocart.click();
	}
	
	public void clickOnBuyNow()
		{
			verifyElementPresent(buyNow);
			buyNow.click();
		}

	}
	
