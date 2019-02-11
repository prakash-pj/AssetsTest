package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.PageObjects.LIFECYCLE_Hold;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class LifecycleHold_Method extends BaseTest{
	    WebDriver driver;
	    LIFECYCLE_Hold hold;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public LifecycleHold_Method(WebDriver driver) {
			this.driver = driver;
			hold = new LIFECYCLE_Hold(driver);
		}
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
				Common.logTrace("multipleTestData  : "+multipleTestData3);
				Common.logTrace("Creating Hold Item");
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
					//hold.ItemSKUCheckbox();
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
					/*hold.OwnerNameSelection();
					Thread.sleep(2000);
					hold.OwnerNameClickPageCount();
					Thread.sleep(1000);
					hold.OwnerNameSelectPageCountValue();
					hold.OwnerNameCheckbox(testData3.get("OwnerName"));
					hold.OwnerNamePopupOK();*/
					hold.StartDate();
					hold.EndDate();
					hold.Notes();
					hold.SaveAndNew();
					if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
					{
						Common.info("Hold Record For --> "+testData3.get("ITEMSKUName")+" created Successfully ");
						Common.logTrace("Hold Record For --> "+testData3.get("ITEMSKUName")+" created Successfully ");
					}
					else
					{
						Common.fail(driver,"Hold Record For-->"+testData3.get("ITEMSKUName")+" is not created successfully ");
						Common.logTrace("Hold Record For-->"+testData3.get("ITEMSKUName")+" is not created successfully ");
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
}
