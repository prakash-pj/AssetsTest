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

import com.issquared.Common.Common;

public class Warranty {
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public Warranty(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}

	
	/* Properties */
	

/*	@FindBy(id="username")
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
    public WebElement selectmaintenancedropdwon;
	
	@FindBy(xpath="//*[@id='733']/a")
    public WebElement clickWarranty;
	
	@FindBy(xpath="//*[@id='btn_New']")
    public WebElement selectNew;
	
	@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[1]/div/span/a/b")
    public WebElement WarrantyContractsearchwin;
	
	  @FindBy(xpath="//select[@role='listbox']")
	    public WebElement RoleResourcesRSRSListBox;
	   
	    @FindBy(xpath="//select[@role='listbox']/option[4]")
	    public WebElement RoleResourcesRSRSListBoxValue;

	
	@FindBy(xpath="//*[@id='Ok-wrntyContract']/div")
    public WebElement serchwinokbtn;
	
	@FindBy(xpath="//div[@class='note-editable panel-body']")
    public WebElement enternotes;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveandnew;
	
    @FindBy(xpath="//button[contains(text(),'Ok')]")
    public WebElement okpopup;
    		


/*Methods */
/*public Warranty openurl(String url)
{
	driver.get(url);
	return PageFactory.initElements(driver, Warranty.class);	
}

public Warranty UserName(String un) {
	UserName.sendKeys(un);
	return PageFactory.initElements(driver, Warranty.class);
}

public Warranty password(String pw) {
	Password.sendKeys(pw);
	return PageFactory.initElements(driver, Warranty.class);
}
public Warranty  DomainName(String dn)  {
	DomainName.sendKeys(dn);
	return PageFactory.initElements(driver, Warranty.class);
}
public Warranty sigin() throws InterruptedException {
	Common.click(Login);
	return PageFactory.initElements(driver, Warranty.class);
}

public Warranty selectImage() throws InterruptedException {
	Common.click(Imageselect);
	return PageFactory.initElements(driver, Warranty.class);
}

public Warranty clickVerifyButton() throws InterruptedException {
	Common.click(clickVerify);
	return PageFactory.initElements(driver, Warranty.class);
}*/

public Warranty selectassets() throws InterruptedException {
	Common.click(selectassets);
	return PageFactory.initElements(driver, Warranty.class);
}


public Warranty selectmaintenancedropdwon() throws InterruptedException {
	Common.click(selectmaintenancedropdwon);
	return PageFactory.initElements(driver, Warranty.class);
}


public Warranty clickWarranty() throws InterruptedException {
	Common.click(clickWarranty);
	return PageFactory.initElements(driver, Warranty.class);
}
public Warranty clickNew() throws InterruptedException {
	Common.click(selectNew);
	return PageFactory.initElements(driver, Warranty.class);
}
public Warranty WarrantyContractsearchwin() throws InterruptedException {
	Common.click(WarrantyContractsearchwin);
	return PageFactory.initElements(driver, Warranty.class);
}



public  Warranty SelectRoleResourcesRSRSListBox() throws InterruptedException  {
	RoleResourcesRSRSListBox.click();
	return PageFactory.initElements(driver,Warranty.class);
	}
	public  Warranty SelectRoleResourcesRSRSListBoxValue() throws InterruptedException  {
		RoleResourcesRSRSListBoxValue.click();
	return PageFactory.initElements(driver,Warranty.class);
	}





public Warranty clickAllCheckboxes()
{
	 Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridwrntyContractName_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	    
	    randomElement.click();

return PageFactory.initElements(driver, Warranty.class); 
}
public Warranty serchwinokbtn() throws InterruptedException {
	Common.click(serchwinokbtn);
	return PageFactory.initElements(driver, Warranty.class);
}
public Warranty  Enternotesfield(String dn)  {
	enternotes.sendKeys(dn);
	return PageFactory.initElements(driver, Warranty.class);
}
public Warranty saveandnew() throws InterruptedException {
	Common.click(saveandnew);
	return PageFactory.initElements(driver, Warranty.class);
}
public Warranty okpopup() throws InterruptedException {
	Common.click(okpopup);
	return PageFactory.initElements(driver, Warranty.class);
}

//*******************************Scroll Methods********************

public Warranty Scrolldown() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
return PageFactory.initElements(driver, Warranty.class);
}
//up
public Warranty ScrollUp() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
return PageFactory.initElements(driver, Warranty.class);
}

public Warranty Scrollmiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,250)","");
return PageFactory.initElements(driver, Warranty.class);
}
public Warranty ScrollUpMiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(-0,-250)","");
return PageFactory.initElements(driver, Warranty.class);
}
public Warranty Scrolldownlast() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(250)","");
return PageFactory.initElements(driver, Warranty.class);
}
/*public Insurance InViewPortTab() throws Exception
{
	inViewPortt(clickWarrantyContract);
	clickWarrantyContract.click();
	return PageFactory.initElements(driver, Insurance.class);
}*/
public static void inViewPortt(WebElement e) throws Exception
{
	Coordinates ord = ((Locatable)e).getCoordinates();
	ord.inViewPort();

	Thread.sleep(500);
}
//*****************************************************

}
