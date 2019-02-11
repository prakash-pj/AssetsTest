package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.PageObjects.WarrantyContract;
import com.issquared.TestCases.BaseTest;

public class WarrantyContract_Method extends BaseTest{
	    WebDriver driver;
	    WarrantyContract WC;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public WarrantyContract_Method(WebDriver driver) {
			this.driver = driver;
			WC = new WarrantyContract(driver);
		}
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
				Common.logTrace("multipleTestData  : "+multipleTestData3);
				Common.logTrace("Creating Warranty Contracts");
				for (HashMap<String, String> testData3 : multipleTestData3)
				{
					String tempName = testData3.get("ContractName")+Common.getUniqueID(5);
					WC.Entercontractname(tempName);
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
						Common.info("Warranty --> "+tempName+" created Successfully ");
					
					}
					else
					{
						Common.fail(driver,"Warranty -->"+tempName+" is not created successfully ");
						
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
					Thread.sleep(500);
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
						Common.logTrace("Warranty Cost --> "+testData3.get("WarrantyCost")+" created Successfully for "+testData3.get("ContractName"));
					}
					else
					{
						Common.fail(driver,"Warranty Cost -->"+testData3.get("WarrantyCost")+" is not created successfully for "+testData3.get("ContractName"));
						Common.logTrace("Warranty Cost -->"+testData3.get("WarrantyCost")+" is not created successfully for "+testData3.get("ContractName"));
					}
					try{WC.SelectExtendedWarrantySaveOK();;}catch(Exception ex){ex.printStackTrace();} 
				
					
			//*****************************************Documents Seciton********************************
					Thread.sleep(500);
					WC.ClickDocumentsTab();
					Thread.sleep(1000);
					WC.clickDocumentsCreateNew();
					
					List<HashMap<String, String>> multipleTestData4 = getContractsInfoConfiguration(testData3.get("ContractName"),"WarrantyDocuments");
					Common.logTrace("multipleTestData  : "+multipleTestData4);
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
							Common.logTrace("Document --> "+testData4.get("DocTitle")+" created Successfully for "+testData3.get("ContractName"));
						}
						else
						{
							Common.fail(driver,"Document -->"+testData4.get("DocTitle")+" is not created successfully for "+testData3.get("ContractName"));
							Common.logTrace("Document -->"+testData4.get("DocTitle")+" is not created successfully for "+testData3.get("ContractName"));
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
		
		
}
