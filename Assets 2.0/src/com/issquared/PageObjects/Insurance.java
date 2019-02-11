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

public class Insurance {
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public Insurance(WebDriver driver) {
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
    public WebElement clickVerify;
	*/
	
	@FindBy(xpath="//div[1]/div/div/div[1]/div[1]/a/div/div")
    public WebElement selectassets;
	
	
	@FindBy(xpath="//*[@id='side-menu']/li[5]/a")
    public WebElement selectmaintenancedropdwon;
	
	@FindBy(xpath="//*[@id='732']/a")
    public WebElement clickInsurance;
	
	@FindBy(xpath="//*[@id='btn_New']")
    public WebElement selectNew;
	
	  @FindBy(xpath="//select[@role='listbox']")
	    public WebElement RoleResourcesRSRSListBox;
	   
	    @FindBy(xpath="//select[@role='listbox']/option[4]")
	    public WebElement RoleResourcesRSRSListBoxValue;
	    
	
	@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[1]/div/span/a/b")
    public WebElement InsuranceContractsearchwin;
	
	@FindBy(xpath="//*[@id='Ok-InsContract']/div")
    public WebElement serchwinokbtn;
	
	@FindBy(xpath="//div[@class='note-editable panel-body']")
    public WebElement enternotes;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveandnew;
	
    @FindBy(xpath="//button[contains(text(),'Ok')]")
    public WebElement okpopup;
    		


/*Methods */
/*public Insurance openurl(String url)
{
	driver.get(url);
	return PageFactory.initElements(driver, Insurance.class);	
}

public Insurance UserName(String un) {
	UserName.sendKeys(un);
	return PageFactory.initElements(driver, Insurance.class);
}

public Insurance password(String pw) {
	Password.sendKeys(pw);
	return PageFactory.initElements(driver, Insurance.class);
}
public Insurance  DomainName(String dn)  {
	DomainName.sendKeys(dn);
	return PageFactory.initElements(driver, Insurance.class);
}
public Insurance sigin() throws InterruptedException {
	Common.click(Login);
	return PageFactory.initElements(driver, Insurance.class);
}

public Insurance selectImage() throws InterruptedException {
	Common.click(Imageselect);
	return PageFactory.initElements(driver, Insurance.class);
}

public Insurance clickVerifyButton() throws InterruptedException {
	Common.click(clickVerify);
	return PageFactory.initElements(driver, Insurance.class);
}*/

public Insurance selectassets() throws InterruptedException {
	Common.click(selectassets);
	return PageFactory.initElements(driver, Insurance.class);
}


public Insurance selectmaintenancedropdwon() throws InterruptedException {
	Common.click(selectmaintenancedropdwon);
	return PageFactory.initElements(driver, Insurance.class);
}


public Insurance clickInsurance() throws InterruptedException {
	Common.click(clickInsurance);
	return PageFactory.initElements(driver, Insurance.class);
}
public Insurance clickNew() throws InterruptedException {
	Common.click(selectNew);
	return PageFactory.initElements(driver, Insurance.class);
}
public Insurance InsuranceContractsearchwin() throws InterruptedException {
	Common.click(InsuranceContractsearchwin);
	return PageFactory.initElements(driver, Insurance.class);
}



public  Insurance SelectRoleResourcesRSRSListBox() throws InterruptedException  {
		RoleResourcesRSRSListBox.click();
		return PageFactory.initElements(driver,Insurance.class);
		}
		public  Insurance SelectRoleResourcesRSRSListBoxValue() throws InterruptedException  {
			RoleResourcesRSRSListBoxValue.click();
		return PageFactory.initElements(driver,Insurance.class);
		}



public Insurance clickAllCheckboxes()
{
	 Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridInsContractName_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	    
	    randomElement.click();

return PageFactory.initElements(driver, Insurance.class); 
}
public Insurance serchwinokbtn() throws InterruptedException {
	Common.click(serchwinokbtn);
	return PageFactory.initElements(driver, Insurance.class);
}
public Insurance  Enternotesfield(String dn)  {
	enternotes.sendKeys(dn);
	return PageFactory.initElements(driver, Insurance.class);
}
public Insurance saveandnew() throws InterruptedException {
	Common.click(saveandnew);
	return PageFactory.initElements(driver, Insurance.class);
}
public Insurance okpopup() throws InterruptedException {
	Common.click(okpopup);
	return PageFactory.initElements(driver, Insurance.class);
}
//*******************************Scroll Methods********************

public Insurance Scrolldown() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
return PageFactory.initElements(driver, Insurance.class);
}
//up
public Insurance ScrollUp() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
return PageFactory.initElements(driver, Insurance.class);
}

public Insurance Scrollmiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,250)","");
return PageFactory.initElements(driver, Insurance.class);
}
public Insurance ScrollUpMiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(-0,-250)","");
return PageFactory.initElements(driver, Insurance.class);
}
public Insurance Scrolldownlast() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(250)","");
return PageFactory.initElements(driver, Insurance.class);
}
/*public Insurance InViewPortTab() throws Exception
{
	inViewPortt(clickWarrantyContract);
	clickWarrantyContract.click();
	return PageFactory.initElements(driver, Insurance.class);
}*/
public static void inViewPortt(WebElement e) throws Exception
{
	Coordinates ord = ((Locatable)e).getCoordinates();
	ord.inViewPort();

	Thread.sleep(500);
}
//*****************************************************

}


