package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.PageObjects.AttributesforItemTypes;
import com.issquared.PageObjects.Items;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class Items_Method extends BaseTest{
	    WebDriver driver;
	    Items Item;
		AttributesforItemTypes Attrb;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public Items_Method(WebDriver driver) {
			this.driver = driver;
			Item = new Items(driver);
		}
		
		public void createSKUItems() throws Exception
		{
		try
		{
			Common.starttest("Create Masters SKUs and Item names");
			Common.assignCategory("Create Masters SKUs and Item names");
			Item = PageFactory.initElements(driver, Items.class);
			/*Item.SelectAssetsDashboard();
			Item.selectIteminfodropdwon();
			Item.selectItems();
			Thread.sleep(2000);
			Item.selectItemSKU_AdvnceSearch();
			Thread.sleep(2000);
			*/
			
			List<HashMap<String, String>> multipleTestData = getTestAssetItemsConfiguration("Itmcls","Class");
			//List<HashMap<String, String>> multipleTestData = getTestAssetItemsConfiguration("Desktop","Class");
			System.out.println("multipleTestData  : "+multipleTestData);
			for (HashMap<String, String> testData : multipleTestData)
			{
				List<HashMap<String, String>> multipleTestData1 = getTestAssetItemsConfiguration(testData.get("ClassName"),"Types");
				System.out.println("multipleTestData  : "+multipleTestData1);
				for (HashMap<String, String> testData1 : multipleTestData1)
				{
					List<HashMap<String, String>> multipleTestData2 = getTestAssetItemsConfiguration(testData1.get("TypeName"),"Subtypes");
					System.out.println("multipleTestData  : "+multipleTestData2);
					for (HashMap<String, String> testData2 : multipleTestData2)
					{
						
						Thread.sleep(2000);
						Item.SelectAssetsDashboard();
						Item.selectIteminfodropdwon();
						Item.selectItems();
						Thread.sleep(2000);
						Item.selectItemSKU_AdvnceSearch();
						Thread.sleep(2000);
						
						Thread.sleep(2000);
						Item.ClickItemClassSearch();
						Thread.sleep(2000);
						Item.ClickPageCount();
						Thread.sleep(2000);
						Item.SelectPageCountValue();
						Thread.sleep(1000);
						//Item.SelectItemClassByName(testData.get("ClassName"));
						Item.SelectItemClassByName();
						Item.ClickItemClassOk();
					
						Item.ClickItemTypeSearch();
						Thread.sleep(1000);
						Item.ClickTypePageCount();
						Thread.sleep(1000);
					    Item.ClickTypePageCountValue();
						//Item.SelectItemTypeByName(testData1.get("TypeName"));
					    Thread.sleep(1000);
					    Item.SelectItemTypeByName();
						Item.SelectItemTypeOk();
						Thread.sleep(1000);
						Item.ClickItemsubtypeSearch();
						Thread.sleep(1000);
						Item.ClicksubtypePageCount();
						Thread.sleep(1000);
						Item.SelectsubtypePageCountValue();
						//Item.SelectItemSubTypeByName(testData2.get("SubtypeName"));
						Item.SelectItemSubTypeByName();
						Item.ClickItemsubtypeOk();
						Item.ClickItemCreateNew();
						Thread.sleep(800);
					    // Create SKUs from External links
						List<HashMap<String, String>> multipleTestData3 = getTestAssetItemsConfiguration(testData2.get("SubtypeName"),"ItemSKU");
						System.out.println("multipleTestData  : "+multipleTestData3);
						for (HashMap<String, String> testData3 : multipleTestData3)
						{
							String tempName = testData3.get("SKUNumber")+Common.getUniqueID(5);
							Common.logTrace("Master SKU Execution InProgress");
							Thread.sleep(2000);
							Item.ClickItemsExternallinks();
							Thread.sleep(800);
							Item.ClickItemsExternalSkuselection();
							//Item.EnterItemName(testData3.get("ItemName"));
							Item.EnterItemName(testData3.get("ItemName"));
							Item.EnterItemSKU(tempName);
							Item.EnterItemDescription(testData3.get("SKUDescription"));
							Item.ClickItemmNameSave();
							if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
							{
								Common.info("Item SKU --> "+testData3.get("ItemName")+" created Successfully");
							
							}
							else
							{
								Common.fail(driver,"Item SKU -->"+testData3.get("ItemName")+" is not created successfully");
							}
							try{Item.ClickItemmNameSaveOk();}catch(Exception ex){ex.printStackTrace();} 	
							Item.BackExtItemSKU();
							
						}
						
						List<HashMap<String, String>> multipleTestData4 = getTestAssetItemsConfiguration(testData2.get("SubtypeName"),"ItemSKU");
						System.out.println("multipleTestData  : "+multipleTestData4);
						for (HashMap<String, String> testData4 : multipleTestData4)
						{
							List<HashMap<String, String>> multipleTestData5 = getTestAssetItemsConfiguration(testData4.get("ItemName"),"Items");
							System.out.println("multipleTestData  : "+multipleTestData5);
							for (HashMap<String, String> testData5 : multipleTestData5)
							{
								String tempName2 = testData4.get("SerialNumber")+Common.getUniqueID(3);
								Common.logTrace("Items creation Execution InProgress");
								Item.ClickItemnameSearch();
								Thread.sleep(2000);
								Item.ClickNamePageCount();
								Thread.sleep(2000);
								Item.SelectNamePageCountValue();
								Thread.sleep(2000);
								Item.SelectItemByName(testData4.get("ItemName"));
								Item.ClickItemNameOk();
								Item.warehouseSelection();
								Thread.sleep(1000);
								Item.ClickNamePageCount();
								Thread.sleep(2000);
								Item.SelectNamePageCountValue();
								Thread.sleep(2000);
								Item.SelectWarehouseByName(testData5.get("Warehouse"));
								Thread.sleep(2000);
								Item.ClickwarehouseNameOk();
								Thread.sleep(2000);
								Item.assetpoolSelection();
								Thread.sleep(1000);
								Item.ClickNamePageCount();
								Item.SelectNamePageCountValue();
								Item.SelectAssetpoolByName(testData5.get("Assetpool"));
								Item.ClickAssetpoolNameOk();
								Item.EnterItemSerialNumber(tempName2);
								Thread.sleep(2000);
								Item.EnterPurchaseOrderNumber(testData5.get("PurchaseOrderNumber"));
								Item.TotalItemCost(testData5.get("TotalItemCost"));
								Item.TotalItemCostValue();
								
								if(testData5.get("IsWarehouse").contains("Yes"))
								{
									Thread.sleep(2000);
									Item.ClickIsWarehouse();
								}
								Thread.sleep(1000);
								Item.ClickItemSaveNew();
								
								if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
								{
									Common.info("Item --> "+testData5.get("ItemName")+" created Successfully");
									Common.logTrace("Item --> "+testData5.get("ItemName")+" created Successfully");
								
								}
								else
								{
									Common.fail(driver,"Item -->"+testData5.get("ItemName")+" is not created successfully");
									
								}
								try{
									Item.ClickItemSaveNewOk();
									}catch(Exception ex){
										
										ex.printStackTrace();
										} 
							      }
								
							}
						Item.ClickBackItems();
						}
					
						//Item.ClickBackItems();
					}
				}
			
			Common.pass("TestPassed");
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
			