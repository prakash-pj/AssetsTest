package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.PageObjects.LIFECYCLE_Repair;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class LifecycleRepair_Method extends BaseTest{
	    WebDriver driver;
	    LIFECYCLE_Repair repair;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public LifecycleRepair_Method(WebDriver driver) {
			this.driver = driver;
			repair = new LIFECYCLE_Repair(driver);
		}
		public void createLIFECYCLE_Repair() throws Exception {
			try
			{
				Common.starttest("Creating Repair Item");
				Common.assignCategory("Creating Repair Item");
				repair = PageFactory.initElements(driver, LIFECYCLE_Repair.class);
				repair.SelectAssetsDashboard();
				Thread.sleep(500);
				repair.clickLIFECYCLEdropdown();
				Thread.sleep(500);
				repair.clickOnRepair();
				repair.clickNew();
				Thread.sleep(500);
				List<HashMap<String, String>> multipleTestData2 = getTestOwnership("LIFECYCLE_Repair","Repair");
				Common.logTrace("multipleTestData  : "+multipleTestData2);
				Common.logTrace("Creating Repair Item");
				for (HashMap<String, String> testData2 : multipleTestData2)
				{
					repair.itemInfoSelection();
					Thread.sleep(500);
					repair.itemSKUSelection();
					Thread.sleep(500);
					repair.ClickPageCount();
					repair.SelectPageCountValue();
					repair.itemSKUNamecheckbox(testData2.get("ITEMSKUName"));
					//repair.itemSKUNamecheckbox();
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
					Thread.sleep(500);
					repair.RequestedForUserCheckbox();
					Thread.sleep(500);
					repair.RequestedForPopupOk();
					repair.RepairFee(testData2.get("RepairFee"));
					repair.RepairFeeCurrency();
					repair.VendorNameSelection();
					repair.ClickPageCount();
					repair.SelectPageCountValue();
					Thread.sleep(500);
					repair.VendorNameCheckbox();
					Thread.sleep(500);
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
						Common.logTrace("Repair Record --> "+testData2.get("ITEMSKUName")+" created Successfully ");
					}
					else
					{
						Common.fail(driver,"Repair Record -->"+testData2.get("ITEMSKUName")+" is not created successfully ");
						Common.logTrace("Repair Record -->"+testData2.get("ITEMSKUName")+" is not created successfully ");
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
		
}
