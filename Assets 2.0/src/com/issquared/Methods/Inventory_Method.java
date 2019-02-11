package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.issquared.Common.Common;
import com.issquared.PageObjects.Inventory;
import com.issquared.TestCases.BaseTest;

public class Inventory_Method extends BaseTest {
	WebDriver driver;
	Inventory inventory;
	
	 public Inventory_Method(WebDriver driver) {
	    	this.driver = driver;
	    	inventory = new Inventory(driver);
		}
	 
	 @Test 
		public void createInventory() throws Exception {
			try
			{
				Common.starttest("Inventory Search ....");
				Common.assignCategory("Inventory Search ....");
				inventory = PageFactory.initElements(driver, Inventory.class);
			    Thread.sleep(2000);
			    List<HashMap<String, String>> multipleTestData = getTestCaseInventory("InUsers","Sheet1");
			    System.out.println("multipleTestData  : "+multipleTestData);
			    for (HashMap<String, String> testData : multipleTestData) {
				System.out.println("Inventory Search Execution is In-Progress");
				//customers.organizationName.clear();
				inventory.selectInventory();
				inventory.searchBox.clear();
			    inventory.EnterSearchItemName(testData.get("SearchItem"));
			    inventory.clickSearchButton();
			    Thread.sleep(1000);
			    inventory.ClickOnFirstValue();
			    Thread.sleep(1000);
			    inventory.clickonExportPDF();
			    Thread.sleep(2000);
			    inventory.clickonExportExcel();
			    Thread.sleep(2000);
			    inventory.clickonHold();
			    Thread.sleep(2000);
			    inventory.clickonRepair();
			    Thread.sleep(2000);
			    inventory.clickonDisposal();
			    Thread.sleep(2000);
			    inventory.clickonRec_ExportPDF();
			    Thread.sleep(500);
			    inventory.clickonRec_ExportExcel();
			    Thread.sleep(500);
			    inventory.clickonRec_Pending();
			    Thread.sleep(2000);
			    inventory.clickonRec_InProcess();
			    Thread.sleep(2000);
			    inventory.clickonRec_Recertified();
			    Thread.sleep(2000);
			    inventory.clickonRec_Rejected();
			    Thread.sleep(2000);
			    inventory.clickonBack();
			    Common.info("Inventory Search for Item--> "+testData.get("SearchItem")+" Working Properly");
				try{
				Thread.sleep(4000);
				}catch(Exception ex){
					ex.printStackTrace();
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
