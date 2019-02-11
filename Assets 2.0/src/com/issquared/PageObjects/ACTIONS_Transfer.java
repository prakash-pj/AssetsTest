package com.issquared.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class ACTIONS_Transfer {
	
	private WebDriver driver;
	Common commonUtil;
	
	/*Constructor */
	public ACTIONS_Transfer(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	
	@FindBy(xpath="//*[@id='side-menu']/li[1]/a/span")
    public WebElement selectAssetsDashboard;
	
	@FindBy(xpath="//div[1]/div/div/div[1]/div[1]/a/div/div")
    public WebElement selectassets;
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement PageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement PageCountValue;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select")
    public WebElement ownerNamePageCount;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement ownerNamePageCountValue;
	
	/*@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select")
    public WebElement transferOwnerNameClickPageCount;*/
	
	@FindBy(xpath="//*[@id='pagerUserPopup_center']/table/tbody/tr/td[8]/select")
    public WebElement transferOwnerNameClickPageCount;
	
	/*@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement transferOwnerNameClickPageCountValue;*/
	
	@FindBy(xpath="//*[@id='pagerUserPopup_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement transferOwnerNameClickPageCountValue;
	
	@FindBy(xpath="//*[text()='Actions' and @class='nav-label']")
    public WebElement selectACTIONSdropdown;
	
	@FindBy(xpath="//*[@id='772']/a")
    public WebElement clickOnTransfer;
	
	@FindBy(xpath="//*[@id='TransferShipType']")
    public WebElement transferShipType;
	
	@FindBy(xpath="//*[@id='TransferShipType']/option[2]")
    public WebElement transferShipTypeValue;
	
	
	@FindBy(xpath="//*[@id='OwnerShipCost']")
    public WebElement transferShipCost;
	
	@FindBy(xpath="//*[@id='OwnerShipCostCurrency']")
    public WebElement transferShipCostCurrency;
	
	@FindBy(xpath="//*[@id='OwnerShipCostCurrency']/option[126]")
    public WebElement transferShipCostCurrencyType;
	
	/*@FindBy(xpath="//*[@id='ownershipinfo']/div[2]/div/span/a/b")
    public WebElement ownerNameSelection;*/
	
	@FindBy(xpath="//*[@id='ownershipinfo']/div[4]/div/span/a/b")
    public WebElement ownerNameSelection;
	
	@FindBy(xpath="//*[@id='OwnershipTransferStatus']/option[2]")
    public WebElement currentOwnershipStatus;
	
	@FindBy(xpath="//*[@id='OwnershipTransferStatus']")
    public WebElement currentOwnershipStatusValue;
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedBy']/div")
    public WebElement ownerNamePopupOk;
	
	@FindBy(xpath="//*[@id='Towner']/b")
    public WebElement transferOwnerNameSelection;
	
	/*@FindBy(xpath="//*[@id='Ok-AssetReqestedBy']/div")
    public WebElement transferOwnerNamePopupOK;*/
	
	@FindBy(xpath="//*[@id='AddUserPopup']/div")
    public WebElement transferOwnerNamePopupOK;
	
	@FindBy(xpath="//*[@id='SaveOwnerShip']/div")
    public WebElement transferButton;
	
	@FindBy(xpath="//*[@id='cancel']/div")
    public WebElement transferCancelButton;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	public ACTIONS_Transfer SelectAssetsDashboard() throws InterruptedException {
		Common.click(selectAssetsDashboard);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}

	
	public ACTIONS_Transfer selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}


	public ACTIONS_Transfer SelectACTIONSdropdown() throws InterruptedException {
		Common.click(selectACTIONSdropdown);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}


	public ACTIONS_Transfer ClickOnTransfer() throws InterruptedException {
		Common.click(clickOnTransfer);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	public ACTIONS_Transfer TransferShipTypeDropdown() throws InterruptedException {
		Common.click(transferShipType);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	public ACTIONS_Transfer TransferShipTypeValue() throws InterruptedException {
		Common.click(transferShipTypeValue);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	/*public ACTIONS_Transfer TransferShipCost() throws InterruptedException {
		Common.click(transferShipCost);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}*/
	public ACTIONS_Transfer TransferShipCost(String transferShip_Cost) throws InterruptedException {
		transferShipCost.sendKeys(transferShip_Cost);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	public ACTIONS_Transfer TransferShipCostCurrency() throws InterruptedException {
		Common.click(transferShipCostCurrency);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	public ACTIONS_Transfer TransferShipCostCurrencyValue() throws InterruptedException {
		Common.click(transferShipCostCurrencyType);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	public ACTIONS_Transfer OwnerName() throws InterruptedException {
		Common.click(ownerNameSelection);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	public ACTIONS_Transfer CurrentOwnershipStatus() throws InterruptedException {
		Common.click(currentOwnershipStatus);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	public ACTIONS_Transfer CurrentOwnershipStatusValue() throws InterruptedException {
		Common.click(currentOwnershipStatusValue);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	public ACTIONS_Transfer ClickPageCount() throws InterruptedException {
		Common.click(PageCount);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	public ACTIONS_Transfer SelectPageCountValue() throws InterruptedException {
		Common.click(PageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	public ACTIONS_Transfer OwnerNameClickPageCount() throws InterruptedException {
		Common.click(ownerNamePageCount);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	public ACTIONS_Transfer OwnerNameSelectPageCountValue() throws InterruptedException {
		Common.click(ownerNamePageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	/*public ACTIONS_Transfer OwnerNameCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
		Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}*/
	
    public ACTIONS_Transfer OwnerNameCheckbox() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy')]"));
	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	public ACTIONS_Transfer OwnerNamePopupOk() throws InterruptedException {
		Common.click(ownerNamePopupOk);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	public ACTIONS_Transfer TransferOwnerNameSelection() throws InterruptedException {
		Common.click(transferOwnerNameSelection);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	public ACTIONS_Transfer TransferOwnerNameClickPageCount() throws InterruptedException {
		Common.click(transferOwnerNameClickPageCount);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	public ACTIONS_Transfer TransferOwnerNameSelectPageCountValue() throws InterruptedException {
		Common.click(transferOwnerNameClickPageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	
	/*public ACTIONS_Transfer TransferOwnerNameCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
		Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}*/
	
	 public ACTIONS_Transfer TransferOwnerNameCheckbox() throws InterruptedException {
			
		    //List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy')]"));
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridUserPopup_')]"));
		    WebElement Element = links.get(2);
		    Common.click(Element);
			return PageFactory.initElements(driver, ACTIONS_Transfer.class);
		}
	
	public ACTIONS_Transfer TransferOwnerNamePopupOk() throws InterruptedException {
		Common.click(transferOwnerNamePopupOK);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	
	public ACTIONS_Transfer SelectItemCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@id='ItemsGrid']//td[@aria-describedby='gridItem_SerialNumber' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
   public ACTIONS_Transfer SelectFirstvalueFromPopup() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItem_')]"));

	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	public ACTIONS_Transfer TransferButton() throws InterruptedException {
		Common.click(transferButton);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	public ACTIONS_Transfer TransferCancelButton() throws InterruptedException {
		Common.click(transferCancelButton);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	public ACTIONS_Transfer PopupOK() throws InterruptedException {
		Common.click(okpopup);
		return PageFactory.initElements(driver, ACTIONS_Transfer.class);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
