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

public class Ownership {
	
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public Ownership(WebDriver driver) {
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
	
	
	@FindBy(xpath="//*[@id='side-menu']/li[6]/a")
    public WebElement selectAssetliftcycledropdwon;
	
	@FindBy(xpath="//*[@id='741']/a")
    public WebElement clickOwnership;
	
	@FindBy(xpath="//a[@id='btn_New']")
    public WebElement selectNew;
	
	
	
	@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[1]/div/span/a/b")
    public WebElement AssetNamesearchwin;
	

	  @FindBy(xpath="//select[@role='listbox']")
	    public WebElement RoleResourcesRSRSListBox;
	   
	    @FindBy(xpath="//select[@role='listbox']/option[4]")
	    public WebElement RoleResourcesRSRSListBoxValue;

	
	
	@FindBy(xpath="//*[@id='Ok-AssetInfoNamePopup']/div")
    public WebElement serchwinokbtn;
	
	@FindBy(xpath="//*[@id='SerialNumber']")  
    public WebElement enterSerialNumber;
	
	@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[3]/div/span/a/b")
    public WebElement OwnerNameserachwin;
	
	  @FindBy(xpath="//select[@role='listbox']")
	    public WebElement RoleResourcesRSRSListBox1;
	   
	    @FindBy(xpath="//select[@role='listbox']/option[4]")
	    public WebElement RoleResourcesRSRSListBoxValue1;

	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedBy']/div")
    public WebElement OwnerNameserachwinokbtn;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveandnew;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
    		


/*Methods */
/*public Ownership openurl(String url)
{
	driver.get(url);
	return PageFactory.initElements(driver, Ownership.class);	
}

public Ownership UserName(String un) {
	UserName.sendKeys(un);
	return PageFactory.initElements(driver, Ownership.class);
}

public Ownership password(String pw) {
	Password.sendKeys(pw);
	return PageFactory.initElements(driver, Ownership.class);
}
public Ownership  DomainName(String dn)  {
	DomainName.sendKeys(dn);
	return PageFactory.initElements(driver, Ownership.class);
}
public Ownership sigin() throws InterruptedException {
	Common.click(Login);
	return PageFactory.initElements(driver, Ownership.class);
}

public Ownership selectImage() throws InterruptedException {
	Common.click(Imageselect);
	return PageFactory.initElements(driver, Ownership.class);
}

public Ownership clickVerifyButton() throws InterruptedException {
	Common.click(clickVerify);
	return PageFactory.initElements(driver, Ownership.class);
}*/

public Ownership selectassets() throws InterruptedException {
	Common.click(selectassets);
	return PageFactory.initElements(driver, Ownership.class);
}


public Ownership selectAssetliftcycledropdwon() throws InterruptedException {
	Common.click(selectAssetliftcycledropdwon);
	return PageFactory.initElements(driver, Ownership.class);
}


public Ownership clickOwnership() throws InterruptedException {
	Common.click(clickOwnership);
	return PageFactory.initElements(driver, Ownership.class);
}
public Ownership clickNew() throws InterruptedException {
	Common.click(selectNew);
	return PageFactory.initElements(driver, Ownership.class);
}
public Ownership AssetNamesearchwin() throws InterruptedException {
	Common.click(AssetNamesearchwin);
	return PageFactory.initElements(driver, Ownership.class);
}

public  Ownership SelectRoleResourcesRSRSListBox() throws InterruptedException  {
	RoleResourcesRSRSListBox.click();
	return PageFactory.initElements(driver,Ownership.class);
	}
	public  Ownership SelectRoleResourcesRSRSListBoxValue() throws InterruptedException  {
		RoleResourcesRSRSListBoxValue.click();
	return PageFactory.initElements(driver,Ownership.class);
	}

public Ownership clickAllCheckboxes()
{
	 Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetInfo_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	    
	    randomElement.click();

return PageFactory.initElements(driver, Ownership.class); 
}
public Ownership serchwinokbtn() throws InterruptedException {
	Common.click(serchwinokbtn);
	return PageFactory.initElements(driver, Ownership.class);
}
public Ownership  enterSerialNumber(String dn)  {
	enterSerialNumber.sendKeys(dn);
	return PageFactory.initElements(driver, Ownership.class);
}

public Ownership OwnerNameserachwin() throws InterruptedException {
	Common.click(OwnerNameserachwin);
	return PageFactory.initElements(driver, Ownership.class);
}

public  ProcureInventory SelectRoleResourcesRSRSListBox1() throws InterruptedException  {
	RoleResourcesRSRSListBox1.click();
	return PageFactory.initElements(driver,ProcureInventory.class);
	}
	public  ProcureInventory SelectRoleResourcesRSRSListBoxValue1() throws InterruptedException  {
		RoleResourcesRSRSListBoxValue1.click();
	return PageFactory.initElements(driver,ProcureInventory.class);
	}


public Ownership clickAllCheckboxesownername()
{
	 Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	    
	    randomElement.click();

return PageFactory.initElements(driver, Ownership.class); 
}
public Ownership OwnerNameserachwinokbtn() throws InterruptedException {
	Common.click(OwnerNameserachwinokbtn);
	return PageFactory.initElements(driver, Ownership.class);
}
public Ownership saveandnew() throws InterruptedException {
	Common.click(saveandnew);
	return PageFactory.initElements(driver, Ownership.class);
}
public Ownership okpopup() throws InterruptedException {
	Common.click(okpopup);
	return PageFactory.initElements(driver, Ownership.class);
}

//*******************************Scroll Methods********************

public Ownership Scrolldown() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
return PageFactory.initElements(driver, Ownership.class);
}
//up
public Ownership ScrollUp() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
return PageFactory.initElements(driver, Ownership.class);
}

public Ownership Scrollmiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,250)","");
return PageFactory.initElements(driver, Ownership.class);
}
public Ownership ScrollUpMiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(-0,-250)","");
return PageFactory.initElements(driver, Ownership.class);
}
public Ownership Scrolldownlast() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(250)","");
return PageFactory.initElements(driver, Ownership.class);
}
/*public Ownership InViewPortTab() throws Exception
{
	inViewPortt(clickWarrantyContract);
	clickWarrantyContract.click();
	return PageFactory.initElements(driver, Ownership.class);
}*/
public static void inViewPortt(WebElement e) throws Exception
{
	Coordinates ord = ((Locatable)e).getCoordinates();
	ord.inViewPort();

	Thread.sleep(500);
}
//*****************************************************

}
