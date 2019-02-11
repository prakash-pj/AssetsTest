package com.issquared.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class LIFECYCLE_Disposal {
	
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public LIFECYCLE_Disposal(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	@FindBy(xpath="//*[@id='side-menu']/li[1]/a/span")
    public WebElement selectAssetsDashboard;
	
	@FindBy(xpath="//div[1]/div/div/div[1]/div[1]/a/div/div")
    public WebElement selectassets;
	
	
	@FindBy(xpath="//*[text()='Life Cycle' and @class='nav-label']")
    public WebElement selectLIFECYCLEdropdown;
	
	@FindBy(xpath="//*[@id='743']/a")
    public WebElement clickDispose;
	
	@FindBy(xpath="//*[@id='btn_New']")
    public WebElement selectNew;
	
	@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[1]/div/span/a/b")
    public WebElement itemName; 
	
	@FindBy(xpath="//*[@id='chkAdvancedSearch']")
    public WebElement advancedSearchcheckbox;   
	
	@FindBy(xpath="//*[@id='modal-container']/div/div/div[3]/div[2]/div/div/div/div[1]/div[1]/div/span/a/b")
    public WebElement itemSKUName; 
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement PageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement PageCountValue;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedFor_center']/table/tbody/tr/td[8]/select")
    public WebElement destroyedFromPageCount;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedFor_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement destroyedFromPageCountValue;

	
	@FindBy(xpath="//*[@id='Ok-ItemSKUPopup']/div")
    public WebElement ItemSKUOk;
	
	@FindBy(xpath="//*[@id='pagerItem_center']/table/tbody/tr/td[8]/select")
    public WebElement itemsPageCount;
	
	@FindBy(xpath="//*[@id='pagerItem_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement itemsPageCountValue;
	
	@FindBy(xpath="//*[@id='Ok-ItemPopup']/div")
    public WebElement ItemOk;
	
	@FindBy(xpath="//*[@id='step0']/div/div[2]/div[1]/div[3]/div/span/a/b")
    public WebElement disposedBySelection;
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedBy']/div")
    public WebElement requestedByPopupOk;
	
	@FindBy(xpath="//*[@id='DisposalType']")
    public WebElement disposalType;
	
	@FindBy(xpath="//select[@id='DisposalType']/option[2]")
    public WebElement disposalTypeValueClose;
	
	@FindBy(xpath="//*[@id='DisposalReason']")
    public WebElement disposalReason;
	
	@FindBy(xpath="//select[@id='DisposalReason']/option[2]")
    public WebElement disposalReasonValueDamaged;
	
	@FindBy(xpath="//*[@id='txtLostDestroyedStolenFrom']/a/b")
    public WebElement lost_Destroyed_StolenFrom;
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedFor']/div")
    public WebElement lost_Destroyed_StolenFrom_popUpOK;
	
	@FindBy(xpath="//*[@id='LostDestroyedStolenDate']")
    public WebElement lost_Destroyed_Stolen_Date;
	
	@FindBy(xpath="//*[@id='chkIsPoliceReportFiled']")
    public WebElement isPoliceReportFiled;
	
	@FindBy(xpath="//*[@id='chkIsInsuranceClaimed']")
    public WebElement isInsuranceClaimed;
	
	@FindBy(xpath="//*[@id='chkIsAssetReturned']")
    public WebElement isAssetReturned;
	
	@FindBy(xpath="//*[@id='VendorName']")
    public WebElement soldTo ;
	
	@FindBy(xpath="//*[@id='SoldCost']")
    public WebElement soldCost ;
	
	@FindBy(xpath="//*[@id='SoldCostUnits']")
    public WebElement SoldCostCurrency;
	
	@FindBy(xpath="//*[@id='SoldCostUnits']/option[126]")
    public WebElement SoldCostCurrencyValue;
	
	
	@FindBy(xpath="//*[@id='DisposalFees']")
    public WebElement disposalFees;
	
	@FindBy(xpath="//*[@id='DisposalFeesUnits']")
    public WebElement disposalFeesCurrency;
    
	@FindBy(xpath="//*[@id='DisposalFeesUnits']/option[126]")
    public WebElement disposalFeesCurrencyValue;
    
	
	@FindBy(xpath="//*[@id='DisposalStatus']")
    public WebElement disposalStatus;
	
	@FindBy(xpath="//*[@id='DisposalStatus']/option[2]")
    public WebElement disposalStatusValue;
	
	@FindBy(xpath="//*[@id='chkWipeAsset']")
    public WebElement wipeAssetCheckbox;
	
	
	@FindBy(xpath="//*[@id='WipeType']")
    public WebElement wipeTypeDropdown;
	
	@FindBy(xpath="//*[@id='WipeType']/option[2]")
    public WebElement wipeTypeDropdownValue;
	
	
	@FindBy(xpath="//*[@id='save-BasicInfo']/div")
    public WebElement save;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveAndNew;
	
	@FindBy(xpath="//*[@id='cancel']/div")
    public WebElement back;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	
	
	
	
	
	
	
	
	public LIFECYCLE_Disposal SelectAssetsDashboard() throws InterruptedException {
		Common.click(selectAssetsDashboard);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}

	
	public LIFECYCLE_Disposal selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}


	public LIFECYCLE_Disposal clickLIFECYCLEdropdown() throws InterruptedException {
		Common.click(selectLIFECYCLEdropdown);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}


	public LIFECYCLE_Disposal ClickOnDisopse() throws InterruptedException {
		Common.click(clickDispose);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	public LIFECYCLE_Disposal clickNew() throws InterruptedException {
		Common.click(selectNew);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal itemNameSelection() throws InterruptedException {
		Common.click(itemName);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal AdvanceSearch() throws InterruptedException {
		Common.click(advancedSearchcheckbox);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal itemSKUSelection() throws InterruptedException {
		Common.click(itemSKUName);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal ClickPageCount() throws InterruptedException {
		Common.click(PageCount);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	public LIFECYCLE_Disposal SelectPageCountValue() throws InterruptedException {
		Common.click(PageCountValue);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal DestroyedFromClickPageCount() throws InterruptedException {
		Common.click(destroyedFromPageCount);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	public LIFECYCLE_Disposal DestroyedFromSelectPageCountValue() throws InterruptedException {
		Common.click(destroyedFromPageCountValue);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal ItemSKUCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemSKU_ItemName' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
 /* public LIFECYCLE_Disposal ItemSKUCheckbox() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemSKU')]"));
	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}*/
	
	public LIFECYCLE_Disposal ItemSKUPopupOK() throws InterruptedException {
		Common.click(ItemSKUOk);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal ItemsClickPageCount() throws InterruptedException {
		Common.click(itemsPageCount);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	public LIFECYCLE_Disposal ItemsSelectPageCountValue() throws InterruptedException {
		Common.click(itemsPageCountValue);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal ItemCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItem_SerialNumber' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
  public LIFECYCLE_Disposal SelectFirstvalueFromPopup() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItem_')]"));

	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal ItemPopupOK() throws InterruptedException {
		Common.click(ItemOk);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal DisposedBySelection() throws InterruptedException {
		Common.click(disposedBySelection);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	/*public LIFECYCLE_Disposal RequestedByUserCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
		Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}*/
	
	 public LIFECYCLE_Disposal RequestedByUserCheckbox() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy')]"));
		 
		    WebElement Element = links.get(2);
		    Common.click(Element);
			return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
		}
	
	public LIFECYCLE_Disposal RequestedByPopupOk() throws InterruptedException {
		Common.click(requestedByPopupOk);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal DisposalType() throws InterruptedException {
		Common.click(disposalType);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal DisposalTypeValueClose() throws InterruptedException {
		Common.click(disposalTypeValueClose);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	
	
	public LIFECYCLE_Disposal DisposalReason() throws InterruptedException {
		Common.click(disposalReasonValueDamaged);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal DisposalReasonValueDamaged() throws InterruptedException {
		Common.click(disposalReasonValueDamaged);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	
	public LIFECYCLE_Disposal Lost_Destroyed_StolenFrom_Selection() throws InterruptedException {
		Common.click(lost_Destroyed_StolenFrom);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	/*public LIFECYCLE_Disposal Lost_Destroyed_StolenFrom_UserCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedFor_ObjectValue' and text()='"+data+"']")));
		Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}*/
	
	 public LIFECYCLE_Disposal Lost_Destroyed_StolenFrom_UserCheckbox() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedFor')]"));
		 
		    WebElement Element = links.get(4);
		    Common.click(Element);
			return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
		}
	
	public LIFECYCLE_Disposal Lost_Destroyed_StolenFrom_PopupOK() throws InterruptedException {
		Common.click(lost_Destroyed_StolenFrom_popUpOK);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal Lost_Destroyed_Stolen_Date(String lostDate) throws InterruptedException {
		/*		Common.Enterdata(ITMTYNME, Itemtypename);*/
		lost_Destroyed_Stolen_Date.sendKeys(lostDate);
			return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
		}
	
	
	public LIFECYCLE_Disposal IsPoliceReportFiled() throws InterruptedException {
		Common.click(isPoliceReportFiled);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	public LIFECYCLE_Disposal IsInsuranceClaimed() throws InterruptedException {
		Common.click(isInsuranceClaimed);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	public LIFECYCLE_Disposal isAssetReturned() throws InterruptedException {
		Common.click(isAssetReturned);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}

	public LIFECYCLE_Disposal SoldTo(String sold_To) throws InterruptedException {
		/*		Common.Enterdata(ITMTYNME, Itemtypename);*/
		soldTo.sendKeys(sold_To);
			return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
		}
	
	public LIFECYCLE_Disposal SoldCost(String sold_Cost) throws InterruptedException {
		/*		Common.Enterdata(ITMTYNME, Itemtypename);*/
		soldCost.sendKeys(sold_Cost);
			return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
		}
	
	public LIFECYCLE_Disposal SoldCostCurrency() throws InterruptedException {
		Common.click(SoldCostCurrency);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal SoldCostCurrencyValue() throws InterruptedException {
		Common.click(SoldCostCurrencyValue);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}

	public LIFECYCLE_Disposal DisposalFees(String disposal_Fees) throws InterruptedException {
		/*		Common.Enterdata(ITMTYNME, Itemtypename);*/
		disposalFees.sendKeys(disposal_Fees);
			return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
		}
	
	public LIFECYCLE_Disposal DisposalFeesCurrency() throws InterruptedException {
		Common.click(disposalFeesCurrency);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal DisposalFeesCurrencyValue() throws InterruptedException {
		Common.click(disposalFeesCurrencyValue);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal DisposalStatus() throws InterruptedException {
		Common.click(disposalStatus);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	public LIFECYCLE_Disposal DisposalStatusValue() throws InterruptedException {
		Common.click(disposalStatusValue);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal WipeAssetCheckbox() throws InterruptedException {
		Common.click(wipeAssetCheckbox);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal WipeTypeDropdown() throws InterruptedException {
		Common.click(wipeTypeDropdown);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	public LIFECYCLE_Disposal WipeTypeDropdownValue() throws InterruptedException {
		Common.click(wipeTypeDropdownValue);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public LIFECYCLE_Hold Save() throws InterruptedException {
		Common.click(save);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	public LIFECYCLE_Hold SaveAndNew() throws InterruptedException {
		Common.click(saveAndNew);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	public LIFECYCLE_Hold Back() throws InterruptedException {
		Common.click(back);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	public LIFECYCLE_Hold PopupOK() throws InterruptedException {
		Common.click(okpopup);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
	
}
