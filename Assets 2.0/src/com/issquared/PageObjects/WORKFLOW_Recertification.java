package com.issquared.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class WORKFLOW_Recertification {
	
	private WebDriver driver;
	Common commonUtil;
	
	/*Constructor */
	public WORKFLOW_Recertification(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	
	@FindBy(xpath="//*[@id='side-menu']/li[1]/a/span")
    public WebElement selectAssetsDashboard;
	
	@FindBy(xpath="//div[1]/div/div/div[1]/div[1]/a/div/div")
    public WebElement selectassets;
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement PageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement PageCountValue;
	
	@FindBy(xpath="//*[text()='Workflow' and @class='nav-label']")
    public WebElement selectWORKFLOWdropdown;
	
	@FindBy(xpath="//*[@id='782']/a")
    public WebElement selectWorkflow_Recertification;
	
	@FindBy(xpath="//*[@id='btn_New']")
    public WebElement clickOnNew;
	
	
	@FindBy(xpath="//*[@id='Name']")
    public WebElement workflowName;
	
	@FindBy(xpath="//*[@id='Description']")
    public WebElement workflowDescription;
	
	@FindBy(xpath="//*[@id='Interval']")
    public WebElement interval;
	
	/*@FindBy(xpath="//*[@id='wfStages']")
	public WebElement dropworkflow;*/      
	
	@FindBy(xpath="//*[@class='content']//*[@id='wfStages']")
	public WebElement dropworkflow;
	
	
	@FindBy(xpath="//*[@id='wfStages']/div[2]/div[2]")
	public WebElement dropworkflow2;
	
	@FindBy(xpath="//*[@id='wfStages']/div[1]")
	public WebElement dropworkflow3;
	
	@FindBy(xpath="//*[@id='draggable']/div")
    public WebElement selectSTART;
	
	
	
	@FindBy(xpath="//*[@class='showmenubox']//*[@title='Notifications']")
    public WebElement selectNotifications;
	
	/*@FindBy(xpath="//*[@class='showmenubox']//*[@title='Recursive']")
    public WebElement selectRecursive;*/
	
	@FindBy(xpath="//*[@title='Recursive']")
    public WebElement selectRecursive;
	
	@FindBy(xpath="//*[@class='showmenubox']//*[@title='Escalation']")
    public WebElement selectEscalation;
	
	/*@FindBy(xpath="//*[@class='showmenubox']//*[@title='Stop']")
    public WebElement selectSTOP;*/
	
	@FindBy(xpath="//*[@title='Stop']")
    public WebElement selectSTOP;
	
	@FindBy(xpath="//*[@id='saveWorkflow']")
    public WebElement saveButton;
	
	@FindBy(xpath="//*[@id='back']")
    public WebElement backButton;
	
	@FindBy(xpath="//*[@id='clear']")
    public WebElement deleteAllButton;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	
	//"Number of days before" Stage wise
	
	@FindBy(xpath="//*[@id='NoOfDaysBefore0']")
    public WebElement numofDaysBefore_Stage1;
	
	@FindBy(xpath="//*[@id='NoOfDaysBefore1']")
    public WebElement numofDaysBefore_Stage2;
	
	@FindBy(xpath="//*[@id='NoOfDaysBefore2']")
    public WebElement numofDaysBefore_Stage3;
	
	// "Roles"_Stage Wise
	
	@FindBy(xpath="//*[@id='RoleOrUserType0']")
    public WebElement role_Stage1;
	
	@FindBy(xpath="//*[@id='RoleOrUserType0']/option[3]")
    public WebElement role_Value_Stage1;
	
	
	@FindBy(xpath="//*[@id='RoleOrUserType1']")
    public WebElement role_Stage2;
	
	@FindBy(xpath="//*[@id='RoleOrUserType1']/option[3]")
    public WebElement role_Value_Stage2;
	
	@FindBy(xpath="//*[@id='RoleOrUserType2']")
    public WebElement role_Stage3;
	
	@FindBy(xpath="//*[@id='RoleOrUserType2']/option[3]")
    public WebElement role_Value_Stage3;
	
	
	
	//Stage Name 1
		@FindBy(xpath="//*[@class='tnotify ttask task tsk1']//*[@id='StageName']")
		public WebElement stage1;
		
	//Stage Name2	
		
		
		@FindBy(xpath="//*[@class='tnotify ttask task tsk2']//*[@id='StageName']")
		public WebElement stage2;
		
	//Stage Name3
		@FindBy(xpath="//*[@class='tnotify ttask task tsk3']//*[@id='StageName']")
		public WebElement stage3;
		
	//Email Template1
		
		@FindBy(xpath="//*[@class='tnotify ttask task tsk1']//*[@id='EmailTemplateId']")
		public WebElement emailTemplate1;
		
		@FindBy(xpath="//*[@class='tnotify ttask task tsk1']//*[@id='EmailTemplateId']/option[2]")
		public WebElement emailTemplate1_Value;
		
	//Email Template2
		
			@FindBy(xpath="//*[@class='tnotify ttask task tsk2']//*[@id='EmailTemplateId']")
			public WebElement emailTemplate2;
			
			@FindBy(xpath="//*[@class='tnotify ttask task tsk2']//*[@id='EmailTemplateId']/option[2]")
			public WebElement emailTemplate2_Value;
			
	//Email Template3
			
		@FindBy(xpath="//*[@class='tnotify ttask task tsk3']//*[@id='EmailTemplateId']")
		public WebElement emailTemplate3;
		
		@FindBy(xpath="//*[@class='tnotify ttask task tsk3']//*[@id='EmailTemplateId']/option[2]")
		public WebElement emailTemplate3_Value;
		

		// Recursive 
		
		@FindBy(xpath="//*[@id='RecursiveFrequency']")
	    public WebElement frequency;
		
		@FindBy(xpath="//*[@id='TotalNoOfTimes']")
	    public WebElement maximumNumofTimes;
		
		
		
	public WORKFLOW_Recertification SelectAssetsDashboard() throws InterruptedException {
		Common.click(selectAssetsDashboard);
		return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
	}

	
	public WORKFLOW_Recertification selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
	}


	public WORKFLOW_Recertification SelectWORKFLOWdropdown() throws InterruptedException {
		Common.click(selectWORKFLOWdropdown);
		return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
	}


	public WORKFLOW_Recertification ClickOnWorkflowRecertification() throws InterruptedException {
		Common.click(selectWorkflow_Recertification);
		return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
	}
	
	public WORKFLOW_Recertification ClickOnNew() throws InterruptedException {
		Common.click(clickOnNew);
		return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
	}
	
	public WORKFLOW_Recertification WorkflowName(String workflow_Name) throws InterruptedException {
		workflowName.sendKeys(workflow_Name);
		return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
	}
	
	public WORKFLOW_Recertification WorkflowDescription(String workflow_Description) throws InterruptedException {
		workflowDescription.sendKeys(workflow_Description);
		return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
	}
	
	public WORKFLOW_Recertification Interval(String interval1) throws InterruptedException {
		interval.sendKeys(interval1);
		return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
	}
	
	 public WORKFLOW_Recertification Dragstart() throws InterruptedException {
			
		 Common.draganddrop(selectSTART, dropworkflow);
		 
		 return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	
	 public WORKFLOW_Recertification SelectNotifications() throws InterruptedException {
			
		 Common.draganddrop(selectNotifications, dropworkflow);
		 
		 return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	 
	 public WORKFLOW_Recertification SelectRecursive() throws InterruptedException {
		 Thread.sleep(500);	
		 Common.draganddrop(selectRecursive, dropworkflow2);
		 
		 return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	 
	 
	 public WORKFLOW_Recertification SelectEscalation() throws InterruptedException {
		
		 Common.draganddrop(selectEscalation, dropworkflow2);
		 
		 return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	 
	 public WORKFLOW_Recertification DragStop() throws InterruptedException {
		 
		 Common.draganddrop(selectSTOP, dropworkflow2);
		 
		 return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	 
	 public WORKFLOW_WorkflowRequest NumofDaysBefore_Stage1(String numofDaysBefore_Stage_1) throws InterruptedException {
		 numofDaysBefore_Stage1.sendKeys(numofDaysBefore_Stage_1);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	
	 public WORKFLOW_WorkflowRequest NumofDaysBefore_Stage2(String numofDaysBefore_Stage_2) throws InterruptedException {
		 numofDaysBefore_Stage2.sendKeys(numofDaysBefore_Stage_2);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest NumofDaysBefore_Stage3(String numofDaysBefore_Stage_3) throws InterruptedException {
		 numofDaysBefore_Stage3.sendKeys(numofDaysBefore_Stage_3);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_Recertification Role_Stage1() throws InterruptedException {
			Common.click(role_Stage1);
			return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	 
	 public WORKFLOW_Recertification Role_Value_Stage1() throws InterruptedException {
			Common.click(role_Value_Stage1);
			return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	 
	 public WORKFLOW_Recertification Role_Stage2() throws InterruptedException {
			Common.click(role_Stage2);
			return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	 
	 public WORKFLOW_Recertification Role_Value_Stage2() throws InterruptedException {
			Common.click(role_Value_Stage2);
			return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	
	 public WORKFLOW_Recertification Role_Stage3() throws InterruptedException {
			Common.click(role_Stage3);
			return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	 
	 public WORKFLOW_Recertification Role_Value_Stage3() throws InterruptedException {
			Common.click(role_Value_Stage3);
			return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	 
	 public WORKFLOW_WorkflowRequest Stage1(String stage_1) throws InterruptedException {
		 stage1.sendKeys(stage_1);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest Stage2(String stage_2) throws InterruptedException {
		 stage2.sendKeys(stage_2);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest Stage3(String stage_3) throws InterruptedException {
		 stage3.sendKeys(stage_3);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	
	 
	 public WORKFLOW_Recertification EmailTemplate1() throws InterruptedException {
			Common.click(emailTemplate2);
			return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	 
	 public WORKFLOW_Recertification EmailTemplate1_Value() throws InterruptedException {
			Common.click(emailTemplate1_Value);
			return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	 
	 public WORKFLOW_Recertification EmailTemplate2() throws InterruptedException {
			Common.click(emailTemplate2);
			return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	 
	 public WORKFLOW_Recertification EmailTemplate2_Value() throws InterruptedException {
			Common.click(emailTemplate2_Value);
			return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	
	 public WORKFLOW_Recertification EmailTemplate3() throws InterruptedException {
			Common.click(emailTemplate3);
			return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	 
	 public WORKFLOW_Recertification EmailTemplate3_Value() throws InterruptedException {
			Common.click(emailTemplate3_Value);
			return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	 
	 
	 public WORKFLOW_WorkflowRequest Frequency(String frequency1) throws InterruptedException {
		 frequency.sendKeys(frequency1);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 public WORKFLOW_WorkflowRequest MaximumNumofTimes(String maximumNumofTimes1) throws InterruptedException {
		 maximumNumofTimes.sendKeys(maximumNumofTimes1);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	 
	 
	 public WORKFLOW_Recertification ClickOnSave() throws InterruptedException {
			Common.click(saveButton);
			return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	 
	 public WORKFLOW_Recertification ClickOnBack() throws InterruptedException {
			Common.click(backButton);
			return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	
	 public WORKFLOW_Recertification ClickOnDeleteAll() throws InterruptedException {
			Common.click(deleteAllButton);
			return PageFactory.initElements(driver, WORKFLOW_Recertification.class);
		}
	
	 public WORKFLOW_WorkflowRequest PopupOK() throws InterruptedException {
			Common.click(okpopup);
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
	
	 public WORKFLOW_WorkflowRequest scrollUp() throws InterruptedException {
			Common.scrollUp();
			return PageFactory.initElements(driver, WORKFLOW_WorkflowRequest.class);
		}
}
