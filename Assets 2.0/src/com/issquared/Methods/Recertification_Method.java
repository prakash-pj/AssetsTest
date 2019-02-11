package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.PageObjects.WORKFLOW_Recertification;
import com.issquared.PageObjects.WORKFLOW_WorkflowRequest;
import com.issquared.TestCases.BaseTest;

public class Recertification_Method extends BaseTest{
	    WebDriver driver;
	    WORKFLOW_Recertification recertification;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public Recertification_Method(WebDriver driver) {
			this.driver = driver;
			recertification = new WORKFLOW_Recertification(driver);
		}
		public void createRecertification() throws Exception {
		    
			try
			{
				Common.starttest("Recertification Creation Started");
				Common.assignCategory("Recertification Creation Started");
				recertification = PageFactory.initElements(driver,WORKFLOW_Recertification.class);
			    Thread.sleep(2000);
			    recertification.SelectAssetsDashboard();
			    Thread.sleep(1000);
			    recertification.SelectWORKFLOWdropdown();
			    recertification.ClickOnWorkflowRecertification();
				List<HashMap<String, String>> multipleTestData = getTestWORKFLOW("recertification","recertification");
				Common.logTrace("multipleTestData  : "+multipleTestData);
				for (HashMap<String, String> testData : multipleTestData) {
				String tempName = testData.get("RecertificationName")+Common.getUniqueID(5);
				Common.logTrace("Recertification Creation InProgress");	
				recertification.ClickOnNew();
				recertification.WorkflowName(tempName);
				recertification.WorkflowDescription(testData.get("Description"));
				recertification.Interval(testData.get("Interval"));
				Thread.sleep(2000);
				recertification.Dragstart();
				Thread.sleep(2000);
				recertification.SelectNotifications();
				Thread.sleep(2000);
				recertification.SelectRecursive();
				Thread.sleep(2000);
				recertification.SelectEscalation();
				Thread.sleep(4000);
				recertification.scrollUp();
				Thread.sleep(2000);
				recertification.DragStop();
				Thread.sleep(2000);
				
				//Stage1 Notification
				recertification.Stage1(testData.get("StageName1"));
				recertification.NumofDaysBefore_Stage1(testData.get("NumofDaysBefore1"));
				recertification.EmailTemplate1();
				recertification.EmailTemplate1_Value();
				recertification.Role_Stage1();
				recertification.Role_Value_Stage1();
				
				//Stage2 Recursive
				recertification.Stage2(testData.get("StageName2"));
				recertification.NumofDaysBefore_Stage2(testData.get("NumofDaysBefore2"));
				recertification.Frequency(testData.get("Frequency"));
				recertification.MaximumNumofTimes(testData.get("MaximumNumofTimes"));
				recertification.EmailTemplate2();
				recertification.EmailTemplate2_Value();
				recertification.Role_Stage2();
				recertification.Role_Value_Stage2();
				
				// Stage3 Escalation
				recertification.Stage3(testData.get("StageName3"));
				recertification.NumofDaysBefore_Stage3(testData.get("NumofDaysBefore3"));
				recertification.EmailTemplate3();
				recertification.EmailTemplate3_Value();
				recertification.Role_Stage3();
				recertification.Role_Value_Stage3();
				recertification.ClickOnSave();
				Thread.sleep(500);
				
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Recertification --> "+tempName+" created Successfully ");
					Common.logTrace("Recertification --> "+tempName+" created Successfully ");
				}
				else
				{
					Common.fail(driver,"Recertification -->"+tempName+" is not created successfully ");
					Common.logTrace("Recertification -->"+tempName+" is not created successfully ");
				}
				try{
					recertification.PopupOK();
					;}catch(Exception ex){ex.printStackTrace();} 
				
				Thread.sleep(500);
				recertification.ClickOnBack();
				
				Common.pass("Test Passed");
				Common.endtest();
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
