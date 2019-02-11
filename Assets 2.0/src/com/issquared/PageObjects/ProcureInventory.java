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

public class ProcureInventory {
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public ProcureInventory(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id='711']/a")
    public WebElement clickProcureassets;
	
	@FindBy(xpath="//*[@id='btn_New']")
    public WebElement selectNew;
	
	@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[1]/div/span/a/b")
    public WebElement clcikonAssetRequestedBy;
	

  @FindBy(xpath="//select[@role='listbox']")
  public WebElement RoleResourcesRSRSListBox;
	   
 @FindBy(xpath="//select[@role='listbox']/option[4]")
 public WebElement RoleResourcesRSRSListBoxValue;
	
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedBy']/div")
    public WebElement clcikokbtnAssetRequestedBy;
	
	 @FindBy(xpath="//select[@role='listbox']")
	  public WebElement RoleResourcesRSRSListBox1;
		   
	 @FindBy(xpath="//select[@role='listbox']/option[4]")
	 public WebElement RoleResourcesRSRSListBoxValue1;
	
	@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[2]/div/span/a/b")
    public WebElement clickAssetRequestedFor;
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedFor']/div")
    public WebElement clickokAssetRequestedFor;
	
	@FindBy(xpath="//*[@id='ServiceReqID']")
	public WebElement ServiceReqID;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveandnew; 
	
    @FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
    		
    		
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

	public ProcureInventory selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, ProcureInventory.class);
	}

	
	public ProcureInventory selectAssetinfodropdwon() throws InterruptedException {
		Common.click(selectAssetinfodropdwon);
		return PageFactory.initElements(driver, ProcureInventory.class);
	}

	
	public ProcureInventory clickProcureassets() throws InterruptedException {
		Common.click(clickProcureassets);
		return PageFactory.initElements(driver, ProcureInventory.class);
	}
	public ProcureInventory clickNew() throws InterruptedException {
		Common.click(selectNew);
		return PageFactory.initElements(driver, ProcureInventory.class);
	}

	public ProcureInventory clcikonAssetRequestedBy() throws InterruptedException {
		Common.click(clcikonAssetRequestedBy);
		return PageFactory.initElements(driver, ProcureInventory.class);
	}
	
	public  ProcureInventory SelectRoleResourcesRSRSListBox() throws InterruptedException  {
		RoleResourcesRSRSListBox.click();
		return PageFactory.initElements(driver,ProcureInventory.class);
		}
		public  ProcureInventory SelectRoleResourcesRSRSListBoxValue() throws InterruptedException  {
			RoleResourcesRSRSListBoxValue.click();
		return PageFactory.initElements(driver,ProcureInventory.class);
		}
			
	public ProcureInventory clickAllCheckboxes() throws InterruptedException
	{
		/*List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy_')]"));
		 int iSize = oCheckBox.size();
		 System.out.println(iSize);
		 for(int i=0; i < iSize ; i++ ){
			 oCheckBox.get(i).click();
			
			 String sValue = oCheckBox.get(i).getAttribute("value");
			 if (sValue.equalsIgnoreCase("test")){
				 
				 oCheckBox.get(i).click();
		 }
		 }*/
		
		Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	    Common.click(randomElement);
		
        return PageFactory.initElements(driver, ProcureInventory.class); 
	    }
	
	

	public ProcureInventory clcikokbtnAssetRequestedBy() throws InterruptedException {
		Common.click(clcikokbtnAssetRequestedBy);
		return PageFactory.initElements(driver, ProcureInventory.class);
	}
	
	public ProcureInventory clickAssetRequestedFor() throws InterruptedException {
		Common.click(clickAssetRequestedFor);
		return PageFactory.initElements(driver, ProcureInventory.class);
	}
	
	
	public  ProcureInventory SelectRoleResourcesRSRSListBox1() throws InterruptedException  {
		RoleResourcesRSRSListBox1.click();
		return PageFactory.initElements(driver,ProcureInventory.class);
		}
		public  ProcureInventory SelectRoleResourcesRSRSListBoxValue1() throws InterruptedException  {
			RoleResourcesRSRSListBoxValue1.click();
		return PageFactory.initElements(driver,ProcureInventory.class);
		}
	
	public ProcureInventory clickAllCheckboxesreqfor() throws InterruptedException
	{
		/*List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedFor_')]"));
		 int iSize = oCheckBox.size();
		 System.out.println(iSize);
		 for(int i=0; i < iSize ; i++ ){
			 oCheckBox.get(i).click();
			
			 String sValue = oCheckBox.get(i).getAttribute("value");
			 if (sValue.equalsIgnoreCase("test")){
				 
				 oCheckBox.get(i).click();
		 }
		 }*/
		Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedFor_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	    Common.click(randomElement);
		
        return PageFactory.initElements(driver, ProcureInventory.class); 
	    }
	
	public ProcureInventory clickokAssetRequestedFor() throws InterruptedException {
		Common.click(clickokAssetRequestedFor);
		return PageFactory.initElements(driver, ProcureInventory.class);
	}
	public ProcureInventory enterOrganizationName(String sr) {
		ServiceReqID.sendKeys(sr);
		return PageFactory.initElements(driver, ProcureInventory.class);
	}
	public ProcureInventory saveandnew() throws InterruptedException {
		Common.click(saveandnew);
		return PageFactory.initElements(driver, ProcureInventory.class);
	}
	public ProcureInventory okpopup() throws InterruptedException {
		Common.click(okpopup);
		return PageFactory.initElements(driver, ProcureInventory.class);
	}
//*******************************Scroll Methods********************

public ProcureInventory Scrolldown() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
return PageFactory.initElements(driver, ProcureInventory.class);
}
//up
public ProcureInventory ScrollUp() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
return PageFactory.initElements(driver, ProcureInventory.class);
}

public ProcureInventory Scrollmiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,250)","");
return PageFactory.initElements(driver, ProcureInventory.class);
}
public ProcureInventory ScrollUpMiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(-0,-250)","");
return PageFactory.initElements(driver, ProcureInventory.class);
}
public ProcureInventory Scrolldownlast() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(250)","");
return PageFactory.initElements(driver, ProcureInventory.class);
}
/*public ProcureInventory InViewPortTab() throws Exception
{
	inViewPortt(clickWarrantyContract);
	clickWarrantyContract.click();
	return PageFactory.initElements(driver, ProcureInventory.class);
 }*/
public static void inViewPortt(WebElement e) throws Exception
{
	Coordinates ord = ((Locatable)e).getCoordinates();
	ord.inViewPort();

	Thread.sleep(500);
}
//*****************************************************
}
