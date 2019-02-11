package com.issquared.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class Customers {
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public Customers(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	
	
	@FindBy(xpath="//a[@id='Assests' and @href='/DefaultLanding/Assets']//div[@class='div-text']")
    public WebElement selectassets;
	
	@FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
	public WebElement Dashboard; 
	
	@FindBy(xpath="//*[@title='Modules']")
	public WebElement selectTopMenu;
	
	@FindBy(xpath="//*[@title='Assets']")
	public WebElement selectAssetsFromTopMenu;
	
	@FindBy(xpath="//a[@href='/Customers/Manage']//span[contains(text(),Customers)]")
    public WebElement customers;

	@FindBy(xpath="//div[@class='stats-icon pull-right']")
	public WebElement customersCreateNew; 
	
	@FindBy(xpath="//*[@id='OrganizationName']")
	public WebElement organizationName; 
	
	@FindBy(xpath="//*[@id='ContactName']")
	public WebElement contactName; 
	
	@FindBy(xpath="//*[@id='EmailId']")
	public WebElement email; 
	
	@FindBy(xpath="//*[@id='Address1']")
	public WebElement address1; 
	
	@FindBy(xpath="//*[@id='Address2']")
	public WebElement address2; 
	
	@FindBy(xpath="//*[@id='Address3']")
	public WebElement address3; 
	
	/*@FindBy(xpath="//div[@class='selected-flag']")
	public WebElement phone1;*/ 
	
	@FindBy(xpath="//*[@id='CustomerForm']/div/div/div[2]/div/div[7]/div[1]/div/div")
	public WebElement phone1;
	
	@FindBy(xpath="//*[@id='CustomerForm']/div/div/div[2]/div/div[7]/div[1]/div/ul/li[233]")
	public WebElement phone1Code;
	
	@FindBy(xpath="//*[@id='Phone1']")
	public WebElement phone1Number;
	
	/*@FindBy(xpath="//div[@class='selected-flag']")
	public WebElement phone2;*/
	
	@FindBy(xpath="//*[@id='CustomerForm']/div/div/div[2]/div/div[8]/div[1]/div/div")
	public WebElement phone2; 
	
	@FindBy(xpath="//*[@id='CustomerForm']/div/div/div[2]/div/div[8]/div[1]/div/ul/li[101]")
	public WebElement phone2Code;
	
	@FindBy(xpath="//*[@id='Phone2']")
	public WebElement phone2Number;
	
	@FindBy(xpath="//*[@id='country_title']")
	public WebElement countryType; 
	
	@FindBy(xpath="//*[@id='country_msdd']/div/ul/li[104]")
	public WebElement countryValue; 
	
	@FindBy(xpath="//*[@id='State']")
    public WebElement state;
	
	@FindBy(xpath="//*[text()='Andhra Pradesh']")
	public WebElement stateValue;
	
	@FindBy(xpath="//*[@id='CustomerForm']/div/div/div[2]/div/div[12]/div/input")
	public WebElement city; 
	
	@FindBy(xpath="//*[@id='zip']")
	public WebElement zip; 
	
	@FindBy(xpath="//*[@id='customerImage']") 
    public WebElement customerImage;
	
	@FindBy(xpath="//*[@id='Save']/div")
	public WebElement save; 
	
	@FindBy(xpath="//button[@class='confirm']") 
    public WebElement successMesOkPopup;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
	public WebElement saveNew; 
	
	@FindBy(xpath="//*[@id='cancel']/div")
	public WebElement back; 
	
	
	public Customers selectAssets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, Customers.class);
	}
	
	public Customers SelectAssetsDashboard() throws InterruptedException
	{
		Common.click(Dashboard);
		return PageFactory.initElements(driver, Customers.class);
	}
	
	public Customers selectTopMenu() throws InterruptedException {
		Common.click(selectTopMenu);
		return PageFactory.initElements(driver, Customers.class);
	}


     public Customers selectAssetsFromTopMenu() throws InterruptedException {
		Common.click(selectAssetsFromTopMenu);
		return PageFactory.initElements(driver, Customers.class);
	}
	
	public Customers selectCustomers() throws InterruptedException {
		Common.click(customers);
		return PageFactory.initElements(driver, Customers.class);
	}
	
	public Customers clickCustomersCreateNew() throws InterruptedException {
		Common.click(customersCreateNew);
		return PageFactory.initElements(driver, Customers.class);
	}
	
	public  Customers EnterOrganizationName(String organization_Name) throws InterruptedException {
		
		Common.Enterdata(organization_Name, organizationName);
		return PageFactory.initElements(driver,Customers.class);
	}
	
	public  Customers EnterContactName(String whName) throws InterruptedException {
		Common.Enterdata(whName, contactName);
		return PageFactory.initElements(driver,Customers.class);
	}
	
	public  Customers EnterEmail(String email_1) throws InterruptedException {
		Common.Enterdata(email_1, email);
		return PageFactory.initElements(driver,Customers.class);
	}
	
	public  Customers EnterAddress1(String addrs1) throws InterruptedException {
		Common.Enterdata(addrs1, address1);
		return PageFactory.initElements(driver,Customers.class);
	}
	
	public  Customers EnterAddress2(String addrs2) throws InterruptedException {
		Common.Enterdata(addrs2, address2);
		return PageFactory.initElements(driver,Customers.class);
	}
	
	public  Customers EnterAddress3(String addrs3) throws InterruptedException {
		Common.Enterdata(addrs3, address3);
		return PageFactory.initElements(driver,Customers.class);
	}
	
	public Customers SelectPhone1country() throws InterruptedException {
		Common.click(phone1);
		return PageFactory.initElements(driver, Customers.class);
	}
	
	public Customers SelectPhone1countryCode() throws InterruptedException {
		Common.click(phone1Code);
		return PageFactory.initElements(driver, Customers.class);
	}
	
	public  Customers EnterPhoneNumer1(String phone) throws InterruptedException {
		Common.Enterdata(phone, phone1Number);
		return PageFactory.initElements(driver,Customers.class);
	}
	
	public Customers SelectPhone2country() throws InterruptedException {
		Common.click(phone2);
		return PageFactory.initElements(driver, Customers.class);
	}
	
	public Customers SelectPhone2countryCode() throws InterruptedException {
		Common.click(phone2Code);
		return PageFactory.initElements(driver, Customers.class);
	}
	
	public  Customers EnterPhoneNumer2(String phone) throws InterruptedException {
		Common.Enterdata(phone, phone2Number);
		return PageFactory.initElements(driver,Customers.class);
	}
	
	public Customers Select_CountryType() throws InterruptedException
	{
		 Common.click(countryType);
		return PageFactory.initElements(driver, Customers.class);
	 }
	public Customers Select_CountryValue() throws InterruptedException
	{
		Thread.sleep(1000);
		 Common.click(countryValue);
		return PageFactory.initElements(driver, Customers.class);
	 }
	
	
	public Customers Select_State() throws InterruptedException
	{
		 Common.click(state);
		return PageFactory.initElements(driver, Customers.class);
	 }
	
	public Customers Select_StateValue() throws InterruptedException
	{     
		 Thread.sleep(1000);
		 Common.click(stateValue);
		 return PageFactory.initElements(driver, Customers.class);
	 }
	public Customers Enter_CityName(String cityName)
	{
		city.sendKeys(cityName);
		return PageFactory.initElements(driver, Customers.class);
	 }
	
	public Customers Enter_ZipCode(String pZip)
	{
		zip.sendKeys(pZip);
		return PageFactory.initElements(driver, Customers.class);
	 }
	
	public Customers UploadCustomerImage(String CIMG) {
		customerImage.sendKeys(CIMG);
		return PageFactory.initElements(driver, Customers.class);
	}
	
	public Customers clickOnSave() throws InterruptedException
	{
		Common.click(save);
		return PageFactory.initElements(driver, Customers.class);
	 }
	
	public Customers SuccessMesOkPopup() throws InterruptedException
	{
		Common.click(successMesOkPopup);
		return PageFactory.initElements(driver, Customers.class);
	 }
	
	
	public Customers clickOnSaveandNew() throws InterruptedException
	{
		Common.click(saveNew);
		return PageFactory.initElements(driver, Customers.class);
	 }
	
	
	public Customers clickOnBack() throws InterruptedException
	{
		Common.click(back);
		return PageFactory.initElements(driver, Customers.class);
	 }
	
}
