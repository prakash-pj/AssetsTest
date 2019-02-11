package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.TestCases.BaseTest;
import com.issquared.PageObjects.AssignUserToManagerRole;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;

public class AssignUserToManagerRole_Method extends BaseTest{
	 WebDriver driver;
	 AssignUserToManagerRole assignUserToManagerRole;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public AssignUserToManagerRole_Method(WebDriver driver) {
			this.driver = driver;
			assignUserToManagerRole = new AssignUserToManagerRole(driver);
		}
	
		public void createAssignUserToManagerRole() throws Exception {
			 try
			 {
				    Common.starttest("createAssignUserToManagerRole");
			 		Common.assignCategory("Login");
			 		assignUserToManagerRole = PageFactory.initElements(driver,AssignUserToManagerRole.class);
			 		Thread.sleep(3000);
			 		assignUserToManagerRole.selectTopMenu();
				    Thread.sleep(2000);
				    assignUserToManagerRole.selectGlobalFromTopMenu();
				    Thread.sleep(2000);
			 		assignUserToManagerRole.Dashboard();
			 		Thread.sleep(1000);
			 		assignUserToManagerRole.ClickAdministration();
			 		assignUserToManagerRole.ApplicationRoles();
					List<HashMap<String, String>> multipleTestData = getTestAssignUserToManagerRole("AssignUserToRole","AssignUserToRole");
					Common.logTrace("multipleTestData  : "+ multipleTestData);
					for (HashMap<String, String> testData : multipleTestData)
					{
						Thread.sleep(2000);
						assignUserToManagerRole.RecordsperPage();
						Thread.sleep(500);
						assignUserToManagerRole.RecordsperPageValue();
						Thread.sleep(1000);
						assignUserToManagerRole.SelectAssetManager(testData.get("AssetManager"));
						assignUserToManagerRole.Edit();
						assignUserToManagerRole.ManagerMemberAssignedCreateNew();
						assignUserToManagerRole.SelecUsersToRole();
						assignUserToManagerRole.PopupSave();
						assignUserToManagerRole.SuccessMessageOK();
						assignUserToManagerRole.Back();
						assignUserToManagerRole.RecordsperPage();
						assignUserToManagerRole.RecordsperPageValue();
						assignUserToManagerRole.SelectWarehouseManager(testData.get("WareHouseManager"));
						assignUserToManagerRole.Edit();
						assignUserToManagerRole.ManagerMemberAssignedCreateNew();
						assignUserToManagerRole.SelecUsersToRole();
						assignUserToManagerRole.PopupSave();
						Thread.sleep(1000);
						
						if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
						{
							Common.info("Users added in AssetManger Role successfully");
							Common.info("Users added in WarehouseManger Role successfully");
						}
						else
						{
							Common.fail(driver,"Users Not added in AssetManger Role");
							Common.fail(driver,"Users Not added in WarehouseManger Role");
							Common.captureScreenShot("fileName");
						}
						try{
							assignUserToManagerRole.SuccessMessageOK();;
						Thread.sleep(1000);
						}catch(Exception ex){ex.printStackTrace();
						}
						
						assignUserToManagerRole.Back();
					}
					Common.pass("Test Passed");
				    Common.endtest();
				 
			 }catch(Exception e)
				{
					Common.fail(driver, "Test Failed");
					Common.endtest();
					throw e;
				}
	
	
	
	
		}
	
	
	
	

}
