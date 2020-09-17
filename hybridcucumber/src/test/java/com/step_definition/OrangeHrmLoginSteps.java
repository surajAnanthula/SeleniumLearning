package com.step_definition;

import org.apache.log4j.Logger;

import com.base_class.Library_Class;
import com.pages.OrangeHrmLoginPage;
import com.selenium_reuseablefunction.Selenium_Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmLoginSteps extends Library_Class {
	OrangeHrmLoginPage lpage;
	Selenium_Utility seleniumUtil;
	
@Given("To launch the browser and Navigate to the Url")
public void to_launch_the_browser_and_Navigate_to_the_Url() {
   browserSetUp();
   	logger.info("Browser Launched");
}

@When("To Enter Username and Password")
public void to_Enter_Username_and_Password() {
	lpage=new OrangeHrmLoginPage(driver);
	lpage.LoginUser(properties.getProperty("username"),properties.getProperty("password"));
	logger.info("Entered Username and Password");
    
}

@Then("To Click the Submit buton")
public void to_Click_the_Submit_buton() {
	lpage=new OrangeHrmLoginPage(driver);
	lpage.Submit();
	logger.info("LoggedIn successfully");
    
}

@Then("To Take the Screenshot and Get Title")
public void to_Take_the_Screenshot_and_Get_Title() {
	seleniumUtil = new Selenium_Utility(driver);
	seleniumUtil.getTitle();
	seleniumUtil.to_take_screenshot("loginpage1");
	logger.info("Screenshot Taken");
}




}
