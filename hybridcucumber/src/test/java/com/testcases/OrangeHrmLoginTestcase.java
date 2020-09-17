package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base_class.Library_Class;
import com.pages.OrangeHrmLoginPage;
import com.selenium_reuseablefunction.Selenium_Utility;

public class OrangeHrmLoginTestcase extends Library_Class{
	
	OrangeHrmLoginPage lpage;
	Selenium_Utility seleniumUtil;
	@BeforeTest
	public void launchApp(){
		//launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
		browserSetUp();
		logger.info("Browser Launched");
	}
	@Test
	public void login() {
		lpage= new OrangeHrmLoginPage(driver);
		lpage.LoginUser(properties.getProperty("username"),properties.getProperty("password"));
		logger.info("Browser Login Successfully");
	}
	
	@AfterTest
	public void close()
	{
		seleniumUtil = new Selenium_Utility(driver);
		seleniumUtil.getTitle();
		seleniumUtil.to_take_screenshot("loginpage");
	}
	

}
