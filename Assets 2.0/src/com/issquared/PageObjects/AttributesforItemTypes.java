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

public class AttributesforItemTypes {
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public AttributesforItemTypes(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}

	
	/* Properties */
	@FindBy(id="Assests")
    public WebElement selectassets;
	
	
	@FindBy(xpath="//*[text()='Item Info' and @class='nav-label']")
    public WebElement selectIteminfodropdwon;
		
	@FindBy(xpath="//a[@href='/ItemType/ManageItemType']")
    public WebElement clickItemsType;
		
	@FindBy(xpath="//*[@id='hrefTable']")
    public WebElement ItemTypeTableGrid;
	
	@FindBy(xpath="//*[@id='jqg_grid_198']")
    public WebElement ItemTypeSelection;
	
	@FindBy(xpath="//*[@id='btn_Edit']")
    public WebElement ItemTypeEdit;
	
	@FindBy(xpath="//*[@id='headingOne']/div/a")
    public WebElement ItemTypeExternallinks;
	@FindBy(xpath="//*[@id='Addattribute']")
    public WebElement ItemTypeAttribute;
	
	//Attributes Creation
	//***********Add New**************
	@FindBy(xpath="//*[@id='New']")
    public WebElement AttributeNew;
	@FindBy(xpath="//*[@id='AttributeName']")
    public WebElement AttributeName;
	@FindBy(xpath="//*[@id='required']")
    public WebElement IsRequired;
	
	@FindBy(xpath="//select[@id='fieldType']")
    public WebElement AttributeType;
	@FindBy(xpath="//select[@id='fieldType']/option[2]")
    public WebElement AttributeValue;
	
	
	//SectionsCreation
	@FindBy(xpath="//*[@id='addSection']")
    public WebElement AddSection;
	@FindBy(xpath="//*[@id='txtNewSection']")
    public WebElement SectionName;
	
	@FindBy(xpath=".//*[@id='newSection']/dl/dt/a/span")
    public WebElement SectionType;
	@FindBy(xpath="//*[@id='newSection']/dl/dd/ul/li[1]")
    public WebElement SectionValue;
	
	@FindBy(xpath="//*[@id='saveSection']")
    public WebElement SectionSave;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement SectionSaveOk;
	
	
	//SectionSelection
	@FindBy(xpath="//select[@id='AttributeSection']")
    public WebElement SectionTypedrop;
	@FindBy(xpath="//select[@id='AttributeSection']/option[2]")
    public WebElement SectionTypeValue;
	
	
	@FindBy(xpath="//a[@id='save']")
    public WebElement AttributeSave;
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement AttributeSaveOK;
	
	
	
	//**********************************************************************************
	
	
	
	
	
	
	
	
	

	/*
	@FindBy(xpath="//*[@id='Ok-ItemClassPopup']/div")
    public WebElement ItemClassOk;
	
	
	@FindBy(xpath="//input[@data-attr='ItemTypeName']")
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

	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveandnew;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okbtn;*/
	
	@FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
	public WebElement Dashboard; 

	/*@FindBy(xpath="//*[@id='cancel']/div")
    public WebElement Back;*/
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement TypePageCount;
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement TypePageCountValue;
	
	
	
	
	/*Methods */
	public ItemClass ClickTypePageCount() throws InterruptedException {
		Common.click(TypePageCount);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass ClickTypePageCountValue() throws InterruptedException {
		Common.click(TypePageCountValue);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	
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
	
	public ItemClass selectItemsType() throws InterruptedException {
		Common.click(clickItemsType);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass SelectItemTypeTableGrid() throws InterruptedException {
		Common.click(ItemTypeTableGrid);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass SelectItemTypeSelection() throws InterruptedException {
		//Common.click(ItemClassValue);
		
		Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_grid_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	    Common.click(randomElement);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickItemTypeEdit() throws InterruptedException {
		Common.click(ItemTypeEdit);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickItemTypeExternallinks() throws InterruptedException {
		Common.click(ItemTypeExternallinks);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass SelectItemTypeAttribute() throws InterruptedException {
		Common.click(ItemTypeAttribute);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass SelectAttributeNew() throws InterruptedException {
		Common.click(AttributeNew);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass EnterAttributeName(String ATTRNAME) throws InterruptedException {
/*		Common.Enterdata(ITMTYNME, Itemtypename);*/
		AttributeName.sendKeys(ATTRNAME);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass SelectIsRequired() throws InterruptedException {
		IsRequired.click();
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	
	public ItemClass SelectAttributeType() throws InterruptedException {
		Common.click(AttributeType);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass SelectAttributeValue() throws InterruptedException {
		Common.click(AttributeValue);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	
	public ItemClass SelectAddSection() throws InterruptedException {
		Common.click(AddSection);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass EnterSectionName(String SECNAME) throws InterruptedException {
		/*		Common.Enterdata(ITMTYNME, Itemtypename);*/
		SectionName.sendKeys(SECNAME);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass SelectSectionType() throws InterruptedException {
		Common.click(SectionType);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass SelectSectionValue() throws InterruptedException {
		Common.click(SectionValue);
		return PageFactory.initElements(driver, ItemClass.class);
	}

	
	public ItemClass ClickSectionSave() throws InterruptedException {
	Common.click(SectionSave);
	return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickSectionSaveOk() throws InterruptedException {
	Common.click(SectionSaveOk);
	return PageFactory.initElements(driver, ItemClass.class);
	}
	
	
	public ItemClass ClickSectionTypedrop() throws InterruptedException {
		Common.click(SectionTypedrop);
		return PageFactory.initElements(driver, ItemClass.class);
		}
	public ItemClass ClickSectionTypeValue() throws InterruptedException {
		Common.click(SectionTypeValue);
		return PageFactory.initElements(driver, ItemClass.class);
		}
	
	public ItemClass ClickAttributeSave() throws InterruptedException {
		Common.click(AttributeSave);
		return PageFactory.initElements(driver, ItemClass.class);
		}
	public ItemClass ClickAttributeSaveOK() throws InterruptedException {
		Common.click(AttributeSaveOK);
		return PageFactory.initElements(driver, ItemClass.class);
		}
	
	
	
	public ItemClass ClickSectionTypeByValue(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//select[@id='AttributeSection']//option[text()='"+data+"']")));
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass SelectItemTypeByName(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@id='managegridwidth']//td[@aria-describedby='grid_ItemTypeName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ItemClass.class);
	}

	/*public ItemClass ClickItmeTypeBack() throws InterruptedException {
		Common.click(Back);
		return PageFactory.initElements(driver, ItemClass.class);
		}
*/
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

