package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.issquared.Common.Common;
import com.issquared.PageObjects.AssetPool;
import com.issquared.PageObjects.ItemType;
import com.issquared.PageObjects.Warehouses;
import com.issquared.TestCases.BaseTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ExtentReportListener.ExtentReporterNG;

public class WAREHOUSES_Method extends BaseTest{
	
	WebDriver driver;
	Warehouses wHouse;
	AssetPool assetPool;
	ITestResult result;
    ExtentReports extent;
    ExtentTest test;
    LogStatus status;
	
    @Test 
	public void createWareHouse() throws Exception {
		try
		{
			Common.starttest("Warehouse Creation....");
			Common.assignCategory("Warehouse Creation....");
			wHouse = PageFactory.initElements(driver, Warehouses.class);
		    Thread.sleep(2000);
		    wHouse.clickWarehouses();
		    wHouse.clickNewonWarehouses();
		    List<HashMap<String, String>> multipleTestData = getTestCaseWarehouses("InUsers","System A");
		    System.out.println("multipleTestData  : "+multipleTestData);
		    for (HashMap<String, String> testData : multipleTestData) {
			System.out.println("Warehouse Creation Execution is In-Progress");
			
			wHouse.warehousesName.clear();
			wHouse.enterFirstname(testData.get("WarehouseName"));
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
				Common.info("Warehouse --> "+testData.get("WarehouseName")+" created Successfully ");
			
			}
			else
			{
			
				 /*test.log(status,"Warehouse -->"+testData.get("WarehouseName")+" is not created successfully1 ");*/
				Common.fail(driver,"Warehouse -->"+testData.get("WarehouseName")+" is not created successfully ");
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
	
	@Test 
	public void createAssetPool() throws Exception {
		
		try
		{
			/*boolean breakIt = true;
	        while (true) {
	        breakIt = true;
	        try {*/	
			
			Common.starttest("Assetpool Creation.... ");
			Common.assignCategory("Assetpool Creation.... ");
			assetPool = PageFactory.initElements(driver, AssetPool.class);
			Thread.sleep(1000);
			assetPool.SelectAssetsDashboard();
			Thread.sleep(1000);
			assetPool.selectwarehousesdropdown();
			Thread.sleep(1000);
		    assetPool.clickAssetPool();
		    assetPool.clickNewonAssetPool();
		    List<HashMap<String, String>> multipleTestData = getTestCaseAssetPool("InUsers","System A");
		    System.out.println("multipleTestData  : "+multipleTestData);
		
		    for (HashMap<String, String> testData : multipleTestData) {
			System.out.println("Assetpool Creation Execution is In-Progress");
			
			assetPool.enterAssetPool_Name(testData.get("AssetPool_Name"));
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
				ExtentReporterNG.info("AssetPool --> "+testData.get("AssetPool_Name")+" created Successfully ");
			
			}
			else
			{
				ExtentReporterNG.fail(driver,"AssetPool-->"+testData.get("AssetPool_Name")+" is not created successfully ");
				
			}
			try{
				assetPool.SuccessMesOkPopup();;}catch(Exception ex){ex.printStackTrace();
				} 
			
			
			ExtentReporterNG.pass("Test Passed");
			ExtentReporterNG.endtest();
		
		    
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
			ExtentReporterNG.fail(driver, "Test Failed");
			ExtentReporterNG.endtest();
			throw e;
		}
	}
	
}
