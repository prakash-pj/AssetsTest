package com.issquared.PageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;


public class Warehouses {
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public Warehouses(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	
	/*@FindBy(xpath="")
    public WebElement ;*/
	

	@FindBy(xpath="//a[@id='Assests' and @href='/DefaultLanding/Assets']//div[@class='div-text']")
    public WebElement selectassets;
	
	
	@FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
	public WebElement Dashboard; 
	
	/*@FindBy(xpath="//*[@id='side-menu']/li[3]/a/span[1]")
    public WebElement warehousesdropdown;*/ //*[text()='Warehouses' and @class='nav-label']
	
	@FindBy(xpath="//*[text()='Warehouses' and @class='nav-label']")
    public WebElement warehousesdropdown;
	
	@FindBy(xpath="//*[text()='Warehouses' and @href='/Warehouses/Manage']")
    public WebElement warehouse;
	
	/*@FindBy(xpath="//*[@id='addWarehouse']")
    public WebElement selectNew;*/
	
	@FindBy(xpath="//*[@id='add']")
    public WebElement selectNew;
	
	@FindBy(xpath="//*[@id='WarehouseName']")
    public WebElement warehousesName; 
	
	/*@FindBy(xpath="//*[@id='Warehouse']/div/div/div[2]/div/div[2]/div/span")
    public WebElement primaryContact_NameSelection;*/ 
    		
    @FindBy(xpath="//a[@class='modal-link' and @href='/AssetProcurement/AssetRequestedByGridPopUp?Name=PrimaryContactName']")
    public WebElement primaryContact_NameSelection;
    
    @FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select")
    public WebElement primarycontactNamePageCount;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement primarycontactNamePageCountValue;
    
	@FindBy(xpath="//*[@id='jqg_gridAssetReqestedBy_138657'] | //*[@id='jqg_gridAssetReqestedBy_128272']")
    public WebElement userNameCheckbox5;
	
	@FindBy(xpath="//*[text()='Ok']")
    public WebElement primaryContactNameOk;
	
	@FindBy(xpath="//*[text()='Cancel']")
    public WebElement PrimaryContactNameCancel;
	
	@FindBy(xpath="//*[@id='searchByColumn']")
    public WebElement PrimaryContactNameSearch;
	
	@FindBy(xpath="//*[@id='ContactPersonNumber']")
    public WebElement primaryContact_Number;
	
	@FindBy(xpath="//*[@id='ContactPersonEmailID']")
    public WebElement primaryContact_EmailID;
	
	@FindBy(xpath="//*[@class='modal-link' and @href='/AssetProcurement/AssetRequestedByGridPopUp?Name=SecondaryContactName']")
    public WebElement secondaryContactNameSection;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select")
    public WebElement secondarycontactNamePageCount;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement secondarycontactNamePageCountValue;
	
	@FindBy(xpath="//*[@id='pagerUserPopup_center']/table/tbody/tr/td[8]/select")
    public WebElement assignManagerPageCount;
	
	@FindBy(xpath="//*[@id='pagerUserPopup_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement assignManagerPageCountValue;
	
	@FindBy(xpath="//*[@id='jqg_gridAssetReqestedBy_138664'] | //*[@id='jqg_gridAssetReqestedBy_138655']")
    public WebElement SecondaryUserNameCheckbox1;
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedBy']/div")
    public WebElement SecondaryContactNameOk;
	
	
	@FindBy(xpath="//*[@id='SecondaryContactPersonNumber']")
    public WebElement SecondaryContact_Number;
	
	@FindBy(xpath="//*[@id='SecondaryContactPersonEmailID']")
    public WebElement SecondaryContact_EmailID;
	
	@FindBy(xpath="//*[@id='AddressLine1']")
    public WebElement address1;
	
	@FindBy(xpath=".//*[@id='AddressLine2']")
    public WebElement address2;
	
	@FindBy(xpath=".//*[@id='AddressLine3']")
    public WebElement address3;
	
	@FindBy(xpath="//*[@id='ddlcounty_title']")
    public WebElement CountryType;
	
	@FindBy(xpath="//*[@id='ddlcounty_child']/ul/li[104]")
    public WebElement CountryValue;
	
	/*@FindBy(xpath="//*[text()='India']")
    public WebElement CountryValue;*/
	
	/*@FindBy(xpath="//*[contains(@title, 'India')]")
    public WebElement CountryValue;*/
	
	@FindBy(xpath="//*[@id='ddlstate']")
    public WebElement state;
	
	@FindBy(xpath="//*[text()='Andhra Pradesh']")
	public WebElement stateValue;
	
	/*@FindBy(xpath="//*[text()='Andhra Pradesh']")
	public WebElement stateValue;*/
	
	@FindBy(xpath="//*[@id='City']")      //CityValue
	public WebElement city;
	
	@FindBy(xpath=".//*[@id='Zipcode']")        //ZIP
	public WebElement zip;
	
	@FindBy(xpath="//*[@id='Description']")
	public WebElement description;
	
	@FindBy(xpath="//*[@class='note-editable panel-body']")
    public WebElement notes;
	
	/*@FindBy(xpath="//*[text()='Save']") 
    public WebElement warehouses_Save; */
	
	@FindBy(xpath="//*[@id='SaveWarehouse']/div/strong/label") 
    public WebElement warehouses_Save; 
	
	@FindBy(xpath="//button[@class='confirm']") 
    public WebElement successMesOkPopup;
	
	@FindBy(xpath="//*[text()='Save & New']")
    public WebElement warehouses_Save_New;  
	
	@FindBy(xpath="//*[text()='Back']")
    public WebElement warehouses_Back;
	
	@FindBy(xpath="//*[@id='newOrganizations']/strong")
    public WebElement assetpool_CreateNew;
	
	/*@FindBy(xpath="//*[@id='jqg_gridAssetPool_3']")
    public WebElement assetpoolName_Checkbox;*/
	
	@FindBy(xpath="//*[@id='jqg_gridAssetPool_20020']")
    public WebElement assetpoolName_Checkbox;
	
	@FindBy(xpath="//*[@id='AddAssetPool']/div")
    public WebElement assetpoolName_Ok;
	
	@FindBy(xpath="//*[text()='Cancel']")
    public WebElement assetpoolName_Cancel;
	
	@FindBy(xpath="//*[@id='searchByColumn']")
    public WebElement assetpoolName_Search;

	@FindBy(xpath="//*[@class='btn btn-default']")
    public WebElement assetpoolName_SearchButton;
	
	@FindBy(xpath="//*[@id='1']/td[3]/a ")
    public WebElement assetpool_Delete;
	
	
	
	@FindBy(xpath="//*[@id='step2-content']/strong/label")
    public WebElement  Assign_Manager; 
	
	@FindBy(xpath="//*[@id='newManagers']/strong")
    public WebElement  AssignManager_CreateNew;  
	
	@FindBy(xpath="//*[@id='jqg_gridUserPopup_189044']")
    public WebElement  AssignManager_Checkbox;
	
	@FindBy(xpath="//*[@id='AddUserPopup']/div")
    public WebElement  AssignManager_Ok;
	
	
	
	public Warehouses selectAssets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, Warehouses.class);
	}
	
