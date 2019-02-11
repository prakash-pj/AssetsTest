package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.issquared.Common.Common;
import com.issquared.PageObjects.REQUESTS_RequestedAssets;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class RequestedAssets_Method extends BaseTest{
	WebDriver driver;
	REQUESTS_RequestedAssets requestedAssets;
	TadminLogin TadminLogin;
	
	public RequestedAssets_Method(WebDriver driver) {
		this.driver = driver;
		requestedAssets = new REQUESTS_RequestedAssets(driver);
	}
	
	@Test 
	public void createRequestedAssets() throws Exception {
		    Common.starttest("Requested Assets");
	        Common.assignCategory("Requested Assets");
	        requestedAssets = PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
		    Thread.sleep(1000);
		    requestedAssets.SelectAssetsDashboard();
		    requestedAssets.SelectREQUESTSdropdown();	
			Thread.sleep(500);
		    requestedAssets.RequestedAssets();  
		    /*List<HashMap<String, String>> multipleTestData = getTestREQUESTS("RequestedAssets","requestedAssets");
			System.out.println("multipleTestData  : "+multipleTestData);*/
			List<HashMap<String, String>> multipleTestData = getTestREQUESTS("RequestedAssets","requestedAssets");
			Common.logTrace("multipleTestData  : "+multipleTestData);
			Common.logTrace("Creating Requested Assets");
			for (HashMap<String, String> testData2 : multipleTestData)
			{
			System.out.println("requestedAssets Execution InProgress");
			requestedAssets.ClickPageCount();
			requestedAssets.SelectPageCountValue();
			Thread.sleep(2000);
			requestedAssets.ClickonAssignButton();
			
			Thread.sleep(2000);
			//String assign = driver.findElements(By.xpath("//*[text()='Assign']")).get(0).getText();
			
			WebElement assign = driver.findElement(By.xpath("//*[@id='assignItems']/div"));
			if(assign.isDisplayed()){
				requestedAssets.SelectFirstvalueFromPopup();
				Thread.sleep(1000);
				requestedAssets.AssetpoolAssign();
				requestedAssets.PopupOK();
				requestedAssets.AssetpoolBack();
			}else{
				requestedAssets.ClickonRequestforOnboard();
				requestedAssets.SelectAssetPooltoOnboard();
				requestedAssets.SelectAssetPooltoOnboardValue();
				requestedAssets.ItemCount(testData2.get("ItemCount"));
				requestedAssets.ItempoolPopupOkButton();
				Thread.sleep(1000);
				requestedAssets.PopupOK();
				Thread.sleep(1000);
				//requestedAssets.AssetpoolBack();
				requestedAssets.WarehousePoolBack();
			}
			
			/*String count2 = driver.findElement(By.xpath("//*[@id='itemCountDiv']/strong")).getText();
			if(count2.getText().equalsIgnoreCase("Count")){
				requestedAssets.SelectAssetPooltoOnboard();
				requestedAssets.SelectAssetPooltoOnboardValue();
				requestedAssets.ItemCount(testData2.get("Count"));
				requestedAssets.PopupOk();
			}else{
					requestedAssets.SelectAssetPooltoOnboard();
					requestedAssets.SelectAssetPooltoOnboardValue();
					requestedAssets.PopupOk();
				}*/
			}
		}
	}


