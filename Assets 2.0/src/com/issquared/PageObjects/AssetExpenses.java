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

public class AssetExpenses {
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public AssetExpenses(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}

	
	/* Properties */
	
/*
	@FindBy(id="username")
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
	
	
	@FindBy(xpath="//div[1]/div/div/div[1]/div[1]/a/div/div")
    public WebElement selectassets;
	
	
	@FindBy(xpath="//*[@id='side-menu']/li[2]/a")
    public WebElement selectAssetinfodropdwon;
	
	@FindBy(xpath="//*[@id='714']/a")
    public WebElement clickassetexpenses;
	
	@FindBy(xpath="//*[@id='btn_New']")
    public WebElement selectNew; 
	

	  @FindBy(xpath="//select[@role='listbox']")
	    public WebElement RoleResourcesRSRSListBox;
	   
	    @FindBy(xpath="//select[@role='listbox']/option[4]")
	    public WebElement RoleResourcesRSRSListBoxValue;
	    

	@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[1]/div/span/a/b")
    public WebElement Assetname; 
	
    @FindBy(xpath="//*[@id='Ok-AssetInfoNamePopup']/div")
    public WebElement assetokpopup;
    
	@FindBy(id="ExpenseName")
    public WebElement ExpenseName; 
	
	 @FindBy(xpath="//*[@id='SaveNew']/div")
	 public WebElement saveandnew;
	 
	 @FindBy(xpath="//button[@class='confirm']")
	 public WebElement saveok;
	
	
	
	/*Methods */
	public AssetExpenses openurl(String url)
	{
		driver.get(url);
		return PageFactory.initElements(driver, AssetExpenses.class);	
	}
	
	

	/*public AssetExpenses UserName(String un) {
		UserName.sendKeys(un);
		return PageFactory.initElements(driver, AssetExpenses.class);
	}
	
	public AssetExpenses password(String pw) {
		Password.sendKeys(pw);
		return PageFactory.initElements(driver, AssetExpenses.class);
	}
	public AssetExpenses  DomainName(String dn)  {
		DomainName.sendKeys(dn);
		return PageFactory.initElements(driver, AssetExpenses.class);
	}
	public AssetExpenses sigin() throws InterruptedException {
		Common.click(Login);
		return PageFactory.initElements(driver, AssetExpenses.class);
	}
	
	public AssetExpenses selectImage() throws InterruptedException {
		Common.click(Imageselect);
		return PageFactory.initElements(driver, AssetExpenses.class);
	}
	
	public AssetExpenses clickVerifyButton() throws InterruptedException {
		Common.click(clickVerify);
		return PageFactory.initElements(driver, AssetExpenses.class);
	}
*/
	public AssetExpenses selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, AssetExpenses.class);
	}

	
	public AssetExpenses selectAssetinfodropdwon() throws InterruptedException {
		Common.click(selectAssetinfodropdwon);
		return PageFactory.initElements(driver, AssetExpenses.class);
	}

	
	public AssetExpenses clickassetexpenses() throws InterruptedException {
		Common.click(clickassetexpenses);
		return PageFactory.initElements(driver, AssetExpenses.class);
	}
	public AssetExpenses clickNew() throws InterruptedException {
		Common.click(selectNew);
		return PageFactory.initElements(driver, AssetExpenses.class);
	}
	public AssetExpenses Assetname() throws InterruptedException {
		Common.click(Assetname);
		return PageFactory.initElements(driver, AssetExpenses.class);
	} 
	public AssetExpenses assetokpopup() throws InterruptedException {
		Common.click(assetokpopup);
		return PageFactory.initElements(driver, AssetExpenses.class);
	} 
	
	
	

public  AssetExpenses SelectRoleResourcesRSRSListBox() throws InterruptedException  {
		RoleResourcesRSRSListBox.click();
		return PageFactory.initElements(driver,AssetExpenses.class);
		}
		public  AssetExpenses SelectRoleResourcesRSRSListBoxValue() throws InterruptedException  {
			RoleResourcesRSRSListBoxValue.click();
		return PageFactory.initElements(driver,AssetExpenses.class);
		}


	

	public AssetExpenses clickAllCheckboxes()
	{
		List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetInfo_')]"));
		 int iSize = oCheckBox.size();
		 System.out.println(iSize);
		 for(int i=0; i < iSize ; i++ ){
			 oCheckBox.get(i).click();
			
			 String sValue = oCheckBox.get(i).getAttribute("value");
			 if (sValue.equalsIgnoreCase("test")){
				 
				 oCheckBox.get(i).click();
		 }
		 }
		
        return PageFactory.initElements(driver, AssetExpenses.class); 
	    }
	
	public AssetExpenses enterAssetExpensesName(String ACN) {
		ExpenseName.sendKeys(ACN);
		return PageFactory.initElements(driver, AssetExpenses.class);
	}
	public AssetExpenses saveandnew() throws InterruptedException {
		Common.click(saveandnew);
		return PageFactory.initElements(driver, AssetExpenses.class);
	}
	public AssetExpenses okbtn() throws InterruptedException {
		Common.click(saveok);
		return PageFactory.initElements(driver, AssetExpenses.class);
	}
	
	//*******************************Scroll Methods********************

	public AssetExpenses Scrolldown() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	return PageFactory.initElements(driver, AssetExpenses.class);
	}
	//up
	public AssetExpenses ScrollUp() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	return PageFactory.initElements(driver, AssetExpenses.class);
	}

	public AssetExpenses Scrollmiddle() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,250)","");
	return PageFactory.initElements(driver, AssetExpenses.class);
	}
	public AssetExpenses ScrollUpMiddle() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(-0,-250)","");
	return PageFactory.initElements(driver, AssetExpenses.class);
	}
	public AssetExpenses Scrolldownlast() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(250)","");
	return PageFactory.initElements(driver, AssetExpenses.class);
	}
	/*public AssetExpenses InViewPortTab() throws Exception
	{
		inViewPortt(clickWarrantyContract);
		clickWarrantyContract.click();
		return PageFactory.initElements(driver, AssetExpenses.class);
	 }*/
	public static void inViewPortt(WebElement e) throws Exception
	{
		Coordinates ord = ((Locatable)e).getCoordinates();
		ord.inViewPort();

		Thread.sleep(500);
	}
	//*****************************************************
	
}
