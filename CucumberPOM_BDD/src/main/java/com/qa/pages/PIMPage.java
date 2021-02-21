package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class PIMPage extends TestBase {
	
	@FindBy(xpath="//b[text()='PIM']")
	WebElement label_PIM;
	
	
	@FindBy(xpath="//a[@id='menu_pim_addEmployee']")
	WebElement addEmployee;
	
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement addEmployeeFirstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement addEmployeeLastName;
		
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement addEmployeeSave;
	
	
	@FindBy(xpath="//input[@id='employeeId']")
	WebElement employeeID;
	
	//div[@id='profile-pic']/h1
	@FindBy(xpath="//h1[text()='Personal Details']")
	WebElement labelPersonalDetails;
	
	public PIMPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String addEmployee(String firstName,String lastName) {
		addEmployeeFirstName.sendKeys(firstName);
		addEmployeeLastName.sendKeys(lastName);
		
		String empID=employeeID.getText();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", addEmployeeSave);
		if(labelPersonalDetails.isDisplayed()) {
			System.out.println("Employee is added successfully.");
		}else {
			System.out.println("Employee is not added successfully.");
		}
		
		return empID;
		
	}
	
}
