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

public class Items {
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public Items(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}

	
	/* Properties */
	@FindBy(id="Assests")
    public WebElement selectassets;
	
	
	@FindBy(xpath="//*[text()='Item Info' and @class='nav-label']")
    public WebElement selectIteminfodropdwon;
		
	@FindBy(xpath="//a[@href='/Items/ItemSubTypeManage']")
    public WebElement clickItems;   
	
	@FindBy(xpath="//a[@href='/ItemMasterSKU/ManageItemMasterSKU']")
    public WebElement clickMasterSKU;  
	
	//Item Class Selection    
	@FindBy(xpath="//*[@id='wrapper']/div[2]/div[2]/div/div/div/div[1]/div[1]/div/span/a/b")
    public WebElement ItemSKUName_AdvncedSearch;    
    
    @FindBy(xpath="//*[@id='chkAdvancedSearch']") 
    public WebElement ItemSKU_AdvncedSearchCheckBox; 
    
    @FindBy(xpath="//*[@id='Ok-ItemSKUPopup']/div")
    public WebElement ItemSKU_OK;
    
    @FindBy(xpath="//*[@id='Cancel-ItemSKUPopup']/div")
    public WebElement ItemSKU_Cancel;  
    
    @FindBy(xpath="//*[@id='searchByColumn']")
    public WebElement ItemSKU_SearckBox;
    
    @FindBy(xpath="//*[@id='modal-container']/div/div/div[2]/div/div/button")
    public WebElement ItemSKU_SearckBottn;
	
	/*@FindBy(xpath="//a[@href='/ItemClass/ItemClassGridPopup?Name=Items']") 
    public WebElement ItemClassSearch;  */
    
    /*@FindBy(xpath="//*[@id='AdvancedSearchData']/div[1]/div/span/a/b") 
    public WebElement ItemClassSearch; */ 
	
    @FindBy(xpath="//*[@id='AdvancedSearchData']/div[1]/div/span/a/b") 
    public WebElement ItemClassSearch; 
    
	@FindBy(xpath="//*[@id='jqg_gridItemClass_114']")
    public WebElement ItemClassValue;
	
	/*@FindBy(xpath="//select[@role='listbox']")
    public WebElement PageCount;*/
	
	/*@FindBy(xpath="//*[@id='pagerItemClass_center']/table/tbody/tr/td[8]/select")
    public WebElement PageCount;*/
	
	@FindBy(xpath="//*[@id='pagerItemClassPopup_center']/table/tbody/tr/td[8]/select")
    public WebElement PageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement PageCountValue;
	
	@FindBy(xpath="//*[@id='Ok-ItemClassPopup']/div")
    public WebElement ItemClassOk;

	//Item Type Selection
	@FindBy(xpath="//*[@id='lnkItemType']/b")
    public WebElement ItemTypeSearch;
	
	@FindBy(xpath="//*[@id='jqg_gridItemType_139']")
    public WebElement ItemtypeValue;
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement TypePageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement TypePageCountValue;
	
	@FindBy(xpath="//*[@id='Ok-ItemTypePopup']/div")
    public WebElement ItemTypeOk;
	
	//Item Sub Type Selection
	@FindBy(xpath="//*[@id='spnSubType']/a/b")
	public WebElement ItemsubtypeSearch;
	
	@FindBy(xpath="//*[@id='jqg_gridItemSubTypePopup_172']")
	public WebElement ItemsubtypeValue;
	
	@FindBy(xpath="//select[@role='listbox']")
	public WebElement subtypePageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
	public WebElement subtypePageCountValue;
	
	@FindBy(xpath="//*[@id='Ok-ItemSubTypePopup']/div")
	public WebElement ItemsubtypeOk;
	
		
	
	
	@FindBy(xpath="//*[@id='btn_New']")
    public WebElement ItemCreateNew;
	
	
	//External Links -Sku Selection
	@FindBy(xpath="//a[@class='btn btn-default dropdown-toggle']")
    public WebElement ItemsExternallinks;
	
	/*@FindBy(xpath="//*[@id='headingOne']/div/ul/li[1]")
    public WebElement ItemsExternalSkuselection;*/
	
	
	@FindBy(xpath="//*[@id='headingOne']/div/ul/li[3]")
    public WebElement ItemsExternalSkuselection;
	
