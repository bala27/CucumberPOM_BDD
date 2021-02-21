package com.qa.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import com.qa.pages.DashboardPage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStep extends TestBase{
	
	LoginPage loginpage;
	DashboardPage dashboardpage;
	
	@Given("^user opens browser$")
	public void user_opens_browser()  {
	    TestBase.invoke();
	    
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page()  {
		loginpage=new LoginPage();
		String actualTitle=loginpage.validateLoginPageTitle();
		Assert.assertEquals("OrangeHRM", actualTitle);
	   
	}

	@Then("^user logs into application$")
	public void user_logs_into_application() {
		loginpage=new LoginPage();
		 dashboardpage=loginpage.logIn();
	    
	}

	@Then("^Dashboard page is displayed$")
	public void Dashboard_page_is_displayed()  {
		Assert.assertTrue(dashboardpage.validateDashboardPageTitle());
	}



}
