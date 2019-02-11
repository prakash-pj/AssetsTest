package com.issquared.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class EmailTemplates {
	
	private WebDriver driver;
	Common commonUtil;

	/*Constructor */
	public EmailTemplates(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	
	
	@FindBy(xpath="//a[@id='Assests' and @href='/DefaultLanding/Assets']//div[@class='div-text']")
    public WebElement selectassets;
	
	@FindBy(xpath="//*[@title='Modules']")
	public WebElement selectTopMenu;
	
	@FindBy(xpath="(//*[text()='Assets'])[2]")
	public WebElement selectAssetsFromTopMenu;
	
	@FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
	public WebElement dashboard; 
	
	@FindBy(xpath="//*[@id='side-menu']/li[14]/a")
    public WebElement selectAdministration;
		
	@FindBy(xpath="//*[@href='/EmailTemplates/Manage']")
    public WebElement clickEmailTemplates;
	
	
	@FindBy(xpath=".//*[@id='btn_New']")
    public WebElement createNew;
		
	@FindBy(xpath="//*[@id='TemplateName']")
    public WebElement emailTemplateName;
	
	@FindBy(xpath="//*[@id='EmailTemplateType']")
    public WebElement emailTemplateType;


	@FindBy(xpath="//*[@id='EmailTemplateType']/option[4]")
    public WebElement emailTemplateTypeValue;
	
	@FindBy(xpath="//*[@id='TemplateSubject']")
    public WebElement  emailTemplateSubject;
	
	@FindBy(xpath="//*[@id='QueryObjectId']")
    public WebElement objects;
	
	@FindBy(xpath="//*[@id='QueryObjectId']/option[2]")
    public WebElement objectsValue;
	
	@FindBy(xpath="//*[@id='Notes']")
    public WebElement description;
	
	
	@FindBy(xpath="//*[@id='cancel']/div")
    public WebElement cancel;

	@FindBy(xpath="//*[@id='save']/div")
    public WebElement save;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveandnew;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okbtn;
	
	public EmailTemplates selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	
	public EmailTemplates selectTopMenu() throws InterruptedException {
		Common.click(selectTopMenu);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}

    public EmailTemplates selectAssetsFromTopMenu() throws InterruptedException {
		Common.click(selectAssetsFromTopMenu);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}

	public EmailTemplates SelectAssetsDashboard() throws InterruptedException
	{
		Common.click(dashboard);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	
	public EmailTemplates SelectAdministration() throws InterruptedException {
		Common.click(selectAdministration);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}

	
	public EmailTemplates ClickEmailTemplates() throws InterruptedException {
		Common.click(clickEmailTemplates);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	
	
	public EmailTemplates CreateNew() throws InterruptedException {
		Common.click(createNew);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	
	
	public EmailTemplates EmailTemplateName(String templateName) {
		emailTemplateName.sendKeys(templateName);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	
	public EmailTemplates EmailTemplateType() throws InterruptedException {
		Common.click(emailTemplateType);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	
	public EmailTemplates EmailTemplateTypeValue() throws InterruptedException {
		Common.click(emailTemplateTypeValue);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	
	public EmailTemplates EmailTemplateSubject(String templateSubject) {
		emailTemplateSubject.sendKeys(templateSubject);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	
	public EmailTemplates Objects() throws InterruptedException {
		Common.click(objects);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	
	public EmailTemplates ObjectsValue() throws InterruptedException {
		Common.click(objectsValue);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	
	public EmailTemplates IsNotification() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='IsNotification']")).click();
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	
	public EmailTemplates Description(String description1) {
		description.sendKeys(description1);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	
	
	public EmailTemplates Save() throws InterruptedException {
		Common.click(save);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	public EmailTemplates Saveandnew() throws InterruptedException {
		Common.click(saveandnew);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	
	public EmailTemplates Cancel() throws InterruptedException {
		Common.click(cancel);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	
	public EmailTemplates PopupOk() throws InterruptedException {
		Common.click(okbtn);
		return PageFactory.initElements(driver, EmailTemplates.class);
	}
	

}
