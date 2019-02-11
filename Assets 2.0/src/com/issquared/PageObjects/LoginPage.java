package com.issquared.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;



public class LoginPage {
	private WebDriver driver;
	Common commonUtil;

	
	
	/*Constructor */
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}

	
	/* Properties */
	
	
	
	@FindBy(id="username")
	public WebElement UserName;
	
	@FindBy(id="password")
	public WebElement Password;
	
	@FindBy(id="domainname")
	public WebElement DomainName;

	@FindBy(xpath="//button[@type='submit']")
    public WebElement SignIn;
	
	@FindBy(xpath="html/body/div[3]/aside/div/ul/li/ul/li/a")
	public WebElement Teantonboardform;
	
	@FindBy(id="btn_New")
	public WebElement New;
	
	@FindBy(id="OrganizationName")
	public WebElement OrganizationName;
   
	@FindBy(id="ApplicationDomain")
	public WebElement ApplicationDomain;
	
	@FindBy(id="TenantEmailAddr")
	public WebElement TenantEmailAddress;
	
	@FindBy(id="TenantAdmPswd")
	public WebElement TenantAdminPassword;
	
	@FindBy(id="ConfirmPswd")
	public WebElement ConfirmPassword;
	
	@FindBy(id="save")
    public WebElement Save;
	
	@FindBy(xpath="//div[4]/div[2]/button[2]")
	public WebElement Ok;
	/*Methods */
	public LoginPage openurl(String url)
	{
		driver.get(url);
		return PageFactory.initElements(driver, LoginPage.class);	
	}
	
	

	public LoginPage UserName(String un) {
		UserName.sendKeys(un);
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
	public LoginPage password(String pw) {
		Password.sendKeys(pw);
		return PageFactory.initElements(driver, LoginPage.class);
	}
	public LoginPage  DomainName(String dn)  {
		DomainName.sendKeys(dn);
		return PageFactory.initElements(driver, LoginPage.class);
	}
	public LoginPage sigin() throws InterruptedException {
		Common.click(SignIn);
		return PageFactory.initElements(driver, LoginPage.class);
	}

	public LoginPage teantonboardform() throws InterruptedException{
		Common.click(Teantonboardform);
		return PageFactory.initElements(driver, LoginPage.class);
		
	}
    public LoginPage clickonnew() throws InterruptedException{
    	Common.click(New);
    	return PageFactory.initElements(driver, LoginPage.class);
    	
    }
	
   public LoginPage orgname(String on){
	   OrganizationName.sendKeys(on);
	   return PageFactory.initElements(driver, LoginPage.class);
   }
	
   public LoginPage appdomain(String dn){
	   ApplicationDomain.sendKeys(dn);
	   return PageFactory.initElements(driver, LoginPage.class);
   }
	
   public LoginPage teantemail(String Temailadd){
	   TenantEmailAddress.sendKeys(Temailadd);
	   return PageFactory.initElements(driver, LoginPage.class);
   }
   public LoginPage teantpassword(String Teantpassword){
	   TenantAdminPassword.sendKeys(Teantpassword);
	   return PageFactory.initElements(driver, LoginPage.class);
   }
   public LoginPage ConfirmPassword(String ConfirmPw){
	   ConfirmPassword.sendKeys(ConfirmPw);
	   return PageFactory.initElements(driver, LoginPage.class);
   }
   
   public LoginPage save() throws InterruptedException {
		Common.click(Save);
		return PageFactory.initElements(driver, LoginPage.class);
	}
   public LoginPage ok() throws InterruptedException {
		Common.click(Ok);
		return PageFactory.initElements(driver, LoginPage.class);
	}
}
