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

public class ManageAssets {
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public ManageAssets(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}

	
	/* Properties */
	

	/*@FindBy(id="username")
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
	
	@FindBy(xpath="//*[@id='712']/a")
    public WebElement clickmanageassets;
	
	@FindBy(xpath="//a[@id='btn_New']")
    public WebElement selectNew; 
    
    @FindBy(id="AssetName")
    public WebElement AssetName;
    
    @FindBy(xpath="//select[@role='listbox']")
    public WebElement RoleResourcesRSRSListBox;
   
    @FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement RoleResourcesRSRSListBoxValue;
    
    @FindBy(xpath="//span[@class='input-group-addon']/a/b")
    public WebElement classserachwin; 
    
    @FindBy(xpath="//*[@id='Ok-AssetClassPopup']/div")
    public WebElement classserachwinokbtn;
    
    @FindBy(xpath="//*[@id='ManageAssetsBasicInfo']/div/div/div[2]/div[1]/div[5]/div/span/a/b")
    public WebElement assettypeerachwin; 
    
    @FindBy(xpath="//select[@role='listbox']")
    public WebElement RoleResourcesRSRSListBox1;
   
    @FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement RoleResourcesRSRSListBoxValue1;
    
    
    @FindBy(xpath="//*[@id='Ok-AssetType']/div")
    public WebElement assettypeerachwinokbtn; 
  
    @FindBy(xpath="//*[@id='ManageAssetsBasicInfo']/div/div/div[2]/div[1]/div[6]/div/span/a/b")
    public WebElement assetsubtypeerachwin; 
    
    @FindBy(xpath="//select[@role='listbox']")
    public WebElement RoleResourcesRSRSListBox2;
   
    @FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement RoleResourcesRSRSListBoxValue2;
    
    @FindBy(xpath="//*[@id='Ok-AssetsubType']/div")
    public WebElement assetsubtypeerachwinokbtn; 
    
    @FindBy(id="AssetRequestServiceRequest")
    public WebElement AssetRequestServiceRequest; 
    
    @FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveandnew; 
    
    @FindBy(xpath="//button[@class='confirm']")
    public WebElement okbtn; 
   
  
 
	/*Methods */
	public ProcureInventory openurl(String url)
	{
		driver.get(url);
		return PageFactory.initElements(driver, ProcureInventory.class);	
	}
	
	

	/*public ProcureAssets UserName(String un) {
		UserName.sendKeys(un);
		return PageFactory.initElements(driver, ProcureAssets.class);
	}
	
	public ProcureAssets password(String pw) {
		Password.sendKeys(pw);
		return PageFactory.initElements(driver, ProcureAssets.class);
	}
	public ProcureAssets  DomainName(String dn)  {
		DomainName.sendKeys(dn);
		return PageFactory.initElements(driver, ProcureAssets.class);
	}
	public ProcureAssets sigin() throws InterruptedException {
		Common.click(Login);
		return PageFactory.initElements(driver, ProcureAssets.class);
	}
	
	public ProcureAssets selectImage() throws InterruptedException {
		Common.click(Imageselect);
		return PageFactory.initElements(driver, ProcureAssets.class);
	}
	
	public ProcureAssets clickVerifyButton() throws InterruptedException {
		Common.click(clickVerify);
		return PageFactory.initElements(driver, ProcureAssets.class);
	}*/

