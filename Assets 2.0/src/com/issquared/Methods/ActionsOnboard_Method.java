package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;
import com.issquared.PageObjects.ACTIONS_Onboard;
import com.issquared.PageObjects.Items;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class ActionsOnboard_Method extends BaseTest{
	    WebDriver driver;
	    ACTIONS_Onboard onboard;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public ActionsOnboard_Method(WebDriver driver) {
			this.driver = driver;
			onboard = new ACTIONS_Onboard(driver);
		}
		public void createACTIONS_onboard() throws Exception {
			try{
			    Common.starttest("Onboard Items...");
			    Common.assignCategory("Onboard Items...");
			    onboard = PageFactory.initElements(driver, ACTIONS_Onboard.class);
			    Thread.sleep(1000);
			    onboard.SelectAssetsDashboard();
				Thread.sleep(500);
				onboard.SelectACTIONSdropdown();
				Thread.sleep(500);
			    onboard.ClickOnboard();
				List<HashMap<String, String>> multipleTestData = getTestACTIONS_Onboard("onboard","onboard");
				Common.logTrace("multipleTestData  : "+multipleTestData);
				Common.logTrace("Onboard Execution InProgress");
				for (HashMap<String, String> testData : multipleTestData) {
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
					Common.logTrace("Onboard Items to--> "+testData.get("Assetpool")+" Assetpool Successfully ");
				}
				else
				{
					Common.fail(driver,"Onboard Items to -->"+testData.get("Assetpool")+" Assetpool is not successfully ");
					Common.logTrace("Onboard Items to -->"+testData.get("Assetpool")+" Assetpool is not successfully ");
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
		
}
