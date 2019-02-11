package com.issquared.PageObjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class PurchaseOrder {
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public PurchaseOrder(WebDriver driver) {
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
	
	
	@FindBy(xpath="//a[@id='Assests' and @href='/DefaultLanding/Assets']//div[@class='div-text']")
    public WebElement selectassets;
	
	
	@FindBy(xpath="//*[text()='Purchase Order' and @class='nav-label']")
    public WebElement selectPurchaseOrderdropdwon;
	
	@FindBy(xpath="//li[@id='754']")
    public WebElement clickPurchaseOrder;
	
	/*@FindBy(xpath="//span[@id='addPorchaseOrder']")
    public WebElement selectNew;*/
	
	@FindBy(xpath="//*[@id='add']")
    public WebElement selectNew;
	
	@FindBy(xpath="//input[@id='PurchaseOrderName']")
    public WebElement EnterPruchaseOrderName;
	
	
	 	/*@FindBy(xpath="//a[@href='/AssetProcurement/OrganizationGridPopup?Name=purchaseOrder']")
    	public WebElement VendorNameSearch;*/
    	
    			
    	@FindBy(xpath="//a[@href='/Meta_Organizations/OrganizationGridPopup?Name=purchaseOrder']")
    	public WebElement VendorNameSearch;		
    			
    	/*@FindBy(xpath="//select[@role='listbox']")
    	public WebElement VendorListbox;*/ 
    	
    	@FindBy(xpath="//*[@id='pagerOrganization_center']/table/tbody/tr/td[8]/select")
    	public WebElement VendorListbox;
    	
    	@FindBy(xpath="//select[@role='listbox']/option[4]")
    	public WebElement VendorListboxvalue;
    	
    	@FindBy(xpath="//*[@id='jqg_gridOrganization_52443']")
    	public WebElement VendorOrganiationValue;
    	
    	@FindBy(xpath="//*[@id='pagerOrganization_center']/table/tbody/tr/td[8]/select")
        public WebElement vendorOrganiationPageCount;
    	
    	@FindBy(xpath="//*[@id='pagerOrganization_center']/table/tbody/tr/td[8]/select/option[4]")
        public WebElement vendorOrganiationPageCountValue;
    	
    	@FindBy(xpath="//*[@id='Ok-OrganizationNamePopup']/div")
    	public WebElement VendorOrganizationOk;
    
	
	@FindBy(xpath="//*[@id='PurchaseDate']")
    public WebElement Enterpurchasedate;
	
	@FindBy(xpath="//*[@id='PurchaseOrderNumber']")
    public WebElement EnterpurchaseOrderNum;
	
	@FindBy(xpath="//*[@id='Price']")
    public WebElement EnterAmount;
	
	@FindBy(xpath="//select[@id='PriceUnit']")
    public WebElement AmountCurrencyType;
	@FindBy(xpath="//select[@id='PriceUnit']/option[72]")
    public WebElement AmountCurrencyTypeValue;
	
	@FindBy(xpath="//*[@id='AddressLine1']")
    public WebElement EnterAddress1;
	@FindBy(xpath="//*[@id='AddressLine2']")
    public WebElement EnterAddress2;
	@FindBy(xpath="//*[@id='AddressLine3']")
    public WebElement EnterAddress3;
	
	@FindBy(xpath="//*[@id='ddlCountry_title']")
    public WebElement CountryValue;
	@FindBy(xpath="//*[@id='ddlCountry_child']/ul/li[104]")
    public WebElement CountryValueSelection;
	
	@FindBy(xpath="//select[@id='ddlState']/option[3]")
    public WebElement StateValue;
	
	@FindBy(xpath="//*[@id='City']")
    public WebElement EnterCityName;
	@FindBy(xpath=".//*[@id='Zipcode']")
    public WebElement EnterZipCode;
	
	@FindBy(xpath=".//*[@id='Description']")
    public WebElement EnterDescription;
	
	/*@FindBy(xpath="//div[@class='note-editable']")
    public WebElement EnterNotes;*/
	
   	@FindBy(xpath="//div[@class='note-editable panel-body']")
      public WebElement EnterNotes;
    		
    		
	@FindBy(xpath="//*[@id='save']/div")
	public WebElement BasicSave;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
	public WebElement BasicSaveAndNew;
	
	@FindBy(xpath="//button[@class='confirm']")
	public WebElement BasicSaveOk;
	
	//*****************************************Pruchase Order Items Tab Elements********************************************
	
	 @FindBy(xpath="//*[@id='PurchaseItemsnew']/label")
    public WebElement PruchaseOrderItemsNew; 
    
    @FindBy(xpath="//*[@id='CItems']")
    public WebElement pruchaseOrderItemsTab;
    
    //********************ItemClassSearch*****************
	@FindBy(xpath="//a[@href='/ItemClass/ItemClassGridPopup']")
    public WebElement ItemClassSearch;
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement ItemPageDrop;
	
	/*@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement ItemPageDropValue;*/   
	
	/*@FindBy(xpath="//*[@class='gridcont']//option[@value='100' and text()='100']")
    public WebElement ItemPageDropValue;*/
	
	@FindBy(xpath="//*[@id='ItemClass']//option[@value='100' and text()='100']")
    public WebElement ItemPageDropValue;
	
	/*@FindBy(xpath="//*[@id='ItemType']//option[@value='100' and text()='100']")
    public WebElement ItemTypePageDropValue;*/
	
	@FindBy(xpath="//*[@id='ItemType1']//option[@value='100' and text()='100']")
    public WebElement ItemTypePageDropValue;
	
	@FindBy(xpath="//*[@class='gridcont']//option[@value='100' and text()='100']")
    public WebElement ItemSubTypePageDropValue;
	
	@FindBy(xpath="//*[@class='gridcont']//option[@value='100' and text()='100']")
    public WebElement wareHousePageDropValue;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement wareHousePageDropValue1;
	
	@FindBy(xpath="//*[@id='pagerContractName_center']/table/tbody/tr/td[8]/select")
    public WebElement contractPageDrop;
	
	@FindBy(xpath="//*[@id='pagerContractName_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement contractPageDropValue;   
	
	
	@FindBy(xpath="//*[@id='jqg_gridItemClass_148']")
    public WebElement ItemClassValue;
	@FindBy(xpath="//*[@id='Ok-ItemClassPopup']/div")
    public WebElement ItemClassOk;
    
    //div[@class='gridcont']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='IT Assets']
    //div[@class='gridcont']//td[@aria-describedby='gridItemType_ItemTypeName' and text()='Desktop']
    //div[@class='gridcont']//td[@aria-describedby='gridItemSubTypePopup_ItemSubTypeName' and text()='Windows']
    //div[@class='gridcont']//td[@aria-describedby='gridItemSKU_ItemName' and text()='Dell']
    
    //*********************ItemTypeSearch*****************
    @FindBy(xpath="//a[@href='/ItemType/TypeGridPopup']")
    public WebElement ItemTypeSearch;
	@FindBy(xpath="//*[@id='jqg_gridItemType_198']")
    public WebElement ItemTypeValue;
	@FindBy(xpath="//*[@id='Ok-ItemTypePopup']/div")
    public WebElement ItemTypeOk;
    
   //***********************ItemSbutypeSearch************* 
    @FindBy(xpath="//a[@href='/ItemSubType/SubTypeGridPopup']")
    public WebElement ItemSubtypeSearch;
	@FindBy(xpath=".//*[@id='jqg_gridItemSubTypePopup_317']")
    public WebElement ItemSubtypeValue;
	@FindBy(xpath="//*[@id='Ok-ItemSubTypePopup']/div")
    public WebElement ItemSubtypeOk;
    
    //***********************ItemSKUMasterSearch*************
    @FindBy(xpath="//a[@href='/ItemMasterSKU/SKUSearch?Name=PurchaseOrder']")
    public WebElement ItemSKUSearch;
	@FindBy(xpath="//*[@id='jqg_gridItemSKU_221']")
    public WebElement ItemSKUValue;
	@FindBy(xpath="//*[@id='Ok-ItemSKUPopup']/div")
    public WebElement ItemSKUOk;   
    
	@FindBy(xpath="//a[@href='/Warehouse/WarehouseGridPopup']")
    public WebElement wareHouseSearch; 
	@FindBy(xpath="//*[@id='Ok-WarehousePopup']/div")
    public WebElement wareHouseOk;
	//**************************************************************
	@FindBy(xpath="//*[@id='UnitPrice']")
    public WebElement unitPrice;
	
	@FindBy(xpath="//*[@id='ShippingUnitCost']")
    public WebElement shippingUnitCost;
	
	@FindBy(xpath="//*[@id='OtherUnitCost']")
    public WebElement otherUnitCost;
	
	@FindBy(xpath="//*[@id='Count']")
    public WebElement count;
	//*****************************************************************
	
    @FindBy(xpath=".//*[@id='ItemName']")
    public WebElement EnterCount;
    
    @FindBy(xpath=".//*[@id='save']/div")
    public WebElement PruchaseOrderItemmSave;
    @FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement PruchaseOrderItemsSaveNew;
    @FindBy(xpath="//button[@class='confirm']")
    public WebElement PurchaseOrderSaveOK;
    
    
    
    @FindBy(xpath="//*[@id='Back']/div")
    public WebElement PurchaseOrderItemBack;
    
    
	//**********************************Purchase Order Contracts Elements****************************************
	
	 @FindBy(xpath="//*[@id='step1-content']")
    public WebElement PurchaseOrderContractsTab;
	@FindBy(xpath=".//*[@id='click_me']/label")
    public WebElement PurchaseOrderContractsNew;
	
	//div[@class='gridcont']//td[@aria-describedby='gridItemSKU_ItemName' and text()='Dell']
	
	@FindBy(xpath="//select[@id='ContractType']")
    public WebElement ContractType;
	@FindBy(xpath="//select[@id='ContractType']/option[2]")
    public WebElement ContractTypeValue;
    
    
	@FindBy(xpath="//a[@id='ContractTypeLink']")
    public WebElement ContractNameSearch;
	@FindBy(xpath=".//*[@id='jqg_gridContractName_20692']")
    public WebElement ContractNameValue;
	@FindBy(xpath="//*[@id='Ok-ContractName']/div")
    public WebElement ContractNameOk;
    
	@FindBy(xpath="//*[@id='EffectiveDate']")
    public WebElement EnterEffectiveDate;
    
	@FindBy(xpath=".//*[@id='EndDate']")
    public WebElement EnterEndDate;
	
	@FindBy(xpath=".//*[@id='RemovalDate']")
    public WebElement EnterRemovalDate;
    
    @FindBy(xpath=".//*[@id='PurchaseOrderContractDesc']")
    public WebElement ContractDescription;
    
	@FindBy(xpath="//*[@id='btn-SaveContract']/div")
    public WebElement ContractSave;
    
    @FindBy(xpath="//button[@class='confirm']")
    public WebElement ContractSaveOK;
    
    @FindBy(xpath=".//*[@id='btn-CancelContract']/div")
    public WebElement ContractBack;
    
    
	//*******************Purchase Order Documents Elements*******************************
	
	@FindBy(xpath="//*[@id='pODoc']")
    public WebElement PurchaseDocumentstab;
	@FindBy(xpath="//*[@id='PoDocs']")
    public WebElement PurchaseDocsNew;
	
	@FindBy(xpath="//*[@id='DocumentTitle']")
    public WebElement PurchaseDocTitle;
	@FindBy(xpath="//*[@id='txtDocVerNo']")
    public WebElement PurchaseDocverno;
	@FindBy(xpath="//*[@id='DocumentDescription']")
    public WebElement PurDocDescrp;
	
	@FindBy(xpath="//*[@id='UploadDoc']")
    public WebElement PurDocUpload;
	@FindBy(xpath="///*[@id='Save']/div")
    public WebElement DocxSave;
	
	/*@FindBy(xpath="//*[@id='SaveNew-Documents']/div")
    public WebElement DocsSaveNew;*/
	
	
	@FindBy(xpath="//*[@id='SaveNew-Docs']/div")
    public WebElement DocsSaveNew;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement DocSaveOk;
	
	@FindBy(xpath="//*[@id='btncan']/div")
    public WebElement DocCancel;
	
	
//*********************Other Information Save, Save&New, Back*******************************************************
	@FindBy(xpath="//*[@id='save']/div")
    public WebElement PurchasOrdeotherSave;
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement PurchasOrderSaveNew; 
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement PurchaseOrderSaveOk;
	@FindBy(xpath="//*[@id='cancelDetails']/div")
    public WebElement PurchaseOrderBack;
	
	@FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
	public WebElement Dashboard;
	
	
	
//****************************************************End************************************************************
	
	
		

/***************************************************Pruchase Order Methods**********************************************************************************/
    
/*public PurchaseOrder openurl(String url)
{
	driver.get(url);
	return PageFactory.initElements(driver, PurchaseOrder.class);	
}



public PurchaseOrder UserName(String un) {
	UserName.sendKeys(un);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder password(String pw) {
	Password.sendKeys(pw);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder  DomainName(String dn)  {
	DomainName.sendKeys(dn);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder sigin() throws InterruptedException {
	Common.click(Login);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder selectImage() throws InterruptedException {
	Common.click(Imageselect);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder clickVerifyButton() throws InterruptedException {
	Common.click(clickVerify);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}*/

	
	
public PurchaseOrder selectassets() throws InterruptedException {
	Common.click(selectassets);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}


public PurchaseOrder SelectAssetsDashboard() throws InterruptedException
{
	Common.click(Dashboard);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}


public PurchaseOrder selectPurchaseOrderdropdwon() throws InterruptedException {
	Common.click(selectPurchaseOrderdropdwon);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}


public PurchaseOrder clickPurchaseOrder() throws InterruptedException {
	Common.click(clickPurchaseOrder);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder PurchaseOrderclickNew() throws InterruptedException {
	Common.click(selectNew);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder  EnterPruchaseOrderName(String Purnme)  {
	EnterPruchaseOrderName.sendKeys(Purnme);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder ClickVendorNameSearch() throws InterruptedException {
	Common.click(VendorNameSearch);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder ClickVendorListbox() throws InterruptedException {
	Common.click(VendorListbox);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
/*public PurchaseOrder ClickVendorListboxvalue() throws InterruptedException {
	Common.click(VendorListboxvalue);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}*/
public ItemClass ClickVendorListboxvalue() throws InterruptedException {
	Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//option[@value='100' and text()='100']")));
	return PageFactory.initElements(driver, ItemClass.class);
} 

public ItemClass VendorOrganiationClickPageCount() throws InterruptedException {
	Common.click(vendorOrganiationPageCount);
	return PageFactory.initElements(driver, ItemClass.class);
}
public ItemClass VendorOrganiationSelectPageCountValue() throws InterruptedException {
	Common.click(vendorOrganiationPageCountValue);
	return PageFactory.initElements(driver, ItemClass.class);
}

/*public PurchaseOrder ClickVendorOrganiationValue() throws InterruptedException {
	//Common.click(VendorOrganiationValue);
	Random r = new java.util.Random();
    List<WebElement> links = driver.findElements(By.xpath("//td[contains(@aria-describedby,'gridOrganization_ObjectValue')]"));

    WebElement randomElement = links.get(r.nextInt(links.size()));
    commonUtil.click(randomElement);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}*/
/*public ItemClass ClickVendorOrganiationValue(String data) throws InterruptedException {
	Common.click(driver.findElement(By.xpath("//div[@class='gridcontorg']//td[@aria-describedby='gridOrganization_ObjectValue' and text()='"+data+"']")));
	return PageFactory.initElements(driver, ItemClass.class);
} */ 

  public PurchaseOrder ClickVendorOrganiationValue(String data) throws InterruptedException {
	
    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridOrganization')]"));
 
    WebElement Element = links.get(0);
    Common.click(Element);
	return PageFactory.initElements(driver, PurchaseOrder.class);
  }
public PurchaseOrder ClickVendorOrganizationOk() throws InterruptedException {
	Common.click(VendorOrganizationOk);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder  Enterpurchasedate(String PurchDte)  {
	Enterpurchasedate.sendKeys(PurchDte);
	return PageFactory.initElements(driver, PurchaseOrder.class);
 }
public PurchaseOrder  EnterpurchaseOrderNumber(String PurchOrderNum)  {
	EnterpurchaseOrderNum.sendKeys(PurchOrderNum);
	return PageFactory.initElements(driver, PurchaseOrder.class);
 }

public PurchaseOrder  EnterAmount(String Amt)  {
	EnterAmount.clear();
	EnterAmount.sendKeys(Amt);
	return PageFactory.initElements(driver, PurchaseOrder.class);
 }

public PurchaseOrder SelecAmountCurrencyType() throws InterruptedException {
	Common.click(AmountCurrencyType);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder SelectAmountCurrencyTypeValue() throws InterruptedException {
	Common.click(AmountCurrencyTypeValue);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder  EnterAddress1(String Adr1)  {
	EnterAddress1.sendKeys(Adr1);
	return PageFactory.initElements(driver, PurchaseOrder.class);
 }
public PurchaseOrder  EnterAddress2(String Adr2)  {
	EnterAddress2.sendKeys(Adr2);
	return PageFactory.initElements(driver, PurchaseOrder.class);
 }
public PurchaseOrder  EnterAddress3(String Adr3)  {
	EnterAddress3.sendKeys(Adr3);
	return PageFactory.initElements(driver, PurchaseOrder.class);
 }

public PurchaseOrder SelectCountryValue() throws InterruptedException {
	Common.click(CountryValue);
	//CountryValue.click();
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder SelectCountryValueSelection() throws InterruptedException {
	Common.click(CountryValueSelection);
	//CountryValueSelection.click();
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder SelectStateValue() throws InterruptedException {
	Common.click(StateValue);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder  EnterCityName(String Adr3)  {
	EnterCityName.sendKeys(Adr3);
	return PageFactory.initElements(driver, PurchaseOrder.class);
 }
public PurchaseOrder  EnterZipCode(String Adr3)  {
	EnterZipCode.sendKeys(Adr3);
	return PageFactory.initElements(driver, PurchaseOrder.class);
 }
public PurchaseOrder  EnterDescription(String Adr3)  {
	EnterDescription.sendKeys(Adr3);
	return PageFactory.initElements(driver, PurchaseOrder.class);
 }
public PurchaseOrder EnterNotes(String NTS)  {
	EnterNotes.sendKeys(NTS);
	return PageFactory.initElements(driver, PurchaseOrder.class);
 }

public PurchaseOrder ClickBasicSave() throws InterruptedException {
	Common.click(BasicSave);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder ClickBasicSaveAndNew() throws InterruptedException {
	Common.click(BasicSaveAndNew);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder ClickBasicSaveOk() throws InterruptedException {
	Common.click(BasicSaveOk);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder ClickPruchaseOrderItemsTab() throws InterruptedException {
	Common.click(pruchaseOrderItemsTab);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder ClickPruchaseOrderItemsNew() throws InterruptedException {
	Common.click(PruchaseOrderItemsNew);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

/*
public ItemClass SelectItemClassByName(String data) throws InterruptedException {
	Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
	return PageFactory.initElements(driver, ItemClass.class);
}
*/
//*************************Item Class Methods*************************
public PurchaseOrder ClickItemClassSearch() throws InterruptedException {
	Common.click(ItemClassSearch);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder ClickItemPageDrop() throws InterruptedException {
	Common.click(ItemPageDrop);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder ClickItemPageDropValue() throws InterruptedException {
	Common.click(ItemPageDropValue);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder ClickItemTypePageDropValue() throws InterruptedException {
	Common.click(ItemTypePageDropValue);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder ClickItemSubTypePageDropValue() throws InterruptedException {
	Common.click(ItemSubTypePageDropValue);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder ClickWarehousePageDropValue100() throws InterruptedException {
	//driver.findElement(By.xpath("//select[@role='listbox']/option[4]")).click();
	Common.click(wareHousePageDropValue);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

/*public PurchaseOrder ClickItemClassByName(String data) throws InterruptedException {
	Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemClassPopup_ItemClassName' and text()='"+data+"']")));
	return PageFactory.initElements(driver, PurchaseOrder.class);
}*/

public PurchaseOrder ClickItemClassByName() throws InterruptedException {
	
    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@title,'IT Assets-PNG')]"));

    WebElement Element = links.get(0);
    Common.click(Element);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}


public PurchaseOrder ClickItemClassOk() throws InterruptedException {
	Common.click(ItemClassOk);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

//*************************Item Types Methods*************************

 public PurchaseOrder ClickItemTypeSearch() throws InterruptedException {
	Common.click(ItemTypeSearch);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
/*public PurchaseOrder ClickItemTypeByName(String data) throws InterruptedException {
	Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemType_ItemTypeName' and text()='"+data+"']")));
	return PageFactory.initElements(driver, PurchaseOrder.class);
}*/
 
 public PurchaseOrder ClickItemTypeByName() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@aria-describedby,'gridItemType_ItemTypeName')]"));
	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, PurchaseOrder.class);
	}

public PurchaseOrder ClickItemTypeOk() throws InterruptedException {
	Common.click(ItemTypeOk);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

//***********************Item Subtypes Methods****************************
public PurchaseOrder ClicItemSubtypeSearch() throws InterruptedException {
	Common.click(ItemSubtypeSearch);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
/*public PurchaseOrder ClickItemSubTypeByName(String data) throws InterruptedException {
	Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemSubTypePopup_ItemSubTypeName' and text()='"+data+"']")));
	return PageFactory.initElements(driver, PurchaseOrder.class);
}*/

public PurchaseOrder ClickItemSubTypeByName() throws InterruptedException {
	
    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@aria-describedby,'gridItemSubTypePopup_ItemSubTypeName')]"));
    WebElement Element = links.get(0);
    Common.click(Element);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder ClickItemSubtypeOk() throws InterruptedException {
	Common.click(ItemSubtypeOk);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

//***********************Item SKU's*******************************************
public PurchaseOrder ClicItemSKUSearch() throws InterruptedException {
	Common.click(ItemSKUSearch);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
/*public PurchaseOrder ClickItemSKUByName(String data) throws InterruptedException {
	Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemSKU_ItemName' and text()='"+data+"']")));
	return PageFactory.initElements(driver, PurchaseOrder.class);
}*/

public PurchaseOrder ClickItemSKUByName() throws InterruptedException {
	
    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@aria-describedby,'gridItemSKU_ItemName')]"));
    WebElement Element = links.get(0);
    Common.click(Element);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder ClickItemSKUOk() throws InterruptedException {
	Common.click(ItemSKUOk);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

//*************************************************************************************************


//***********************Warehouses*******************************************
public PurchaseOrder ClicWarehouseSearch() throws InterruptedException {
	Common.click(wareHouseSearch);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
/*public PurchaseOrder ClickWarehouseByName(String data) throws InterruptedException {
	Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridWarehouse_WarehouseName' and text()='"+data+"']")));
	return PageFactory.initElements(driver, PurchaseOrder.class);
}*/

public PurchaseOrder ClickWarehouseByName() throws InterruptedException {
	
    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@aria-describedby,'gridWarehouse_WarehouseName')]"));
    WebElement Element = links.get(0);
    Common.click(Element);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder ClickWarehouseOk() throws InterruptedException {
	Common.click(wareHouseOk);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
//**************************************************************************************
public PurchaseOrder EnterUnitPrice(String UnitPrice) throws InterruptedException {
	unitPrice.sendKeys(UnitPrice);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

/*public PurchaseOrder EnterShippingUnitCost(String ShipingUnitCost) throws InterruptedException {
	shippingUnitCost.sendKeys(ShipingUnitCost);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}*/
public PurchaseOrder EnterShippingUnitCost(String ShipingUnitCost) throws InterruptedException {
	shippingUnitCost.sendKeys(ShipingUnitCost);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}



public PurchaseOrder EnterOtherUnitCost(String OtherUnitCst) throws InterruptedException {
	otherUnitCost.sendKeys(OtherUnitCst);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder EnterCount(String count1) throws InterruptedException {
	count.sendKeys(count1);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder SelectPruchaseOrderItemSave() throws InterruptedException {
	Common.click(PruchaseOrderItemmSave);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder SelectPruchaseOrderItemsSaveNew() throws InterruptedException {
	Common.click(PruchaseOrderItemsSaveNew);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder SelectPurchaseOrderSaveOK() throws InterruptedException {
	Common.click(PurchaseOrderSaveOK);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder SelectPurchaseOrderItemBack() throws InterruptedException {
	Common.click(PurchaseOrderItemBack);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}


//***********Purchase Order Contracts Tab****************
public PurchaseOrder ClickPurchaseOrderContractsTab() throws InterruptedException {
	Common.click(PurchaseOrderContractsTab);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder ClickPurchaseOrderContractsNew() throws InterruptedException {
	Common.click(PurchaseOrderContractsNew);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder ClickContractType() throws InterruptedException {
	Common.click(ContractType);
	//ContractType.click();
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder ClickContractTypeValue() throws InterruptedException {
	Common.click(ContractTypeValue);
	//ContractTypeValue.click();
	return PageFactory.initElements(driver, PurchaseOrder.class);
}


public PurchaseOrder ClickContractNameSearch() throws InterruptedException {
	Common.click(ContractNameSearch);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

/*public PurchaseOrder SelectContractNameSelection() throws InterruptedException {
	//Common.click(ContractItemSelection);
	List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridContractName_')]"));
	 int iSize = oCheckBox.size();
	 System.out.println(iSize);
	 for(int i=0; i < iSize ; i++ )
	 {
		 oCheckBox.get(i).click();
	 } 
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
*/

public PurchaseOrder ClickcontractPageDrop() throws InterruptedException {
	Common.click(contractPageDrop);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder ClickcontractPageDropValue() throws InterruptedException {
	Common.click(contractPageDropValue);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

/*public PurchaseOrder SelectContractNameSelection(String data) throws InterruptedException {
	Common.click(driver.findElement(By.xpath("//div[@class='gridcontContractName']//td[@aria-describedby='gridContractName_MaintenanceContractName' and text()='"+data+"']")));
	return PageFactory.initElements(driver, PurchaseOrder.class);
}*/

public PurchaseOrder SelectContractNameSelection() throws InterruptedException {
	
    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridContractName')]"));
 
    WebElement Element = links.get(1);
    Common.click(Element);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder ClickContractNameOk() throws InterruptedException {
	Common.click(ContractNameOk);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}


public PurchaseOrder EnterEffectiveDate(String ECount) throws InterruptedException {
	EnterEffectiveDate.sendKeys(ECount);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder EnterEndDate(String ECount) throws InterruptedException {
	EnterEndDate.sendKeys(ECount);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder EnterRemovalDate(String ECount) throws InterruptedException {
	EnterRemovalDate.sendKeys(ECount);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder EnterContractDescription(String ECount) throws InterruptedException {
	ContractDescription.sendKeys(ECount);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}


public PurchaseOrder ClickContractSave() throws InterruptedException {
	Common.click(ContractSave);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder ClickContractSaveOK() throws InterruptedException {
	Common.click(ContractSaveOK);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder ClickContractBack() throws InterruptedException {
	Common.click(ContractBack);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}


/////***************************Documents Tab*************************
public PurchaseOrder ClickDocumentsTab() throws InterruptedException {
	Common.click(PurchaseDocumentstab);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder clickDocumentsCreateNew() throws InterruptedException {
	//Common.click(DocumentsCreateNew);
	PurchaseDocsNew.click();
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder EnterDocTitle(String Doctitle) throws InterruptedException {
	PurchaseDocTitle.sendKeys(Doctitle);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder EnterDocVersionNo(String Docversn) throws InterruptedException {
	PurchaseDocverno.sendKeys(Docversn);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder EnterDocDescription(String DocDesc) throws InterruptedException {
	PurDocDescrp.sendKeys(DocDesc);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder Documentupload(String Docupld) throws InterruptedException {
	PurDocUpload.sendKeys(Docupld);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder clickDocSaveNew() throws InterruptedException {
	Common.click(DocsSaveNew);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder clickDocSave() throws InterruptedException {
	Common.click(DocxSave);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder clickDocSaveokpopup() throws InterruptedException {
	Common.click(DocSaveOk);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder clickDocCancel() throws InterruptedException {
	Common.click(DocCancel);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}


//************************Other Information Save,Save&New and Back******************
public PurchaseOrder clickOtherInformationSave() throws InterruptedException {
	Common.click(PurchasOrdeotherSave);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder clickOtherInformationSavenew() throws InterruptedException {
	Common.click(PurchasOrderSaveNew);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder clickOtherInformationSavenewOk() throws InterruptedException {
	Common.click(PurchaseOrderSaveOk);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder clickOtherInformationCancel() throws InterruptedException {
	Common.click(PurchaseOrderBack);
	return PageFactory.initElements(driver, PurchaseOrder.class);
}

//******************************************End********************************************************************************************************************************
/*
public PurchaseOrder Scrolldown() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
return PageFactory.initElements(driver, PurchaseOrder.class);
}
//up
public PurchaseOrder ScrollUp() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
return PageFactory.initElements(driver, PurchaseOrder.class);
}

public PurchaseOrder Scrollmiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,250)","");
return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder ScrollUpMiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(-0,-250)","");
return PageFactory.initElements(driver, PurchaseOrder.class);
}
public PurchaseOrder Scrolldownlast() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(250)","");
return PageFactory.initElements(driver, PurchaseOrder.class);
}*/
/*public PurchaseOrder InViewPortTab() throws Exception
{
	inViewPortt(SelectProgramIssues);
	SelectProgramIssues.click();
	return PageFactory.initElements(driver, PurchaseOrder.class);
 }
public static void inViewPortt(WebElement e) throws Exception
{
	Coordinates ord = ((Locatable)e).getCoordinates();
	ord.inViewPort();

	Thread.sleep(500);
}
*/




}	
