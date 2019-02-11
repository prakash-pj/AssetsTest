package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.issquared.PageObjects.REQUESTS_OnboardRequests;
import com.issquared.PageObjects.REQUESTS_RequestedAssets;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class OnboardRequests_Method extends BaseTest{
	WebDriver driver;
	REQUESTS_OnboardRequests onboardRequests;
	TadminLogin TadminLogin;
	
	public OnboardRequests_Method(WebDriver driver) {
		this.driver = driver;
		onboardRequests = new REQUESTS_OnboardRequests(driver);
	}
	@Test
	public void createOnboardRequests() throws Exception {
		    onboardRequests = PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
		    Thread.sleep(1000);
		    onboardRequests.SelectAssetsDashboard();
		    onboardRequests.SelectREQUESTSdropdown();	
			Thread.sleep(500);
		    onboardRequests.OnboardRequests();  
		    List<HashMap<String, String>> multipleTestData = getTestREQUESTS("onboardRequests","onboardRequests");
			System.out.println("multipleTestData  : "+multipleTestData);
			for (HashMap<String, String> testData : multipleTestData) {
			System.out.println("onboardRequests Execution InProgress");
			WebElement onboard = driver.findElements(By.xpath("//*[@class='jqgrow ui-row-ltr ui-widget-content']")).get(0);
			
			if(onboard.isDisplayed()){
			onboardRequests.ClickPageCount();
			onboardRequests.SelectPageCountValue();
			driver.findElement(By.xpath("//*[@id='jqgh_grid_RequestedFor']")).click();
			onboardRequests.ClickonOnboardButton();
			//onboardRequests.AssetTag();
			onboardRequests.OnBoardCost(testData.get("OnBoardCost "));
			onboardRequests.onBoardCostCurrency();
			onboardRequests.onBoardCostCurrencyValue();
			onboardRequests.OnBoardRequestPage_OnboardButton();
			Thread.sleep(1000);
			onboardRequests.PopupOK();
			//onboardRequests.OnBoardRequestPage_Back();
		    }else{
			onboardRequests.RequestUnavailableItems();
			onboardRequests.RequestsforUnavailableItemsPageCount();
			onboardRequests.RequestsforUnavailableItemsPageCountValue();
			onboardRequests.DiscoverButton();
			onboardRequests.DiscoveredItemsPageCount();
			onboardRequests.DiscoveredItemsPageCountValue();
			onboardRequests.TransferButton();
			onboardRequests.PopupOK();
		}
	   }
     }
	}