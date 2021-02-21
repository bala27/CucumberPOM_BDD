package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement password;

	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public DashboardPage logIn() {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
		
		return new DashboardPage();
	}
	 

}
