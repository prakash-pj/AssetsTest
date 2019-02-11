package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;
import com.issquared.PageObjects.ACTIONS_Dispose;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class ActionsDispose_Method extends BaseTest{
	    WebDriver driver;
	    ACTIONS_Dispose dispose;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public ActionsDispose_Method(WebDriver driver) {
			this.driver = driver;
			dispose = new ACTIONS_Dispose(driver);
		}
		public void createACTIONS_dispose() throws Exception {
			try{
				Common.starttest("Dispose Items...");
				Common.assignCategory("Dispose Items...");
				dispose = PageFactory.initElements(driver,ACTIONS_Dispose.class);
				List<HashMap<String, String>> multipleTestData5 = getTestACTIONS_Onboard("dispose","dispose");
				Common.logTrace("multipleTestData  : "+multipleTestData5);
				Common.logTrace("Actions Dispose Execution InProgress");
				for (HashMap<String, String> testData5 : multipleTestData5) {
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
				Thread.sleep(20000);
				//dispose.ItemNamecheckbox(testData5.get("SerialNumber"));
				dispose.SelectFirstvalueFromPopup();
				Thread.sleep(1000);
				dispose.SelectAssetsToDisposeAddItem();
				dispose.PopupOK();
				
				
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Item Dispose to --> "+testData5.get("AssetpoolName")+" created Successfully ");
					Common.logTrace("Item Dispose to --> "+testData5.get("AssetpoolName")+" created Successfully ");
				}
				else
				{
					Common.fail(driver,"Item Dispose to -->"+testData5.get("AssetpoolName")+" is not created successfully ");
					Common.logTrace("Item Dispose to -->"+testData5.get("AssetpoolName")+" is not created successfully ");
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
}
