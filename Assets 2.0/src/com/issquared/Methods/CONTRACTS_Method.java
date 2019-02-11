package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.issquared.Common.Common;
import com.issquared.PageObjects.InsuranceContracts;
import com.issquared.PageObjects.MaintenanceContract;
import com.issquared.PageObjects.WarrantyContract;
import com.issquared.TestCases.BaseTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CONTRACTS_Method extends BaseTest{
	WebDriver driver;
	MaintenanceContract MC;
	WarrantyContract WC;
	InsuranceContracts IC;
	ITestResult result;
    ExtentReports extent;
    ExtentTest test;
    LogStatus status;
	
    @Test 
	public void createMaintenanceContract() throws Exception {
		try
		{
			Common.starttest("Creating Maintenance Contracts");
			Common.assignCategory("Creating Maintenance Contracts");
			MC = PageFactory.initElements(driver, MaintenanceContract.class);
			MC.SelectAssetsDashboard();
			Thread.sleep(1000);
			MC.selectcontractdropdown();
			Thread.sleep(1000);
			MC.clickMaintenanceContract();
			MC.clickNew();
			Thread.sleep(500);
			List<HashMap<String, String>> multipleTestData = getContractsInfoConfiguration("Mcontracts","MaintenanceContracts");
			System.out.println("multipleTestData  : "+multipleTestData);
			for (HashMap<String, String> testData : multipleTestData)
			{
				Thread.sleep(1000);
				MC.Entercontractname(testData.get("ContractName"));
				MC.Entercontractnumber(testData.get("ContractNumber"));
				MC.EnterContractAmount(testData.get("ContractAmount"));
				MC.ContractAmountType();
				MC.ContractAmountTypeValue();
				MC.SelectContractType();
				MC.SelectContractTypeValue();
				MC.SelectContractLevel();
				MC.SelectContractLevelValue();
				MC.SelectPriortyLevel();
				MC.SelectPriortyLevelValue();
				MC.SelectPrioritysublevel();
				MC.SelectPrioritysublevelvalue();
				MC.SelectMaintenanceStatus();
				MC.SelectMaintenanceStatusValue();
				MC.EnterEffectiveDate(testData.get("EffectiveDate"));
				MC.EnterEnddate(testData.get("Enddate"));
				MC.EnterRemovaldate(testData.get("Removaldate"));
				MC.EnterNotes(testData.get("Notes"));
				MC.BasicSave();
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Maintenance --> "+testData.get("ContractName")+" created Successfully ");
				
				}
				else
				{
					Common.fail(driver,"Maintenance -->"+testData.get("ContractName")+" is not created successfully ");
					
				}
				try{
					MC.BasicSaveOk();
					;}catch(Exception ex){ex.printStackTrace();} 
				
				MC.EnterResponseTime(testData.get("ResponseTime"));
				MC.clickResponseTimeunit();
				MC.clickResponseTimeunitvalue();
				MC.clickVendorSearch();
				//Thread.sleep(500);
				//MC.ClickTypePageCount();
				//MC.ClickTypePageCountValue();
				Thread.sleep(2000);
				MC.SelectVendorSearchValue();
				MC.SelectVendorSearchValueOK();
				MC.EnterPhone1(testData.get("Phone1"));
				MC.EnterPhone2(testData.get("Phone2"));
				MC.EnterEmailAddress(testData.get("EmailAddress"));
				MC.EnterWebsite(testData.get("Website"));
				MC.EnterStartDate(testData.get("StartDate"));
				MC.EnterEndDate(testData.get("EndDate"));
				MC.EnterRemovalDate(testData.get("RemovalDate"));
				MC.EnterPremiumDueDate(testData.get("PremiumDueDate"));
				MC.EnterPremiumDueAmount(testData.get("PremiumDueAmount"));
				
				MC.EnterPremiumDueCurrency();
				MC.SelectPremiumDueCurrencyValue();
				
				MC.EnterMaintenanceContractCoPayment(testData.get("MaintenanceContractCoPayment"));
				MC.EnterMaintenanceContractCoPaymentCurrency();
				Thread.sleep(500);
				MC.SelectMaintenanceContractCoPaymentCurrencyvalue();
				Thread.sleep(800);
				MC.ClickCoversLoaner();
				Thread.sleep(500);
				MC.ClickCoversshipping();
				MC.ClickOtherSave();
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Other Information for --> "+testData.get("ContractName")+" is saved Successfully");
				
				}
				else
				{
					Common.fail(driver,"Other Information for -->"+testData.get("ContractName")+" is not saved Successfully");
					
				}
				try{
				MC.ClickOtherSaveokpopup();;;}catch(Exception ex){ex.printStackTrace();} 
				MC.ClickDocumentsTab();
				Thread.sleep(1000);
				MC.clickDocumentsCreateNew();
				
				List<HashMap<String, String>> multipleTestData1 = getContractsInfoConfiguration(testData.get("ContractName"),"MaintenanceDocuments");
				System.out.println("multipleTestData  : "+multipleTestData1);
				for (HashMap<String, String> testData1 : multipleTestData1)
				{
					MC.EnterDocTitle(testData1.get("DocTitle"));
					MC.EnterDocVersionNo(testData1.get("DocVersionNo"));
					MC.EnterDocDescription(testData1.get("DocDescription"));
					MC.Documentupload(testData1.get("Documentupload"));
					MC.clickDocSaveNew();
					//MC.clickDocSave();
					
					if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
					{
						Common.info("Document --> "+testData1.get("DocTitle")+" created Successfully for "+testData.get("ContractName"));
					
					}
					else
					{
						Common.fail(driver,"Document -->"+testData1.get("DocTitle")+" is not created successfully for "+testData.get("ContractName"));
						
					}
					try{MC.clickDocSaveokpopup();;
					Common.pass("Test Passed");
					Common.endtest();
					}catch(Exception ex){ex.printStackTrace();} 
					
				}

				MC.clickDocCancel();
				Thread.sleep(2000);
				MC.clickContractItemsTab();
				MC.clickContractItemsCreateNew();
				Thread.sleep(500);
				MC.SelectContractItemSelection();
				Thread.sleep(500);
				/*MC.ClickTypePageCount();
				MC.ClickTypePageCountValue();
				Thread.sleep(500);*/
				MC.ClickContractAddItemClass();
				Thread.sleep(500);
				MC.clickContractAddItemokpopup();
				Thread.sleep(500);
				//MC.clickContractItemCancel();
				Thread.sleep(2000);
				//MC.clickOtherInformationSave();
				MC.clickOtherInformationSavenew();
				MC.clickOtherInformationSavenewOk();
				
			/*Common.pass("Test Passed");
			Common.endtest();*/
		}
			//MC.clickOtherInformationCancel();
		}
		catch(Exception e)
		{
			Common.fail(driver, "Test Failed");
			Common.endtest();
			throw e;
		}
	}
 
 @Test 
	public void createWarrantyContract() throws Exception {
		try
		{
			Common.starttest("Creating Warranty Contracts");
			Common.assignCategory("Creating Warranty Contracts");
			WC = PageFactory.initElements(driver, WarrantyContract.class);
			Thread.sleep(2000);
			WC.SelectAssetsDashboard();
			Thread.sleep(1000);
			WC.selectcontractdropdwon();
			Thread.sleep(500);
			WC.clickWarrantyContract();
			WC.clickNew();
			Thread.sleep(500);
			List<HashMap<String, String>> multipleTestData3 = getContractsInfoConfiguration("Wcontracts","WarrantyContracts");
			System.out.println("multipleTestData  : "+multipleTestData3);
			for (HashMap<String, String> testData3 : multipleTestData3)
			{
		
			
				WC.Entercontractname(testData3.get("ContractName"));
				WC.Entercontractnumber(testData3.get("ContractNumber"));
				WC.EnterContractAmount(testData3.get("ContractAmount"));
				WC.ContractAmountType();
				WC.ContractAmountTypeValue();
				WC.SelectContractType();
				WC.SelectContractTypeValue();
				WC.SelectContractLevel();
				WC.SelectContractLevelValue();
				WC.SelectPriortyLevel();
				WC.SelectPriortyLevelValue();
				WC.SelectPrioritysublevel();
				WC.SelectPrioritysublevelvalue();
				WC.SelectMaintenanceStatus();
				WC.SelectMaintenanceStatusValue();
				WC.EnterEffectiveDate(testData3.get("EffectiveDate"));
				WC.EnterEnddate(testData3.get("Enddate"));
				WC.EnterRemovaldate(testData3.get("Removaldate"));
				WC.EnterNotes(testData3.get("Notes"));
				WC.BasicSave();
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Warranty --> "+testData3.get("ContractName")+" created Successfully ");
				
				}
				else
				{
					Common.fail(driver,"Warranty -->"+testData3.get("ContractName")+" is not created successfully ");
					
				}
				try{WC.BasicSaveOk();;}catch(Exception ex){ex.printStackTrace();} 
				Thread.sleep(3000);
				WC.EnterResponseTime(testData3.get("ResponseTime"));
				WC.clickResponseTimeunit();
				WC.clickResponseTimeunitvalue();
				//WC.clickVendorSearch();
				//Thread.sleep(500);
				//MC.ClickTypePageCount();
				//MC.ClickTypePageCountValue();
				//Thread.sleep(800);
				//WC.SelectVendorSearchValue();
				//WC.SelectVendorSearchValueOK();
				//WC.EnterPhone1(testData.get("Phone1"));
				//WC.EnterPhone2(testData.get("Phone2"));
				//WC.EnterEmailAddress(testData.get("EmailAddress"));
				//WC.EnterWebsite(testData.get("Website"));
				Thread.sleep(500);
				WC.SelectProvidedby();
				WC.SelectProvidedbyvalue();
				WC.EnterStartDate(testData3.get("StartDate"));
				Thread.sleep(500);
				WC.EnterEndDate(testData3.get("EndDate"));
				Thread.sleep(500);
				WC.EnterRemovalDate(testData3.get("RemovalDate"));
				Thread.sleep(500);
				WC.EnterPremiumDueDate(testData3.get("PremiumDueDate"));
				WC.EnterPremiumDueAmount(testData3.get("PremiumDueAmount"));
				
				WC.EnterPremiumDueCurrency();
				WC.SelectPremiumDueCurrencyValue();
				
				WC.EnterWarrantyContractCoPayment(testData3.get("MaintenanceContractCoPayment"));
				WC.EnterWarrantyContractCoPaymentCurrency();
				Thread.sleep(500);
				WC.SelectWarrantyContractCoPaymentCurrencyvalue();
				Thread.sleep(800);
				WC.ClickCoversLoaner();
				Thread.sleep(500);
				WC.ClickCoversshipping();
				//WC.ClickOtherSave();
				
				/*if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Other Information for --> "+testData3.get("ContractName")+" is saved Successfully");
				
				}
				else
				{
					Common.fail(driver,"Other Information for -->"+testData3.get("ContractName")+" is not saved Successfully");
					
				}
				try{WC.ClickOtherSaveokpopup();;;}catch(Exception ex){ex.printStackTrace();} */
				
		//*******************************************Extended Warranty tab test cases*************************		
				Thread.sleep(500);
				WC.SelectExtendedWarrantyTab();
				Thread.sleep(500);
				WC.SelectExntedVendorSearch();
				Thread.sleep(500);
				WC.VendorClickTypePageCount();
				WC.VendorClickTypePageCountValue();
				WC.SelectExtendedVendorValue();
				WC.SelectExtendedVendorOrganizationOk();
				Thread.sleep(500);
				WC.SelectWarrantyCost(testData3.get("WarrantyCost"));
				WC.SelectWarrantyCostCurrency();
				WC.SelectWarrantyCostCurrencyValue();
				WC.SelectExtendedWarrantyStartDate(testData3.get("ExtendedWarrantyStartDate"));
				WC.SelectExtendedWarrantyEndDate(testData3.get("WarrantyEndDate"));
				WC.SelectExtendedWarrantySave();
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Warranty Cost --> "+testData3.get("WarrantyCost")+" created Successfully for "+testData3.get("ContractName"));
				
				}
				else
				{
					Common.fail(driver,"Warranty Cost -->"+testData3.get("WarrantyCost")+" is not created successfully for "+testData3.get("ContractName"));
					
				}
				try{WC.SelectExtendedWarrantySaveOK();;}catch(Exception ex){ex.printStackTrace();} 
			
				
		//*****************************************Documents Seciton********************************
				Thread.sleep(500);
				WC.ClickDocumentsTab();
				Thread.sleep(1000);
				WC.clickDocumentsCreateNew();
				
				List<HashMap<String, String>> multipleTestData4 = getContractsInfoConfiguration(testData3.get("ContractName"),"WarrantyDocuments");
				System.out.println("multipleTestData  : "+multipleTestData4);
				for (HashMap<String, String> testData4 : multipleTestData4)
				{
					
					WC.EnterDocTitle(testData4.get("DocTitle"));
					WC.EnterDocVersionNo(testData4.get("DocVersionNo"));
					WC.EnterDocDescription(testData4.get("DocDescription"));
					WC.Documentupload(testData4.get("Documentupload"));
					WC.clickDocSaveNew();
					//WC.clickDocSave();
					
					if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
					{
						Common.info("Document --> "+testData4.get("DocTitle")+" created Successfully for "+testData3.get("ContractName"));
					
					}
					else
					{
						Common.fail(driver,"Document -->"+testData4.get("DocTitle")+" is not created successfully for "+testData3.get("ContractName"));
						
					}
					try{WC.clickDocSaveokpopup();;}catch(Exception ex){ex.printStackTrace();} 
					
				}

				WC.clickDocCancel();
				
				Thread.sleep(1000);
				WC.clickContractItemsTab();
				Thread.sleep(500);
				WC.clickContractItemsCreateNew();
				Thread.sleep(500);
				WC.SelectContractItemSelection();
				Thread.sleep(500);
				/*WC.ClickTypePageCount();
				WC.ClickTypePageCountValue();
				Thread.sleep(500);*/
				WC.ClickContractAddItemClass();
				Thread.sleep(500);
				WC.clickContractAddItemokpopup();
				Thread.sleep(500);
				//WC.clickContractItemCancel();
				Thread.sleep(1500);
				//WC.clickOtherInformationSave();
				WC.clickOtherInformationSavenew();
				WC.clickOtherInformationSavenewOk();
				
			Common.pass("Test Passed");
			Common.endtest();
		}
			//MC.clickOtherInformationCancel();
		}
		catch(Exception e)
		{
			Common.fail(driver, "Test Failed");
			Common.endtest();
			throw e;
		}
	}


 @Test 
	public void createInsuranceContract() throws Exception {
		try
		{
			Common.starttest("Creating Insurance Contracts");
			Common.assignCategory("Creating Insurance Contracts");
			IC = PageFactory.initElements(driver, InsuranceContracts.class);
			WC.SelectAssetsDashboard();
			Thread.sleep(1000);
			IC.selectcontractdropdwon();
			Thread.sleep(3000);
			IC.clickInsuranceContracts();
			IC.clickNew();
			Thread.sleep(1000);
			List<HashMap<String, String>> multipleTestData5 = getContractsInfoConfiguration("Icontracts","InsuranceContracts");
			System.out.println("multipleTestData  : "+multipleTestData5);
			for (HashMap<String, String> testData5 : multipleTestData5)
			{
		
			
				IC.Entercontractname(testData5.get("ContractName"));
				IC.Entercontractnumber(testData5.get("ContractNumber"));
				IC.EnterContractAmount(testData5.get("ContractAmount"));
				IC.ContractAmountType();
				IC.ContractAmountTypeValue();
				IC.EnterMaximumCoverage(testData5.get("MaximumCoverage"));
				IC.SelectMaxcoveragecurrency();
				IC.SelectMaxcoveragecurrencyvalue();
				IC.SelectInsuranceType();
				IC.SelectInsuranceTypevalue();
				
				
			/*	IC.SelectContractType();
				IC.SelectContractTypeValue();*/
				IC.SelectContractLevel();
				IC.SelectContractLevelValue();
				IC.SelectPriortyLevel();
				IC.SelectPriortyLevelValue();
				IC.SelectPrioritysublevel();
				IC.SelectPrioritysublevelvalue();
				IC.SelectMaintenanceStatus();
				IC.SelectMaintenanceStatusValue();
				IC.EnterEffectiveDate(testData5.get("EffectiveDate"));
				IC.EnterEnddate(testData5.get("Enddate"));
				IC.EnterRemovaldate(testData5.get("Removaldate"));
				IC.EnterNotes(testData5.get("Notes"));
				IC.BasicSave();
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Insurance --> "+testData5.get("ContractName")+" created Successfully ");
				
				}
				else
				{
					Common.fail(driver,"Insurance -->"+testData5.get("ContractName")+" is not created successfully ");
					
				}
				try{IC.BasicSaveOk();;}catch(Exception ex){ex.printStackTrace();} 
				
				IC.EnterResponseTime(testData5.get("ResponseTime"));
				IC.clickResponseTimeunit();
				IC.clickResponseTimeunitvalue();
				//WC.clickVendorSearch();
				//Thread.sleep(500);
				//MC.ClickTypePageCount();
				//MC.ClickTypePageCountValue();
				//Thread.sleep(800);
				//WC.SelectVendorSearchValue();
				//WC.SelectVendorSearchValueOK();
				//WC.EnterPhone1(testData.get("Phone1"));
				//WC.EnterPhone2(testData.get("Phone2"));
				//WC.EnterEmailAddress(testData.get("EmailAddress"));
				//WC.EnterWebsite(testData.get("Website"));
				Thread.sleep(500);
				IC.SelectProvidedby();
				IC.SelectProvidedbyvalue();
				IC.EnterStartDate(testData5.get("StartDate"));
				IC.EnterEndDate(testData5.get("EndDate"));
				IC.EnterRemovalDate(testData5.get("RemovalDate"));
				IC.EnterPremiumDueDate(testData5.get("PremiumDueDate"));
				IC.EnterPremiumDueAmount(testData5.get("PremiumDueAmount"));
				
				IC.EnterPremiumDueCurrency();
				IC.SelectPremiumDueCurrencyValue();
				
				IC.EnterInsuranceContractCoPayment(testData5.get("MaintenanceContractCoPayment"));
				IC.EnterInsuranceContractCoPaymentCurrency();
				Thread.sleep(500);
				IC.SelectInsuranceContractCoPaymentCurrencyvalue();
				Thread.sleep(800);
				IC.ClickCoversLoaner();
				Thread.sleep(500);
				IC.ClickCoversshipping();
				IC.ClickOtherSave();
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Other Information for --> "+testData5.get("ContractName")+" is saved Successfully");
				
				}
				else
				{
					Common.fail(driver,"Other Information for -->"+testData5.get("ContractName")+" is not saved Successfully");
					
				}
				try{IC.ClickOtherSaveokpopup();;;}catch(Exception ex){ex.printStackTrace();} 
				
		//*******************************************Extended Warranty tab test cases*************************		
				//Thread.sleep(500);
				/*IC.SelectExtendedWarrantyTab();
				Thread.sleep(500);
				IC.SelectExntedVendorSearch();
				Thread.sleep(500);
				IC.SelectExtendedVendorValue();
				IC.SelectExtendedVendorOrganizationOk();
				Thread.sleep(500);
				IC.SelectWarrantyCost(testData3.get("WarrantyCost"));
				IC.SelectWarrantyCostCurrency();
				IC.SelectWarrantyCostCurrencyValue();
				IC.SelectExtendedWarrantyStartDate(testData3.get("ExtendedWarrantyStartDate"));
				IC.SelectExtendedWarrantyEndDate(testData3.get("WarrantyEndDate"));
				IC.SelectExtendedWarrantySave();
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Warranty Cost --> "+testData3.get("WarrantyCost")+" created Successfully for "+testData3.get("ContractName"));
				
				}
				else
				{
					Common.fail(driver,"Warranty Cost -->"+testData3.get("WarrantyCost")+" is not created successfully for "+testData3.get("ContractName"));
					
				}
				try{IC.SelectExtendedWarrantySaveOK();;}catch(Exception ex){ex.printStackTrace();} */
			
				
		//*****************************************Documents Seciton********************************
				Thread.sleep(500);
				IC.ClickDocumentsTab();
				Thread.sleep(1000);
				IC.clickDocumentsCreateNew();
				
				List<HashMap<String, String>> multipleTestData6 = getContractsInfoConfiguration(testData5.get("ContractName"),"InsuranceDocuments");
				System.out.println("multipleTestData  : "+multipleTestData6);
				for (HashMap<String, String> testData6 : multipleTestData6)
				{
					
					IC.EnterDocTitle(testData6.get("DocTitle"));
					IC.EnterDocVersionNo(testData6.get("DocVersionNo"));
					IC.EnterDocDescription(testData6.get("DocDescription"));
					IC.Documentupload(testData6.get("Documentupload"));
					IC.clickDocSaveNew();
					//WC.clickDocSave();
					
					if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
					{
						Common.info("Document --> "+testData6.get("DocTitle")+" created Successfully for "+testData5.get("ContractName"));
					
					}
					else
					{
						Common.fail(driver,"Document -->"+testData6.get("DocTitle")+" is not created successfully for "+testData5.get("ContractName"));
						
					}
					try{IC.clickDocSaveokpopup();;}catch(Exception ex){ex.printStackTrace();} 
					
				}

				IC.clickDocCancel();
				
				Thread.sleep(1000);
				IC.clickContractItemsTab();
				Thread.sleep(500);
				IC.clickContractItemsCreateNew();
				Thread.sleep(500);
				IC.SelectContractItemSelection();
				Thread.sleep(500);
				/*WC.ClickTypePageCount();
				WC.ClickTypePageCountValue();
				Thread.sleep(500);*/
				IC.ClickContractAddItemClass();
				Thread.sleep(500);
				IC.clickContractAddItemokpopup();
				
				//IC.clickContractItemCancel();
				//Thread.sleep(1500);
				//WC.clickOtherInformationSave();
				Thread.sleep(2000);
				IC.clickOtherInformationSavenew();
				IC.clickOtherInformationSavenewOk();
				
			Common.pass("Test Passed");
			Common.endtest();
		}
			//MC.clickOtherInformationCancel();
		}
		catch(Exception e)
		{
			Common.fail(driver, "Test Failed");
			Common.endtest();
			throw e;
		}
	}

}