	//ItemName
	@FindBy(id="ItemNamePopup")
    public WebElement ItemName;
	
	//ItemSKUNumber
	@FindBy(id="SKUNumberPopup")
    public WebElement ItemSKU;
	
	//ItemNameDescription
	@FindBy(id="SKUNumberDescPopup")
    public WebElement ItemDescription;
	
	//ItemNameSave
	@FindBy(xpath="//*[@id='SaveItemSKU']/div")
    public WebElement ItemmNameSave; 
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement ItemmNameSaveAndNew;
	
	//ItemNameSaveOK
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement ItemmNameSaveOk;
	

	//Item Name Search
	/*@FindBy(xpath="//a[@href='/ItemMasterSKU/Grid?Name=ItemsMain']")
    public WebElement ItemnameSearch;*/
	
	@FindBy(xpath="//*[@id='ItemType']/div/div/div[2]/div/div[4]/div/span/a/b")
    public WebElement ItemnameSearch;
	
	@FindBy(xpath="//*[@id='jqg_gridItemSKU_143']")
    public WebElement ItemNameValue;
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement NamePageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement NamePageCountValue;
	
	@FindBy(xpath="//*[@id='Ok-ItemSKUPopup']/div")
    public WebElement ItemNameOk;
	
	@FindBy(xpath="//*[@id='Cancel-ItemSKU']/div")
    public WebElement BackItemSKU;
	
	@FindBy(xpath="//*[@id='cancel']/div")
    public WebElement BackItems;
	
	//Serial Number
	@FindBy(xpath="//input[@data-attr='SerialNumber']")
    public WebElement ItemSerialNumber;  
	
    //PurchaseOrderNumber
    @FindBy(xpath="//*[@id='PurchaseOrderNumber']")
    public WebElement ItemPurchaseOrderNumber;
    
    @FindBy(xpath="//*[@id='TotalItemCost']")
    public WebElement totalItemCost;
    
    @FindBy(xpath="//*[@id='TotalItemCostValue']/option[126]")
    public WebElement totalItemCostValue;
	
	//IsWarehouse
	/*@FindBy(id="IsWarehouse")
    public WebElement IsWarehouse;*/
    
    @FindBy(xpath="//*[@id='IsWarehouse']")
    public WebElement IsWarehouse_Checkbox; 
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement ItemSaveNew;

	@FindBy(xpath="//button[@class='confirm']")
    public WebElement ItemSaveNewOk;
	
	//******Assets Dashboard************
	@FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
	public WebElement Dashboard; 
	
	@FindBy(xpath="//*[@id='lnkSKU']/b")
	public WebElement clickWarehouse;
	
	@FindBy(xpath="//*[@id='lnkAssetPool']/b")
	public WebElement clickAssetpool;
	
	
	@FindBy(xpath="//*[@id='Ok-WarehousePopup']/div")
	public WebElement warehouseNameOk;  
	
	@FindBy(xpath="//*[@id='Ok-AssetPoolPopup']/div")
	public WebElement assetpoolNameOk; 
	
	
	
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
	
