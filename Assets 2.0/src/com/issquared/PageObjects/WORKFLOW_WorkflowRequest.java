package com.issquared.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class WORKFLOW_WorkflowRequest {
	private WebDriver driver;
	Common commonUtil;
	
	/*Constructor */
	public WORKFLOW_WorkflowRequest(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	
	@FindBy(xpath="//*[@id='side-menu']/li[1]/a/span")
    public WebElement selectAssetsDashboard;
	
	@FindBy(xpath="//div[1]/div/div/div[1]/div[1]/a/div/div")
    public WebElement selectassets;
	
	@FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
	public WebElement Dashboard; 
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement PageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement PageCountValue;
	
	@FindBy(xpath="//*[text()='Workflow' and @class='nav-label']")
    public WebElement selectWORKFLOWdropdown;
	
	@FindBy(xpath="//*[@id='781']/a")
    public WebElement selectWorkflowRequest;
	
	@FindBy(xpath="//*[@id='btn_New']")
    public WebElement clickOnNew;
	
	@FindBy(xpath="//*[@id='Name']")
    public WebElement workflowName;
	
	@FindBy(xpath="//*[@id='Description']")
    public WebElement workflowDescription;
	
	@FindBy(xpath="//*[@id='draggable']/div")
    public WebElement selectSTART;
	
	@FindBy(xpath=".//*[@id='wfStages']")
	public WebElement dropworkflow;
	
	@FindBy(xpath="//*[@id='wfStages']/div[2]/div[2]")
	public WebElement dropworkflow2;
	
	@FindBy(xpath="//*[@title='Stop']")
    public WebElement selectSTOP;
	
	@FindBy(xpath="//*[@title='Approval by Supervisor']")
    public WebElement selectApprovalbyManager;
	
	@FindBy(xpath="//*[@id='StageName0']")
    public WebElement supervisorStageName;
	
	@FindBy(xpath="//*[@id='SupervisorLevel0']")
    public WebElement supervisorStageLevel;
	
	@FindBy(xpath="//*[@id='EmailTemplateId0']")
    public WebElement supervisorEmailTemplate;
	
	@FindBy(xpath="//*[@title='Approval by Cost Center Manager']")
    public WebElement selectApprovalbyCostCenterManager;
	
	//Stage1
		@FindBy(xpath=".//*[@id='StageName0']")
		public WebElement Stage1;
		
		
	//Stage2	
		
		
		@FindBy(xpath=".//*[@id='StageName1']")
		public WebElement Stage2;
		
	//Stage3
		@FindBy(xpath=".//*[@id='StageName2']")
		public WebElement Stage3;
		
		
	//Stage4	
		
		
		@FindBy(xpath="//*[@id='StageName3']")
		public WebElement Stage4;
		
	//Stage5
		@FindBy(xpath=".//*[@id='StageName4']")
		public WebElement Stage5;
				
				
	//Stage6	
				
				
	   @FindBy(xpath=".//*[@id='StageName5']")
		public WebElement Stage6;	
	   
	 //Stage7	
		
	   @FindBy(xpath=".//*[@id='StageName6']")
		public WebElement Stage7; 
	   
	 //Email Template1  
	   @FindBy(xpath="//*[@id='EmailTemplateId0']")
		public WebElement emailTemplate1; 
	   
	   @FindBy(xpath="//*[@id='EmailTemplateId0']/option[2]")
		public WebElement emailTemplate1_Value; 
	
	 //Email Template2  
	   @FindBy(xpath="//*[@id='EmailTemplateId1']")
		public WebElement emailTemplate2; 
	   
	   @FindBy(xpath="//*[@id='EmailTemplateId1']/option[2]")
		public WebElement emailTemplate2_Value; 
	   
	   
	 //Email Template3  
	   @FindBy(xpath="//*[@id='EmailTemplateId2']")
		public WebElement emailTemplate3; 
	   
	   @FindBy(xpath="//*[@id='EmailTemplateId2']/option[2]")
		public WebElement emailTemplate3_Value; 
	   
	 //Email Template4  
	   @FindBy(xpath="//*[@id='EmailTemplateId3']")
		public WebElement emailTemplate4; 
	   
	   @FindBy(xpath="//*[@id='EmailTemplateId3']/option[2]")
		public WebElement emailTemplate4_Value;
	   
	 //Email Template5 
	   @FindBy(xpath="//*[@id='EmailTemplateId4']")
		public WebElement emailTemplate5; 
	   
	   @FindBy(xpath="//*[@id='EmailTemplateId4']/option[2]")
		public WebElement emailTemplate5_Value; 
	   
	   
	 //Email Template6  
	   @FindBy(xpath="//*[@id='EmailTemplateId5']")
		public WebElement emailTemplate6; 
	   
	   @FindBy(xpath="//*[@id='EmailTemplateId5']/option[2]")
		public WebElement emailTemplate6_Value;
	   
	   
	 //Email Template7  
	   @FindBy(xpath="//*[@id='EmailTemplateId6']")
		public WebElement emailTemplate7; 
	   
	   @FindBy(xpath="//*[@id='EmailTemplateId6']/option[2]")
		public WebElement emailTemplate7_Value;
	   
	 
	   // SupervisorLevel_to Approve
	   @FindBy(xpath="//*[@id='SupervisorLevel0']")
		public WebElement supervisorLevel_1;
	   
	   @FindBy(xpath="//*[@id='SupervisorLevel1']")
		public WebElement supervisorLevel_2;
	   
	   @FindBy(xpath="//*[@id='SupervisorLevel2']")
		public WebElement supervisorLevel_3;
	   
	   @FindBy(xpath="//*[@id='SupervisorLevel3']")
		public WebElement supervisorLevel_4; 
	   
	   @FindBy(xpath="//*[@id='SupervisorLevel4']")
		public WebElement supervisorLevel_5;
	   
	   @FindBy(xpath="//*[@id='SupervisorLevel5']")
		public WebElement supervisorLevel_6;
	   
	   @FindBy(xpath="//*[@id='SupervisorLevel6']")
		public WebElement supervisorLevel_7;
	   
	// UserSelection
	   
	   @FindBy(xpath="//*[@id='wfStages']/div[5]/div[2]/div/div[1]/div[2]/div/div/span/a/b")
		public WebElement customUserName_Approval;
	 
	   @FindBy(xpath="//*[@id='Ok-AssetReqestedBy']/div")
		public WebElement customUserName_Approval_Popup_OK;
	   
	   @FindBy(xpath="//*[@id='wfStages']/div[7]/div[2]/div/div[1]/div[2]/div/div/span/a/b")
		public WebElement customUserName_Notification;
	   
	   @FindBy(xpath="//*[@id='Ok-AssetReqestedBy']/div")
		public WebElement customUserName_Notification_Popup_OK;
	   
	 
	@FindBy(xpath="//*[@id='RoleId2']")
	public WebElement notificationToDropdown;
	   
	@FindBy(xpath="//*[@id='RoleId2']/option[2]")
	public WebElement notificationToValue;
	   
	@FindBy(xpath="//*[@title='Approval by Location Manager']")
    public WebElement selectApprovalbyLocationManager;
	
	@FindBy(xpath="//*[@title='Approval by Custom User']")
    public WebElement selectApprovalbyCustomUser;
	
	@FindBy(xpath="//*[@class='showmenubox']//*[@title='Notifications']")
    public WebElement selectNotifications;
	
	@FindBy(xpath="//*[@class='showmenubox']//*[@title='Custom User Notification']")
    public WebElement selectCustomUserNotification;
	
	@FindBy(xpath="//*[@title='Approval by Department Head']")
    public WebElement selectApprovalbyDepartmentHead;
	
	@FindBy(xpath="//*[@id='saveWorkflow']")
    public WebElement selectSaveWorkflowButton;
	
	@FindBy(xpath="//*[@id='back']")
    public WebElement selectBack;
	
	@FindBy(xpath="//*[@id='clear']")
    public WebElement selectDeleteAll;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	public WORKFLOW_WorkflowRequest SelectAssetsDashboard() throws InterruptedException {
		Common.click(selectAssetsDashboard);
		return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
	}

	
	public WORKFLOW_WorkflowRequest selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
	}

	
	public WORKFLOW_WorkflowRequest SelectWORKFLOWdropdown() throws InterruptedException {
		Common.click(selectWORKFLOWdropdown);
		return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
	}


	public WORKFLOW_WorkflowRequest ClickOnWorkflowRequest() throws InterruptedException {
		Common.click(selectWorkflowRequest);
		return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
	}
	
	public WORKFLOW_WorkflowRequest ClickOnNew() throws InterruptedException {
		Common.click(clickOnNew);
		return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
	}
	
	public WORKFLOW_WorkflowRequest WorkflowName(String workflow_Name) throws InterruptedException {
		workflowName.sendKeys(workflow_Name);
		return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
	}
	
	public WORKFLOW_WorkflowRequest WorkflowDescription(String workflow_Description) throws InterruptedException {
		workflowDescription.sendKeys(workflow_Description);
		return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
	}
	
	 public WORKFLOW_WorkflowRequest Dragstart() throws InterruptedException {
			
		 Common.draganddrop(selectSTART, dropworkflow);
		 
		 return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	
	 public WORKFLOW_WorkflowRequest DragStop() throws InterruptedException {
			
		 Common.draganddrop(selectSTOP, dropworkflow);
		 
		 return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest DragApprovalbyManager() throws InterruptedException {
			
		 Common.draganddrop(selectApprovalbyManager, dropworkflow);
		 
		 return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest DragApprovalbyCostCenterManager() throws InterruptedException {
			
		 Common.draganddrop(selectApprovalbyCostCenterManager, dropworkflow);
		 
		 return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	
	 public WORKFLOW_WorkflowRequest DragApprovalbyLocationManager() throws InterruptedException {
			
		 Common.draganddrop(selectApprovalbyLocationManager, dropworkflow2);
		 
		 return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}

	 public WORKFLOW_WorkflowRequest DragApprovalbyCustomUser() throws InterruptedException {
			
		 Common.draganddrop(selectApprovalbyCustomUser, dropworkflow2);
		 
		 return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}

	 public WORKFLOW_WorkflowRequest DragNotifications() throws InterruptedException {
			
		 Common.draganddrop(selectNotifications, dropworkflow2);
		 
		 return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}

	 public WORKFLOW_WorkflowRequest DragCustomUserNotification() throws InterruptedException {
			
		 Common.draganddrop(selectCustomUserNotification, dropworkflow2);
		 
		 return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}

	 public WORKFLOW_WorkflowRequest DragApprovalbyDepartmentHead() throws InterruptedException {
			
		 Common.draganddrop(selectApprovalbyDepartmentHead, dropworkflow2);
		 
		 return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest Stage_1(String stage_1) throws InterruptedException {
		 Stage1.sendKeys(stage_1);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest Stage_2(String stage_2) throws InterruptedException {
		 Stage2.sendKeys(stage_2);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest Stage_3(String stage_3) throws InterruptedException {
		 Stage3.sendKeys(stage_3);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest Stage_4(String stage_4) throws InterruptedException {
		 Stage4.sendKeys(stage_4);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest Stage_5(String stage_5) throws InterruptedException {
		 Stage5.sendKeys(stage_5);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest Stage_6(String stage_6) throws InterruptedException {
		 Stage6.sendKeys(stage_6);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest Stage_7(String stage_7) throws InterruptedException {
		 Stage7.sendKeys(stage_7);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest SupervisorStageName(String workflow_Name) throws InterruptedException {
		 supervisorStageName.sendKeys(workflow_Name);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest SupervisorLevel(String supervisor_Level) throws InterruptedException {
			workflowName.sendKeys(supervisor_Level);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest EmailTemplate1() throws InterruptedException {
			Common.click(emailTemplate1);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest EmailTemplate1_Value() throws InterruptedException {
			Common.click(emailTemplate1_Value);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest EmailTemplate2() throws InterruptedException {
			Common.click(emailTemplate2);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest EmailTemplate2_Value() throws InterruptedException {
			Common.click(emailTemplate2_Value);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest EmailTemplate3() throws InterruptedException {
			Common.click(emailTemplate3);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest EmailTemplate3_Value() throws InterruptedException {
			Common.click(emailTemplate3_Value);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest EmailTemplate4() throws InterruptedException {
			Common.click(emailTemplate4);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest EmailTemplate4_Value() throws InterruptedException {
			Common.click(emailTemplate4_Value);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 
	 public WORKFLOW_WorkflowRequest EmailTemplate5() throws InterruptedException {
			Common.click(emailTemplate5);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest EmailTemplate5_Value() throws InterruptedException {
			Common.click(emailTemplate5_Value);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest EmailTemplate6() throws InterruptedException {
			Common.click(emailTemplate6);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest EmailTemplate6_Value() throws InterruptedException {
			Common.click(emailTemplate6_Value);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 
	 public WORKFLOW_WorkflowRequest EmailTemplate7() throws InterruptedException {
			Common.click(emailTemplate7);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest EmailTemplate7_Value() throws InterruptedException {
			Common.click(emailTemplate7_Value);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 
	 public WORKFLOW_WorkflowRequest SupervisorLevel_1(String supervisorLevel1) throws InterruptedException {
		 supervisorLevel_1.sendKeys(supervisorLevel1);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest SupervisorLevel_2(String supervisorLevel2) throws InterruptedException {
		 supervisorLevel_2.sendKeys(supervisorLevel2);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest SupervisorLevel_3(String supervisorLevel3) throws InterruptedException {
		 supervisorLevel_3.sendKeys(supervisorLevel3);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest SupervisorLevel_4(String supervisorLevel4) throws InterruptedException {
		 supervisorLevel_4.sendKeys(supervisorLevel4);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest SupervisorLevel_5(String supervisorLevel5) throws InterruptedException {
		 supervisorLevel_5.sendKeys(supervisorLevel5);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest SupervisorLevel_6(String supervisorLevel6) throws InterruptedException {
		 supervisorLevel_6.sendKeys(supervisorLevel6);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest SupervisorLevel_7(String supervisorLevel7) throws InterruptedException {
		 supervisorLevel_7.sendKeys(supervisorLevel7);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	
	
	public WORKFLOW_WorkflowRequest ClickOnSaveWorkflowButton() throws InterruptedException {
		Common.click(selectSaveWorkflowButton);
		return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
	}
	
	public WORKFLOW_WorkflowRequest ClickOnBack() throws InterruptedException {
		Common.click(selectBack);
		return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
	}
	
	public WORKFLOW_WorkflowRequest ClickOnDeleteAll() throws InterruptedException {
		Common.click(selectDeleteAll);
		return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
	}
	
	 public WORKFLOW_WorkflowRequest PopupOK() throws InterruptedException {
			Common.click(okpopup);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	
	 public WORKFLOW_WorkflowRequest CustomUserName_Notification() throws InterruptedException {
			Common.click(customUserName_Notification);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	
	 public WORKFLOW_WorkflowRequest CustomUserName_Notification_Popup_OK() throws InterruptedException {
			Common.click(customUserName_Notification_Popup_OK);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	
	 /*public WORKFLOW_WorkflowRequest CustomUserName_Notification_checkbox(String data) throws InterruptedException {
			Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
			Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}*/
	 
	 public WORKFLOW_WorkflowRequest CustomUserName_Notification_checkbox() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy')]"));
		    WebElement Element = links.get(2);
		    Common.click(Element);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest CustomUserName_Approval() throws InterruptedException {
			Common.click(customUserName_Approval);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	
	 /*public WORKFLOW_WorkflowRequest CustomUserName_Approval_checkbox(String data) throws InterruptedException {
			Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
			Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}*/
	 
	 public WORKFLOW_WorkflowRequest CustomUserName_Approval_checkbox() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy')]"));
		 
		    WebElement Element = links.get(2);
		    Common.click(Element);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest CustomUserName_Approval_Popup_OK() throws InterruptedException {
			Common.click(customUserName_Approval_Popup_OK);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest NotificationToDropdown() throws InterruptedException {
			Common.click(notificationToDropdown);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest NotificationToValue() throws InterruptedException {
			Common.click(notificationToValue);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 public ACTIONS_Dispose ClickPageCount() throws InterruptedException {
			Common.click(PageCount);
			return PageFactory.initElements(driver, ACTIONS_Dispose.class);
		}
		public ACTIONS_Dispose SelectPageCountValue() throws InterruptedException {
			Common.click(PageCountValue);
			return PageFactory.initElements(driver, ACTIONS_Dispose.class);
		}
	 
		 public WORKFLOW_WorkflowRequest scrollUp() throws InterruptedException {
				Common.scrollUp();
				return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
			}
	 
}
