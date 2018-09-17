package com.craftsvilla.testscripts;

import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.generic.ReadExcel;
import com.craftsvilla.pompage.HomePage;
import com.craftsvilla.pompage.SignInPage;

public class SignUpScripts extends BaseTest
{
	public HomePage hp=null;
	public SignInPage sp=null;
	@Test
	public void signUp()
	{
		hp=new HomePage(driver);
		sp=new SignInPage( driver);
		
		String[][] credentials=ReadExcel.getData(filePath,"User_SignUp");  //Input Data having data file and the first sheet in Excel
		for(int i=1; i<credentials.length;i++)
		{
			String email=credentials[i][0];
			String password=credentials[i][1];
			
			hp.clickOnSignIn();
			sp.setEmail(email);
			sp.clickContinue();
			sp.setPassword(password);
			sp.clickOnRegister();
     		hp.gotoAccount();
			hp.clickOnLogout();
			sp.waitForHomePage("Ethnic Wear - Buy Ethnic Wear in Latest Designs Online at Craftsvilla");
//			hp.clickOnCart();
		}
	}
}