	public ManageAssets selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, ManageAssets.class);
	}

	
	public ManageAssets selectAssetinfodropdwon() throws InterruptedException {
		Common.click(selectAssetinfodropdwon);
		return PageFactory.initElements(driver, ManageAssets.class);
	}

	
	public ManageAssets clickmanageassets() throws InterruptedException {
		Common.click(clickmanageassets);
		return PageFactory.initElements(driver, ManageAssets.class);
	}
	public ManageAssets clickNew() throws InterruptedException {
		Common.click(selectNew);
		return PageFactory.initElements(driver, ManageAssets.class);
	}
	public ManageAssets AssetName(String an) {
		AssetName.sendKeys(an);
		return PageFactory.initElements(driver, ManageAssets.class);
	}

	
	public ManageAssets classserachwin() throws InterruptedException {
		Common.click(classserachwin);
		return PageFactory.initElements(driver, ManageAssets.class);
	}
	
	public  ManageAssets SelectRoleResourcesRSRSListBox() throws InterruptedException  {
		RoleResourcesRSRSListBox.click();
		return PageFactory.initElements(driver,ManageAssets.class);
		}
		public  ManageAssets SelectRoleResourcesRSRSListBoxValue() throws InterruptedException  {
			RoleResourcesRSRSListBoxValue.click();
		return PageFactory.initElements(driver,ManageAssets.class);
		}
	
		
		
	
	public ManageAssets clickAllCheckboxes()
	{
		List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetClass_')]"));
		 int iSize = oCheckBox.size();
		 System.out.println(iSize);
		 for(int i=0; i < iSize ; i++ ){
			 oCheckBox.get(i).click();
			
			 String sValue = oCheckBox.get(i).getAttribute("value");
			 if (sValue.equalsIgnoreCase("test")){
				 
				 oCheckBox.get(i).click();
		 }
		 }
		
        return PageFactory.initElements(driver, ManageAssets.class); 
	    }
	
	public ManageAssets classserachwinokbtn() throws InterruptedException {
		Common.click(classserachwinokbtn);
		return PageFactory.initElements(driver, ManageAssets.class);
	}

	public ManageAssets assettypeerachwin() throws InterruptedException {
		Common.click(assettypeerachwin);
		return PageFactory.initElements(driver, ManageAssets.class);
	}
	
	public  ManageAssets SelectRoleResourcesRSRSListBox1() throws InterruptedException  {
		RoleResourcesRSRSListBox1.click();
		return PageFactory.initElements(driver,ManageAssets.class);
		}
		public  ManageAssets SelectRoleResourcesRSRSListBoxValue1() throws InterruptedException  {
			RoleResourcesRSRSListBoxValue1.click();
		return PageFactory.initElements(driver,ManageAssets.class);
		}
	
	
	
	
	
	public ManageAssets clickAllCheckboxesassettype()
	{
		List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetTypeName_')]"));
		 int iSize = oCheckBox.size();
		 System.out.println(iSize);
		 for(int i=0; i < iSize ; i++ ){
			 oCheckBox.get(i).click();
			
			 String sValue = oCheckBox.get(i).getAttribute("value");
			 if (sValue.equalsIgnoreCase("test")){
				 
				 oCheckBox.get(i).click();
		 }
		 }
		
        return PageFactory.initElements(driver, ManageAssets.class); 
	    }
	public ManageAssets assettypeerachwinokbtn() throws InterruptedException {
		Common.click(assettypeerachwinokbtn);
		return PageFactory.initElements(driver, ManageAssets.class);
	}
	
	public ManageAssets assetsubtypeerachwin() throws InterruptedException {
		Common.click(assetsubtypeerachwin);
		return PageFactory.initElements(driver, ManageAssets.class);
	}
	
	public  ManageAssets SelectRoleResourcesRSRSListBox2() throws InterruptedException  {
		RoleResourcesRSRSListBox2.click();
		return PageFactory.initElements(driver,ManageAssets.class);
		}
		public  ManageAssets SelectRoleResourcesRSRSListBoxValue2() throws InterruptedException  {
			RoleResourcesRSRSListBoxValue2.click();
		return PageFactory.initElements(driver,ManageAssets.class);
		}
	
	public ManageAssets clickAllCheckboxesasubtype()
	{
		List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetsubTypeName_')]"));
		 int iSize = oCheckBox.size();
		 System.out.println(iSize);
		 for(int i=0; i < iSize ; i++ ){
			 oCheckBox.get(i).click();
			
			 String sValue = oCheckBox.get(i).getAttribute("value");
			 if (sValue.equalsIgnoreCase("test")){
				 
				 oCheckBox.get(i).click();
		 }
		 }
		
        return PageFactory.initElements(driver, ManageAssets.class); 
	    }
	public ManageAssets assetsubtypeerachwinokbtn() throws InterruptedException {
		Common.click(assetsubtypeerachwinokbtn);
		return PageFactory.initElements(driver, ManageAssets.class);
	}
	public ManageAssets AssetRequestServiceRequest(String an) {
		AssetRequestServiceRequest.sendKeys(an);
		return PageFactory.initElements(driver, ManageAssets.class);
	}

	
	public ManageAssets saveandnew() throws InterruptedException {
		Common.click(saveandnew);
		return PageFactory.initElements(driver, ManageAssets.class);
	}
	public ManageAssets okpopup() throws InterruptedException {
		Common.click(okbtn);
		return PageFactory.initElements(driver, ManageAssets.class);
	}
	
	//*******************************Scroll Methods********************

	public ManageAssets Scrolldown() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	return PageFactory.initElements(driver, ManageAssets.class);
	}
	//up
	public ManageAssets ScrollUp() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	return PageFactory.initElements(driver, ManageAssets.class);
	}

	public ManageAssets Scrollmiddle() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,250)","");
	return PageFactory.initElements(driver, ManageAssets.class);
	}
	public ManageAssets ScrollUpMiddle() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(-0,-250)","");
	return PageFactory.initElements(driver, ManageAssets.class);
	}
	public ManageAssets Scrolldownlast() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(250)","");
	return PageFactory.initElements(driver, ManageAssets.class);
	}
	/*public ManageAssets InViewPortTab() throws Exception
	{
		inViewPortt(clickWarrantyContract);
		clickWarrantyContract.click();
		return PageFactory.initElements(driver, ManageAssets.class);
	 }*/
	public static void inViewPortt(WebElement e) throws Exception
	{
		Coordinates ord = ((Locatable)e).getCoordinates();
		ord.inViewPort();

		Thread.sleep(500);
	}
	//*****************************************************
}
