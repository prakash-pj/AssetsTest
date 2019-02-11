package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;
import com.issquared.PageObjects.ACTIONS_Release;
import com.issquared.PageObjects.Assign;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.Ownership;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class Assign_Method extends BaseTest{
	    WebDriver driver;
	    Ownership Ownership;
		Assign assign;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public Assign_Method(WebDriver driver) {
			this.driver = driver;
			assign = new Assign(driver);
		}
		public void createLIFECYCLE_Assign() throws Exception {
			try
			{
				List<HashMap<String, String>> multipleTestData = getTestOwnership("Assign","Assign");
				Common.logTrace("multipleTestData  : "+multipleTestData);
				for (HashMap<String, String> testData : multipleTestData) {
					
				Common.logTrace("Asset Ownership Execution InProgress");
				Common.starttest("Creating Ownership Item");
				Common.assignCategory("Creating Ownership Item");
				assign = PageFactory.initElements(driver, Assign.class);
				assign.SelectAssetsDashboard();
				Thread.sleep(1000);
				assign.clickLIFECYCLEdropdown();
				Thread.sleep(1000);
				assign.clickOnAssign();
				assign.clickNew();
				assign.OwnershipType();
				Thread.sleep(1000);
				assign.OwnershipTypeValue();
				
				assign.itemNameSelection();
				Thread.sleep(1000);
				assign.itemSKUNameSelection();
				Thread.sleep(1000);
				assign.ClickPageCount();
				assign.SelectPageCountValue();
				Thread.sleep(2000);
				assign.itemSKUNamecheckbox(testData.get("ITEMSKU"));
				//assign.itemSKUNamecheckbox();
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
				//assign.itemOwnerNamecheckbox(testData.get("OwnerName"));
				assign.SelectOwnerNameFromPopup();
				assign.OwnerNamesearchOK();
				Thread.sleep(500);
				assign.AssignmentStartDate(testData.get("AssignmentStartDate"));
				assign.AssignmentReturnDate(testData.get("AssignmentReturnDate"));
				assign.ExpectedEndDate(testData.get("ExpectedEndDate"));
				assign.ActualReturnDate(testData.get("ActualReturnDate"));
				assign.CurrentOwnershipStatus();
				assign.CurrentOwnershipStatusValue();
				assign.Notes(testData.get("Notes"));
				assign.Save();
				assign.PopupOK();
				assign.AssignUsersTab();
				assign.AddUsers();
				assign.SelectFirstUserFromPopup();
				assign.UsersPopupOK();
				assign.PopupOK();
				assign.UsersPopupCancel();
				assign.SaveAndNew();
				
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info(" Ownership For --> "+testData.get("ITEMSKU")+" created Successfully ");
					Common.logTrace(" Ownership For --> "+testData.get("ITEMSKU")+" created Successfully ");
				}
				else
				{
					Common.fail(driver," Ownership For-->"+testData.get("ITEMSKU")+" is not created successfully ");
					Common.logTrace(" Ownership For-->"+testData.get("ITEMSKU")+" is not created successfully ");
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
		
}
