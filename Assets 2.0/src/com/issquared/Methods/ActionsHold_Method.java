package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;
import com.issquared.PageObjects.ACTIONS_Hold;
import com.issquared.PageObjects.ACTIONS_Transfer;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class ActionsHold_Method extends BaseTest{
	    WebDriver driver;
	    ACTIONS_Hold action_hold;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public ActionsHold_Method(WebDriver driver) {
			this.driver = driver;
			action_hold = new ACTIONS_Hold(driver);
		}
		public void createACTIONS_hold() throws Exception {
			try{
				Common.starttest("Hold Items...");
				Common.assignCategory("Hold Items...");
				action_hold = PageFactory.initElements(driver, ACTIONS_Hold.class);
			    Thread.sleep(500);
			    action_hold.SelectAssetsDashboard();
				Thread.sleep(500);
				action_hold.SelectACTIONSdropdown();
				Thread.sleep(500);
			    action_hold.ClickOnHold();
				List<HashMap<String, String>> multipleTestData3 = getTestACTIONS_Onboard("hold","hold");
				Common.logTrace("multipleTestData  : "+multipleTestData3);
				for (HashMap<String, String> testData3 : multipleTestData3) {
				Common.logTrace("Actions Hold Execution InProgress");
				Thread.sleep(1000);
				action_hold.AssetpoolNameSelection();
				Thread.sleep(1000);
				action_hold.AssetpoolPageCount();
				Thread.sleep(500);
				action_hold.AssetpoolPageCountValue();
				Thread.sleep(500);
				action_hold.AssetPoolNamecheckbox(testData3.get("AssetpoolName"));
				action_hold.AssetpoolNamePopupOk();
				Thread.sleep(500);
				action_hold.AddAssetsToHold();
				Thread.sleep(500);
				action_hold.ItemsGridPageCount();
				Thread.sleep(1500);
				action_hold.ItemsGridPageCountValue();
				Thread.sleep(1500);
				//action_hold.ItemNamecheckbox(testData3.get("SerialNumber"));
				action_hold.SelectFirstvalueFromPopup();
				Thread.sleep(2000);
				action_hold.SelectAssetsToHoldPopupAddItem();
				
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Hold Items to--> "+testData3.get("AssetpoolName")+"  Successfully ");
					Common.logTrace("Hold Items to--> "+testData3.get("AssetpoolName")+"  Successfully ");
				}
				else
				{
					Common.fail(driver,"Hold Items to -->"+testData3.get("AssetpoolName")+"  is not successfully ");
					Common.logTrace("Hold Items to -->"+testData3.get("AssetpoolName")+"  is not successfully ");
				}
				try{
					action_hold.PopupOK();
					;}catch(Exception ex){ex.printStackTrace();} 
				//hold.SelectAssetsToHoldPopupBack();
				
				
				Thread.sleep(1000);
				
				}
				Common.pass("Test Passed");
				Common.endtest();
			}
			catch(Exception e)
			{
				Common.fail(driver, "Test Failed");
				Common.endtest();
				throw e;
			}
		}	
}
