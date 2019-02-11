package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.PageObjects.InsuranceContracts;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class InsuranceContract_Method extends BaseTest{
	    WebDriver driver;
	    InsuranceContracts IC;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public InsuranceContract_Method(WebDriver driver) {
			this.driver = driver;
			IC = new InsuranceContracts(driver);
		}
		public void createInsuranceContract() throws Exception {
			try
			{
				Common.starttest("Creating Insurance Contracts");
				Common.assignCategory("Creating Insurance Contracts");
				IC = PageFactory.initElements(driver, InsuranceContracts.class);
				IC.SelectAssetsDashboard();
				Thread.sleep(1000);
				IC.selectcontractdropdwon();
				Thread.sleep(3000);
				IC.clickInsuranceContracts();
				IC.clickNew();
				Thread.sleep(1000);
				List<HashMap<String, String>> multipleTestData5 = getContractsInfoConfiguration("Icontracts","InsuranceContracts");
				Common.logTrace("multipleTestData  : "+multipleTestData5);
				Common.logTrace("Creating Insurance Contracts");
				for (HashMap<String, String> testData5 : multipleTestData5)
				{
					String tempName = testData5.get("ContractName")+Common.getUniqueID(5);
					IC.Entercontractname(tempName);
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
						Common.info("Insurance --> "+tempName+" created Successfully ");
						Common.logTrace("Insurance --> "+tempName+" created Successfully ");
					}
					else
					{
						Common.fail(driver,"Insurance -->"+tempName+" is not created successfully ");
						Common.logTrace("Insurance -->"+tempName+" is not created successfully ");
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
						Common.info("Other Information for --> "+tempName+" is saved Successfully");
						Common.logTrace("Other Information for --> "+tempName+" is saved Successfully");
					}
					else
					{
						Common.fail(driver,"Other Information for -->"+tempName+" is not saved Successfully");
						Common.logTrace("Other Information for -->"+tempName+" is not saved Successfully");
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
					Common.logTrace("multipleTestData  : "+multipleTestData6);
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
							Common.logTrace("Document --> "+testData6.get("DocTitle")+" created Successfully for "+testData5.get("ContractName"));
						}
						else
						{
							Common.fail(driver,"Document -->"+testData6.get("DocTitle")+" is not created successfully for "+testData5.get("ContractName"));
							Common.logTrace("Document -->"+testData6.get("DocTitle")+" is not created successfully for "+testData5.get("ContractName"));
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
