package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.issquared.PageObjects.REQUESTS_OnboardRequests;
import com.issquared.PageObjects.REQUESTS_TransferRequests;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class TransferRequests_Method extends BaseTest{
	WebDriver driver;
	REQUESTS_TransferRequests transferRequests;
	TadminLogin TadminLogin;
	
	public TransferRequests_Method(WebDriver driver) {
		this.driver = driver;
		transferRequests = new REQUESTS_TransferRequests(driver);
	}
	
	@Test
	public void createTransferRequests() throws Exception {
		    transferRequests = PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	        Thread.sleep(1000);
	        transferRequests.SelectAssetsDashboard();
	        transferRequests.SelectREQUESTSdropdown();	
		    Thread.sleep(500);
		    transferRequests.TransferRequests();  
		    List<HashMap<String, String>> multipleTestData = getTestREQUESTS("TransferRequests","transferRequests");
			System.out.println("multipleTestData  : "+multipleTestData);
			for (HashMap<String, String> testData : multipleTestData) {
			System.out.println("onboardRequests Execution InProgress");
			transferRequests.ClickPageCount();
			transferRequests.SelectPageCountValue();
			transferRequests.TransferButton();
			transferRequests.TransferCost(testData.get("TransferCost"));
			Thread.sleep(1000);
			transferRequests.TransferCurrency();
			Thread.sleep(1000);
			transferRequests.TransferCurrencyValue();
			transferRequests.TransferRequests_Transferbutton();
			transferRequests.PopupOK();
			transferRequests.TransferRequests_Back();
		}
	}
	}