	public ItemClass selectItems() throws InterruptedException {
		Common.click(clickItems);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass selectMasterSKU() throws InterruptedException {
		Common.click(clickMasterSKU);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	
	public ItemClass selectItemSKU_Name() throws InterruptedException {
		Common.click(ItemSKUName_AdvncedSearch);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass selectItemSKU_AdvnceSearch() throws InterruptedException {
		Common.click(ItemSKU_AdvncedSearchCheckBox);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	
//ItemClassSelectionMethods
	/*public ItemClass ClickItemClassSearch() throws InterruptedException {
		Common.wait(ItemClassSearch);
		Common.click(ItemClassSearch);
		return PageFactory.initElements(driver, ItemClass.class);
	}*/
	
	public ItemClass ClickItemClassSearch() throws InterruptedException {
		Common.click(ItemClassSearch);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass SelectItemClassValue() throws InterruptedException {
		//Common.click(ItemClassValue);
		List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemClass_')]"));
		 int iSize = oCheckBox.size();
		 System.out.println(iSize);
		 for(int i=0; i < iSize ; i++ )
		 {
			 oCheckBox.get(i).click();
			
			 String sValue = oCheckBox.get(i).getAttribute("value");
			 if (sValue.equalsIgnoreCase("test"))
			 	{
				 
				 oCheckBox.get(i).click();
			 	}	 
		 } 
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
	
//ItemTypeSelectionMethods
	public ItemClass ClickItemTypeSearch() throws InterruptedException {
		Common.click(ItemTypeSearch);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass SelectItemtypeValue() throws InterruptedException {
		//Common.click(ItemClassValue);
		List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemType_')]"));
		 int iSize = oCheckBox.size();
		 System.out.println(iSize);
		 for(int i=0; i < iSize ; i++ )
		 {
			 oCheckBox.get(i).click();
			
			 String sValue = oCheckBox.get(i).getAttribute("value");
			 if (sValue.equalsIgnoreCase("test"))
			 	{
				 
				 oCheckBox.get(i).click();
			 	}	 
		 } 
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickTypePageCount() throws InterruptedException {
		Common.click(TypePageCount);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass ClickTypePageCountValue() throws InterruptedException {
		Common.click(TypePageCountValue);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass SelectItemTypeOk() throws InterruptedException {
		Common.click(ItemTypeOk);
		return PageFactory.initElements(driver, ItemClass.class);
	}
//ItemSubtypeSelectionMethods
	public ItemClass ClickItemsubtypeSearch() throws InterruptedException {
		Common.click(ItemsubtypeSearch);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass SelectItemsubtypeValue() throws InterruptedException {
		//Common.click(ItemClassValue);
		List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemSubTypePopup_')]"));
		 int iSize = oCheckBox.size();
		 System.out.println(iSize);
		 for(int i=0; i < iSize ; i++ )
		 {
			 oCheckBox.get(i).click();
			
			 String sValue = oCheckBox.get(i).getAttribute("value");
			 if (sValue.equalsIgnoreCase("test"))
			 	{
				 
				 oCheckBox.get(i).click();
			 	}	 
		 } 
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickItemsubtypeOk() throws InterruptedException {
		Common.click(ItemsubtypeOk);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass ClicksubtypePageCount() throws InterruptedException {
		Common.click(subtypePageCount);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass SelectsubtypePageCountValue() throws InterruptedException {
		Common.click(subtypePageCountValue);
		return PageFactory.initElements(driver, ItemClass.class);
	}
//**********End********
	
	
	public ItemClass ClickItemCreateNew() throws InterruptedException {
		Common.click(ItemCreateNew);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickItemsExternallinks() throws InterruptedException {
		Common.click(ItemsExternallinks);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass ClickItemsExternalSkuselection() throws InterruptedException {
		Common.click(ItemsExternalSkuselection);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass EnterItemName(String ITMNME) throws InterruptedException {
		  ItemName.clear();	
		Common.Enterdata(ITMNME, ItemName);
				return PageFactory.initElements(driver, ItemClass.class);
			}
	
	
	
	public ItemClass EnterItemSKU(String ITMSKU) throws InterruptedException {
		ItemSKU.clear();
		Common.Enterdata(ITMSKU, ItemSKU);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ItemClass EnterItemDescription(String ITMDESCC) throws InterruptedException {
		ItemDescription.clear();
		Common.Enterdata(ITMDESCC, ItemDescription);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	
	public ItemClass ClickItemmNameSave() throws InterruptedException {
		Common.click(ItemmNameSave);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickItemmNameSaveAndNew() throws InterruptedException {
		Common.click(ItemmNameSaveAndNew);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickItemmNameSaveOk() throws InterruptedException {
		Common.click(ItemmNameSaveOk);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
//Item name/SKU selection
		public ItemClass ClickItemnameSearch() throws InterruptedException {
			Common.click(ItemnameSearch);
			return PageFactory.initElements(driver, ItemClass.class);
		}
		public ItemClass SelectItemNameValue() throws InterruptedException {
			//Common.click(ItemClassValue);
			List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemSKU_')]"));
			 int iSize = oCheckBox.size();
			 System.out.println(iSize);
			 for(int i=0; i < iSize ; i++ )
			 {
				 oCheckBox.get(i).click();
				
				 String sValue = oCheckBox.get(i).getAttribute("value");
				 if (sValue.equalsIgnoreCase("test"))
				 	{
					 
					 oCheckBox.get(i).click();
				 	}	 
			 } 
			return PageFactory.initElements(driver, ItemClass.class);
		}
		
		public ItemClass ClickItemNameOk() throws InterruptedException {
			Common.click(ItemNameOk);
			return PageFactory.initElements(driver, ItemClass.class);
		}  
		
		public ItemClass ClickwarehouseNameOk() throws InterruptedException {
			Common.click(warehouseNameOk);
			return PageFactory.initElements(driver, ItemClass.class);
		}
		
		public ItemClass ClickAssetpoolNameOk() throws InterruptedException {
			Common.click(assetpoolNameOk);
			return PageFactory.initElements(driver, ItemClass.class);
		}
		
		public ItemClass warehouseSelection() throws InterruptedException {
			Common.click(clickWarehouse);
			return PageFactory.initElements(driver, ItemClass.class);
		}
		
		public ItemClass assetpoolSelection() throws InterruptedException {
			Common.click(clickAssetpool);
			return PageFactory.initElements(driver, ItemClass.class);
		}
		
		
		public ItemClass ClickNamePageCount() throws InterruptedException {
			Common.click(NamePageCount);
			return PageFactory.initElements(driver, ItemClass.class);
		}
		public ItemClass SelectNamePageCountValue() throws InterruptedException {
			Common.click(NamePageCountValue);
			return PageFactory.initElements(driver, ItemClass.class);
		}
	
	
	
	public ItemClass EnterItemSerialNumber(String ItmSERLNUM) throws InterruptedException {
		Common.Enterdata(ItmSERLNUM,ItemSerialNumber);
		return PageFactory.initElements(driver, ItemClass.class);
		}
	
	public ItemClass EnterPurchaseOrderNumber(String ItmPONUM) throws InterruptedException {
		Common.Enterdata(ItmPONUM,ItemPurchaseOrderNumber);
		return PageFactory.initElements(driver, ItemClass.class);
		}
	
	public ItemClass TotalItemCost(String ItmPONUM) throws InterruptedException {
		Common.Enterdata(ItmPONUM,totalItemCost);
		return PageFactory.initElements(driver, ItemClass.class);
		}
	public ItemClass TotalItemCostValue() throws InterruptedException {
		Common.click(totalItemCostValue);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass ClickIsWarehouse() throws InterruptedException {
		//driver.findElement(By.id("IsWarehouse")).click();
			Common.click(IsWarehouse_Checkbox);
		//IsWarehouse.click();
			return PageFactory.initElements(driver, ItemClass.class);
		}
	public ItemClass ClickItemSaveNew() throws InterruptedException {
	Common.click(ItemSaveNew);
	return PageFactory.initElements(driver, ItemClass.class);
	}
	

	public ItemClass ClickItemSaveNewOk() throws InterruptedException {
	Common.click(ItemSaveNewOk);
	return PageFactory.initElements(driver, ItemClass.class);
	}
	
	public ItemClass BackExtItemSKU() throws InterruptedException {
		Common.click(BackItemSKU);
		return PageFactory.initElements(driver, ItemClass.class);
		}
	
	public ItemClass ClickBackItems() throws InterruptedException {
		Common.click(BackItems);
		return PageFactory.initElements(driver, ItemClass.class);
		}
	
	/*public ItemClass SelectItemClassByName(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ItemClass.class);
	}*/
	
	/*public ItemClass SelectItemClassByName(String data) throws InterruptedException {
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
	
	/*public ItemClass SelectItemSubTypeByName(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemSubTypePopup_ItemSubTypeName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ItemClass.class);
	}*/
	 
	 public ItemClass SelectItemSubTypeByName() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemSubTypePopup')]"));
		    WebElement Element = links.get(0);
		    Common.click(Element);
			return PageFactory.initElements(driver, ItemClass.class);
		}
	
	public ItemClass SelectItemByName(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemSKU_ItemName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ItemClass.class);
	}
	
	/*public ItemClass SelectWarehouseByName(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]")));
		return PageFactory.initElements(driver, ItemClass.class);
	}*/
	
	public ItemClass SelectWarehouseByName(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridWarehouse_WarehouseName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ItemClass.class);
	}  
	
	/*public ItemClass SelectWarehouseByName(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//*[contains(@title,'"+data+"')]")));
		return PageFactory.initElements(driver, ItemClass.class);
	}
*/
	public ItemClass SelectAssetpoolByName(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetPool_AssetPoolName' and text()='"+data+"']")));
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





