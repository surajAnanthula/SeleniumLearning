package com.step_definition;

import com.base_class.Library_Class;
import com.pages.AdminPage;
import com.selenium_reuseablefunction.Selenium_Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmAdminPageSteps extends Library_Class{

	AdminPage aPage;
	Selenium_Utility seleniumUtil;
	
	@Given("To Open Admin functionlity of OrangeHrm")
	public void to_Open_Admin_functionlity_of_OrangeHrm() {
	   aPage = new AdminPage(driver);
	   aPage.clickMenuAdmin();
	   logger.info("menu Admin button is clicked");
	}

	@When("To Enter {string}")
	public void to_Enter(String uName) {
	    aPage = new AdminPage(driver);
		aPage.insertUserName(uName);
	    logger.info("Username is Entered");	
	}

	@Then("Select {string}")
	public void select(String uRole) {
	   aPage = new AdminPage(driver);
	   aPage.selectUserType(uRole);
	   logger.info("Usertype is selected");
	}

	@Then("To Enter EmployeeName")
	public void to_Enter_EmployeeName() {
		aPage = new AdminPage(driver);
		aPage.insertEmployeeName(properties.getProperty("adminEmployeeName"));
		logger.info("Employee Name is Entered");

	}

	@Then("Select Status")
	public void select_Status() {
		aPage = new AdminPage(driver);
		aPage.selectStatus(properties.getProperty("adminStatus"));
		logger.info("Status is Selected");
	}

	@Then("Click Search Button")
	public void click_Search_Button() {
		aPage = new AdminPage(driver);
		aPage.search();
	    logger.info("Search button is clicked");
	}

	@Then("Take the Screenshot and the Title")
	public void take_the_Screenshot_and_the_Title() {
		seleniumUtil = new Selenium_Utility(driver);
		seleniumUtil.getTitle();
		seleniumUtil.to_take_screenshot("searchadmin");
		logger.info("Taken Screenshot Of Login Page And Title printed in console");
	}

	@Then("Close the browser")
	public void close_the_browser() {
		tearDown();
		logger.info("Browser is Closed");
	}
	
}