package com.issquared.PageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class AssetBundles {
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public AssetBundles(WebDriver driver) {
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
    public WebElement clickVerify;
	*/
	
	@FindBy(xpath="//a[@id='Assests' and @href='/DefaultLanding/Assets']//div[@class='div-text']")
    public WebElement selectassets;
	
	@FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
	public WebElement Dashboard; 
	
	/*@FindBy(xpath="//*[@id='side-menu']/li[7]/a")
    public WebElement selectAdministratordropdwon;*/
	
	@FindBy(xpath="//*[@id='side-menu']/li[14]/a/span[1]")   
    public WebElement administration;
	
	/*@FindBy(xpath="//*[@id='752']/a")
    public WebElement clickAssetBundle;*/
	
	@FindBy(xpath="//*[@id='752']/a")
    public WebElement clickAssetBundle;
	
	@FindBy(xpath="//*[@id='btn_New']")
    public WebElement selectNew;
	
	@FindBy(xpath="//*[@id='BundleName']")
    public WebElement EnterBundleName;
	
	@FindBy(xpath="//*[@id='Description']")
    public WebElement description;
	
	@FindBy(xpath="//*[@id='save']/div")
    public WebElement save;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveandnew;
	
	@FindBy(xpath="//*[@id='cancel']/div")
    public WebElement back;
	
	@FindBy(xpath="//*[@id='click_me']/label")
    public WebElement createNew;
	
	@FindBy(xpath="//*[@id='istype']/b")
    public WebElement itemName;
	
	@FindBy(xpath="//*[@id='ItemsubTypeQuantity']")
    public WebElement quantity;
	
	@FindBy(xpath="//*[@id='Ok-ItemSKUPopup']/div")
    public WebElement itemNamePopupOK;
	
	@FindBy(xpath="//*[@id='Savebundle']/div")
    public WebElement itemNameSave;
	
	@FindBy(xpath="//*[@id='SaveNewbundle']/div")
    public WebElement itemNameSaveNew;
	
	@FindBy(xpath="//*[@id='CancelBundle']/div")
    public WebElement itemNameBack;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
    		


/*Methods */
public AssetBundles openurl(String url)
{
	driver.get(url);
	return PageFactory.initElements(driver, AssetBundles.class);	
}

/*public AssetBundles UserName(String un) {
	UserName.sendKeys(un);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles password(String pw) {
	Password.sendKeys(pw);
	return PageFactory.initElements(driver, AssetBundles.class);
}
public AssetBundles  DomainName(String dn)  {
	DomainName.sendKeys(dn);
	return PageFactory.initElements(driver, AssetBundles.class);
}
public AssetBundles sigin() throws InterruptedException {
	Common.click(Login);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles selectImage() throws InterruptedException {
	Common.click(Imageselect);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles clickVerifyButton() throws InterruptedException {
	Common.click(clickVerify);
	return PageFactory.initElements(driver, AssetBundles.class);
}*/



public AssetBundles selectAssets() throws InterruptedException {
	Common.click(selectassets);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles SelectAssetsDashboard() throws InterruptedException
{
	Common.click(Dashboard);
	return PageFactory.initElements(driver, AssetBundles.class);
}
public AssetBundles selectAdministration() throws InterruptedException {
	Common.click(administration);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles clickAssetBundle() throws InterruptedException {
	Common.click(clickAssetBundle);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles clickNew() throws InterruptedException {
	Common.click(selectNew);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles  EnterBundleName(String dn)  {
	EnterBundleName.sendKeys(dn);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles  EnterDescription(String description1)  {
	description.sendKeys(description1);
	return PageFactory.initElements(driver, AssetBundles.class);
}


public AssetBundles Save() throws InterruptedException {
	Common.click(save);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles saveandnew() throws InterruptedException {
	Common.click(saveandnew);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles Back() throws InterruptedException {
	Common.click(back);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles CreateNew() throws InterruptedException {
	Common.click(createNew);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles ClickonItemName() throws InterruptedException {
	Common.click(itemName);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles SelectFirstvalueFromPopup() throws InterruptedException {
	
    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemSKU')]"));
 
    WebElement Element = links.get(0);
    Common.click(Element);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles ClickonitemNamePopupOK() throws InterruptedException {
	Common.click(itemNamePopupOK);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles ClickonitemNameSave() throws InterruptedException {
	Common.click(itemNameSave);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles ClickonitemNameBack() throws InterruptedException {
	Common.click(itemNameBack);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles  EnterQuantity(String quantity1)  {
	quantity.sendKeys(quantity1);
	return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles PopupOK() throws InterruptedException {
	Common.click(okpopup);
	return PageFactory.initElements(driver, AssetBundles.class);
}


//*******************************Scroll Methods********************

public AssetBundles Scrolldown() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
return PageFactory.initElements(driver, AssetBundles.class);
}
//up
public AssetBundles ScrollUp() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
return PageFactory.initElements(driver, AssetBundles.class);
}

public AssetBundles Scrollmiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,250)","");
return PageFactory.initElements(driver, AssetBundles.class);
}
public AssetBundles ScrollUpMiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(-0,-250)","");
return PageFactory.initElements(driver, AssetBundles.class);
}
public AssetBundles Scrolldownlast() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(250)","");
return PageFactory.initElements(driver, AssetBundles.class);
}
/*public AssetBundles InViewPortTab() throws Exception
{
	inViewPortt(clickWarrantyContract);
	clickWarrantyContract.click();
	return PageFactory.initElements(driver, AssetBundles.class);
}*/
public static void inViewPortt(WebElement e) throws Exception
{
	Coordinates ord = ((Locatable)e).getCoordinates();
	ord.inViewPort();

	Thread.sleep(500);
}
//*****************************************************
}
