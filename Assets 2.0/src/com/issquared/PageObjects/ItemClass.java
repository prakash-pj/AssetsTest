package com.issquared.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class ItemClass {

	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public ItemClass(WebDriver driver) {
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
    public WebElement clickVerify;
	*/
	
	@FindBy(xpath="//a[@id='Assests' and @href='/DefaultLanding/Assets']//div[@class='div-text']")
    public WebElement selectassets;
	
	
	@FindBy(xpath="//*[text()='Item Info' and @class='nav-label']")
    public WebElement selectIteminfodropdwon;
		
	@FindBy(xpath="//a[@href='/ItemClass/ManageItemClass']")
    public WebElement clickItemsclass;
	
	/*@FindBy(xpath="//*[@id='addClass']/span/a/div")
    public WebElement selectNew; */
	
	@FindBy(xpath="//*[@id='add']")
    public WebElement selectNew; 

	@FindBy(xpath="//input[@data-attr='ItemClassName']") 
    public WebElement ItemClassName;
	
	@FindBy(xpath="//*[@id='ItemClassImage']") 
    public WebElement ItemImage;
	
	@FindBy(xpath="//*[@id='Description']") 
    public WebElement ItemDescription; 
	
	/*@FindBy(xpath="//div[@class='note-editable']") 
    public WebElement ItemNotes;*/ 
    
    @FindBy(xpath="//div[@class='note-editable panel-body']") 
    public WebElement ItemNotes;
	
	
	@FindBy(xpath="//*[@id='save']/div")
    public WebElement ItemClassSave;
	
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement ItemClassSaveNew;
	
	

	@FindBy(xpath="//button[@class='confirm']")
    public WebElement ItemClasssaveokbtn;
	
		
	@FindBy(xpath="//*[@id='newSubItem']")
    public WebElement ItemTypeCreateNew;
		
	@FindBy(xpath="//*[@id='TypeName']")
    public WebElement Itemtypename;
	
	@FindBy(xpath="//*[@id='ItemTypeImage']")
    public WebElement ItemtypeImage;

	@FindBy(xpath="//*[@id='ItemTypeDesc']")
    public WebElement ItemTypeDescription;
	
	@FindBy(xpath="//div[@class='note-editable']")
    public WebElement ItemTypeNotes;
	
	@FindBy(xpath=".//*[@id='save']/div")
    public WebElement ItmeTypesave;
		
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement ItemTypeOKbutn;
			
	@FindBy(xpath="//*[@id='newSubItem']")
    public WebElement ItemSubtypenew;
	
	
	@FindBy(xpath="//*[@id='ItemSubTypeName']")
    public WebElement ItemSubtypename;
	

	@FindBy(xpath="//*[@id='ItemSubTypeImage']")
    public WebElement ItemSubypeImage;
	
	@FindBy(xpath="//*[@id='ItemTypeDesc']")
    public WebElement ItemSubtypeDescription;
	
	@FindBy(xpath="//div[@class='note-editable']")
    public WebElement ItemSubtypeNotes;
	
	@FindBy(xpath="//*[@id='save']/div")
    public WebElement ItemSubtypeSave;
		
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement ItemSubtypeSaveOK;
	
	@FindBy(xpath=".//*[@id='cancel']/div")
    public WebElement ItemSubtypeCancel;


	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveandnew;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okbtn;
	
	
	//******Assets Dashboard************
	@FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
	public WebElement Dashboard; 
	

	/*Methods */
	public ItemClass openurl(String url)
	{
		driver.get(url);
		return PageFactory.initElements(driver, ItemClass.class);	
	}
	
	

/*	public AssetClass UserName(String un) {
		UserName.sendKeys(un);
		return PageFactory.initElements(driver, AssetClass.class);
	}
	
	public AssetClass password(String pw) {
		Password.sendKeys(pw);
		return PageFactory.initElements(driver, AssetClass.class);
	}
	public AssetClass  DomainName(String dn)  {
		DomainName.sendKeys(dn);
		return PageFactory.initElements(driver, AssetClass.class);
	}
	public AssetClass sigin() throws InterruptedException {
		Common.click(Login);
		return PageFactory.initElements(driver, AssetClass.class);
	}
	
	public AssetClass selectImage() throws InterruptedException {
		Common.click(Imageselect);
		return PageFactory.initElements(driver, AssetClass.class);
	}
	
	public AssetClass clickVerifyButton() throws InterruptedException {
		Common.click(clickVerify);
		return PageFactory.initElements(driver, AssetClass.class);
	}*/

	public ItemClass selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, ItemClass.class);
	}

	
	public ItemClass selectIteminfodropdwon() throws InterruptedException {
		Common.click(selectIteminfodropdwon);
		return PageFactory.initElements(driver, ItemClass.class);
	}

	
	public ItemClass ClickItemsclass() throws InterruptedException {
		Common.click(clickItemsclass);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass clickNew() throws InterruptedException {
		Common.click(selectNew);
		return PageFactory.initElements(driver, ItemClass.class);
	}

	public ItemClass EnterItemClassName(String ACN) {
		ItemClassName.sendKeys(ACN);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass UploadItemClassImage(String ICIMG) {
		ItemImage.sendKeys(ICIMG);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass EnterItemDescription(String Itemdesc) {
		ItemDescription.sendKeys(Itemdesc);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass EnterItemNotes(String Itemnts) {
		ItemNotes.sendKeys(Itemnts);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass ClickItemClassSave() throws InterruptedException {
		Common.click(ItemClassSave); 
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass ClickItemClassSaveNew() throws InterruptedException {
		Common.click(ItemClassSaveNew); 
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickItemClassSaveokbtn() throws InterruptedException {
		Common.click(ItemClasssaveokbtn);
		return PageFactory.initElements(driver, ItemClass.class);
	}

	
	public ItemClass ClickItemTypeCreateNew() throws InterruptedException {
		Common.click(ItemTypeCreateNew);
		return PageFactory.initElements(driver, ItemClass.class);
	}

	
	
	public ItemClass EnterItemtypename(String ITMTYNME) {
		Itemtypename.sendKeys(ITMTYNME);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	

	public ItemClass UploadItemtypeImage(String Itmtypimg) {
	ItemtypeImage.sendKeys(Itmtypimg);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass EnterItemTypeDescription(String Itmtypdesc) {
		ItemTypeDescription.sendKeys(Itmtypdesc);
			return PageFactory.initElements(driver, ItemClass.class);
		}
	public ItemClass EnterItemTypeNotes(String Itmtypnts) throws InterruptedException {
			Common.Enterdata(Itmtypnts,ItemTypeNotes);
			return PageFactory.initElements(driver, ItemClass.class);
		}
	public ItemClass ClickItmeTypesave() throws InterruptedException {
	Common.click(ItmeTypesave);
	return PageFactory.initElements(driver, ItemClass.class);
	}
	

	public ItemClass ClickItemTypeOKbutn() throws InterruptedException {
	Common.click(ItemTypeOKbutn);
	return PageFactory.initElements(driver, ItemClass.class);
	}
	



public ItemClass ClickItemSubtypenew() throws InterruptedException {
	Common.click(ItemSubtypenew);
	return PageFactory.initElements(driver, ItemClass.class);
}

public ItemClass EnterItemSubtypename(String ITSBNME) throws InterruptedException {
	ItemSubtypename.sendKeys(ITSBNME);
	return PageFactory.initElements(driver, ItemClass.class);
}
public ItemClass UploadItemSubypeImage(String ITSBIMG) throws InterruptedException {
	ItemSubypeImage.sendKeys(ITSBIMG);
	return PageFactory.initElements(driver, ItemClass.class);
}

public ItemClass EnterItemSubtypeDescription(String ITSBDESC) throws InterruptedException {
	ItemSubtypeDescription.sendKeys(ITSBDESC);
	return PageFactory.initElements(driver, ItemClass.class);
}
public ItemClass EnterItemSubtypeNotes(String ITSBNTS) throws InterruptedException {
	ItemSubtypeNotes.sendKeys(ITSBNTS);
	return PageFactory.initElements(driver, ItemClass.class);
}
public ItemClass clickItemSubtypeSave() throws InterruptedException {
	Common.click(ItemSubtypeSave);
	return PageFactory.initElements(driver, ItemClass.class);
}
public ItemClass clickItemSubtypeSaveOK() throws InterruptedException {
	Common.click(ItemSubtypeSaveOK);
	return PageFactory.initElements(driver, ItemClass.class);
}
public ItemClass clickItemSubtypeCancel() throws InterruptedException {
	Common.click(ItemSubtypeCancel);
	return PageFactory.initElements(driver, ItemClass.class);
}


public ItemClass SelectAssetsDashboard() throws InterruptedException
{
	Common.click(Dashboard);
	return PageFactory.initElements(driver, ItemClass.class);
}

//*******************************Scroll Methods********************

	public ItemClass Scrolldown() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	return PageFactory.initElements(driver, ItemClass.class);
	}
	//up
	public ItemClass ScrollUp() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	return PageFactory.initElements(driver, ItemClass.class);
	}

	public ItemClass Scrollmiddle() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,250)","");
	return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass ScrollUpMiddle() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(-0,-250)","");
	return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass Scrolldownlast() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(250)","");
	return PageFactory.initElements(driver, ItemClass.class);
	}
	/*public AssetClass InViewPortTab() throws Exception
	{
		inViewPortt(clickWarrantyContract);
		clickWarrantyContract.click();
		return PageFactory.initElements(driver, AssetClass.class);
	 }*/
	public static void inViewPortt(WebElement e) throws Exception
	{
		Coordinates ord = ((Locatable)e).getCoordinates();
		ord.inViewPort();

		Thread.sleep(500);
	}
	//*****************************************************
}
