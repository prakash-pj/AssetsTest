package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.issquared.Common.Common;
import com.issquared.PageObjects.Assign;
import com.issquared.PageObjects.LIFECYCLE_Disposal;
import com.issquared.PageObjects.LIFECYCLE_Hold;
import com.issquared.PageObjects.LIFECYCLE_Repair;
import com.issquared.PageObjects.Ownership;
import com.issquared.TestCases.BaseTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LIFECYCLE_Method extends BaseTest{
	WebDriver driver;
	ITestResult result;
    ExtentReports extent;
    ExtentTest test;
    LogStatus status;
    Ownership Ownership;
	Assign assign;
	LIFECYCLE_Repair repair;
	LIFECYCLE_Hold hold;
	LIFECYCLE_Disposal disposal;
	
    @Test 
	public void createLIFECYCLE_Assign() throws Exception {
		try
		{
			List<HashMap<String, String>> multipleTestData = getTestOwnership("Assign","Sheet1");
			System.out.println("multipleTestData  : "+multipleTestData);
			for (HashMap<String, String> testData : multipleTestData) {
			System.out.println("Asset Ownership Execution InProgress");
			Common.intReport();
			Common.starttest("Creating Ownership Item");
			Common.assignCategory("Creating Ownership Item");
			assign = PageFactory.initElements(driver, Assign.class);
			assign.SelectAssetsDashboard();
			Thread.sleep(1000);
			assign.clickLIFECYCLEdropdown();
			Thread.sleep(1000);
			assign.clickOnAssign();
			assign.clickNew();
			assign.itemNameSelection();
			Thread.sleep(1000);
			assign.itemSKUNameSelection();
			Thread.sleep(1000);
			assign.ClickPageCount();
			assign.SelectPageCountValue();
			assign.itemSKUNamecheckbox(testData.get("ITEMSKU"));
			assign.itemSKUOk();
			Thread.sleep(2000);
			assign.ClickPageCount();
			Thread.sleep(1000);
			assign.SelectPageCountValue();
			Thread.sleep(2000);
			//assign.selectitem(testData.get("SerialNumber"));
			assign.SelectFirstvalueFromPopup();
			Thread.sleep(1000);
			assign.itemsOkButton();
			
			assign.OwnerNamesearchSelection();
			Thread.sleep(500);
			assign.ClickPageCount();
			Thread.sleep(500);
			assign.SelectPageCountValue();
			assign.itemOwnerNamecheckbox(testData.get("OwnerName"));
			//assign.SelectOwnerNameFromPopup();
			assign.OwnerNamesearchOK();
			Thread.sleep(500);
			assign.OwnershipType();
			assign.OwnershipTypeValue();
			assign.AssignmentStartDate(testData.get("AssignmentStartDate"));
			assign.AssignmentReturnDate(testData.get("AssignmentReturnDate"));
			assign.ExpectedEndDate(testData.get("ExpectedEndDate"));
			assign.ActualReturnDate(testData.get("ActualReturnDate"));
			assign.CurrentOwnershipStatus();
			assign.CurrentOwnershipStatusValue();
			assign.Notes(testData.get("Notes"));
			assign.SaveAndNew();
			
			if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
			{
				Common.info(" Ownership For --> "+testData.get("ITEMSKU")+" created Successfully ");
			
			}
			else
			{
				Common.fail(driver," Ownership For-->"+testData.get("ITEMSKU")+" is not created successfully ");
				
			}
			try{
				assign.PopupOK();
				;}catch(Exception ex){ex.printStackTrace();}
			
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
		public void createLIFECYCLE_Repair() throws Exception {
			try
			{
				Common.starttest("Creating Repair Item");
				Common.assignCategory("Creating Repair Item");
				repair = PageFactory.initElements(driver, LIFECYCLE_Repair.class);
				/*repair.selectassets();
				repair.SelectAssetsDashboard();
				repair.clickLIFECYCLEdropdown();*/
				repair.SelectAssetsDashboard();
				Thread.sleep(500);
				repair.clickLIFECYCLEdropdown();
				Thread.sleep(500);
				repair.clickOnRepair();
				repair.clickNew();
				Thread.sleep(500);
				List<HashMap<String, String>> multipleTestData2 = getTestOwnership("LIFECYCLE_Repair","Repair");
				System.out.println("multipleTestData  : "+multipleTestData2);
				for (HashMap<String, String> testData2 : multipleTestData2)
				{
					repair.itemInfoSelection();
					Thread.sleep(500);
					repair.itemSKUSelection();
					Thread.sleep(500);
					repair.ClickPageCount();
					repair.SelectPageCountValue();
					repair.itemSKUNamecheckbox(testData2.get("ITEMSKUName"));
					repair.itemSKUPopupOK();
					repair.ItemsClickPageCount();
					repair.ItemsSelectPageCountValue();
					Thread.sleep(1000);
					//repair.itemNamecheckbox(testData2.get("SerialNumber"));
					repair.SelectFirstvalueFromPopup();
					Thread.sleep(1000);
					repair.itemPopupOK();
					Thread.sleep(1000);
					repair.RepairType();
					repair.RepairTypeValueNew();
					//repair.RepairReasonType();
					//repair.RepairReasonTypeValueDamaged();
					repair.RequestedBySelection();
					repair.ClickPageCount();
					repair.SelectPageCountValue();
					repair.RequestedByUserCheckbox();
					repair.RequestedByPopupOk();
					Thread.sleep(1000);
					repair.RequestedForSelection();
					Thread.sleep(500);
					repair.ClickPageCount();
					repair.SelectPageCountValue();
					repair.RequestedForUserCheckbox();
					repair.RequestedForPopupOk();
					repair.RepairFee(testData2.get("RepairFee"));
					repair.RepairFeeCurrency();
					repair.VendorNameSelection();
					repair.ClickPageCount();
					repair.SelectPageCountValue();
					repair.VendorNameCheckbox();
					repair.VendorNamePopupOk();
					repair.TicketID(testData2.get("TicketID"));
					repair.VendorTicketDate(testData2.get("VendorTicketDate"));
					repair.VendorRMA(testData2.get("VendorRMA"));
					Thread.sleep(500);
					repair.SaveAndNew();
					Thread.sleep(500);
					
					if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
					{
						Common.info("Repair Record --> "+testData2.get("ITEMSKUName")+" created Successfully ");
					
					}
					else
					{
						Common.fail(driver,"Repair Record -->"+testData2.get("ITEMSKUName")+" is not created successfully ");
						
					}
					try{
						repair.PopupOK();
						;}catch(Exception ex){ex.printStackTrace();}
					
					
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
		public void createLIFECYCLE_hold() throws Exception {
			try
			{
				Common.starttest("Creating Hold Item");
				Common.assignCategory("Creating Hold Item");
				hold = PageFactory.initElements(driver, LIFECYCLE_Hold.class);
				hold.SelectAssetsDashboard();
				hold.clickLIFECYCLEdropdown();
				Thread.sleep(500);
				hold.clickOnHold();
				hold.clickNew();
				Thread.sleep(500);
				List<HashMap<String, String>> multipleTestData3 = getTestOwnership("LIFECYCLE_Hold","Hold");
				System.out.println("multipleTestData  : "+multipleTestData3);
				for (HashMap<String, String> testData3 : multipleTestData3)
				{
					hold.itemNameSelection();
					Thread.sleep(1000);
					hold.itemSKUSelection();
					Thread.sleep(1000);
					hold.ClickPageCount();
					Thread.sleep(500);
					hold.SelectPageCountValue();
					hold.ItemSKUCheckbox(testData3.get("ITEMSKUName"));
					hold.ItemSKUPopupOK();
					Thread.sleep(1000);
					hold.ItemsClickPageCount();
					Thread.sleep(2000);
					hold.ItemsSelectPageCountValue();
					Thread.sleep(1000);
					//hold.ItemCheckbox(testData3.get("SerialNumber"));
					hold.SelectFirstvalueFromPopup();
					Thread.sleep(1000);
					hold.ItemPopupOK();
					hold.HoldType();
					hold.HoldTypeValueNew();
					hold.OwnerNameSelection();
					Thread.sleep(2000);
					hold.OwnerNameClickPageCount();
					Thread.sleep(1000);
					hold.OwnerNameSelectPageCountValue();
					hold.OwnerNameCheckbox(testData3.get("OwnerName"));
					hold.OwnerNamePopupOK();
					hold.StartDate();
					hold.EndDate();
					hold.Notes();
					hold.SaveAndNew();
					if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
					{
						Common.info("Hold Record For --> "+testData3.get("ITEMSKUName")+" created Successfully ");
					
					}
					else
					{
						Common.fail(driver,"Hold Record For-->"+testData3.get("ITEMSKUName")+" is not created successfully ");
						
					}
					try{
						hold.PopupOK();
						;}catch(Exception ex){ex.printStackTrace();}
						
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
		public void createLIFECYCLE_dispose() throws Exception {
			try
			{
				Thread.sleep(3000);
				Common.starttest("Creating Dispose Item");
				Common.assignCategory("Creating Dispose Item");
				disposal = PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
				Thread.sleep(500);
				disposal.SelectAssetsDashboard();
				Thread.sleep(500);
				disposal.clickLIFECYCLEdropdown();
				Thread.sleep(500);
				disposal.ClickOnDisopse();
				disposal.clickNew();
				Thread.sleep(500);
				List<HashMap<String, String>> multipleTestData4 = getTestOwnership("LIFECYCLE_Disposal","Dispose");
				System.out.println("multipleTestData  : "+multipleTestData4);
				for (HashMap<String, String> testData4 : multipleTestData4)
				{
					disposal.itemNameSelection();
					Thread.sleep(1000);
					disposal.itemSKUSelection();
					Thread.sleep(1000);
					disposal.ClickPageCount();
					Thread.sleep(1000);
					disposal.SelectPageCountValue();
					disposal.ItemSKUCheckbox(testData4.get("ITEMSKUName"));
					disposal.ItemSKUPopupOK();
					Thread.sleep(1000);
					disposal.ItemsClickPageCount();
					disposal.ItemsSelectPageCountValue();
					Thread.sleep(1000);
					//disposal.ItemCheckbox(testData4.get("SerialNumber"));
					disposal.SelectFirstvalueFromPopup();
					Thread.sleep(1000);
					disposal.ItemPopupOK();
					disposal.DisposedBySelection();
					disposal.ClickPageCount();
					Thread.sleep(1000);
					disposal.SelectPageCountValue();
					disposal.RequestedByUserCheckbox();
					disposal.RequestedByPopupOk();
					disposal.DisposalType();
					disposal.DisposalTypeValueClose();
					disposal.DisposalReason();
					disposal.DisposalReasonValueDamaged();
					disposal.Lost_Destroyed_StolenFrom_Selection();
					disposal.DestroyedFromClickPageCount();
					Thread.sleep(1000);
					disposal.DestroyedFromSelectPageCountValue();
					disposal.Lost_Destroyed_StolenFrom_UserCheckbox();
					disposal.Lost_Destroyed_StolenFrom_PopupOK();
					Thread.sleep(1000);
					disposal.lost_Destroyed_Stolen_Date.clear();
					Thread.sleep(1000);
					disposal.Lost_Destroyed_Stolen_Date(testData4.get("Lostdate"));
					Thread.sleep(1000);
					//disposal.IsPoliceReportFiled();
					Thread.sleep(1000);
					//disposal.IsInsuranceClaimed();
					Thread.sleep(1000);
					//disposal.isAssetReturned();
					disposal.soldCost.clear();
					disposal.SoldCost(testData4.get("SoldCost"));
					disposal.SoldCostCurrency();
					disposal.SoldCostCurrencyValue();
					disposal.disposalFees.clear();
					Thread.sleep(1000);
					disposal.DisposalFees(testData4.get("DisposalFees"));
					Thread.sleep(1000);
					disposal.DisposalFeesCurrency();
					Thread.sleep(1000);
					disposal.DisposalFeesCurrencyValue();
					disposal.DisposalStatus();
					Thread.sleep(1000);
					disposal.DisposalStatusValue();
					//disposal.WipeAssetCheckbox();
					disposal.WipeTypeDropdown();
					Thread.sleep(1000);
					disposal.WipeTypeDropdownValue();
					Thread.sleep(1000);
					disposal.SaveAndNew();
					
					if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
					{
						Common.info("Dispose Record For --> "+testData4.get("ITEMSKUName")+" created Successfully ");
					
					}
					else
					{
						Common.fail(driver,"Dispose Record For-->"+testData4.get("ITEMSKUName")+" is not created successfully ");
						
					}
					try{
						disposal.PopupOK();
						;}catch(Exception ex){ex.printStackTrace();}
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
