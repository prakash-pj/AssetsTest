package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.issquared.Common.Common;
import com.issquared.PageObjects.ACTIONS_Dispose;
import com.issquared.PageObjects.ACTIONS_Hold;
import com.issquared.PageObjects.ACTIONS_Onboard;
import com.issquared.PageObjects.ACTIONS_Release;
import com.issquared.PageObjects.ACTIONS_Repair;
import com.issquared.PageObjects.ACTIONS_Transfer;
import com.issquared.TestCases.BaseTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ACTIONS_Method extends BaseTest{
	WebDriver driver;
	ITestResult result;
    ExtentReports extent;
    ExtentTest test;
    LogStatus status;
    ACTIONS_Onboard onboard;
	ACTIONS_Transfer transfer;
	ACTIONS_Hold action_hold;
	ACTIONS_Repair action_repair;
	ACTIONS_Dispose dispose;
	ACTIONS_Release release;
	
	
	 @Test 
		public void createACTIONS_onboard() throws Exception {
			try{
			    Common.starttest("Onboard Items...");
			    Thread.sleep(1000);
			    onboard.SelectAssetsDashboard();
				Thread.sleep(500);
				onboard.SelectACTIONSdropdown();
				Thread.sleep(500);
			    onboard.ClickOnboard();
				List<HashMap<String, String>> multipleTestData = getTestACTIONS_Onboard("onboard","onboard");
				System.out.println("multipleTestData  : "+multipleTestData);
				for (HashMap<String, String> testData : multipleTestData) {
				System.out.println("Onboard Execution InProgress");	
				
				Thread.sleep(1000);
				onboard.WareHouseselection();
				Thread.sleep(500);
				onboard.WarehouseClickPageCount();
				Thread.sleep(500);
				onboard.WarehouseSelectPageCountValue();
				onboard.Warehousecheckbox(testData.get("WarehouseName"));
				Thread.sleep(1000);
				onboard.WareHousePopupOk();
				Thread.sleep(1000);
				onboard.assetpoolselection();
				Thread.sleep(500);
				onboard.AssetpoolClickPageCount();
				Thread.sleep(500);
				onboard.AssetpoolSelectPageCountValue();
				onboard.assetpoolcheckbox(testData.get("Assetpool"));
				onboard.assetpoolPopupOk();
				Thread.sleep(1000);
				onboard.OrganizationtoOnboardSelection();
				Thread.sleep(2000);
				onboard.OrganizationClickPageCount();
				Thread.sleep(1500);
				onboard.OrganizationSelectPageCountValue();
				onboard.Organizationcheckbox(testData.get("Organization"));
				onboard.OrganizationPopup_Ok();
				onboard.DepartmenttoOnboardSelection();
				Thread.sleep(2000);
				onboard.DepartmentClickPageCount();
				Thread.sleep(1500);
				onboard.DepartmentSelectPageCountValue();
				onboard.Departmentcheckbox(testData.get("Department"));
				onboard.DepartmentPopup_Ok();
				onboard.CostCentertoOnboardSelection();
				Thread.sleep(500);
				onboard.CostCenterClickPageCount();
				Thread.sleep(500);
				onboard.CostCenterSelectPageCountValue();
				onboard.CostCentercheckbox(testData.get("CostCenter"));
				onboard.CostCenterPopup_OK();
				onboard.EffectiveDate_OnBoardDate();
				onboard.onBoardCost.clear();
				onboard.OnBoardCost(testData.get("OnBoardCost"));
				onboard.OnBoardCostCurrency();
				onboard.OnBoardCostCurrencyValue();
				onboard.AddItemsToOnboard();
				Thread.sleep(500);
				onboard.ItemOnboardClickPageCount();
				Thread.sleep(500);
				onboard.ItemOnboardSelectPageCountValue();
				Thread.sleep(1000);
				//onboard.GridItemsToOnboard(testData.get("SerialNumber"));
				onboard.SelectFirstvalueFromPopup();
				Thread.sleep(1000);
				onboard.ItemsPopup_OK();
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Onboard Items to--> "+testData.get("Assetpool")+" Assetpool Successfully ");
				
				}
				else
				{
					Common.fail(driver,"Onboard Items to -->"+testData.get("Assetpool")+" Assetpool is not successfully ");
					
				}
				try{
					onboard.PopupOK();
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
		@Test 
		public void createACTIONS_transfer() throws Exception {
			try{
				Common.starttest("Transfer Items...");
			    Thread.sleep(1000);
			    transfer.SelectAssetsDashboard();
				Thread.sleep(500);
				transfer.SelectACTIONSdropdown();
				Thread.sleep(500);
			    transfer.ClickOnTransfer();
				List<HashMap<String, String>> multipleTestData2 = getTestACTIONS_Onboard("transfer","transfer");
				System.out.println("multipleTestData  : "+multipleTestData2);
				for (HashMap<String, String> testData2 : multipleTestData2) {
				System.out.println("Actions Tranfer Execution InProgress");	
				transfer.TransferShipTypeDropdown();
				Thread.sleep(500);
				transfer.TransferShipTypeValue();
				Thread.sleep(500);
				transfer.transferShipCost.clear();
				transfer.TransferShipCost(testData2.get("TransferShipCost"));
				Thread.sleep(500);
				transfer.TransferShipCostCurrency();
				Thread.sleep(500);
				transfer.TransferShipCostCurrencyValue();
				transfer.CurrentOwnershipStatus();
				Thread.sleep(500);
				transfer.CurrentOwnershipStatusValue();
				Thread.sleep(500);
				transfer.OwnerName();
				Thread.sleep(500);
				transfer.OwnerNameClickPageCount();
				Thread.sleep(1000);
				transfer.OwnerNameSelectPageCountValue();
				Thread.sleep(500);
				//transfer.OwnerNameCheckbox(testData2.get("OwnerName"));
				transfer.OwnerNameCheckbox();
				Thread.sleep(1000);
				transfer.OwnerNamePopupOk();
				Thread.sleep(500);
				transfer.TransferOwnerNameSelection();
				Thread.sleep(500);
				transfer.TransferOwnerNameClickPageCount();
				Thread.sleep(500);
				transfer.TransferOwnerNameSelectPageCountValue();
				Thread.sleep(500);
				//transfer.TransferOwnerNameCheckbox(testData2.get("TransferOwnerName"));
				transfer.TransferOwnerNameCheckbox();
				Thread.sleep(500);
				transfer.TransferOwnerNamePopupOk();
				Thread.sleep(500);
				transfer.ClickPageCount();
				Thread.sleep(500);
				transfer.SelectPageCountValue();
				Thread.sleep(1000);
				//transfer.SelectItemCheckbox(testData2.get("SelectItem"));
				transfer.SelectFirstvalueFromPopup();
				Thread.sleep(1000);
				transfer.TransferButton();
				Thread.sleep(1000);
				
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Transfer Items to--> "+testData2.get("TransferOwnerName")+"  Successfully ");
				
				}
				else
				{
					Common.fail(driver,"Transfer Items to -->"+testData2.get("TransferOwnerName")+"  is not successfully ");
					
				}
				try{
					transfer.PopupOK();
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
		
		@Test 
		public void createACTIONS_hold() throws Exception {
			try{
				Common.starttest("Hold Items...");
			    Thread.sleep(500);
			    action_hold.SelectAssetsDashboard();
				Thread.sleep(500);
				action_hold.SelectACTIONSdropdown();
				Thread.sleep(500);
			    action_hold.ClickOnHold();
				List<HashMap<String, String>> multipleTestData3 = getTestACTIONS_Onboard("hold","hold");
				System.out.println("multipleTestData  : "+multipleTestData3);
				for (HashMap<String, String> testData3 : multipleTestData3) {
				System.out.println("Actions Hold Execution InProgress");
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
				
				}
				else
				{
					Common.fail(driver,"Hold Items to -->"+testData3.get("AssetpoolName")+"  is not successfully ");
					
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

		
		@Test 
		public void createACTIONS_repair() throws Exception {
			try{
				Common.starttest("Repair Items...");
			    Thread.sleep(500);
			    action_repair.SelectAssetsDashboard();
				Thread.sleep(500);
				action_repair.SelectACTIONSdropdown();
				Thread.sleep(500);
			    action_repair.ClickOnRepair();
				List<HashMap<String, String>> multipleTestData4 = getTestACTIONS_Onboard("repair","repair");
				System.out.println("multipleTestData  : "+multipleTestData4);
				for (HashMap<String, String> testData4 : multipleTestData4) {
				System.out.println("Actions Repair Execution InProgress");
				
				Thread.sleep(500);
				action_repair.AssetpoolNameSelection();
				Thread.sleep(500);
				action_repair.AssetpoolPageCount();
				Thread.sleep(500);
				action_repair.AssetpoolPageCountValue();
				Thread.sleep(500);
				action_repair.AssetPoolNamecheckbox(testData4.get("AssetpoolName"));
				action_repair.AssetpoolNamePopupOk();
				
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
				
				}
				else
				{
					Common.fail(driver,"Item Repair to -->"+testData4.get("AssetpoolName")+" is not created successfully ");
					
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
		
		@Test 
		public void createACTIONS_dispose() throws Exception {
			try{
				Common.starttest("Dispose Items...");
				List<HashMap<String, String>> multipleTestData5 = getTestACTIONS_Onboard("dispose","dispose");
				System.out.println("multipleTestData  : "+multipleTestData5);
				for (HashMap<String, String> testData5 : multipleTestData5) {
				System.out.println("Actions Dispose Execution InProgress");	
				dispose.SelectAssetsDashboard();
				Thread.sleep(500);
				dispose.SelectACTIONSdropdown();
				Thread.sleep(500);
				dispose.ClickOnDispose();
				dispose.AssetpoolNameSelection();
				dispose.ClickPageCount();
				Thread.sleep(2000);
				dispose.SelectPageCountValue();
				Thread.sleep(2000);
				//dispose.AssetPoolNamecheckbox(testData5.get("AssetpoolName"));
				dispose.AssetPoolNamecheckbox();
				dispose.AssetpoolNamePopupOk();
				dispose.DisposedBySelection();
				dispose.DisposedByClickPageCount();
				dispose.DisposedBySelectPageCountValue();
				//dispose.DisposedBycheckbox(testData5.get("DisposedBy"));
				dispose.DisposedBycheckbox();
				dispose.DisposedByPopupOk();
				
				dispose.DisposeItemsCreateNew();
				Thread.sleep(15000);
				dispose.DisposeItemsClickPageCount();
				Thread.sleep(2000);
				dispose.DisposeItemsSelectPageCountValue();
				Thread.sleep(10000);
				//dispose.ItemNamecheckbox(testData5.get("SerialNumber"));
				dispose.SelectFirstvalueFromPopup();
				Thread.sleep(1000);
				dispose.SelectAssetsToDisposeAddItem();
				dispose.PopupOK();
				
				
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Item Dispose to --> "+testData5.get("AssetpoolName")+" created Successfully ");
				
				}
				else
				{
					Common.fail(driver,"Item Dispose to -->"+testData5.get("AssetpoolName")+" is not created successfully ");
					
				}
				try{
					dispose.PopupBack();
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
		
		@Test 
		public void createACTIONS_release() throws Exception {
			try{
				Common.starttest("Release Items to Assetpool...");
				List<HashMap<String, String>> multipleTestData6 = getTestACTIONS_Onboard("release","release");
				System.out.println("multipleTestData  : "+multipleTestData6);
				for (HashMap<String, String> testData6 : multipleTestData6) {
				Thread.sleep(2000);
				System.out.println("Actions Item Release Execution InProgress");	
				release.SelectAssetsDashboard();
				Thread.sleep(500);
				release.SelectACTIONSdropdown();
				Thread.sleep(500);
				release.ClickOnRelease();
				Thread.sleep(500);
				release.OwnerNameInformationSelection();
				Thread.sleep(500);
				release.OwnerNameClickPageCount();
				release.OwnerNameSelectPageCountValue();
				Thread.sleep(500);
				release.OwnerNameInformationCheckbox(testData6.get("OwnerName"));
				Thread.sleep(500);
				release.OwnerNameInformationPOpupOk();
				Thread.sleep(500);
				release.AssetPoolNameSelection();
				Thread.sleep(500);
				release.AssetPoolPageCount();
				release.AssetPoolPageCountValue();
				Thread.sleep(500);
				release.AssetPoolCheckbox(testData6.get("AssetpoolName"));
				Thread.sleep(500);
				release.AssetPoolNamePOpupOk();
				release.releaseDate.clear();
				release.ReleaseDate(testData6.get("ReleaseDate"));
				Thread.sleep(500);
				release.ClickPageCount();
				Thread.sleep(500);
				release.SelectPageCountValue();
				Thread.sleep(500);
				//release.AssignedItemSelect(testData6.get("SerialNumber"));
				release.SelectFirstvalueFromPopup();
				Thread.sleep(500);
				release.ReleaseButton();
				Thread.sleep(500);
				
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Item Dispose to --> "+testData6.get("AssetpoolName")+" created Successfully ");
				
				}
				else
				{
					Common.fail(driver,"Item Dispose to -->"+testData6.get("AssetpoolName")+" is not created successfully ");
					
				}
				try{
					release.PopupOK();
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
