package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;
import com.issquared.PageObjects.ACTIONS_Onboard;
import com.issquared.PageObjects.ACTIONS_Transfer;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class ActionsTransfer_Method extends BaseTest{
	    WebDriver driver;
	    ACTIONS_Transfer transfer;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public ActionsTransfer_Method(WebDriver driver) {
			this.driver = driver;
			transfer = new ACTIONS_Transfer(driver);
		}
		public void createACTIONS_transfer() throws Exception {
			try{
				Common.starttest("Transfer Items...");
				Common.assignCategory("Transfer Items...");
				transfer = PageFactory.initElements(driver, ACTIONS_Transfer.class);
			    Thread.sleep(1000);
			    transfer.SelectAssetsDashboard();
				Thread.sleep(500);
				transfer.SelectACTIONSdropdown();
				Thread.sleep(500);
			    transfer.ClickOnTransfer();
				List<HashMap<String, String>> multipleTestData2 = getTestACTIONS_Onboard("transfer","transfer");
				Common.logTrace("multipleTestData  : "+multipleTestData2);
				for (HashMap<String, String> testData2 : multipleTestData2) {
				Common.logTrace("Actions Tranfer Execution InProgress");	
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
				driver.findElement(By.xpath("//*[@id='searchByColumn']")).sendKeys("Pavanr");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='searchByColumn']")).sendKeys(Keys.SPACE);
				Thread.sleep(1000);
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
					Common.logTrace("Transfer Items to--> "+testData2.get("TransferOwnerName")+"  Successfully ");
				}
				else
				{
					Common.fail(driver,"Transfer Items to -->"+testData2.get("TransferOwnerName")+"  is not successfully ");
					Common.logTrace("Transfer Items to -->"+testData2.get("TransferOwnerName")+"  is not successfully ");
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
		
		
}
