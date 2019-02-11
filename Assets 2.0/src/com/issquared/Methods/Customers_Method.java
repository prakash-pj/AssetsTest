package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.issquared.Common.Common;
import com.issquared.PageObjects.Customers;
import com.issquared.TestCases.BaseTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Customers_Method extends BaseTest{
	WebDriver driver;
	Customers customers;
	ITestResult result;
    ExtentReports extent;
    ExtentTest test;
    LogStatus status;

    public Customers_Method(WebDriver driver) {
    	this.driver = driver;
		customers = new Customers(driver);
	}

	@Test 
	public void createCustomers() throws Exception {
		try
		{
			Common.starttest("Customers Creation....");
			Common.assignCategory("Customers Creation....");
			customers = PageFactory.initElements(driver, Customers.class);
			
		    Thread.sleep(2000);
		    customers.selectTopMenu();
		    Thread.sleep(200);
		    customers.selectAssetsFromTopMenu();
		    Thread.sleep(1000);
		    customers.selectCustomers();
		    customers.clickCustomersCreateNew();
		    List<HashMap<String, String>> multipleTestData = getTestCaseCustomers("InUsers","Sheet1");
		    System.out.println("multipleTestData  : "+multipleTestData);
		    for (HashMap<String, String> testData : multipleTestData) {
			System.out.println("Customers Creation Execution is In-Progress");
			//customers.organizationName.clear();
			customers.EnterOrganizationName(testData.get("OrganizationName"));
			customers.contactName.clear();
			customers.EnterContactName(testData.get("ContactName"));
			customers.email.clear();
			customers.EnterEmail(testData.get("Email"));
			customers.address1.clear();
			customers.EnterAddress1(testData.get("Address1"));
			customers.address2.clear();
			customers.EnterAddress2(testData.get("Address2"));
			customers.address3.clear();
			customers.EnterAddress3(testData.get("Address3"));
			/*customers.SelectPhone1country();
			customers.SelectPhone1countryCode();*/
			customers.phone1Number.clear();
			customers.EnterPhoneNumer1(testData.get("PhoneNumer1"));
			/*customers.SelectPhone2country();
			customers.SelectPhone2countryCode();*/
			customers.phone2Number.clear();
			customers.EnterPhoneNumer2(testData.get("PhoneNumer2"));
			customers.Select_CountryType();
			customers.Select_CountryValue();
			customers.Select_State();
			Thread.sleep(1000);
			customers.Select_StateValue();
			customers.city.clear();
			customers.Enter_CityName(testData.get("City"));
			customers.zip.clear();
			customers.Enter_ZipCode(testData.get("Zip"));
			customers.UploadCustomerImage(System.getProperty("user.dir")+testData.get("CustomerImage"));
			Thread.sleep(1000);
			customers.clickOnSaveandNew();
			Thread.sleep(800);
			/*customers.SuccessMesOkPopup();
			Thread.sleep(2000);*/
			
			if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
			{
				Common.info("Customers --> "+testData.get("CustomersName")+" created Successfully ");
			}
			else
			{
				Common.fail(driver,"Customers -->"+testData.get("CustomersName")+" is not created successfully ");
				Common.captureScreenShot("fileName");
			}
			try{
				customers.SuccessMesOkPopup();;
			Thread.sleep(4000);
			}catch(Exception ex){ex.printStackTrace();
			} 
			}
		    Common.pass("Test Passed");
		    Common.endtest();
		   
		    Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Common.fail(driver, "Test Failed");
			Common.endtest();
			throw e;
		}
	}
		    
}


