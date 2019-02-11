package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.PageObjects.WORKFLOW_WorkflowRequest;
import com.issquared.TestCases.BaseTest;

public class Workflows_Method extends BaseTest{
	    WebDriver driver;
	    WORKFLOW_WorkflowRequest workflowRequest;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public Workflows_Method(WebDriver driver) {
			this.driver = driver;
			workflowRequest = new WORKFLOW_WorkflowRequest(driver);
		}
		
		public void createWorkflowRequest_7Level() throws Exception {
			
			try
			{
				Common.starttest("Workflow Creation Started");
				Common.assignCategory("Workflow Creation Started");
				workflowRequest = PageFactory.initElements(driver,WORKFLOW_WorkflowRequest.class);
			    Thread.sleep(1000);
			    workflowRequest.SelectAssetsDashboard();
			    Thread.sleep(1000);
			    workflowRequest.SelectWORKFLOWdropdown();
			    Thread.sleep(500);
			    workflowRequest.ClickOnWorkflowRequest();
			    Thread.sleep(1000);
				List<HashMap<String, String>> multipleTestData = getTestWORKFLOW("workflowRequest","workflowRequest");
				Common.logTrace("multipleTestData  : "+multipleTestData);
				for (HashMap<String, String> testData : multipleTestData) {
				String tempName = testData.get("WorkflowName")+Common.getUniqueID(5);	
				Common.logTrace("Workflow Creation InProgress");
				workflowRequest.ClickOnNew();
				workflowRequest.WorkflowName(tempName);
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
				Thread.sleep(2000);
				workflowRequest.ClickPageCount();
				Thread.sleep(1000);
				workflowRequest.SelectPageCountValue();
				workflowRequest.CustomUserName_Notification_checkbox();
				workflowRequest.CustomUserName_Notification_Popup_OK();
				workflowRequest.EmailTemplate6();
				workflowRequest.EmailTemplate6_Value();
				
				Thread.sleep(2000);
				//workflowRequest.DragApprovalbyDepartmentHead();
				workflowRequest.Stage_7(testData.get("Stage7"));
				workflowRequest.EmailTemplate7();
				workflowRequest.EmailTemplate7_Value();
				
				Thread.sleep(1000);
				workflowRequest.ClickOnSaveWorkflowButton();
				Thread.sleep(1000);
				
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("workflow Record --> "+tempName+" created Successfully ");
					Common.logTrace("workflow Record --> "+tempName+" created Successfully ");
				}
				else
				{
					Common.fail(driver,"workflow Record-->"+tempName+" is not created successfully ");
					Common.logTrace("workflow Record-->"+tempName+" is not created successfully ");
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
		
		
}
