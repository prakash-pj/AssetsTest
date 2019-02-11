package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.PageObjects.AttributesforItemTypes;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;
import ExtentReportListener.ExtentReporterNG;

public class Attribute_Method extends BaseTest{
	    WebDriver driver;
		AttributesforItemTypes Attrb;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public Attribute_Method(WebDriver driver) {
			this.driver = driver;
			Attrb = new AttributesforItemTypes(driver);
		}
		
		public void createItemTypesAttributes() throws Exception {
			try
			{
				Common.starttest("Creating item types attributes");
				Common.assignCategory("Creating item types attributes");
				Common.logTrace("Attributes creation Execution InProgress");
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
				Common.logTrace("multipleTestData  : "+multipleTestData);
				for (HashMap<String, String> testData : multipleTestData)
				{
					
					Attrb.SelectItemTypeByName(testData.get("TypeName"));
					Attrb.ClickItemTypeEdit();
					Attrb.ClickItemTypeExternallinks();
					Attrb.SelectItemTypeAttribute();
					
					Attrb.SelectAttributeNew();
					
					List<HashMap<String, String>> multipleTestData1 = getTestItemTypesAttributes(testData.get("TypeName"),"AttributesSections");
					Common.logTrace("multipleTestData  : "+multipleTestData1);
					for (HashMap<String, String> testData1 : multipleTestData1)
					{
						String tempName = testData.get("Section Name")+Common.getUniqueID(5);
						Attrb.SelectAddSection();
						Attrb.EnterSectionName(testData1.get("Section Name"));
						Attrb.SelectSectionType();
						Attrb.SelectSectionValue();
						Attrb.ClickSectionSave();
						if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
						{
							Common.info("Section --> "+tempName+" created Successfully for "+testData.get("TypeName"));
							Common.logTrace("Section --> "+tempName+" created Successfully for "+testData.get("TypeName"));
						
						}
						else
						{
							Common.fail(driver,"Section Name -->"+tempName+" is not created successfully for "+testData.get("TypeName"));
							
						}
						try{Attrb.ClickSectionSaveOk();}catch(Exception ex){ex.printStackTrace();} 
					}
					
					List<HashMap<String, String>> multipleTestData2 = getTestItemTypesAttributes(testData.get("TypeName"),"AttributesSections");
					Common.logTrace("multipleTestData  : "+multipleTestData2);
					for (HashMap<String, String> testData2 : multipleTestData2)
					{
						List<HashMap<String, String>> multipleTestData3 = getTestItemTypesAttributes(testData2.get("Section Name"),"Attributes");
						Common.logTrace("multipleTestData  : "+multipleTestData3);
						for (HashMap<String, String> testData3 : multipleTestData3)
						{
							String tempName1 = testData.get("AttributeName")+Common.getUniqueID(5);
							Attrb.SelectAttributeNew();
							Attrb.EnterAttributeName(tempName1);
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
								Common.logTrace("Attribute --> "+testData3.get("AttributeName")+" created Successfully for section '"+testData2.get("Section Name")+"'");
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
			