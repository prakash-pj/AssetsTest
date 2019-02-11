package com.issquared.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class REQUESTS_RequestedAssets {
	
	private WebDriver driver;
	Common commonUtil;
	
	/*Constructor */
	public REQUESTS_RequestedAssets(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	
	@FindBy(xpath="//*[@id='side-menu']/li[1]/a/span")
    public WebElement selectAssetsDashboard;
	
	@FindBy(xpath="//div[1]/div/div/div[1]/div[1]/a/div/div")
    public WebElement selectassets;
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement ownerNamePageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement ownerNamePageCountValue;
	
	@FindBy(xpath="//*[text()='Requests' and @class='nav-label']")
    public WebElement requestsDropdown;
	
	@FindBy(xpath="//*[@id='715']/a")
    public WebElement requestedAssets;
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement PageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement PageCountValue;
	
	@FindBy(xpath="//a[@href='/RequestedAssets/AssignedTo?keyId=70241']")
    public WebElement assignButton;
	
	@FindBy(xpath="//*[@id='20022']/td[6]/a")
    public WebElement requestForOnboard;
	
	@FindBy(xpath="//*[@id='AssetPool']")
    public WebElement  selectAssetPooltoOnboard;
;
	
	@FindBy(xpath="//*[@id='AssetPool']/option[2]")
    public WebElement selectAssetPooltoOnboardValue;
	
	@FindBy(xpath="//*[@id='itemCount']")
    public WebElement count;
	
	@FindBy(xpath="//*[@id='Ok-AssetPoolDropdown']/div")
    public WebElement popupOk;
	
	
	/*@FindBy(xpath="//*[@class='btn btn-info btn-md btn-md']")
    public WebElement assign;*/
	
	
	/*@FindBy(xpath="//*[contains(text(),'Assign') and @class='btn btn-info btn-md btn-md']/child::*[1]")
    public WebElement assign;*/
	
	@FindBy(xpath="//*[@id='120886']/td[16]/a")
    public WebElement assign;
	
	@FindBy(xpath="//*[@id='btncanAssignment']/div")
    public WebElement wareHousepoolBack;
	
	@FindBy(xpath="//*[@id='assignItems']/div")
    public WebElement assetpoolAssign;
	
	@FindBy(xpath="//*[@id='btncanAssignment']/div")
    public WebElement assetpoolBack;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	public REQUESTS_RequestedAssets SelectAssetsDashboard() throws InterruptedException {
		Common.click(selectAssetsDashboard);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}

	
	public REQUESTS_RequestedAssets selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	
	public REQUESTS_RequestedAssets SelectREQUESTSdropdown() throws InterruptedException {
		Common.click(requestsDropdown);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	
	public REQUESTS_RequestedAssets RequestedAssets() throws InterruptedException {
		Common.click(requestedAssets);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	
	public REQUESTS_RequestedAssets ClickPageCount() throws InterruptedException {
		Common.click(PageCount);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	public REQUESTS_RequestedAssets SelectPageCountValue() throws InterruptedException {
		Common.click(PageCountValue);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	
	public REQUESTS_RequestedAssets AssignButton() throws InterruptedException {
		Common.click(assignButton);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	
	public REQUESTS_RequestedAssets AssignItemsfromItemPool(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='tab-content']//td[@aria-describedby='gridItemPool_SerialNumber' and text()='"+data+"']")));
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	
  
   public REQUESTS_RequestedAssets SelectFirstvalueFromGrid() throws InterruptedException {
		
	    //List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_grid_')]"));
	   List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'gridItem')]"));
	   Thread.sleep(1000);
	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
   public REQUESTS_RequestedAssets SelectFirstvalueFromGrid2() throws InterruptedException {
		//Common.click(assign);
		driver.findElements(By.xpath("//a[contains(@id,'gridItemPool')]")).get(0).click();
	return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
  /* public REQUESTS_RequestedAssets SelectFirstvalueFromPopup() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'gridItem')]"));
	   
	 //*[@id='gview_gridItemPool']/div[3]/div[1]/table/tbody/tr[2]/td[8]
	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}*/
 
   public REQUESTS_RequestedAssets SelectFirstvalueFromPopup() throws InterruptedException {
		//Common.click(assign);
		driver.findElements(By.xpath("//*[@class='jqgrow ui-row-ltr ui-widget-content']")).get(0).click();
	return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
   
   public REQUESTS_RequestedAssets ClickonAssignButton() throws InterruptedException {
		//Common.click(assign);
		driver.findElements(By.xpath("//a[contains(@href,'/RequestedAssets/AssignedT')]")).get(0).click();
	return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
 
   /*public REQUESTS_RequestedAssets ClickonAssignButton() throws InterruptedException {
		//Common.click(assign);
		driver.findElements(By.xpath("//*[@class='jqgfirstrow']/following-sibling::tr[1]/td[16]//a[@class='btn btn-info btn-md btn-md']")).get(0).click();
	return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}*/
   
   
   public REQUESTS_RequestedAssets ClickonRequestforOnboard() throws InterruptedException {
		//Common.click(assign);
		driver.findElements(By.xpath("//a[contains(@href,'/AssetPool/AssetPoolDropdownPopup')]")).get(0).click();
	return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
   
   
  /* public REQUESTS_RequestedAssets ClickonAssignButton() throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='tab-content']//td[@aria-describedby='gridItemPool_SerialNumber' and text()='Assign']")));
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}*/
   
   public REQUESTS_RequestedAssets SelectAssetPooltoOnboard() throws InterruptedException {
		Common.click(selectAssetPooltoOnboard);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	public REQUESTS_RequestedAssets SelectAssetPooltoOnboardValue() throws InterruptedException {
		Common.click(selectAssetPooltoOnboardValue);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
   
	public REQUESTS_RequestedAssets  ItemCount(String itemcount) throws InterruptedException {
		count.sendKeys(itemcount);
			return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
		}
	
	public REQUESTS_RequestedAssets  ItempoolPopupOkButton() throws InterruptedException {
		popupOk.click();
			return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
		}
	
	public REQUESTS_RequestedAssets RequestForOnboard() throws InterruptedException {
		Common.click(requestForOnboard);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	
	public REQUESTS_RequestedAssets AssetpoolAssign() throws InterruptedException {
		Common.click(assetpoolAssign);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	
	public REQUESTS_RequestedAssets AssetpoolBack() throws InterruptedException {
		Thread.sleep(1000);
		//Common.click(assetpoolBack);
		//driver.findElements(By.xpath("//*[@id='btncanAssignment']/div[1]")).get(2).click();
		driver.findElements(By.xpath("//*[text()='Back']")).get(0).click();
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	
	public REQUESTS_RequestedAssets WarehousePoolBack() throws InterruptedException {
		Thread.sleep(1000);
		//Common.click(assetpoolBack);
		//driver.findElements(By.xpath("//*[@id='btncanAssignment']/div[1]")).get(2).click();
		driver.findElements(By.xpath("//*[text()='Back']")).get(1).click();
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	
	public REQUESTS_RequestedAssets AssetpoolBack1() throws InterruptedException {
		List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'btncanAssignment')]"));

        WebElement Element = links.get(0);
        Common.click(Element);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	
	public REQUESTS_RequestedAssets WarehousePoolBack1() throws InterruptedException {
		List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'btncanAssignment')]"));

        WebElement Element = links.get(1);
        Common.click(Element);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	
	
	/*public ACTIONS_Release OwnerNameInformationCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
		Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}*/
	
	public REQUESTS_RequestedAssets PopupOK() throws InterruptedException {
		Common.click(okpopup);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	

}
