package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.issquared.Common.Common;
import com.issquared.PageObjects.WORKFLOW_Recertification;
import com.issquared.PageObjects.WORKFLOW_WorkflowRequest;
import com.issquared.TestCases.BaseTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WORKFLOW_Method extends BaseTest{
	WebDriver driver;
    WORKFLOW_WorkflowRequest workflowRequest;
	WORKFLOW_Recertification recertification;
	ITestResult result;
    ExtentReports extent;
    ExtentTest test;
    LogStatus status;
    
    
    @Test 
	public void createWorkflowRequest_7Level() throws Exception {
		
		try
		{
			Common.starttest("Workflow Creation Started");
			Common.assignCategory("Workflow Creation Started");
			workflowRequest = PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		    Thread.sleep(1000);
		    workflowRequest.SelectAssetsDashboard();
		    Thread.sleep(1000);
		    workflowRequest.SelectWORKFLOWdropdown();
		    Thread.sleep(500);
		    workflowRequest.ClickOnWorkflowRequest();
		    Thread.sleep(1000);
			List<HashMap<String, String>> multipleTestData = getTestWORKFLOW("workflowRequest","workflowRequest");
			System.out.println("multipleTestData  : "+multipleTestData);
			for (HashMap<String, String> testData : multipleTestData) {
			System.out.println("Workflow Creation InProgress");	
			
			workflowRequest.ClickOnNew();
			workflowRequest.WorkflowName(testData.get("WorkflowName"));
			workflowRequest.WorkflowDescription(testData.get("Description"));
			workflowRequest.Dragstart();
			Thread.sleep(2000);
			workflowRequest.DragApprovalbyManager();
			Thread.sleep(2000);
			workflowRequest.DragApprovalbyLocationManager();
			Thread.sleep(2000);
			workflowRequest.DragApprovalbyCostCenterManager();
			Thread.sleep(2000);
			workflowRequest.DragApprovalbyCustomUser();
			Thread.sleep(2000);
			workflowRequest.DragNotifications();
			Thread.sleep(2000);
			workflowRequest.DragCustomUserNotification();
			Thread.sleep(2000);
			workflowRequest.DragApprovalbyDepartmentHead();
			Thread.sleep(1000);
			workflowRequest.scrollUp();
			workflowRequest.DragStop();
			Thread.sleep(1000);
			
			workflowRequest.Stage_1(testData.get("Stage1"));
			workflowRequest.SupervisorLevel_1(testData.get("SupervisorLevel"));
			workflowRequest.EmailTemplate1();
			workflowRequest.EmailTemplate1_Value();
			Thread.sleep(1000);
			//workflowRequest.DragApprovalbyLocationManager();
			workflowRequest.Stage_2(testData.get("Stage2"));
			workflowRequest.EmailTemplate2();
			workflowRequest.EmailTemplate2_Value();
			
			//workflowRequest.DragApprovalbyCostCenterManager();
			workflowRequest.Stage_3(testData.get("Stage3"));
			workflowRequest.EmailTemplate3();
			workflowRequest.EmailTemplate3_Value();
			
			//workflowRequest.DragApprovalbyCustomUser();
			workflowRequest.Stage_4(testData.get("Stage4"));
			workflowRequest.CustomUserName_Approval();
			Thread.sleep(1000);
			workflowRequest.ClickPageCount();
			Thread.sleep(1000);
			workflowRequest.SelectPageCountValue();
			workflowRequest.CustomUserName_Approval_checkbox();
			workflowRequest.CustomUserName_Approval_Popup_OK();
			workflowRequest.EmailTemplate4();
			workflowRequest.EmailTemplate4_Value();
			
			//workflowRequest.DragNotifications();
			workflowRequest.Stage_5(testData.get("Stage5"));
			Thread.sleep(1000);
			workflowRequest.NotificationToDropdown();
			Thread.sleep(1000);
			workflowRequest.NotificationToValue();
			workflowRequest.EmailTemplate5();
			workflowRequest.EmailTemplate5_Value();
			
			//workflowRequest.DragCustomUserNotification();
			workflowRequest.Stage_6(testData.get("Stage6"));
			workflowRequest.CustomUserName_Notification();
			workflowRequest.ClickPageCount();
			workflowRequest.SelectPageCountValue();
			workflowRequest.CustomUserName_Notification_checkbox();
			workflowRequest.CustomUserName_Notification_Popup_OK();
			workflowRequest.EmailTemplate6();
			workflowRequest.EmailTemplate6_Value();
			
			
			//workflowRequest.DragApprovalbyDepartmentHead();
			workflowRequest.Stage_7(testData.get("Stage7"));
			workflowRequest.EmailTemplate7();
			workflowRequest.EmailTemplate7_Value();
			
			Thread.sleep(1000);
			workflowRequest.ClickOnSaveWorkflowButton();
			Thread.sleep(1000);
			
			if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
			{
				Common.info("workflow Record --> "+testData.get("WorkflowName")+" created Successfully ");
			
			}
			else
			{
				Common.fail(driver,"workflow Record-->"+testData.get("WorkflowName")+" is not created successfully ");
				
			}
			try{
				workflowRequest.PopupOK();
				;}catch(Exception ex){ex.printStackTrace();}  
			
			
			workflowRequest.ClickOnBack();
			
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
	
	@Test (priority=9)
	public void createRecertification() throws Exception {
		    
		try
		{
			Common.starttest("Recertification Creation Started");
		    Thread.sleep(2000);
		    Common.assignCategory("Recertification Creation Started");
		    recertification = PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		    recertification.SelectAssetsDashboard();
		    Thread.sleep(1000);
		    recertification.SelectWORKFLOWdropdown();
		    recertification.ClickOnWorkflowRecertification();
			List<HashMap<String, String>> multipleTestData = getTestWORKFLOW("recertification","recertification");
			System.out.println("multipleTestData  : "+multipleTestData);
			for (HashMap<String, String> testData : multipleTestData) {
			System.out.println("Recertification Creation InProgress");	
	
			recertification.ClickOnNew();
			recertification.WorkflowName(testData.get("RecertificationName"));
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
				Common.info("Recertification --> "+testData.get("RecertificationName")+" created Successfully ");
			
			}
			else
			{
				Common.fail(driver,"Recertification -->"+testData.get("RecertificationName")+" is not created successfully ");
				
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
