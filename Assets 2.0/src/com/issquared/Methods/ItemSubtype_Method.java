package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.PageObjects.ItemSubType;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class ItemSubtype_Method extends BaseTest{
	    WebDriver driver;
	    ItemSubType ItemSType;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public ItemSubtype_Method(WebDriver driver) {
			this.driver = driver;
			ItemSType = new ItemSubType(driver);
		}
		
	
			public void createitemSubType() throws Exception
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
					Common.logTrace("multipleTestData  : "+multipleTestData);
					for (HashMap<String, String> testData : multipleTestData)
					{
						List<HashMap<String, String>> multipleTestData1 = getTestAssetItemsConfiguration(testData.get("ClassName"),"Types");
						Common.logTrace("multipleTestData  : "+multipleTestData1);
						for (HashMap<String, String> testData1 : multipleTestData1)
						{
							
							ItemSType.ClickItemTypeCreateNew();
							ItemSType.ClickItemClassSearch();
							Thread.sleep(2000);
							ItemSType.ClickPageCount();
							Thread.sleep(1000);
							ItemSType.SelectPageCountValue();
							//ItemSType.SelectItemClassByName(testData.get("ClassName"));
							ItemSType.SelectItemClassByName();
							ItemSType.ClickItemClassOk();
							ItemSType.ClickItemTypeSearch();
							Thread.sleep(1000);
							ItemSType.ClickTypePageCount();
							ItemSType.SelectTypePageCountValue();
							//ItemSType.SelectItemTypeByName(testData1.get("TypeName"));
							Thread.sleep(2000);
							ItemSType.SelectItemTypeByName();
							ItemSType.ClickItemTypeOk();
							Thread.sleep(2000);
							List<HashMap<String, String>> multipleTestData2 = getTestAssetItemsConfiguration(testData1.get("TypeName"),"Subtypes");
							Common.logTrace("multipleTestData  : "+multipleTestData2);
							for (HashMap<String, String> testData2 : multipleTestData2)
							{
								String tempName = testData2.get("SubtypeName")+Common.getUniqueID(5);
								Common.logTrace("Item Subtype Execution InProgress");
								ItemSType.EnterItemSubtypename(tempName);
								ItemSType.UploadItemtypeImage(testData2.get("ImagePath"));
								ItemSType.EnterItemTypeDescription(testData2.get("Description"));
								//ItemSType.EnterItemTypeNotes(testData2.get("Notes"));
								ItemSType.ClickItmeTypesavenew();
								//ItemSType.ClickItmeTypeSave();
								
								if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
								{
									Common.info("Item SubType --> "+tempName+" created Successfully");
									Common.logTrace("Item SubType --> "+tempName+" created Successfully");
								}
								else
								{
									Common.fail(driver,"Item SubType -->"+tempName+" is not created successfully");
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
			}
			