package com.bank.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.bank.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	
@Test
public void LoginTest()
{
	driver.get(baseURL);
	
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	lp.setPassword(password);
	
	lp.clickSubmit();
	
	if(driver.getTitle().equals("Guru99 Bank Manager"))
	{
		AssertJUnit.assertTrue(true);
	}
	else
	{
		AssertJUnit.assertTrue(false);
	}
}

	

}
