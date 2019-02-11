package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.PageObjects.ItemType;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class ItemType_Method extends BaseTest{
	 WebDriver driver;
		ItemType ItemType;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public ItemType_Method(WebDriver driver) {
			this.driver = driver;
			ItemType = new ItemType(driver);
		}
		
		public void createItemType() throws Exception
		{
			try
			{
				Common.starttest("Creating Item types");
				Common.assignCategory("Creating Item types");
				ItemType = PageFactory.initElements(driver, ItemType.class);
				Thread.sleep(2000);
				ItemType.SelectAssetsDashboard();
				ItemType.selectIteminfodropdwon();
				ItemType.selectItemsType();
				List<HashMap<String, String>> multipleTestData = getTestAssetItemsConfiguration("Itmcls","Class");
				//Common.logTrace("multipleTestData  : "+multipleTestData);
				for (HashMap<String, String> testData : multipleTestData)
				{
					//String tempName = testData.get("TypeName")+Common.getUniqueID(5);
					Common.logTrace("Item Type Execution InProgress");
					ItemType.ClickItemTypeCreateNew();
					Thread.sleep(500);
					ItemType.ClickItemClassSearch();
					Thread.sleep(1000);
			     	ItemType.ClickPageCount();
					ItemType.SelectPageCountValue();
					//ItemType.SelectItemClassByName(testData.get("ClassName"));
					ItemType.SelectFirstvalueFromPopup();
					ItemType.ClickItemClassOk();
					List<HashMap<String, String>> multipleTestData1 = getTestAssetItemsConfiguration(testData.get("ClassName"),"Types");
					//List<HashMap<String, String>> multipleTestData1 = getTestAssetItemsConfiguration("IT Assets-PNG7","Types");
					for (HashMap<String, String> testData1 : multipleTestData1)
					{
						String tempName = testData1.get("TypeName")+Common.getUniqueID(5);
						ItemType.EnterItemtypename(tempName);
						ItemType.UploadItemtypeImage(testData1.get("ImagePath"));
						ItemType.EnterItemTypeDescription(testData1.get("Description"));
					    //ItemType.EnterItemTypeNotes(testData1.get("ItemTypeNotes"));
						ItemType.ClickItmeTypesavenew();
						
						if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
						{
							Common.info("Item Type --> "+tempName+" created Successfully");
							Common.logTrace("Item Type --> "+tempName+" created Successfully");
						}
						else
						{
							Common.fail(driver,"Item Type -->"+tempName+" is not created successfully");
						}
						try{
							ItemType.ClickItemTypeOKbutn();
							}catch(Exception ex){
								ex.printStackTrace();
								} 
					}
					ItemType.ClickItmeTypeBack();
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
