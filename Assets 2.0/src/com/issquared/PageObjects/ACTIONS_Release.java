package com.issquared.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class ACTIONS_Release {
	
	
	private WebDriver driver;
	Common commonUtil;
	
	/*Constructor */
	public ACTIONS_Release(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id='pagerAssetPool_center']/table/tbody/tr/td[8]/select")
    public WebElement assetpoolPageCount;
	
	@FindBy(xpath="//*[@id='pagerAssetPool_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement assetpoolPageCountValue;
	
	@FindBy(xpath="//*[text()='Actions' and @class='nav-label']")
    public WebElement selectACTIONSdropdown;
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement PageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement PageCountValue;
	
	@FindBy(xpath="//*[@id='776']/a")
    public WebElement clickOnRelease;
	
	@FindBy(xpath="//*[@id='wrapper']/div[2]/div[2]/div/div/div/div[1]/div/span/a/b")
    public WebElement ownerNameInformation;
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedBy']/div")
    public WebElement ownerNameInformationPOpupOk;
	
	@FindBy(xpath="//*[@id='Cancel-AssetReqestedBy']/div")
    public WebElement ownerNameInformationPOpupCancel;
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement pageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement pageCountValue;
	
	@FindBy(xpath="//*[@id='wrapper']/div[2]/div[2]/div/div/div/div[2]/div/span/a/b")
    public WebElement assetPoolNameSelection;
	
	@FindBy(xpath="//*[@id='Ok-AssetPoolPopup']/div")
    public WebElement assetPoolNamePOpupOk;
	
	@FindBy(xpath="//*[@id='Cancel-AssetPoolPopup']/div")
    public WebElement assetPoolNamePOpupCancel;
	
	@FindBy(xpath="//*[@id='ReleaseDate']")
    public WebElement  releaseDate;
	
	@FindBy(xpath="//*[@id='ItemOwnershipRelease']/div")
    public WebElement  releaseButton;
	
	@FindBy(xpath="//*[@id='Cancel']/div")
    public WebElement  releaseCancel;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	
	public ACTIONS_Release SelectAssetsDashboard() throws InterruptedException {
		Common.click(selectAssetsDashboard);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}

	
	public ACTIONS_Release selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}


	public ACTIONS_Release SelectACTIONSdropdown() throws InterruptedException {
		Common.click(selectACTIONSdropdown);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}


	public ACTIONS_Release ClickOnRelease() throws InterruptedException {
		Common.click(clickOnRelease);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
	public ACTIONS_Release ClickPageCount() throws InterruptedException {
		Common.click(PageCount);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	public ACTIONS_Release SelectPageCountValue() throws InterruptedException {
		Common.click(PageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
	public ACTIONS_Release OwnerNameInformationSelection() throws InterruptedException {
		Common.click(ownerNameInformation);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
	public ACTIONS_Release OwnerNameClickPageCount() throws InterruptedException {
		Common.click(ownerNamePageCount);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
	public ACTIONS_Release OwnerNameSelectPageCountValue() throws InterruptedException {
		Common.click(ownerNamePageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
	public ACTIONS_Release OwnerNameInformationCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
		//Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
	/*public ACTIONS_Release OwnerNameInformationCheckbox() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy')]"));
	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}*/
	
	public ACTIONS_Release OwnerNameInformationPOpupOk() throws InterruptedException {
		Common.click(ownerNameInformationPOpupOk);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
	public ACTIONS_Release AssetPoolNameSelection() throws InterruptedException {
		Common.click(assetPoolNameSelection);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
	public ACTIONS_Release AssetPoolPageCount() throws InterruptedException {
		Common.click(assetpoolPageCount);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
	public ACTIONS_Release AssetPoolPageCountValue() throws InterruptedException {
		Common.click(assetpoolPageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
	public ACTIONS_Release AssetPoolCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetPool_AssetPoolName' and text()='"+data+"']")));
		//Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
	/*public ACTIONS_Release AssetPoolCheckbox() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetPool')]"));
	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}*/
	
	public ACTIONS_Release AssetPoolNamePOpupOk() throws InterruptedException {
		Common.click(assetPoolNamePOpupOk);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
	public ACTIONS_Release ReleaseDate(String release_Date) throws InterruptedException {
		releaseDate.sendKeys(release_Date);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
	/*public ACTIONS_Release AssignedItemSelect(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='grid_SerialNumber' and text()='"+data+"']")));
		Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}*/
	
	public ACTIONS_Release AssignedItemSelect(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@id='ItemsGrid']//td[@aria-describedby='grid_SerialNumber' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
  public ACTIONS_Release SelectFirstvalueFromPopup() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_grid_')]"));

	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
	public ACTIONS_Release ReleaseButton() throws InterruptedException {
		Common.click(releaseButton);
		return PageFactory.initElements(driver, ACTIONS_Release.class);
	}
	
	public ACTIONS_Transfer PopupOK() throws InterruptedException {
		Common.click(okpopup);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
