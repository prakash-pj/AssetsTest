package com.issquared.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class TadminPage {

	
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public TadminPage(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}

	
	/* Properties */
	

	@FindBy(id="username")
	public WebElement UserName;
	
	@FindBy(id="password")
	public WebElement Password;
	
	@FindBy(id="domainname")
	public WebElement DomainName;

	@FindBy(xpath="//button[@type='submit']")
    public WebElement Login;
	
	@FindBy(xpath="//input[@value='2337']")
    public WebElement Imageselect;
	
	
	@FindBy(xpath="//a[@id='verify']")
    public WebElement clickVerify;
	
	@FindBy(xpath="//div[1]/div/div/div[2]/div[1]/a/div/div")
    public WebElement selectOrganization;
	
	
	@FindBy(xpath="html/body/aside/div/ul/li[2]/a/span[2]")
    public WebElement selectOrganizationdropdwon;
	
	@FindBy(xpath="html/body/aside/div/ul/li[2]/ul/li[1]/a")
    public WebElement clickOrganizationValue;
	
	@FindBy(xpath="//a[@id='btn_New']")
    public WebElement selectNew;
	
	@FindBy(xpath="//input[@id='OrgName']")
    public WebElement organizationName;
	
	/*@FindBy(xpath="//div[2]/div/div[2]/div/span/a/b")
    public WebElement browsevalue;
	
	@FindBy(xpath="//div/div[4]/a[2]/div/strong")
    public WebElement clickOK;*/
	
	@FindBy(id="save-BasicContent")
    public WebElement save;
	
	@FindBy(xpath="//div[169]/div[2]/button[2]")
    public WebElement saveok;
	
	@FindBy(xpath="//div/div/div[1]/div/div[2]/a[2]")
    public WebElement cancel;
	
	
	
	
	
	/*Methods */
	public TadminPage openurl(String url)
	{
		driver.get(url);
		return PageFactory.initElements(driver, TadminPage.class);	
	}
	
	

	public TadminPage UserName(String un) {
		UserName.sendKeys(un);
		return PageFactory.initElements(driver, TadminPage.class);
	}
	
	public TadminPage password(String pw) {
		Password.sendKeys(pw);
		return PageFactory.initElements(driver, TadminPage.class);
	}
	public TadminPage  DomainName(String dn)  {
		DomainName.sendKeys(dn);
		return PageFactory.initElements(driver, TadminPage.class);
	}
	public TadminPage sigin() throws InterruptedException {
		Common.click(Login);
		return PageFactory.initElements(driver, TadminPage.class);
	}
	
	public TadminPage selectImage() throws InterruptedException {
		Common.click(Imageselect);
		return PageFactory.initElements(driver, TadminPage.class);
	}
	
	public TadminPage clickVerifyButton() throws InterruptedException {
		Common.click(clickVerify);
		return PageFactory.initElements(driver, TadminPage.class);
	}

	public TadminPage selectOrganization() throws InterruptedException {
		Common.click(selectOrganization);
		return PageFactory.initElements(driver, TadminPage.class);
	}

	
	public TadminPage selectOrganizationaValue() throws InterruptedException {
		Common.click(selectOrganizationdropdwon);
		return PageFactory.initElements(driver, TadminPage.class);
	}

	
	public TadminPage clickOrganizationaList() throws InterruptedException {
		Common.click(clickOrganizationValue);
		return PageFactory.initElements(driver, TadminPage.class);
	}

	
	public TadminPage clickNew() throws InterruptedException {
		Common.click(selectNew);
		return PageFactory.initElements(driver, TadminPage.class);
	}

	public TadminPage enterOrganizationName(String orgname) {
		organizationName.sendKeys(orgname);
		return PageFactory.initElements(driver, TadminPage.class);
	}
	
	
/*	public TadminPage selectBrowserValue() {
		browsevalue.click();
		return PageFactory.initElements(driver, TadminPage.class);
	}
	
	public TadminPage clickAllCheckboxes()
	{
		List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridOrganization_')]"));
		 int iSize = oCheckBox.size();
		 System.out.println(iSize);
		 for(int i=0; i < iSize ; i++ ){
			 oCheckBox.get(i).click();
			
			 String sValue = oCheckBox.get(i).getAttribute("value");
			 if (sValue.equalsIgnoreCase("test")){
				 
				 oCheckBox.get(i).click();
		 //}
		 }
		
        return PageFactory.initElements(driver, TadminPage.class);
	    }
	
	public TadminPage clickOK()
	{
		clickOK.click();
		return PageFactory.initElements(driver, TadminPage.class);
	    }*/
	
	public TadminPage clickSave()
	{
		save.click();
		return PageFactory.initElements(driver, TadminPage.class);
	    }
	
	public TadminPage clickOKButton()
	{
		saveok.click();
		return PageFactory.initElements(driver, TadminPage.class);
	    }
	
	public TadminPage clickCancel()
	{
		cancel.click();
		return PageFactory.initElements(driver, TadminPage.class);
	    }
	
}
