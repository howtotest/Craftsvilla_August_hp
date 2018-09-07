package com.craftsvilla.pompage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class SareesPage extends BasePage
{
	public SareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}


	@FindBy(linkText="Embroidered Sarees")  //when inspecting web element starts with <a href..>text</a>
	private WebElement embroideredSarees;
	
	@FindBy(linkText="Georgette Sarees")
	private WebElement georgetteSarees;
	
	@FindBy(linkText="Printed Sarees")
	private WebElement printedSarees;
	
	@FindBy(linkText="Woven Sarees")
	private WebElement wovenSarees;
	
	@FindBy(linkText="View All")
	private WebElement viewAll;
	
	//Utilization
	public void clickOnEmbroideredSarees()
	{
		verifyElementPresent(embroideredSarees);
		embroideredSarees.click();
	}
	
	public void clickOnGeorgetteSarees()
	{
		verifyElementPresent(georgetteSarees);
		georgetteSarees.click();
	}
	
	public void clickOnPrintedSarees()
	{
		verifyElementPresent(printedSarees);
		printedSarees.click();
	}
	
	public void clickOnWovenSarees()
	{
		verifyElementPresent(wovenSarees);
		wovenSarees.click();
	}
	

}

