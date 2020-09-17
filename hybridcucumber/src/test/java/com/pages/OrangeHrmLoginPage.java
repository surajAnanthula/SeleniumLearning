package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Library_Class;

public class OrangeHrmLoginPage extends Library_Class {
	public OrangeHrmLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="txtUsername")
	WebElement username;

	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id = "btnLogin")
	WebElement loginBtn;
	
	@FindBy(xpath = "//*[@id='menu_admin_viewAdminModule']")
	WebElement menu_adminbutton;
	
	public void LoginUser(String username,String password)
	{
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		
		
	}
	public void Submit()
	{
		this.loginBtn.click();
	}

}
