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

public class AssetsHold {
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public AssetsHold(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}

	
	/* Properties */
	

	/*@FindBy(id="username")
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
	
	
	
	/*@FindBy(xpath="//*[@id='side-menu']/li[6]/a")
    public WebElement selectAssetliftcycledropdwon;*/
	
	@FindBy(xpath="//*[@id='side-menu']/li[9]/a")
    public WebElement selectACTIONSdropdown;
	
	@FindBy(xpath="//*[@id='772']/a")
    public WebElement clickOnHold;
	
	@FindBy(xpath="//*[@id='744']/a")
    public WebElement clickAssetsHold;
	
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
	
	@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[3]/div/span/a/b")
    public WebElement selectOwnerNameserachwin;
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedFor']/div")
    public WebElement selectOwnerNameserachwinokbtn;
	
	@FindBy(xpath="//*[@id='HoldType']")
	public WebElement HoldType;
	
	@FindBy(xpath="//option[@value='84545']")
    public WebElement selectholdtypedropdown;
	
	@FindBy(xpath="//div[@class='note-editable panel-body']")
    public WebElement Notes;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveandnew;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
    		


/*Methods */
/*public AssetsHold openurl(String url)
{
	driver.get(url);
	return PageFactory.initElements(driver, AssetsHold.class);	
}

public AssetsHold UserName(String un) {
	UserName.sendKeys(un);
	return PageFactory.initElements(driver, AssetsHold.class);
}

public AssetsHold password(String pw) {
	Password.sendKeys(pw);
	return PageFactory.initElements(driver, AssetsHold.class);
}
public AssetsHold  DomainName(String dn)  {
	DomainName.sendKeys(dn);
	return PageFactory.initElements(driver, AssetsHold.class);
}
public AssetsHold sigin() throws InterruptedException {
	Common.click(Login);
	return PageFactory.initElements(driver, AssetsHold.class);
}

public AssetsHold selectImage() throws InterruptedException {
	Common.click(Imageselect);
	return PageFactory.initElements(driver, AssetsHold.class);
}

public AssetsHold clickVerifyButton() throws InterruptedException {
	Common.click(clickVerify);
	return PageFactory.initElements(driver, AssetsHold.class);
}*/

public AssetsHold selectassets() throws InterruptedException {
	Common.click(selectassets);
	return PageFactory.initElements(driver, AssetsHold.class);
}


/*public AssetsHold selectAssetliftcycledropdwon() throws InterruptedException {
	Common.click(selectAssetliftcycledropdwon);
	return PageFactory.initElements(driver, AssetsHold.class);
}*/

/*public AssetsHold selectAssetliftcycledropdwon() throws InterruptedException {
	Common.click(selectACTIONSdropdown);
	return PageFactory.initElements(driver, AssetsHold.class);
}*/

public AssetsHold SelectACTIONSdropdown() throws InterruptedException {
	Common.click(selectACTIONSdropdown);
	return PageFactory.initElements(driver, AssetsHold.class);
}

public ACTIONS_Onboard ClickOnHold() throws InterruptedException {
	Common.click(clickOnHold);
	return PageFactory.initElements(driver, ACTIONS_Onboard.class);
}

public AssetsHold clickAssetsHold() throws InterruptedException {
	Common.click(clickAssetsHold);
	return PageFactory.initElements(driver, AssetsHold.class);
}
public AssetsHold clickNew() throws InterruptedException {
	Common.click(selectNew);
	return PageFactory.initElements(driver, AssetsHold.class);
}
public AssetsHold AssetNamesearchwin() throws InterruptedException {
	Common.click(AssetNamesearchwin);
	return PageFactory.initElements(driver, AssetsHold.class);
}


public  AssetsHold SelectRoleResourcesRSRSListBox() throws InterruptedException  {
	RoleResourcesRSRSListBox.click();
	return PageFactory.initElements(driver,AssetsHold.class);
	}
	public  AssetsHold SelectRoleResourcesRSRSListBoxValue() throws InterruptedException  {
		RoleResourcesRSRSListBoxValue.click();
	return PageFactory.initElements(driver,AssetsHold.class);
	}


public AssetsHold clickAllCheckboxes()
{
	 Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetInfo_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	    
	    randomElement.click();

return PageFactory.initElements(driver, AssetsHold.class); 
}
public AssetsHold serchwinokbtn() throws InterruptedException {
	Common.click(serchwinokbtn);
	return PageFactory.initElements(driver, AssetsHold.class);
}
public AssetsHold selectOwnerNameserachwin() throws InterruptedException {
	Common.click(selectOwnerNameserachwin);
	return PageFactory.initElements(driver, AssetsHold.class);
}
public AssetsHold clickAllCheckboxesownername()
{
	 Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedFor_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	    
	    randomElement.click();

return PageFactory.initElements(driver, AssetsHold.class); 
} 

public AssetsHold selectOwnerNameserachwinokbtn() throws InterruptedException {
	Common.click(selectOwnerNameserachwinokbtn);
	return PageFactory.initElements(driver, AssetsHold.class);
}
/*public AssetsHold HoldType() throws InterruptedException {
	Common.click(HoldType);
	return PageFactory.initElements(driver, AssetsHold.class);
	
	
}*/


public AssetsHold HoldType() throws InterruptedException{
	 
         Common.click(HoldType);

         Select entitle=new Select(driver.findElement(By.id("HoldType")));
 
         entitle.selectByIndex(1);

         return PageFactory.initElements(driver, AssetsHold.class);
} 
 

/*public AssetsHold selectholdtypedropdown() throws InterruptedException {
	Common.click(selectholdtypedropdown);
	return PageFactory.initElements(driver, AssetsHold.class);
}
*/


public  AssetsHold Notes(String Notes1) {
	Notes.sendKeys(Notes1);
	return PageFactory.initElements(driver,AssetsHold.class);
}

public AssetsHold saveandnew() throws InterruptedException {
	Common.click(saveandnew);
	return PageFactory.initElements(driver, AssetsHold.class);
}
public AssetsHold okpopup() throws InterruptedException {
	Common.click(okpopup);
	return PageFactory.initElements(driver, AssetsHold.class);
}

//*******************************Scroll Methods********************

public AssetsHold Scrolldown() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
return PageFactory.initElements(driver, AssetsHold.class);
}
//up
public AssetsHold ScrollUp() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
return PageFactory.initElements(driver, AssetsHold.class);
}

public AssetsHold Scrollmiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,250)","");
return PageFactory.initElements(driver, AssetsHold.class);
}
public AssetsHold ScrollUpMiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(-0,-250)","");
return PageFactory.initElements(driver, AssetsHold.class);
}
public AssetsHold Scrolldownlast() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(250)","");
return PageFactory.initElements(driver, AssetsHold.class);
}
/*public AssetsHold InViewPortTab() throws Exception
{
	inViewPortt(clickWarrantyContract);
	clickWarrantyContract.click();
	return PageFactory.initElements(driver, AssetsHold.class);
}*/
public static void inViewPortt(WebElement e) throws Exception
{
	Coordinates ord = ((Locatable)e).getCoordinates();
	ord.inViewPort();

	Thread.sleep(500);
}
//*****************************************************
}
