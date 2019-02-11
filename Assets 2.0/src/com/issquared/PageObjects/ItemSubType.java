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

public class ItemSubType {
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public ItemSubType(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}

	
	/* Properties */
	@FindBy(id="Assests")
    public WebElement selectassets;
	
	
	@FindBy(xpath="//*[text()='Item Info' and @class='nav-label']")
    public WebElement selectIteminfodropdwon;
		
	@FindBy(xpath="//a[@href='/ItemSubType/ManageItemSubType']")
    public WebElement clickItemSubType;
		
	/*@FindBy(xpath="//*[@id='addSubType']/span/a/div")
    public WebElement ItemTypeCreateNew;*/
	
	@FindBy(xpath="//*[@id='add']")
    public WebElement ItemTypeCreateNew;
	
	@FindBy(xpath="//*[@id='spnItemClass']")
    public WebElement ItemClassSearch;
	@FindBy(xpath="//*[@id='jqg_gridItemClass_116']")
    public WebElement ItemClassValue;	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement PageCount;
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement PageCountValue;
	@FindBy(xpath="//*[@id='Ok-ItemClassPopup']/div")
    public WebElement ItemClassOk;
	
	
	@FindBy(xpath="//*[@id='spnItemType']")
    public WebElement ItemTypeSearch;
	@FindBy(xpath="//*[@id='jqg_gridItemType_145']")
    public WebElement ItemTypeValue;	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement TypePageCount;
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement TypePageCountValue;
	@FindBy(xpath="//*[@id='Ok-ItemTypePopup']/div")
    public WebElement ItemTypeOk;
	
	
	
	@FindBy(xpath="//*[@id='ItemSubTypeName']")
    public WebElement ItemSubTypeName;
	
	@FindBy(xpath="//*[@id='ItemSubTypeImage']")
    public WebElement ItemtypeImage;

	@FindBy(xpath="//*[@id='ItemTypeDesc']")
    public WebElement ItemTypeDescription;
	
	@FindBy(xpath="//div[@class='note-editable']")
    public WebElement ItemTypeNotes;
	
	@FindBy(xpath=".//*[@id='save']/div")
    public WebElement ItmeTypesave;
		
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement ItemTypeOKbutn;

	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveandnew;
	
	@FindBy(xpath="//*[@id='save']/div")
    public WebElement save;
	
	@FindBy(xpath="//*[@id='cancel']/div")
    public WebElement Back;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okbtn;
	
	//******Assets Dashboard************
		@FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
		public WebElement Dashboard; 
		
	/*Methods */
		
		public ItemClass SelectAssetsDashboard() throws InterruptedException
		{
			Common.click(Dashboard);
			return PageFactory.initElements(driver, ItemClass.class);
		}
		
	public ItemClass openurl(String url)
	{
		driver.get(url);
		return PageFactory.initElements(driver, ItemClass.class);	
	}
	

	public ItemClass selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, ItemClass.class);
	}

	
	public ItemClass selectIteminfodropdwon() throws InterruptedException {
		Common.click(selectIteminfodropdwon);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	/*public ItemClass selectItemsType() throws InterruptedException {
		Common.click(clickItemSubType);
		return PageFactory.initElements(driver, ItemClass.class);
	}*/
	public ItemClass selectItemsSubType() throws InterruptedException {
		Common.click(clickItemSubType);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickItemTypeCreateNew() throws InterruptedException {
		Common.click(ItemTypeCreateNew);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickItemClassSearch() throws InterruptedException {
		Common.click(ItemClassSearch);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass SelectItemClassValue() throws InterruptedException {
		//Common.click(ItemClassValue);
		Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemClass_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	    Common.click(randomElement);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickItemClassOk() throws InterruptedException {
		Common.click(ItemClassOk);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickPageCount() throws InterruptedException {
		Common.click(PageCount);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass SelectPageCountValue() throws InterruptedException {
		Common.click(PageCountValue);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
//*************
	public ItemClass ClickItemTypeSearch() throws InterruptedException {
		Common.click(ItemTypeSearch);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass SelectItemTypeValue() throws InterruptedException {
		//Common.click(ItemClassValue);
		Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemType_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	    Common.click(randomElement);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickItemTypeOk() throws InterruptedException {
		Common.click(ItemTypeOk);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickTypePageCount() throws InterruptedException {
		Common.click(TypePageCount);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass SelectTypePageCountValue() throws InterruptedException {
		Common.click(TypePageCountValue);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	
	public ItemClass EnterItemSubtypename(String ITMTYNME) throws InterruptedException {
		Common.Enterdata(ITMTYNME, ItemSubTypeName);
	//	Itemtypename.sendKeys(ITMTYNME);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	

	public ItemClass UploadItemtypeImage(String Itmtypimg) throws InterruptedException {
		Common.Enterdata(Itmtypimg, ItemtypeImage);
		//ItemtypeImage.sendKeys(Itmtypimg);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass EnterItemTypeDescription(String Itmtypdesc) throws InterruptedException {
		Common.Enterdata(Itmtypdesc,ItemTypeDescription);
		return PageFactory.initElements(driver, ItemClass.class);
		}
	public ItemClass EnterItemTypeNotes(String Itmtypnts) throws InterruptedException {
			Common.Enterdata(Itmtypnts,ItemTypeNotes);
			return PageFactory.initElements(driver, ItemClass.class);
		}
	public ItemClass ClickItmeTypesavenew() throws InterruptedException {
	Common.click(saveandnew);
	return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickItmeTypeSave() throws InterruptedException {
		Common.click(save);
		return PageFactory.initElements(driver, ItemClass.class);
		}
	
	public ItemClass ClickItmeTypeBack() throws InterruptedException {
		Common.click(Back);
		return PageFactory.initElements(driver, ItemClass.class);
		}
	
	

	public ItemClass ClickItemTypeOKbutn() throws InterruptedException {
	Common.click(ItemTypeOKbutn);
	return PageFactory.initElements(driver, ItemClass.class);
	}
	
	/*public ItemClass SelectItemClassByName(String data) throws InterruptedException {
		//Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemClassPopup_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ItemClass.class);
	}*/
	
   public ItemClass SelectItemClassByName() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemClassPopup')]"));

	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	
	/*public ItemClass SelectItemTypeByName(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemType_ItemTypeName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ItemClass.class);
	}*/
	 public ItemClass SelectItemTypeByName() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemType')]"));

		    WebElement Element = links.get(0);
		    Common.click(Element);
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
