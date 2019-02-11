package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import com.issquared.Common.Common;
import com.issquared.PageObjects.ACTIONS_Hold;
import com.issquared.PageObjects.ACTIONS_Release;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class ActionsRelease_Method extends BaseTest{
	    WebDriver driver;
	    ACTIONS_Release release;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public ActionsRelease_Method(WebDriver driver) {
			this.driver = driver;
			release = new ACTIONS_Release(driver);
		}
		
		public void createACTIONS_release() throws Exception {
			try{
				Common.starttest("Release Items to Assetpool...");
				Common.assignCategory("Release Items to Assetpool...");
				release = PageFactory.initElements(driver, ACTIONS_Release.class);
				List<HashMap<String, String>> multipleTestData6 = getTestACTIONS_Onboard("release","release");
				Common.logTrace("multipleTestData  : "+multipleTestData6);
				Common.logTrace("Actions Item Release Execution InProgress");
				for (HashMap<String, String> testData6 : multipleTestData6) {
					
				Thread.sleep(2000);
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
				driver.findElement(By.xpath("//*[@id='searchByColumn']")).sendKeys("Pavanr");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='searchByColumn']")).sendKeys(Keys.SPACE);
				Thread.sleep(500);
				//release.OwnerNameInformationCheckbox();
				//release.OwnerNameInformationCheckbox(testData6.get("OwnerName"));
				release.OwnerNameInformationCheckbox("Pavanr");
				Thread.sleep(500);
				release.OwnerNameInformationPOpupOk();
				Thread.sleep(500);
				release.AssetPoolNameSelection();
				Thread.sleep(500);
				release.AssetPoolPageCount();
				release.AssetPoolPageCountValue();
				Thread.sleep(500);
				release.AssetPoolCheckbox(testData6.get("AssetpoolName"));
				//release.AssetPoolCheckbox();
				Thread.sleep(500);
				release.AssetPoolNamePOpupOk();
				Thread.sleep(500);
				//release.releaseDate.clear();
				release.ReleaseDate(testData6.get("ReleaseDate"));
				Thread.sleep(1000);
				release.ClickPageCount();
				Thread.sleep(500);
				release.SelectPageCountValue();
				Thread.sleep(3000);
				//release.AssignedItemSelect(testData6.get("SerialNumber"));
				release.SelectFirstvalueFromPopup();
				Thread.sleep(500);
				release.ReleaseButton();
				Thread.sleep(500);
				
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Item Released to --> "+testData6.get("AssetpoolName")+"  Successfully ");
					Common.logTrace("Item Released to --> "+testData6.get("AssetpoolName")+"  Successfully ");
				}
				else
				{
					Common.fail(driver,"Item Released to -->"+testData6.get("AssetpoolName")+" is not successfully");
					Common.logTrace("Item Released to -->"+testData6.get("AssetpoolName")+" is not successfully ");
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
		
		@AfterTest
		public void complete()
		{
			Common.endtest();
			Common.endReport();
			System.out.println("After test");
			
		}
}
