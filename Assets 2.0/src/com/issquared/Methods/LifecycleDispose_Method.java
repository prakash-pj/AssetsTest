package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.PageObjects.LIFECYCLE_Disposal;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class LifecycleDispose_Method extends BaseTest{
	    WebDriver driver;
	    LIFECYCLE_Disposal disposal;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public LifecycleDispose_Method(WebDriver driver) {
			this.driver = driver;
			disposal = new LIFECYCLE_Disposal(driver);
		}
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
				Common.logTrace("multipleTestData  : "+multipleTestData4);
				Common.logTrace("Creating Dispose Item");
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
					//disposal.ItemSKUCheckbox();
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
					disposal.soldTo.clear();
					disposal.SoldTo(testData4.get("SoldTo"));
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
						Common.logTrace("Dispose Record For --> "+testData4.get("ITEMSKUName")+" created Successfully ");
					}
					else
					{
						Common.fail(driver,"Dispose Record For-->"+testData4.get("ITEMSKUName")+" is not created successfully ");
						Common.logTrace("Dispose Record For-->"+testData4.get("ITEMSKUName")+" is not created successfully ");
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
