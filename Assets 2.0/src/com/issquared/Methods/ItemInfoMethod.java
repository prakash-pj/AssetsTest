package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.issquared.Common.Common;
import com.issquared.TestCases.BaseTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.issquared.PageObjects.AttributesforItemTypes;
import com.issquared.PageObjects.ItemClass;
import com.issquared.PageObjects.ItemSubType;
import com.issquared.PageObjects.ItemType;
import com.issquared.PageObjects.Items;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;

public class ItemInfoMethod extends BaseTest{
		WebDriver driver;
		ItemClass AC;
		ItemType ItemType;
		ItemSubType ItemSType;
		Items Item;
		AttributesforItemTypes Attrb;
		TadminLogin TadminLogin;	 
		ITestResult result;
	    ExtentReports extent;
	    ExtentTest test;
	    LogStatus status;
	    Common commonUtil;
	    
	    public ItemInfoMethod(WebDriver driver) {
			this.driver = driver;
			AC = new ItemClass(driver);
		}
	    
			@Test 
			public void createItemClass() throws Exception {
				try
				{
					Common.starttest("Creating item class");
					Common.assignCategory("Creating item class");
					AC = PageFactory.initElements(driver,ItemClass.class);
					AC.SelectAssetsDashboard();
					AC.selectIteminfodropdwon();
					List<HashMap<String, String>> multipleTestData = getTestAssetItemsConfiguration("Itmcls","Class");
					System.out.println("multipleTestData  : "+multipleTestData);
					for (HashMap<String, String> testData : multipleTestData)
					{
						System.out.println("Item Class Execution InProgress");
						
						AC.ClickItemsclass();
						AC.clickNew();
		
						AC.EnterItemClassName(testData.get("ClassName"));
						AC.UploadItemClassImage(testData.get("ImagePath"));
						AC.EnterItemDescription(testData.get("Description"));
						AC.EnterItemNotes(testData.get("Notes"));
						//AC.ClickItemClassSave();
						Thread.sleep(2000);
						AC.ClickItemClassSaveNew();
						Thread.sleep(2000);
						if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
						{
							Common.info("Item Class --> "+testData.get("ClassName")+" created Successfully");
							
						}
						else
						{
							Common.fail(driver,"Item Class --> "+testData.get("ClassName")+" not created Successfully");
						}
						try{
							AC.	ClickItemClassSaveokbtn();
							
							}catch(Exception ex){
								ex.printStackTrace();
								} 
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
			//	AC.clickItemSubtypeCancel();
			}
					
			@Test
			public void createItemType() throws Exception
			{
				try
				{
					Common.starttest("Creating Item types");
					Common.assignCategory("Creating item types");
					ItemType = PageFactory.initElements(driver, ItemType.class);
					Thread.sleep(2000);
					ItemType.SelectAssetsDashboard();
					ItemType.selectIteminfodropdwon();
					ItemType.selectItemsType();
					List<HashMap<String, String>> multipleTestData = getTestAssetItemsConfiguration("Itmcls","Class");
					System.out.println("multipleTestData  : "+multipleTestData);
					for (HashMap<String, String> testData : multipleTestData)
					{
						ItemType.ClickItemTypeCreateNew();
						Thread.sleep(500);
						ItemType.ClickItemClassSearch();
						Thread.sleep(1000);
				     	ItemType.ClickPageCount();
						ItemType.SelectPageCountValue();
						ItemType.SelectItemClassByName(testData.get("ClassName"));
						ItemType.ClickItemClassOk();
						List<HashMap<String, String>> multipleTestData1 = getTestAssetItemsConfiguration(testData.get("ClassName"),"Types");
						System.out.println("multipleTestData  : "+multipleTestData1);
						for (HashMap<String, String> testData1 : multipleTestData1)
						{
							ItemType.EnterItemtypename(testData1.get("TypeName"));
							ItemType.UploadItemtypeImage(testData1.get("ImagePath"));
							ItemType.EnterItemTypeDescription(testData1.get("Description"));
						    //ItemType.EnterItemTypeNotes(testData1.get("ItemTypeNotes"));
							ItemType.ClickItmeTypesavenew();
							
							if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
							{
								Common.info("Item Type --> "+testData1.get("TypeName")+" created Successfully");
							}
							else
							{
								Common.fail(driver,"Item Type -->"+testData1.get("TypeName")+" is not created successfully");
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
			
			
	       @Test 
			public void createItemSubType() throws Exception
			{
				try
				{
					Common.starttest("Creating item subtypes");
					Common.assignCategory("Creating item subtypes");
					ItemSType = PageFactory.initElements(driver, ItemSubType.class);
					ItemSType.SelectAssetsDashboard();
					ItemSType.selectIteminfodropdwon();
					ItemSType.selectItemsSubType();
					
					
					List<HashMap<String, String>> multipleTestData = getTestAssetItemsConfiguration("Itmcls","Class");
					System.out.println("multipleTestData  : "+multipleTestData);
					for (HashMap<String, String> testData : multipleTestData)
					{
						List<HashMap<String, String>> multipleTestData1 = getTestAssetItemsConfiguration(testData.get("ClassName"),"Types");
						System.out.println("multipleTestData  : "+multipleTestData1);
						for (HashMap<String, String> testData1 : multipleTestData1)
						{
							ItemSType.ClickItemTypeCreateNew();
							ItemSType.ClickItemClassSearch();
							ItemSType.ClickPageCount();
							ItemSType.SelectPageCountValue();
							//ItemSType.SelectItemClassByName(testData.get("ClassName"));
							ItemSType.SelectItemClassByName();
							ItemSType.ClickItemClassOk();
							ItemSType.ClickItemTypeSearch();
							Thread.sleep(1000);
							ItemSType.ClickTypePageCount();
							ItemSType.SelectTypePageCountValue();
							//ItemSType.SelectItemTypeByName(testData1.get("TypeName"));
							ItemSType.SelectItemTypeByName();
							ItemSType.ClickItemTypeOk();
							Thread.sleep(2000);
							List<HashMap<String, String>> multipleTestData2 = getTestAssetItemsConfiguration(testData1.get("TypeName"),"Subtypes");
							System.out.println("multipleTestData  : "+multipleTestData2);
							for (HashMap<String, String> testData2 : multipleTestData2)
							{
								ItemSType.EnterItemSubtypename(testData2.get("SubtypeName"));
								ItemSType.UploadItemtypeImage(testData2.get("ImagePath"));
								ItemSType.EnterItemTypeDescription(testData2.get("Description"));
								//ItemSType.EnterItemTypeNotes(testData2.get("Notes"));
								ItemSType.ClickItmeTypesavenew();
								//ItemSType.ClickItmeTypeSave();
								
								if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
								{
									Common.info("Item Type --> "+testData2.get("SubtypeName")+" created Successfully");
									//ItemSType.ClickItmeTypeBack();
								}
								else
								{
									Common.fail(driver,"Item Type -->"+testData2.get("SubtypeName")+" is not created successfully");
								}
								try{
									ItemSType.ClickItemTypeOKbutn();
								}catch(Exception ex){
									ex.printStackTrace();
								} 
							}
							ItemSType.ClickItmeTypeBack();
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
			
			
	   @Test
	   public void createSKUItems() throws Exception
	   {
		try
		{
			Common.starttest("Create Masters SKUs and Item names");
			Common.assignCategory("Creating items");
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
					    Item.SelectItemTypeByName();
						Item.SelectItemTypeOk();

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
							Thread.sleep(2000);
							Item.ClickItemsExternallinks();
							Thread.sleep(800);
							Item.ClickItemsExternalSkuselection();
							Item.EnterItemName(testData3.get("ItemName"));
							Item.EnterItemSKU(testData3.get("SKUNumber"));
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
								Item.SelectNamePageCountValue();
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
								Item.EnterItemSerialNumber(testData5.get("SerialNumber"));
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
									Common.info("Item --> "+testData5.get("SerialNumber")+" created Successfully");
								
								}
								else
								{
									Common.fail(driver,"Item -->"+testData5.get("SerialNumber")+" is not created successfully");
									
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
			
			//		
			@Test (priority=4,enabled = false)  
			public void createItemTypesAttributes() throws Exception {
				try
				{
					Common.starttest("Creating item types attributes");
					Attrb = PageFactory.initElements(driver, AttributesforItemTypes.class);
					Attrb.SelectAssetsDashboard();
					Attrb.selectIteminfodropdwon();
					Attrb.selectItemsType();
					Thread.sleep(500);
					Attrb.SelectItemTypeTableGrid();
					Thread.sleep(500);
					Attrb.ClickTypePageCount();
					Attrb.ClickTypePageCountValue();
					Thread.sleep(800);
					List<HashMap<String, String>> multipleTestData = getTestItemTypesAttributes("Itypes","ItemTypes");
					System.out.println("multipleTestData  : "+multipleTestData);
					for (HashMap<String, String> testData : multipleTestData)
					{
						Attrb.SelectItemTypeByName(testData.get("TypeName"));
						Attrb.ClickItemTypeEdit();
						Attrb.ClickItemTypeExternallinks();
						Attrb.SelectItemTypeAttribute();
						
						Attrb.SelectAttributeNew();
						
						List<HashMap<String, String>> multipleTestData1 = getTestItemTypesAttributes(testData.get("TypeName"),"AttributesSections");
						System.out.println("multipleTestData  : "+multipleTestData1);
						for (HashMap<String, String> testData1 : multipleTestData1)
						{
							Attrb.SelectAddSection();
							Attrb.EnterSectionName(testData1.get("Section Name"));
							Attrb.SelectSectionType();
							Attrb.SelectSectionValue();
							Attrb.ClickSectionSave();
							if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
							{
								Common.info("Section --> "+testData1.get("Section Name")+" created Successfully for "+testData.get("TypeName"));
							
							}
							else
							{
								Common.fail(driver,"Section Name -->"+testData1.get("Section Name")+" is not created successfully for "+testData.get("TypeName"));
								
							}
							try{Attrb.ClickSectionSaveOk();}catch(Exception ex){ex.printStackTrace();} 
						}
						
						List<HashMap<String, String>> multipleTestData2 = getTestItemTypesAttributes(testData.get("TypeName"),"AttributesSections");
						System.out.println("multipleTestData  : "+multipleTestData2);
						for (HashMap<String, String> testData2 : multipleTestData2)
						{
							List<HashMap<String, String>> multipleTestData3 = getTestItemTypesAttributes(testData2.get("Section Name"),"Attributes");
							System.out.println("multipleTestData  : "+multipleTestData3);
							for (HashMap<String, String> testData3 : multipleTestData3)
							{
								Attrb.SelectAttributeNew();
								Attrb.EnterAttributeName(testData3.get("AttributeName"));
								if(testData3.get("Is Required").equals("Yes"))
								{
									Attrb.SelectIsRequired();
								}
								Attrb.SelectAttributeType();
								Attrb.SelectAttributeValue();
								Attrb.ClickSectionTypedrop();
								Attrb.ClickSectionTypeByValue(testData2.get("Section Name"));
								Thread.sleep(800);
								Attrb.ClickAttributeSave();
								
								if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
								{
									Common.info("Attribute --> "+testData3.get("AttributeName")+" created Successfully for section '"+testData2.get("Section Name")+"'");
								
								}
								else
								{
									Common.fail(driver,"Attribute --> "+testData3.get("AttributeName")+" not created Successfully for section '"+testData2.get("Section Name")+"'");
									
								}
								try{Attrb.ClickAttributeSaveOK();}catch(Exception ex){ex.printStackTrace();} 
							}
						}
						Attrb.SelectAssetsDashboard();
						Attrb.selectIteminfodropdwon();
						Attrb.selectItemsType();
						Thread.sleep(500);
						Attrb.SelectItemTypeTableGrid();
						Thread.sleep(500);
						Attrb.ClickTypePageCount();
						Attrb.ClickTypePageCountValue();
						Thread.sleep(800);
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
			//	AC.clickItemSubtypeCancel();
			}	
			
			
			
		}
