package com.issquared.PageObjects;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class AssetPool {
	
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public AssetPool(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	
	@FindBy(xpath="//a[@id='Assests' and @href='/DefaultLanding/Assets']//div[@class='div-text']")
    public WebElement selectassets;
	
	@FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
	public WebElement Dashboard; 
	
	@FindBy(xpath="//*[text()='Warehouses' and @class='nav-label']")
    public WebElement warehousesdropdown;
	
	@FindBy(xpath="//*[@id='732']/a")
    public WebElement assetpool;  
	
	/*@FindBy(xpath="//*[text()='Asset Pool' and @href='/AssetPool/Manage']")
    public WebElement assetpool;*/
	
	/*@FindBy(xpath="//*[@id='addAssetPool']/span/a/div")
    public WebElement assetpoolCreateNew;*/
	
	@FindBy(xpath="//*[@id='add']")
    public WebElement assetpoolCreateNew;
	
	@FindBy(xpath="//*[@id='AssetPoolName']")
    public WebElement asset_Pool_Name;
	
	@FindBy(xpath="//*[@class='modal-link' and @href='/AssetProcurement/AssetRequestedByGridPopUp?Name=PrimaryContactName']")
    public WebElement primary_ContactName;
    
    @FindBy(xpath="//*[@id='Ok-AssetReqestedBy']/div")
    public WebElement primaryContactOk;
    
    @FindBy(xpath="//*[@id='jqg_gridAssetReqestedBy_136035']")
    public WebElement primaryContact_UserNameCheckbx;
    
    @FindBy(xpath="//*[@id='searchByColumn']")
    public WebElement primaryContact_SearchBox;
    
    @FindBy(xpath=".//*[@class='btn btn-default']")
    public WebElement primaryContact_SearchButtn;
	
	@FindBy(xpath="//*[@id='ContactPersonNumber']")
    public WebElement  primarycontact_Number;
	
	@FindBy(xpath="//*[@id='ContactPersonEmailID']")
    public WebElement primarycontact_Email_Id;
	
	@FindBy(xpath="//*[@class='modal-link' and @href='/AssetProcurement/AssetRequestedByGridPopUp?Name=SecondaryContactName']")
    public WebElement secondry_ContactNameSelection;   
	
	@FindBy(xpath="//*[text()='Ok']")
    public WebElement secondryContactOk;
    
    @FindBy(xpath=".//*[@id='jqg_gridAssetReqestedBy_128597']")
    public WebElement secondryContact_UserNameCheckbx;
    
    @FindBy(xpath="//*[@id='searchByColumn']")
    public WebElement secondryContact_SearchBox;
    
    @FindBy(xpath="//*[@class='btn btn-default']")
    public WebElement secondryContact_SearchButtn;
	
	@FindBy(xpath="//*[@id='SecondaryContactPersonNumber']")
    public WebElement secondryContact_Number;    
	
	@FindBy(xpath="//*[@id='SecondaryContactPersonEmailID']")
    public WebElement secondryContact_Email_Id;
	
	@FindBy(xpath="//*[@id='Description']")
    public WebElement assetPool_Description;
	
	@FindBy(xpath="//div[contains(@class,'note-editable')]")
    public WebElement assetPool_Notes;
	
	@FindBy(xpath="//*[@id='SaveAssetPool']/div")
    public WebElement assetPool_Save;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement assetPool_SaveAndNew;
	
	@FindBy(xpath="//*[@id='Cancel-AssetPool']/div")
    public WebElement assetPool_Back;
	
	/*@FindBy(xpath="//button[contains(text(),'OK')]") 
    public WebElement assetPool_SuccessMesOkPopup;*/
	
	@FindBy(xpath="//button[@class='confirm']") 
    public WebElement assetPool_SuccessMesOkPopup;
	
	
	
	
	
	
	
	@FindBy(xpath="//*[@id='newWarehouses']/label")
    public WebElement warehouse_CreateNew;
	
	@FindBy(xpath="//*[@id='jqg_gridWarehouse_90079']")
    public WebElement warehouseName_Checkbox;
	
	@FindBy(xpath="//*[@id='Ok-WarehousePopup']/div")
    public WebElement warehouseName_Ok;
	
	@FindBy(xpath="//*[text()='Cancel']")
    public WebElement warehouseName_Cancel;
	
	@FindBy(xpath="//*[@id='searchByColumn']")
    public WebElement warehouseName_Search;

	@FindBy(xpath="//*[@class='btn btn-default']")
    public WebElement warehouseName_SearchButton;
	
	@FindBy(xpath="//*[@id='4']/td[3]/a")
    public WebElement warehouse_Delete;
	
	
	@FindBy(xpath="//*[@id='liOrganizations']/strong/label")
    public WebElement  organizations_Tab;
	
	@FindBy(xpath="//*[@id='newOrganizations']/label")
    public WebElement organizations_CreateNew;
	
	@FindBy(xpath="//*[@id='orgsinfo']/div[1]/div[1]/div/span/a/b")
    public WebElement organizations_Selection;
	
	@FindBy(xpath="//*[@id='jqg_gridOrganization_100193']")
    public WebElement organizations_Checkbox;
	
	@FindBy(xpath="//*[@id='Ok-OrganizationNamePopup']/div")
    public WebElement organizations_Ok;
	
	
	@FindBy(xpath="//*[@id='jqg_gridOrganization_100145']")
    public WebElement organizations2_Checkbox;
	
	@FindBy(xpath="//*[@id='liOrganizations']/strong/label")
    public WebElement organization_tab;
	
	
	@FindBy(xpath="//*[@id='newOrganizations']/label")
    public WebElement organization_CreateNew;
    
    @FindBy(xpath="//*[@class='modal-link3' and @href='/Meta_Organizations/OrganizationGridPopup?Name=AssetPoolOrgs']")
    public WebElement organization_selection;
    
	
	@FindBy(xpath="//*[@id='jqg_gridOrganization_130359']")
    public WebElement organization_Checkbox;
	
	@FindBy(xpath="//*[@id='jqg_gridLoc_20386']")
    public WebElement organization_LocCheckbox;
	
	@FindBy(xpath="//*[@id='Ok-OrganizationNamePopup']/div")
    public WebElement organization_Ok;
	
	@FindBy(xpath="//*[@id='AddLocation']/div")
    public WebElement organization_AddLocation;
	
	@FindBy(xpath="//*[@id='Cancel-OrganizationNamePopup']/div")
    public WebElement organization_Cancel;
	
	@FindBy(xpath="//*[@id='searchByColumn']")
    public WebElement organization_Search;

	@FindBy(xpath="//*[@id='modal-container2']/div/div/div[2]/div/div/button")
    public WebElement organization_SearchButton;
	
	@FindBy(xpath="//*[@id='100053']/td[3]/a")
    public WebElement organization_Delete;
	
	@FindBy(xpath="//button[@class='confirm']") 
    public WebElement successMesOkPopup;
	
	/*@FindBy(xpath="//select[@role='listbox']")
    public WebElement PageCount;*/
	
	@FindBy(xpath="//*[@id='pagerOrganization_center']/table/tbody/tr/td[8]/select")
    public WebElement PageCount;
	
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement PageCountValue;
	
	@FindBy(xpath="//*[@id='pagerOrganization_center']/table/tbody/tr/td[8]/select")
    public WebElement organizationPageCount;
	
	
	@FindBy(xpath="//*[@id='pagerOrganization_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement organizationPageCountValue;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select")
    public WebElement primarycontactNamePageCount;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement primarycontactNamePageCountValue;
	
	@FindBy(xpath="//*[@id='pagerUserPopup_center']/table/tbody/tr/td[8]/select")
    public WebElement assignManagerNamePageCount;
	
	
	@FindBy(xpath="//*[@id='pagerUserPopup_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement assignManagerNamePageCountValue;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select")
    public WebElement secondarycontactNamePageCount;
	
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement secondarycontactNamePageCountValue;
	
	@FindBy(xpath="//*[@id='pagerWarehouse_center']/table/tbody/tr/td[8]/select")
    public WebElement wareHousecontactNamePageCount;
	
	
	@FindBy(xpath="//*[@id='pagerWarehouse_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement wareHousecontactNamePageCountValue;
	
	@FindBy(xpath="//*[@id='step2-content']/strong/label")
    public WebElement  assign_manager; 
	
	@FindBy(xpath="//*[@id='newManagers']/strong")
    public WebElement  assignManager_createNew;  
	
	@FindBy(xpath=".//*[@id='jqg_gridUserPopup_239217']")
    public WebElement assignManager_checkbox;
	
	
	@FindBy(xpath="//*[@id='AddUserPopup']/div")
    public WebElement  assignManager_ok;
	
	
	
	
	
	public AssetPool selectAssets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, AssetPool.class);
	}
	
	public AssetPool SelectAssetsDashboard() throws InterruptedException
	{
		Common.click(Dashboard);
		return PageFactory.initElements(driver, AssetPool.class);
	}
	public AssetPool selectwarehousesdropdown() throws InterruptedException {
		Common.click(warehousesdropdown);
		return PageFactory.initElements(driver, AssetPool.class);
	}
	
	public AssetPool clickAssetPool() throws InterruptedException {
		Thread.sleep(2000);
		//Common.click(assetpool);
		driver.findElement(By.xpath("//*[@id='732']/a")).click();
		return PageFactory.initElements(driver, AssetPool.class);
	}
	
	public AssetPool  clickNewonAssetPool() throws InterruptedException {
		Common.click(assetpoolCreateNew);
		return PageFactory.initElements(driver, AssetPool.class);
	}
	
	/*public  AssetPool enterAssetPool_Name(String ApName) throws InterruptedException {
		Common.Enterdata(ApName, asset_Pool_Name);
		//FirstName.sendKeys(fname);
		//asset_Pool_Name.sendKeys(ApName);
		return PageFactory.initElements(driver,AssetPool.class);
	}*/
	
	public  AssetPool enterAssetPool_Name(String whName) throws InterruptedException {
		Common.Enterdata(whName, asset_Pool_Name);
		//FirstName.sendKeys(fname);
		return PageFactory.initElements(driver,AssetPool.class);
	}
	
	public  AssetPool clickPrimary_contctName() throws InterruptedException  {
		
		Common.click(primary_ContactName);
		return PageFactory.initElements(driver,AssetPool.class);
	}
	
	public AssetPool PrimarycontctNameClickPageCount() throws InterruptedException {
		Common.click(primarycontactNamePageCount);
		return PageFactory.initElements(driver, AssetPool.class);
	}
	
	public AssetPool PrimarycontctNameSelectPageCountValue() throws InterruptedException {
		Common.click(primarycontactNamePageCountValue);
		return PageFactory.initElements(driver, AssetPool.class);
	}
	
	
	/*public AssetPool SelectPrimaryContactUser(String data) throws InterruptedException {
		
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
		return PageFactory.initElements(driver, AssetPool.class);
	}*/
	
	
   public AssetPool SelectPrimaryContactUser() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy')]"));
	 
	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, AssetPool.class);
	}
   
	public AssetPool PrimaryContctNameOkButton() throws InterruptedException
	{
		Common.click(primaryContactOk);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool clickAllCheckboxes()
	{
				 Random r = new java.util.Random();
				    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAsset')]"));                                                                         
				    WebElement randomElement = links.get(r.nextInt(links.size()));
				    randomElement.click();
				    return PageFactory.initElements(driver, AssetPool.class);
		 }
	
	public  AssetPool enterPrimary_Conct_Number(String ContactNumber) throws InterruptedException {
		Common.Enterdata(ContactNumber, primarycontact_Number);
		//LastName.sendKeys(primaryconctNum);
		return PageFactory.initElements(driver,AssetPool.class);
	}
	
	public  AssetPool enterPrimaryContact_EmailID(String primaryContact_Email_ID) throws InterruptedException {
		Common.Enterdata(primaryContact_Email_ID, primarycontact_Email_Id);
		//LastName.sendKeys(lname);
		return PageFactory.initElements(driver,AssetPool.class);
	}
	
    public  AssetPool clickSecondary_contactName() throws InterruptedException  {
		Common.click(secondry_ContactNameSelection);
		return PageFactory.initElements(driver,AssetPool.class);
	}
    public AssetPool SecondarycontctNameClickPageCount() throws InterruptedException {
		Common.click(secondarycontactNamePageCount);
		return PageFactory.initElements(driver, AssetPool.class);
	}
	
	public AssetPool SecondarycontctNameSelectPageCountValue() throws InterruptedException {
		Common.click(secondarycontactNamePageCountValue);
		return PageFactory.initElements(driver, AssetPool.class);
	}
  /* public AssetPool SelectSecondaryContactUser(String data) throws InterruptedException {
		
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
		return PageFactory.initElements(driver, AssetPool.class);
	}*/
	 public AssetPool SelectSecondaryContactUser() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy')]"));
		 
		    WebElement Element = links.get(2);
		    Common.click(Element);
			return PageFactory.initElements(driver, AssetPool.class);
		}
	
    public AssetPool SecondaryContactNameOkButton() throws InterruptedException
	{
		Common.click(secondryContactOk);
		return PageFactory.initElements(driver, AssetPool.class);
	 }

	public  AssetPool enterSecondary_Conct_Number(String SecondaryContactNumber) throws InterruptedException {
		Common.Enterdata(SecondaryContactNumber, secondryContact_Number);
		//LastName.sendKeys(primaryconctNum);
		return PageFactory.initElements(driver,AssetPool.class);
	}
	
	public  AssetPool enterSecondaryContact_EmailID(String secondaryContact_Email_ID) throws InterruptedException {
		Common.Enterdata(secondaryContact_Email_ID, secondryContact_Email_Id);
		//LastName.sendKeys(lname);
		return PageFactory.initElements(driver,AssetPool.class);
	}
	
	public AssetPool AssetPool_Description(String descrptn)
	{
		assetPool_Description.sendKeys(descrptn);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool AssetPool_Notes(String notess)
	{
		assetPool_Notes.sendKeys(notess);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool clickOnSave() throws InterruptedException
	{
	
		Common.click(assetPool_Save);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool SuccessMesOkPopup() throws InterruptedException
	{
	
		Common.click(assetPool_SuccessMesOkPopup);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	
	public AssetPool clickOnSaveandNew() throws InterruptedException
	{
		Common.click(assetPool_SaveAndNew);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	
	public AssetPool clickOnBack() throws InterruptedException
	{
		Common.click(assetPool_Back);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	public AssetPool wareHouse_CreateNew() throws InterruptedException
	{
		Common.click(warehouse_CreateNew);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool WareHousecontctNameClickPageCount() throws InterruptedException {
		Common.click(wareHousecontactNamePageCount);
		return PageFactory.initElements(driver, AssetPool.class);
	}
	
	public AssetPool WareHousecontctNameSelectPageCountValue() throws InterruptedException {
		Common.click(wareHousecontactNamePageCountValue);
		return PageFactory.initElements(driver, AssetPool.class);
	}
  /* public AssetPool SelectWareHouse(String data) throws InterruptedException {
		
		Common.click(driver.findElement(By.xpath("//div[@class='gridcontwarehouses']//td[@aria-describedby='gridWarehouse_WarehouseName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, AssetPool.class);
	}*/
	
	 public AssetPool SelectWareHouse() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridWarehouse')]"));
		 
		    WebElement Element = links.get(2);
		    Common.click(Element);
			return PageFactory.initElements(driver, AssetPool.class);
		}
	
	
	public AssetPool wareHouseName_Checkbox() throws InterruptedException
	{
		Common.click(warehouseName_Checkbox);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool wareHouseName_OK() throws InterruptedException
	{
		Common.click(warehouseName_Ok);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool wareHouseName_Cancel() throws InterruptedException
	{
		Common.click(warehouseName_Cancel);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool wareHouseName_Search(String searchAssetpool)
	{
		warehouseName_Search.sendKeys(searchAssetpool);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool wareHouseName_SearchButton() throws InterruptedException
	{
		Common.click(warehouseName_SearchButton);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool wareHouse_Delete() throws InterruptedException
	{
		Common.click(warehouse_Delete);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	
	
	
	
	
	 public AssetPool organization_Tab() throws InterruptedException
	{
		Common.click(organization_tab);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	 public AssetPool Organization_CreateNew() throws InterruptedException
	{
		Common.click(organization_CreateNew);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	 public AssetPool Organization_selection() throws InterruptedException
		{
			Common.click(organization_selection);
			return PageFactory.initElements(driver, AssetPool.class);
		 }
	  public AssetPool SelectOrganization(String data) throws InterruptedException {
			
			Common.click(driver.findElement(By.xpath("//div[@class='gridcontorg']//td[@aria-describedby='gridOrganization_ObjectValue' and text()='"+data+"']")));
			return PageFactory.initElements(driver, AssetPool.class);
		}
	  public AssetPool SelectOrganizationLocation(String data) throws InterruptedException {
			
			Common.click(driver.findElement(By.xpath("//div[@class='gridcontloc']//td[@aria-describedby='gridLoc_LocationName' and text()='"+data+"']")));
			return PageFactory.initElements(driver, AssetPool.class);
		}
	  
	  
	public AssetPool Organization_Checkbox() throws InterruptedException
	{
		Common.click(organization_Checkbox);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool Organization_LocCheckbox() throws InterruptedException
	{
		Common.click(organization_LocCheckbox);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool Organization_OK() throws InterruptedException
	{
		Common.click(organization_Ok);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	public AssetPool Organization_AddLocation() throws InterruptedException
	{
		Common.click(organization_AddLocation);
		return PageFactory.initElements(driver, AssetPool.class);
	 }

	
	public AssetPool successMesOkpopup() throws InterruptedException
	{
	
		Common.click(successMesOkPopup);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool Organization_Cancel() throws InterruptedException
	{
		Common.click(organization_Cancel);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool Organization_Search(String searchOrganization)
	{
		organization_Search.sendKeys(searchOrganization);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool Organization_SearchButton() throws InterruptedException
	{
		Common.click(organization_SearchButton);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool Organization_Delete() throws InterruptedException
	{
		Common.click(organization_Delete);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool ClickPageCount() throws InterruptedException {
		Common.click(PageCount);
		return PageFactory.initElements(driver, AssetPool.class);
	}
	
	public AssetPool SelectPageCountValue() throws InterruptedException {
		Common.click(PageCountValue);
		return PageFactory.initElements(driver, AssetPool.class);
	}
	
	public AssetPool OrganizationClickPageCount() throws InterruptedException {
		Common.click(organizationPageCount);
		return PageFactory.initElements(driver, AssetPool.class);
	}
	
	public AssetPool OrganizationSelectPageCountValue() throws InterruptedException {
		Common.click(organizationPageCountValue);
		return PageFactory.initElements(driver, AssetPool.class);
	}
	
	public AssetPool AssignManagerClickPageCount() throws InterruptedException {
		Common.click(assignManagerNamePageCount);
		return PageFactory.initElements(driver, AssetPool.class);
	}
	
	public AssetPool AssignManagerSelectPageCountValue() throws InterruptedException {
		Common.click(assignManagerNamePageCountValue);
		return PageFactory.initElements(driver, AssetPool.class);
	}
	
	public AssetPool AssignManager_Tab() throws InterruptedException
	{
		Common.click(assign_manager);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool AssignManager_CreateNew() throws InterruptedException
	{
		Common.click(assignManager_createNew);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	/*public AssetPool SelectManager(String data) throws InterruptedException {
		
		Common.click(driver.findElement(By.xpath("//div[@class='gridItemsToOnboard']//td[@aria-describedby='gridUserPopup_MemberName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, AssetPool.class);
	}*/
	
	 public AssetPool SelectManager() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridUserPopup')]"));
		 
		    WebElement Element = links.get(2);
		    Common.click(Element);
			return PageFactory.initElements(driver, AssetPool.class);
		}
	
	public AssetPool AssignManager_Checkbox() throws InterruptedException
	{
		Common.click(assignManager_checkbox);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
	
	public AssetPool AssignManager_OK() throws InterruptedException
	{
		Common.click(assignManager_ok);
		return PageFactory.initElements(driver, AssetPool.class);
	 }
		
}
