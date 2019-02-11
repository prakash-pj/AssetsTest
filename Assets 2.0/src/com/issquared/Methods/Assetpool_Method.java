package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;
import com.issquared.PageObjects.AssetPool;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class Assetpool_Method extends BaseTest{
	    WebDriver driver;
	    AssetPool assetPool;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public Assetpool_Method(WebDriver driver) {
			this.driver = driver;
			assetPool = new AssetPool(driver);
		}
		
		public void createAssetPoolTest() throws Exception {
			
			try
			{
				Common.starttest("Assetpool Creation.... ");
				Common.assignCategory("Assetpool Creation.... ");
				assetPool = PageFactory.initElements(driver,AssetPool.class);
				Thread.sleep(1000);
				assetPool.SelectAssetsDashboard();
				Thread.sleep(1000);
				assetPool.selectwarehousesdropdown();
				Thread.sleep(1000);
			    assetPool.clickAssetPool();
			    Thread.sleep(1000);
			    assetPool.clickNewonAssetPool();
			    List<HashMap<String, String>> multipleTestData = getTestCaseAssetPool("InUsers","System A");
			    Common.logTrace("multipleTestData  : "+multipleTestData);
			    for (HashMap<String, String> testData : multipleTestData) {
			    String tempName = testData.get("AssetPool_Name")+Common.getUniqueID(5);
			    Common.logTrace("Assetpool Creation Execution is In-Progress");
				assetPool.enterAssetPool_Name(tempName);
				assetPool.clickPrimary_contctName();
				Thread.sleep(800);
				assetPool.PrimarycontctNameClickPageCount();
				assetPool.PrimarycontctNameSelectPageCountValue();
				assetPool.SelectPrimaryContactUser();
				//assetPool.clickAllCheckboxes();
				assetPool.PrimaryContctNameOkButton();
				assetPool.enterPrimary_Conct_Number(testData.get("ContactNumber"));
				assetPool.enterPrimaryContact_EmailID(testData.get("ContactEmailId"));
				Thread.sleep(2000);
				assetPool.clickSecondary_contactName();
				Thread.sleep(2000);
				assetPool.SecondarycontctNameClickPageCount();
				assetPool.SecondarycontctNameSelectPageCountValue();
				assetPool.SelectSecondaryContactUser();
				//assetPool.clickAllCheckboxes();
				Thread.sleep(1000);
				assetPool.SecondaryContactNameOkButton();
				Thread.sleep(1000);
				assetPool.enterSecondary_Conct_Number(testData.get("SecondaryContactNumber"));
				assetPool.enterSecondaryContact_EmailID(testData.get("SecondaryContactEmailId"));
				assetPool.AssetPool_Description(testData.get("Description"));
				//assetPool.AssetPool_Notes(testData.get("Notes"));
				Thread.sleep(600);
				assetPool.clickOnSave();
				Thread.sleep(2000);
				assetPool.SuccessMesOkPopup();
				Thread.sleep(2000);
				assetPool.wareHouse_CreateNew();
				Thread.sleep(2000);
				assetPool.WareHousecontctNameClickPageCount();
				assetPool.WareHousecontctNameSelectPageCountValue();
				Thread.sleep(1000);
				//assetPool.SelectWareHouse(testData.get("WarehouseName1"));
				assetPool.SelectWareHouse();
				//assetPool.wareHouseName_Checkbox();
				Thread.sleep(600);
				assetPool.wareHouseName_OK();
				Thread.sleep(600);
				assetPool.SuccessMesOkPopup();
				Thread.sleep(600);

				assetPool.organization_Tab();
				assetPool.Organization_CreateNew();
				Thread.sleep(1000);
				assetPool.Organization_selection();
				Thread.sleep(1000);
				assetPool.OrganizationClickPageCount();
				Thread.sleep(500);
				assetPool.OrganizationSelectPageCountValue();
				Thread.sleep(600);
				assetPool.SelectOrganization(testData.get("Organization"));
				//assetPool.Organization_Checkbox();
				Thread.sleep(1000);
				assetPool.Organization_OK();
				Thread.sleep(1000);
				assetPool.SelectOrganizationLocation(testData.get("OrganizationLocation"));
				//assetPool.Organization_LocCheckbox();
				assetPool.Organization_AddLocation();
				assetPool.successMesOkpopup();
				Thread.sleep(1000);
				
				assetPool.AssignManager_Tab();
				assetPool.AssignManager_CreateNew();
				Thread.sleep(1000);
				assetPool.AssignManagerClickPageCount();
				Thread.sleep(500);
				assetPool.AssignManagerSelectPageCountValue();
				//assetPool.SelectManager(testData.get("AP_Manager"));
				assetPool.SelectManager();
				//assetPool.AssignManager_Checkbox();
				Thread.sleep(1000);
				assetPool.AssignManager_OK();
				Thread.sleep(3000);
				assetPool.SuccessMesOkPopup();
				Thread.sleep(1000);
				//wHouse.clickOnSaveandNew();
				//Thread.sleep(600);
				//wHouse.SuccessMesOkPopup();
				driver.findElement(By.xpath("//*[@id='Cancel-AssetPoolPopup']/div")).click();
				Thread.sleep(1000);
				assetPool.clickOnSaveandNew();
				Thread.sleep(1000);
				
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("AssetPool --> "+tempName+" created Successfully ");
					Common.logTrace("AssetPool --> "+tempName+" created Successfully ");
				}
				else
				{
					Common.fail(driver,"AssetPool-->"+tempName+" is not created successfully ");
					Common.logTrace("AssetPool-->"+tempName+" is not created successfully ");
				}
				try{
					assetPool.SuccessMesOkPopup();;}catch(Exception ex){ex.printStackTrace();
					} 
				
				
				Common.pass("Test Passed");
				Common.endtest();
			
			    
			    }
				
			/* } catch (Exception e) {
		            if (e.getMessage().contains("element is not attached")) {
		                breakIt = false;
		            }
		        }
		        if (breakIt) {
		            break;
		        }
		        }*/
			}
			catch(Exception e)
			{
				Common.fail(driver, "Test Failed");
				Common.endtest();
				throw e;
			}
		}
		
		
		
}
