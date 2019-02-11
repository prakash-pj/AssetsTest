package com.issquared.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class REQUESTS_ProcureRequests {
	private WebDriver driver;
	Common commonUtil;
	
	/*Constructor */
	public REQUESTS_ProcureRequests(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	
	@FindBy(xpath="//*[@id='side-menu']/li[1]/a/span")
    public WebElement selectAssetsDashboard;
	
	@FindBy(xpath="//div[1]/div/div/div[1]/div[1]/a/div/div")
    public WebElement selectassets;
	
	
	@FindBy(xpath="//*[@id='side-menu']/li[6]/a/span[1]")
    public WebElement requestsDropdown;
	
	@FindBy(xpath="//*[@id='711']/a")
    public WebElement procureRequests;
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement PageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement PageCountValue;
	
	@FindBy(xpath="//*[@id='btn_Edit']")
    public WebElement procureRequest_Edit;
	
	@FindBy(xpath="//*[@id='liProcureRequest']")
    public WebElement procureRequestTab;
	
	@FindBy(xpath="//*[@id='liProcureItem']")
    public WebElement procureInventoryTab;
	
	@FindBy(xpath="//*[@id='btn_New']")
    public WebElement procureInventory_New;
	
	@FindBy(xpath="//*[@id='btn_Clone']")
    public WebElement procureInventory_Clone;
	
	@FindBy(xpath="//*[@id='btn_Edit']")
    public WebElement procureInventory_Edit;
	
	@FindBy(xpath="//*[@id='btn_Delete']")
    public WebElement procureInventory_Delete;
	
	@FindBy(xpath="//*[@id='btn_View']")
    public WebElement procureInventory_View;
	
	@FindBy(xpath="//*[@id='btn_Refresh']")
    public WebElement procureInventory_Refresh;
	
	@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[2]/div/span/a/b")
    public WebElement  assetRequestedBy;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select")
    public WebElement  assetRequestedBy_Pagecount;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement  assetRequestedBy_PagecountValue;
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedBy']/div")
    public WebElement  assetRequestedBy_OK;
	
	@FindBy(xpath="//*[@id='Cancel-AssetReqestedBy']/div")
    public WebElement  assetRequestedBy_Cancel;
	
	@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[3]/div/span/a/b")
    public WebElement  assetRequestedFor;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedFor_center']/table/tbody/tr/td[8]/select")
    public WebElement  assetRequestedFor_Pagecount;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedFor_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement  assetRequestedFor_PagecountValue;
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedFor']/div")
    public WebElement  assetRequestedFor_OK;
		
	@FindBy(xpath="//*[@id='Cancel-AssetReqestedFor']/div")
    public WebElement  assetRequestedFor_Cancel;
	
	@FindBy(xpath="//*[@id='ServiceReqID']")
    public WebElement  serviceRequestID;
	
	@FindBy(xpath="//*[@id='AssetRequestedDate']")
    public WebElement  assetRequestedDate;
	
	@FindBy(xpath="//*[@id='AssetCost']")
    public WebElement  unitCost;
	
	@FindBy(xpath="//*[@id='AssetCostUnits']")
    public WebElement  unitCostCurrency;
	
	@FindBy(xpath="//*[@id='AssetCostUnits']/option[72]")
    public WebElement  unitCostCurrencyType;
	
	@FindBy(xpath="//*[@id='UnitCount']")
    public WebElement  unitCount;
	
	@FindBy(xpath="//*[@id='save']/div")
    public WebElement  save;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement  saveAndNew;
	
	@FindBy(xpath="//*[@id='canceljoblisting']/div")
    public WebElement  back;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	public REQUESTS_ProcureRequests SelectAssetsDashboard() throws InterruptedException {
		Common.click(selectAssetsDashboard);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests SelectREQUESTSdropdown() throws InterruptedException {
		Common.click(requestsDropdown);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests ProcureRequests() throws InterruptedException {
		Common.click(procureRequests);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests ClickPageCount() throws InterruptedException {
		Common.click(PageCount);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests SelectPageCountValue() throws InterruptedException {
		Common.click(PageCountValue);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests ProcureRequests_Checkbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@id='tab-ProcureItem']//td[@aria-describedby='gridProcureItem_AssetRequestedForName' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests ProcureRequest_Edit() throws InterruptedException {
		Common.click(procureRequest_Edit);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests ProcureRequestTab() throws InterruptedException {
		Common.click(procureRequestTab);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests ProcureInventoryTab() throws InterruptedException {
		Common.click(procureInventoryTab);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests ProcureInventory_New() throws InterruptedException {
		Common.click(procureInventory_New);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests  AssetRequestedBy() throws InterruptedException {
		Common.click(assetRequestedBy);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests AssetRequestedBy_Pagecount() throws InterruptedException {
		Common.click(assetRequestedBy_Pagecount);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests AssetRequestedBy_PagecountValue() throws InterruptedException {
		Common.click(assetRequestedBy_PagecountValue);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests AssetRequestedByUser_Checkbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests  AssetRequestedBy_OK() throws InterruptedException {
		Common.click(assetRequestedBy_OK);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests  AssetRequestedFor() throws InterruptedException {
		Common.click(assetRequestedFor);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests AssetRequestedFor_Pagecount() throws InterruptedException {
		Common.click(assetRequestedFor_Pagecount);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests AssetRequestedFor_PagecountValue() throws InterruptedException {
		Common.click(assetRequestedFor_PagecountValue);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests AssetRequestedForUser_Checkbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedFor_ObjectValue' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public REQUESTS_ProcureRequests  AssetRequestedFor_OK() throws InterruptedException {
		Common.click(assetRequestedFor_OK);
		return PageFactory.initElements(driver, REQUESTS_ProcureRequests.class);
	}
	
	public LIFECYCLE_Repair ServiceRequestID(String serviceRequest_ID) throws InterruptedException {
		/*		Common.Enterdata(ITMTYNME, Itemtypename);*/
		serviceRequestID.sendKeys(serviceRequest_ID);
			return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
		}
	
	public LIFECYCLE_Repair AssetRequestedDate(String assetRequested_Date) throws InterruptedException {
		/*		Common.Enterdata(ITMTYNME, Itemtypename);*/
		assetRequestedDate.sendKeys(assetRequested_Date);
			return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
		}
	
	public LIFECYCLE_Repair UnitCost(String unit_Cost) throws InterruptedException {
		/*		Common.Enterdata(ITMTYNME, Itemtypename);*/
		unitCost.sendKeys(unit_Cost);
			return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
		}
	
	
	
	public REQUESTS_TransferRequests  UnitCostCurrency() throws InterruptedException {
		Common.click(unitCostCurrency);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
	
	public REQUESTS_TransferRequests  UnitCostCurrencyType() throws InterruptedException {
		Common.click(unitCostCurrencyType);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
	
	
	public LIFECYCLE_Repair UnitCount(String unitCount1) throws InterruptedException {
		/*		Common.Enterdata(ITMTYNME, Itemtypename);*/
		unitCount.sendKeys(unitCount1);
			return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
		}
	public REQUESTS_TransferRequests  Save() throws InterruptedException {
		Common.click(save);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
	
	public REQUESTS_TransferRequests  SaveAndNew() throws InterruptedException {
		Common.click(saveAndNew);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
	
	public REQUESTS_TransferRequests  Back() throws InterruptedException {
		Common.click(back);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}	
	public REQUESTS_TransferRequests PopupOK() throws InterruptedException {
		Common.click(okpopup);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
}
