package com.bank.testCases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public String baseURL ="https://demo.guru99.com/v4/index.php/";
	public String username ="mngr164225";
	public String password ="jahetAp";
	public static WebDriver driver;

	@BeforeClass
	public void setup() 
	{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//PavanDrivers//chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
		
	}
}
