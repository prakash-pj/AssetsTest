package com.issquared.PageObjects;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.issquared.Common.Common;

public class Maintenance {
	
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public Maintenance(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}

	
	/* Properties */
	
/*
	@FindBy(id="username")
	public WebElement UserName;
	
	@FindBy(id="password")
	public WebElement Password;
	
	@FindBy(id="domainname")
	public WebElement DomainName;

	@FindBy(xpath="//button[@type='submit']")
    public WebElement Login;
	
	@FindBy(xpath="//input[@value='445']")
    public WebElement Imageselect;
	
	
	@FindBy(xpath="//a[@id='verify']")
    public WebElement clickVerify;*/
	
	
	@FindBy(xpath="//div[1]/div/div/div[1]/div[1]/a/div/div")
    public WebElement selectassets;
	
	
	@FindBy(xpath="//*[@id='side-menu']/li[5]/a")
    public WebElement selectMaintenancedropdwon;
	
	@FindBy(xpath="//*[@id='731']/a")
    public WebElement clickMaintenance;
	
	@FindBy(xpath="//a[@id='btn_New']")
    public WebElement selectNew;
	
	@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[1]/div/span/a/b")
    public WebElement MaintenanceContractsearchwin;
	
	  @FindBy(xpath="//select[@role='listbox']")
	    public WebElement RoleResourcesRSRSListBox;
	   
	    @FindBy(xpath="//select[@role='listbox']/option[4]")
	    public WebElement RoleResourcesRSRSListBoxValue;
	
	@FindBy(xpath="//*[@id='Ok-MaintenanceContractPopup']/div")
    public WebElement serchwinokbtn;
	
	@FindBy(xpath="//div[@class='note-editable panel-body']")
    public WebElement enternotes;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveandnew;
	
    @FindBy(xpath="//button[contains(text(),'Ok')]")
    public WebElement okpopup;
    		


/*Methods */
/*public Maintenance openurl(String url)
{
	driver.get(url);
	return PageFactory.initElements(driver, Maintenance.class);	
}

public Maintenance UserName(String un) {
	UserName.sendKeys(un);
	return PageFactory.initElements(driver, Maintenance.class);
}

public Maintenance password(String pw) {
	Password.sendKeys(pw);
	return PageFactory.initElements(driver, Maintenance.class);
}
public Maintenance  DomainName(String dn)  {
	DomainName.sendKeys(dn);
	return PageFactory.initElements(driver, Maintenance.class);
}
public Maintenance sigin() throws InterruptedException {
	Common.click(Login);
	return PageFactory.initElements(driver, Maintenance.class);
}

public Maintenance selectImage() throws InterruptedException {
	Common.click(Imageselect);
	return PageFactory.initElements(driver, Maintenance.class);
}

public Maintenance clickVerifyButton() throws InterruptedException {
	Common.click(clickVerify);
	return PageFactory.initElements(driver, Maintenance.class);
}*/

public Maintenance selectassets() throws InterruptedException {
	Common.click(selectassets);
	return PageFactory.initElements(driver, Maintenance.class);
}


public Maintenance selectcontractdropdwon() throws InterruptedException {
	Common.click(selectMaintenancedropdwon);
	return PageFactory.initElements(driver, Maintenance.class);
}


public Maintenance clickMaintenance() throws InterruptedException {
	Common.click(clickMaintenance);
	return PageFactory.initElements(driver, Maintenance.class);
}
public Maintenance clickNew() throws InterruptedException {
	Common.click(selectNew);
	return PageFactory.initElements(driver, Maintenance.class);
}
public Maintenance MaintenanceContractsearchwin() throws InterruptedException {
	Common.click(MaintenanceContractsearchwin);
	return PageFactory.initElements(driver, Maintenance.class);
}

public  Maintenance SelectRoleResourcesRSRSListBox() throws InterruptedException  {
	RoleResourcesRSRSListBox.click();
	return PageFactory.initElements(driver,Maintenance.class);
	}
	public  Maintenance SelectRoleResourcesRSRSListBoxValue() throws InterruptedException  {
		RoleResourcesRSRSListBoxValue.click();
	return PageFactory.initElements(driver,Maintenance.class);
	}

	
public Maintenance clickAllCheckboxes()
{

	
	 Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridMaintenanceContract_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	     
	    randomElement.click();

	
    return PageFactory.initElements(driver, Maintenance.class); 
    }

public Maintenance serchwinokbtn() throws InterruptedException {
	Common.click(serchwinokbtn);
	return PageFactory.initElements(driver, Maintenance.class);
}
public Maintenance  Enternotesfield(String dn)  {
	enternotes.sendKeys(dn);
	return PageFactory.initElements(driver, Maintenance.class);
}
public Maintenance saveandnew() throws InterruptedException {
	Common.click(saveandnew);
	return PageFactory.initElements(driver, Maintenance.class);
}
public Maintenance okpopup() throws InterruptedException {
	Common.click(okpopup);
	return PageFactory.initElements(driver, Maintenance.class);
}

//*******************************Scroll Methods********************

public Maintenance Scrolldown() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
return PageFactory.initElements(driver, Maintenance.class);
}
//up
public Maintenance ScrollUp() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
return PageFactory.initElements(driver, Maintenance.class);
}

public Maintenance Scrollmiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,250)","");
return PageFactory.initElements(driver, Maintenance.class);
}
public Maintenance ScrollUpMiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(-0,-250)","");
return PageFactory.initElements(driver, Maintenance.class);
}
public Maintenance Scrolldownlast() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(250)","");
return PageFactory.initElements(driver, Maintenance.class);
}
/*public Maintenance InViewPortTab() throws Exception
{
	inViewPortt(clickWarrantyContract);
	clickWarrantyContract.click();
	return PageFactory.initElements(driver, Maintenance.class);
}*/
public static void inViewPortt(WebElement e) throws Exception
{
	Coordinates ord = ((Locatable)e).getCoordinates();
	ord.inViewPort();

	Thread.sleep(500);
}
//*****************************************************

}
