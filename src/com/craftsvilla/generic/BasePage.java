package com.craftsvilla.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver=null; //
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver; //refers to current class instance which in this case is driver
	}
	
	public void verifyTitle(String exp_title)
	{
		WebDriverWait w=new WebDriverWait(driver,10);
		try
		{
			w.until(ExpectedConditions.titleContains(exp_title));
			String act_title=driver.getTitle();
			Assert.assertEquals(act_title,exp_title);
		}
		catch (Exception e)
		{
			Reporter.log("Fail, Mismatch in the title of the webpage");
		}
	}
	public void verifyElementPresent(WebElement ele)
	{
		WebDriverWait w=new WebDriverWait(driver,10);
		try
		{
			w.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log(ele+" found:");
		}
		catch (Exception e)
		{
			//exception
			Reporter.log(ele+" not found");
		}
		
	}
	
	public void mouseHover(WebDriver driver,WebElement ele)
	{
		try
		{
			Actions action=new Actions(driver);
			Reporter.log("mousehovered on "+ele);
		}
		catch (Exception e)
		{
			Reporter.log("Unable to mousehover on "+ele);
		}
	}
	
	public void handleDropdown(WebElement ele, String option)
	{
		
	}
	
	public void confirmationPopup()
	{
		
	}
	
	
	//add any number of methods depending on the need
	}
	
	
	
	

