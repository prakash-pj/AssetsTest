package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.PageObjects.EmailTemplates;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class EmailTemplates_Method  extends BaseTest {
	
	WebDriver driver;
	EmailTemplates emailTemplates;
	TadminLogin TadminLogin;
	LoginPage login;
	
	public EmailTemplates_Method(WebDriver driver) {
		this.driver = driver;
		emailTemplates = new EmailTemplates(driver);
	}
	
	public void createEmailTemplates() throws Exception {
		 try
		 {
			    Common.starttest("createEmailTemplates");
		 		Common.assignCategory("Login");
		 		emailTemplates = PageFactory.initElements(driver,EmailTemplates.class);
		 		emailTemplates.selectTopMenu();
			    Thread.sleep(1000);
			    emailTemplates.selectAssetsFromTopMenu();
			    Thread.sleep(1000);
		 		emailTemplates.SelectAssetsDashboard();
		 		emailTemplates.SelectAdministration();
		 		emailTemplates.ClickEmailTemplates();
		 		List<HashMap<String, String>> multipleTestData = getEmailTemplates("EmailTemplates","EmailTemplate");
				Common.logTrace("multipleTestData  : "+ multipleTestData);
				for (HashMap<String, String> testData : multipleTestData)
				{
					String tempName = testData.get("RecertificationName")+Common.getUniqueID(5);
					Common.logTrace("EmailTemplates Execution InProgress");	
					Thread.sleep(1000);
					emailTemplates.CreateNew();
					emailTemplates.EmailTemplateName(testData.get("EmailTemplateName")+Common.getUniqueID(1));
					emailTemplates.EmailTemplateType();
					emailTemplates.EmailTemplateTypeValue();
					emailTemplates.EmailTemplateSubject(testData.get("TemplateSubject"));
					emailTemplates.Objects();
					emailTemplates.ObjectsValue();
					emailTemplates.IsNotification();
					emailTemplates.Description(testData.get("Description"));
					emailTemplates.Save();
					/*emailTemplates.PopupOk();
					emailTemplates.Cancel();*/
					if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
					{
						Common.info("EmailTemplate --> "+testData.get("EmailTemplateName")+" created Successfully");
						Common.logTrace("EmailTemplate --> "+testData.get("EmailTemplateName")+" created Successfully");
						
					}
					else
					{
						Common.fail(driver,"EmailTemplate --> "+testData.get("EmailTemplateName")+" not created Successfully");
					}
					try{
						emailTemplates.PopupOk();
						
						}catch(Exception ex){
							ex.printStackTrace();
							} 
					emailTemplates.Cancel();
				}
				Common.pass("Test Passed");
				Common.endtest();
		 } 
		 catch(Exception e)
			{
			    driver.navigate().back();
			    driver.navigate().back();
				Common.fail(driver, "Test Failed");
				Common.endtest();
				throw e;
			}
	
	    }
	}
	
	