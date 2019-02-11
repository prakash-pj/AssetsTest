package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.PageObjects.Warehouses;
import com.issquared.TestCases.BaseTest;

public class Warehouse_Method extends BaseTest{
	    WebDriver driver;
	    Warehouses wHouse;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public Warehouse_Method(WebDriver driver) {
			this.driver = driver;
			wHouse = new Warehouses(driver);
		}
		
		public void createWareHouses() throws Exception {
			try
			{
				wHouse = PageFactory.initElements(driver,Warehouses.class);
				Common.starttest("Warehouse Creation....");
				Common.assignCategory("Warehouse Creation....");
			    Thread.sleep(1000);
			    wHouse.SelectAssetsDashboard();
			    Thread.sleep(1000);
			    wHouse.selectwarehousesdropdown();
			    wHouse.clickWarehouses();
			    wHouse.clickNewonWarehouses();
			    List<HashMap<String, String>> multipleTestData = getTestCaseWarehouses("InUsers","System A");
			    Common.logTrace("multipleTestData  : "+multipleTestData);
			    for (HashMap<String, String> testData : multipleTestData) {
			    String tempName = testData.get("WarehouseName")+Common.getUniqueID(5);
			    Common.logTrace("Warehouse Creation Execution is In-Progress");
				wHouse.warehousesName.clear();
				wHouse.enterFirstname(tempName);
				wHouse.address1.clear();
				wHouse.Select_WH_Address1(testData.get("Address1"));
				wHouse.address2.clear();
				wHouse.Select_WH_Address2(testData.get("Address2"));
				wHouse.address3.clear();
				wHouse.Select_WH_Address3(testData.get("Address3"));
				wHouse.Select_WH_CountryType();
				wHouse.Select_WH_CountryValue();
				wHouse.Select_WH_State();
				Thread.sleep(1000);
				wHouse.Select_WH_StateValue();
				wHouse.city.clear();
				wHouse.Enter_WH_CityName(testData.get("City"));
				wHouse.zip.clear();
				wHouse.Enter_WH_ZipCode(testData.get("Zip"));
				Thread.sleep(1000);
				wHouse.clickPrimary_contactName();
				Thread.sleep(2000);
				wHouse.PrimarycontctNameClickPageCount();
				wHouse.PrimarycontctNameSelectPageCountValue();
				wHouse.SelectPrimaryContactUser();
				wHouse.PrimaryContactNameOkButton();
				Thread.sleep(2000);
				wHouse.primaryContact_Number.clear();
				Thread.sleep(1000);
				wHouse.enterPrimary_Conct_Number(testData.get("ContactNumber"));
				Thread.sleep(2000);
				wHouse.primaryContact_EmailID.clear();
				Thread.sleep(2000);
				wHouse.enterPrimaryContact_EmailID(testData.get("ContactEmailId"));
				Thread.sleep(2000);
				wHouse.clickSecondary_contactName();
				Thread.sleep(2000);
				wHouse.SecondarycontctNameClickPageCount();
				wHouse.SecondarycontctNameSelectPageCountValue();
				wHouse.SelectSecondaryContactUser();
				Thread.sleep(2000);
				wHouse.SecondaryContactNameOkButton();
				Thread.sleep(2000);
				wHouse.SecondaryContact_Number.clear();
				Thread.sleep(1000);
				wHouse.enterSecondary_Conct_Number(testData.get("SecondaryContactNumber"));
				wHouse.SecondaryContact_EmailID.clear();
				wHouse.enterSecondaryContact_EmailID(testData.get("SecondaryContactEmailId"));
				wHouse.description.clear();
				wHouse.WH_Description(testData.get("Description"));
				wHouse.notes.clear();
				wHouse.WH_Notes(testData.get("Notes"));
				Thread.sleep(1000);
				//wHouse.clickOnSaveandNew();
				Thread.sleep(1000);
				wHouse.clickOnSave();
				Thread.sleep(800);
				wHouse.SuccessMesOkPopup();
				Thread.sleep(2000);
				
				/*wHouse.Assetpool_CreateNew();
				Thread.sleep(1000);
				wHouse.AssetpoolName(testData.get("AssetpoolNam"));
				Thread.sleep(1000);
				wHouse.AssetpoolName_OK();
				Thread.sleep(1000);
				wHouse.SuccessMesOkPopup();*/
				
				/*Thread.sleep(1000);
				wHouse.clickOnSaveandNew();
				Thread.sleep(600);
				wHouse.SuccessMesOkPopup();*/
				
				Thread.sleep(3000);
				wHouse.AssignManager_Tab();
				wHouse.AssignManager_CreateNew();
				Thread.sleep(1000);
				wHouse.AssignManagerClickPageCount();
				wHouse.AssignManagerSelectPageCountValue();
				//wHouse.SelectAssignManager(testData.get("WH_AssignManager"));
				wHouse.SelectAssignManager();
				//wHouse.AssignManager_Checkbox();
				Thread.sleep(1000);
				wHouse.AssignManager_OK();
				Thread.sleep(3000);
				wHouse.SuccessMesOkPopup();
				Thread.sleep(1000);
				//wHouse.clickOnSaveandNew();
				//Thread.sleep(600);
				//wHouse.SuccessMesOkPopup();
				driver.findElement(By.xpath("//*[@id='Cancel-AssetPoolPopup']/div")).click();
				Thread.sleep(1000);
				wHouse.clickOnSaveandNew();
				Thread.sleep(600);
				
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Warehouse --> "+tempName+" created Successfully ");
					 Common.logTrace("Warehouse --> "+tempName+" created Successfully ");
				
				}
				else
				{
				
					 /*test.log(status,"Warehouse -->"+testData.get("WarehouseName")+" is not created successfully1 ");*/
					Common.fail(driver,"Warehouse -->"+tempName+" is not created successfully ");
					Common.logTrace("Warehouse -->"+tempName+" is not created successfully ");
					Common.captureScreenShot("fileName");
				}
				try{wHouse.SuccessMesOkPopup();;
				Thread.sleep(4000);
				}catch(Exception ex){ex.printStackTrace();
				} 
				}
			    Common.pass("Test Passed");
			    Common.endtest();
			   
			    Thread.sleep(3000);
			}
			catch(Exception e)
			{
				Common.fail(driver, "Test Failed");
				Common.endtest();
				throw e;
			}
		}
		
		
}
