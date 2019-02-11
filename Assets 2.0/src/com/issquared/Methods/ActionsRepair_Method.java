package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;
import com.issquared.PageObjects.ACTIONS_Hold;
import com.issquared.PageObjects.ACTIONS_Repair;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class ActionsRepair_Method extends BaseTest{
	    WebDriver driver;
	    ACTIONS_Repair action_repair;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public ActionsRepair_Method(WebDriver driver) {
			this.driver = driver;
			action_repair = new ACTIONS_Repair(driver);
		}
		public void createACTIONS_repair() throws Exception {
			try{
				Common.starttest("Repair Items...");
				Common.assignCategory("Repair Items...");
				action_repair = PageFactory.initElements(driver, ACTIONS_Repair.class);
			    Thread.sleep(500);
			    action_repair.SelectAssetsDashboard();
				Thread.sleep(500);
				action_repair.SelectACTIONSdropdown();
				Thread.sleep(500);
			    action_repair.ClickOnRepair();
				List<HashMap<String, String>> multipleTestData4 = getTestACTIONS_Onboard("repair","repair");
				Common.logTrace("multipleTestData  : "+multipleTestData4);
				Common.logTrace("Actions Repair Execution InProgress");
				for (HashMap<String, String> testData4 : multipleTestData4) {
				Thread.sleep(500);
				action_repair.RequestedByNameSelection();
				Thread.sleep(500);
				action_repair.RequestedByClickPageCount();
				Thread.sleep(500);
				action_repair.RequestedBySelectPageCountValue();
				Thread.sleep(500);
				//action_repair.RequestedByNamecheckbox(testData4.get("RequestedBy"));
				action_repair.RequestedByNamecheckbox();
				action_repair.RequestedByNamePopupOk();
				action_repair.RequestedForNameSelection();
				Thread.sleep(500);
				action_repair.RequestedForClickPageCount();
				Thread.sleep(500);
				action_repair.RequestedForSelectPageCountValue();
				Thread.sleep(500);
				//action_repair.RequestedForNamecheckbox(testData4.get("RequestedFor"));
				action_repair.RequestedForNamecheckbox();
				action_repair.RequestedForNamePopupOk();
				Thread.sleep(500);
				action_repair.AssetpoolNameSelection();
				Thread.sleep(500);
				action_repair.AssetpoolPageCount();
				Thread.sleep(500);
				action_repair.AssetpoolPageCountValue();
				Thread.sleep(500);
				action_repair.AssetPoolNamecheckbox(testData4.get("AssetpoolName"));
				action_repair.AssetpoolNamePopupOk();
				Thread.sleep(500);
				action_repair.EnterRepairCost(testData4.get("RepairCost"));
				action_repair.ClickRepairCostCurrency();
				action_repair.ClickRepairCostValue();
				action_repair.AssignItemRepairCreateNew();
				Thread.sleep(500);
				action_repair.ItemsGridPageCount();
				Thread.sleep(500);
				action_repair.ItemsGridPageCountValue();
				Thread.sleep(1000);
				//action_repair.ItemNamecheckbox(testData4.get("SerialNumber"));
				action_repair.SelectFirstvalueFromPopup();
				Thread.sleep(500);
				action_repair.SelectAssetsToRepairAddItem();
				Thread.sleep(500);
				
				
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Item Repair to --> "+testData4.get("AssetpoolName")+" created Successfully ");
					Common.logTrace("Item Repair to --> "+testData4.get("AssetpoolName")+" created Successfully ");
				}
				else
				{
					Common.fail(driver,"Item Repair to -->"+testData4.get("AssetpoolName")+" is not created successfully ");
					Common.logTrace("Item Repair to -->"+testData4.get("AssetpoolName")+" is not created successfully ");
				}
				try{
					action_repair.PopupOK();
					;}catch(Exception ex){ex.printStackTrace();} 
				
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
