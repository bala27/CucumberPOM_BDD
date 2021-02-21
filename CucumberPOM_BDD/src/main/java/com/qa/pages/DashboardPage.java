package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class DashboardPage extends TestBase{
	
	@FindBy(xpath="//h1[text()='Dashboard']")
	WebElement dashboardlabel;
	
	
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateDashboardPageTitle() {
		return dashboardlabel.isDisplayed();
	}
	
	
	 

}
