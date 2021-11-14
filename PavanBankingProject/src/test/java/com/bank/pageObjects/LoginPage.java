package com.bank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver rdriver)
	{
		driver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="uid")
	WebElement txtUsername;
	
	@FindBy(name="Password")
	WebElement txtPassword;
	
	@FindBy(name="Login")
	WebElement btnLogin;
	
	
	public void setUserName(String uname) 
	{
		txtUsername.sendKeys(uname);
	}
		
	public void setPassword(String Password) 
	{
		txtPassword.sendKeys(Password);
	}
			
	public void setLogin(String Login) 
	{
		btnLogin.click();
	}
		
		
		
	}
	