	public Warehouses SelectAssetsDashboard() throws InterruptedException
	{
		Common.click(Dashboard);
		return PageFactory.initElements(driver, Warehouses.class);
	}
	public Warehouses selectwarehousesdropdown() throws InterruptedException {
		Common.click(warehousesdropdown);
		return PageFactory.initElements(driver, Warehouses.class);
	}
	
	public Warehouses clickWarehouses() throws InterruptedException {
		Common.click(warehouse);
		return PageFactory.initElements(driver, Warehouses.class);
	}
	
	public Warehouses  clickNewonWarehouses() throws InterruptedException {
		Common.click(selectNew);
		return PageFactory.initElements(driver, Warehouses.class);
	}
	
	public  Warehouses enterFirstname(String whName) throws InterruptedException {
		Common.Enterdata(whName, warehousesName);
		//FirstName.sendKeys(fname);
		return PageFactory.initElements(driver,Warehouses.class);
	}
	
	public  Warehouses clickPrimary_contactName() throws InterruptedException  {
		
		Common.click(primaryContact_NameSelection);
		return PageFactory.initElements(driver,Warehouses.class);
	}
	public Warehouses PrimaryContactNameOkButton() throws InterruptedException
	{
		Common.click(primaryContactNameOk);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	public Warehouses PrimarycontctNameClickPageCount() throws InterruptedException {
		Common.click(primarycontactNamePageCount);
		return PageFactory.initElements(driver, Warehouses.class);
	}
	
	public Warehouses PrimarycontctNameSelectPageCountValue() throws InterruptedException {
		Common.click(primarycontactNamePageCountValue);
		return PageFactory.initElements(driver, Warehouses.class);
	}
	
	
	
	/*public Warehouses SelectPrimaryContactUser(String data) throws InterruptedException {
	
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
		return PageFactory.initElements(driver, Warehouses.class);
	}*/
	
   public Warehouses SelectPrimaryContactUser() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy')]"));
	 
	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, Warehouses.class);
	}
	
	
	/*public Warehouses SelectSecondaryContactUser(String data) throws InterruptedException {
		
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
		return PageFactory.initElements(driver, Warehouses.class);
	}*/
	
	 public Warehouses SelectSecondaryContactUser() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy')]"));
		 
		    WebElement Element = links.get(2);
		    Common.click(Element);
			return PageFactory.initElements(driver, Warehouses.class);
		}
	
	

	public  Warehouses enterPrimary_Conct_Number(String ContactNumber) throws InterruptedException {
		Common.Enterdata(ContactNumber, primaryContact_Number);
		//LastName.sendKeys(primaryconctNum);
		return PageFactory.initElements(driver,Warehouses.class);
	}
	
	public  Warehouses enterPrimaryContact_EmailID(String primaryContact_Email_ID) throws InterruptedException {
		Common.Enterdata(primaryContact_Email_ID, primaryContact_EmailID);
		//LastName.sendKeys(lname);
		return PageFactory.initElements(driver,Warehouses.class);
	}
	
    public  Warehouses clickSecondary_contactName() throws InterruptedException  {
		Common.click(secondaryContactNameSection);
		return PageFactory.initElements(driver,Warehouses.class);
	}
    public Warehouses SecondarycontctNameClickPageCount() throws InterruptedException {
		Common.click(secondarycontactNamePageCount);
		return PageFactory.initElements(driver, Warehouses.class);
	}
	
	public Warehouses SecondarycontctNameSelectPageCountValue() throws InterruptedException {
		Common.click(secondarycontactNamePageCountValue);
		return PageFactory.initElements(driver, Warehouses.class);
	}
    public Warehouses SecondaryContactNameOkButton() throws InterruptedException
	{
		Common.click(primaryContactNameOk);
		return PageFactory.initElements(driver, Warehouses.class);
	 }

	public  Warehouses enterSecondary_Conct_Number(String SecondaryContactNumber) throws InterruptedException {
		Common.Enterdata(SecondaryContactNumber, SecondaryContact_Number);
		//LastName.sendKeys(primaryconctNum);
		return PageFactory.initElements(driver,Warehouses.class);
	}
	
	public  Warehouses enterSecondaryContact_EmailID(String secondaryContact_Email_ID) throws InterruptedException {
		Common.Enterdata(secondaryContact_Email_ID, SecondaryContact_EmailID);
		//LastName.sendKeys(lname);
		return PageFactory.initElements(driver,Warehouses.class);
	}
	
	public Warehouses Select_WH_Address1(String addrs1)
	{
		address1.sendKeys(addrs1);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	public Warehouses Select_WH_Address2(String addrs2)
	{
		address2.sendKeys(addrs2);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	public Warehouses Select_WH_Address3(String addrs3)
	{
		address3.sendKeys(addrs3);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	public Warehouses Select_WH_CountryType() throws InterruptedException
	{
		 Common.click(CountryType);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	public Warehouses Select_WH_CountryValue() throws InterruptedException
	{
		Thread.sleep(1000);
		 Common.click(CountryValue);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	
	public Warehouses Select_WH_State() throws InterruptedException
	{
		 Common.click(state);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	public Warehouses Select_WH_StateValue() throws InterruptedException
	{     
		 Thread.sleep(1000);
		 Common.click(stateValue);
		 return PageFactory.initElements(driver, Warehouses.class);
	 }
	public Warehouses Enter_WH_CityName(String cityName)
	{
		city.sendKeys(cityName);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	public Warehouses Enter_WH_ZipCode(String pZip)
	{
		zip.sendKeys(pZip);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	public Warehouses WH_Description(String descrptn)
	{
		description.sendKeys(descrptn);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	public Warehouses WH_Notes(String notess)
	{
		notes.sendKeys(notess);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	public Warehouses clickOnSave() throws InterruptedException
	{
	
		Common.click(warehouses_Save);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	public Warehouses SuccessMesOkPopup() throws InterruptedException
	{
	
		Common.click(successMesOkPopup);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	
	public Warehouses clickOnSaveandNew() throws InterruptedException
	{
		Common.click(warehouses_Save_New);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	
	public Warehouses clickOnCancel() throws InterruptedException
	{
		Common.click(warehouses_Back);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
/*	public Warehouses ClickBasicsaveOK() throws InterruptedException
	{
		
		Common.click(BasicSaveOK);
		return PageFactory.initElements(driver,Warehouses.class);
	}*/
	public Warehouses Assetpool_CreateNew() throws InterruptedException
	{
		Common.click(assetpool_CreateNew);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	/*public Warehouses AssetpoolName_Checkbox() throws InterruptedException
	{
		Common.click(assetpoolName_Checkbox);
		return PageFactory.initElements(driver, Warehouses.class);
	 }*/
	
	public Warehouses AssetpoolName(String data) throws InterruptedException {
		
		Common.click(driver.findElement(By.xpath("//div[@class='gridItemsToOnboard']//td[@aria-describedby='gridAssetPool_AssetPoolName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, Warehouses.class);
	}
	
	public Warehouses AssetpoolName_OK() throws InterruptedException
	{
		Common.click(assetpoolName_Ok);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	public Warehouses AssetpoolName_Cancel() throws InterruptedException
	{
		Common.click(assetpoolName_Cancel);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	public Warehouses AssetpoolName_Search(String searchAssetpool)
	{
		assetpoolName_Search.sendKeys(searchAssetpool);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	public Warehouses AssetpoolName_SearchButton() throws InterruptedException
	{
		Common.click(assetpoolName_SearchButton);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	public Warehouses Assetpool_Delete() throws InterruptedException
	{
		Common.click(assetpool_Delete);
		return PageFactory.initElements(driver, Warehouses.class);
	 }

	
	
	
	public Warehouses AssignManager_Tab() throws InterruptedException
	{
		Common.click(Assign_Manager);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	public Warehouses AssignManager_CreateNew() throws InterruptedException
	{
		Common.click(AssignManager_CreateNew);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	public Warehouses AssignManagerClickPageCount() throws InterruptedException {
		Common.click(assignManagerPageCount);
		return PageFactory.initElements(driver, Warehouses.class);
	}
	
	public Warehouses AssignManagerSelectPageCountValue() throws InterruptedException {
		Common.click(assignManagerPageCountValue);
		return PageFactory.initElements(driver, Warehouses.class);
	}
	
  /* public Warehouses SelectAssignManager(String data) throws InterruptedException {
		
		Common.click(driver.findElement(By.xpath("//div[@class='gridItemsToOnboard']//td[@aria-describedby='gridUserPopup_MemberName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, Warehouses.class);
	}*/
	
	 public Warehouses SelectAssignManager() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridUserPopup')]"));
		 
		    WebElement Element = links.get(2);
		    Common.click(Element);
			return PageFactory.initElements(driver, Warehouses.class);
		}
	
	
	public Warehouses AssignManager_Checkbox() throws InterruptedException
	{
		Common.click(AssignManager_Checkbox);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	
	public Warehouses AssignManager_OK() throws InterruptedException
	{
		Common.click(AssignManager_Ok);
		return PageFactory.initElements(driver, Warehouses.class);
	 }
	

}
