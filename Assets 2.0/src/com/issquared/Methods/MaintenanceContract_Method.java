package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.MaintenanceContract;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class MaintenanceContract_Method extends BaseTest{
	    WebDriver driver;
	    MaintenanceContract MC;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public MaintenanceContract_Method(WebDriver driver) {
			this.driver = driver;
			MC = new MaintenanceContract(driver);
		}
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
				Common.logTrace("multipleTestData  : "+multipleTestData);
				for (HashMap<String, String> testData : multipleTestData)
				{
					String tempName = testData.get("ContractName")+Common.getUniqueID(5);
					Thread.sleep(1000);
					MC.Entercontractname(tempName);
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
						Common.info("Maintenance --> "+tempName+" created Successfully ");
						Common.logTrace("Maintenance --> "+tempName+" created Successfully ");
					}
					else
					{
						Common.fail(driver,"Maintenance -->"+tempName+" is not created successfully ");
						Common.logTrace("Maintenance -->"+tempName+" is not created successfully ");
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
						Common.info("Other Information for --> "+tempName+" is saved Successfully");
						Common.logTrace("Other Information for --> "+tempName+" is saved Successfully");
					}
					else
					{
						Common.fail(driver,"Other Information for -->"+tempName+" is not saved Successfully");
						Common.logTrace("Other Information for -->"+tempName+" is not saved Successfully");
					}
					try{
					MC.ClickOtherSaveokpopup();;;}catch(Exception ex){ex.printStackTrace();} 
					MC.ClickDocumentsTab();
					Thread.sleep(1000);
					MC.clickDocumentsCreateNew();
					
					List<HashMap<String, String>> multipleTestData1 = getContractsInfoConfiguration(testData.get("ContractName"),"MaintenanceDocuments");
					Common.logTrace("multipleTestData  : "+multipleTestData1);
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
							Common.logTrace("Document --> "+testData1.get("DocTitle")+" created Successfully for "+testData.get("ContractName"));
						}
						else
						{
							Common.fail(driver,"Document -->"+testData1.get("DocTitle")+" is not created successfully for "+testData.get("ContractName"));
							Common.logTrace("Document -->"+testData1.get("DocTitle")+" is not created successfully for "+testData.get("ContractName"));
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

		
		
}
