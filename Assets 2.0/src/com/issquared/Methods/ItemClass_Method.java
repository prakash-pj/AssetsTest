package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.PageObjects.ItemClass;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class ItemClass_Method extends BaseTest{
    WebDriver driver;
    ItemClass itemClass;
	TadminLogin TadminLogin;
	LoginPage login;
	
	public ItemClass_Method(WebDriver driver) {
		this.driver = driver;
		itemClass = new ItemClass(driver);
	}

	public void createItemClass() throws Exception {
		 try
		 {
			Common.intReport();
			Common.starttest("createItemClass");
	 		Common.assignCategory("Login");
	 		itemClass = PageFactory.initElements(driver,ItemClass.class);
	 		itemClass.SelectAssetsDashboard();
			itemClass.selectIteminfodropdwon();
			
			List<HashMap<String, String>> multipleTestData = getTestAssetItemsConfiguration("Itmcls","Class");
			Common.logTrace("multipleTestData  : "+ multipleTestData);
			for (HashMap<String, String> testData : multipleTestData)
			{
				String tempName = testData.get("ClassName")+Common.getUniqueID(5);
				Common.logTrace("Item Class Execution InProgress");
				itemClass.ClickItemsclass();
				itemClass.clickNew();
				//itemClass.EnterItemClassName(testData.get("ClassName"));
				itemClass.EnterItemClassName(tempName);
				itemClass.UploadItemClassImage(testData.get("ImagePath"));
				itemClass.EnterItemDescription(testData.get("Description"));
				itemClass.EnterItemNotes(testData.get("Notes"));
				//AC.ClickItemClassSave();
				Thread.sleep(2000);
				itemClass.ClickItemClassSaveNew();
				Thread.sleep(2000);
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Item Class --> "+tempName+" created Successfully");
					Common.logTrace("Item Class --> "+tempName+" created Successfully");
					
				}
				else
				{
					Common.fail(driver,"Item Class --> "+tempName+" not created Successfully");
				}
				try{
					itemClass.ClickItemClassSaveokbtn();
					
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
}
	}
