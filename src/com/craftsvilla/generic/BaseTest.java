package com.craftsvilla.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest implements AutoConst //Note abstract class since cannot be instantiated no test cases in here
{
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;

	@Parameters({"browser"}) //need this to take browser value from browser in testng 
	@BeforeMethod
	public void launchBrowser(String browser) //pass the browser value here
	{
			if(browser.equalsIgnoreCase("CHROME"))
			{
				System.setProperty(chrome_key,chrome_value);
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("FIREFOX"))
			{
				System.setProperty(gecko_key,gecko_value);
				driver=new FirefoxDriver();
			}
			else
			{
				Reporter.log("invalid browser selection");
			}
			
			driver.get("https://www.craftsvilla.com/");
			wait=new WebDriverWait(driver,10);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
	}
	
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
		
}

 