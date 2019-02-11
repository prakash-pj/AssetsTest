package com.issquared.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class ACTIONS_Repair {
	private WebDriver driver;
	Common commonUtil;
	
	/*Constructor */
	public ACTIONS_Repair(WebDriver driver) {
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
    
    @FindBy(xpath="//*[@id='pagerAssetPool_center']/table/tbody/tr/td[8]/select")
    public WebElement assetpoolPageCount;
	
	@FindBy(xpath="//*[@id='pagerAssetPool_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement assetpoolPageCountValue;  
    
    @FindBy(xpath="//*[@id='pagerItemRepair_center']/table/tbody/tr/td[8]/select")
    public WebElement itemsGridPageCount;
	
	@FindBy(xpath="//*[@id='pagerItemRepair_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement itemsGridPageCountValue;
	
	@FindBy(xpath="//*[text()='Actions' and @class='nav-label']")
    public WebElement selectACTIONSdropdown;
	  
	@FindBy(xpath="//*[@id='774']/a")
    public WebElement clickOnRepair;
	
	@FindBy(xpath="//*[@id='ItemRepair']/div/div/div[2]/div/div[3]/div/span/a/b")
    public WebElement assetpoolNameSelection;
	
	
	@FindBy(xpath="//*[@id='Ok-AssetPoolPopup']/div")
    public WebElement assetpoolNamePopupOk;
	
	@FindBy(xpath=".//*[@id='ItemRepair']/div/div/div[2]/div/div[1]/div/span/a/b")
    public WebElement requestedByNameSelection;
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedBy']/div")
    public WebElement requestedByNamePopupOk;
	
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedFor_center']/table/tbody/tr/td[8]/select")
    public WebElement requestedForPageCount;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedFor_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement requestedForPageCountValue;
	
	
	@FindBy(xpath="//*[@id='ItemRepair']/div/div/div[2]/div/div[2]/div/span/a/b")
    public WebElement requestedForNameSelection;
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedFor']/div")
    public WebElement requestedForNamePopupOk;
	
	@FindBy(xpath="//*[@id='Cost']")
    public WebElement repairCost;
	
	@FindBy(xpath="//*[@id='CostCurrency']")
    public WebElement repairCostCurrency;
	
	@FindBy(xpath="//*[@id='CostCurrency']/option[126]")
    public WebElement repairCostCurrencyValue;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select")
    public WebElement requestedByPageCount;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement requestedByPageCountValue;
	
	
	@FindBy(xpath="//*[@id='AssetHoldnew']")
    public WebElement  assignItemRepairCreateNew;

	@FindBy(xpath="//*[@id='AddItemRepairForActions']/div")
    public WebElement  selectAssetsToRepairAddItem;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	public ACTIONS_Repair SelectAssetsDashboard() throws InterruptedException {
		Common.click(selectAssetsDashboard);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}

	
	public ACTIONS_Repair selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}


	public ACTIONS_Repair SelectACTIONSdropdown() throws InterruptedException {
		Common.click(selectACTIONSdropdown);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}


	public ACTIONS_Repair ClickOnRepair() throws InterruptedException {
		Common.click(clickOnRepair);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	public ACTIONS_Repair AssetpoolNameSelection() throws InterruptedException {
		Common.click(assetpoolNameSelection);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	public ACTIONS_Repair ClickPageCount() throws InterruptedException {
		Common.click(PageCount);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	public ACTIONS_Repair SelectPageCountValue() throws InterruptedException {
		Common.click(PageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	public ACTIONS_Repair AssetpoolPageCount() throws InterruptedException {
		Common.click(assetpoolPageCount);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	public ACTIONS_Repair AssetpoolPageCountValue() throws InterruptedException {
		Common.click(assetpoolPageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	public ACTIONS_Repair ItemsGridPageCount() throws InterruptedException {
		Common.click(itemsGridPageCount);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	public ACTIONS_Repair ItemsGridPageCountValue() throws InterruptedException {
		Common.click(itemsGridPageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	public ACTIONS_Repair RequestedByNameSelection() throws InterruptedException {
		Common.click(requestedByNameSelection);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	public ACTIONS_Repair RequestedByClickPageCount() throws InterruptedException {
		Common.click(requestedByPageCount);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	public ACTIONS_Repair RequestedBySelectPageCountValue() throws InterruptedException {
		Common.click(requestedByPageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	/*public ACTIONS_Repair RequestedByNamecheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
		Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}*/
	
	 public ACTIONS_Repair RequestedByNamecheckbox() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy')]"));
		    WebElement Element = links.get(0);
		    Common.click(Element);
			return PageFactory.initElements(driver, ACTIONS_Repair.class);
		}
	
	public ACTIONS_Repair RequestedByNamePopupOk() throws InterruptedException {
		Common.click(requestedByNamePopupOk);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	
	
	
	public ACTIONS_Repair RequestedForNameSelection() throws InterruptedException {
		Common.click(requestedForNameSelection);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	public ACTIONS_Repair RequestedForClickPageCount() throws InterruptedException {
		Common.click(requestedForPageCount);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	public ACTIONS_Repair RequestedForSelectPageCountValue() throws InterruptedException {
		Common.click(requestedForPageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	/*public ACTIONS_Repair RequestedForNamecheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedFor_ObjectValue' and text()='"+data+"']")));
		Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}*/
	
	
	 public ACTIONS_Repair RequestedForNamecheckbox() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedFor')]"));
		    WebElement Element = links.get(2);
		    Common.click(Element);
			return PageFactory.initElements(driver, ACTIONS_Repair.class);
		}
	 
	 public ACTIONS_Repair EnterItemTypeNotes(String repair_Cost) throws InterruptedException {
			Common.Enterdata(repair_Cost,repairCost);
			return PageFactory.initElements(driver, ACTIONS_Repair.class);
		}
	
	public ACTIONS_Repair RequestedForNamePopupOk() throws InterruptedException {
		Common.click(requestedForNamePopupOk);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	
	
	
	
	
	
	
	public ACTIONS_Repair AssetPoolNamecheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetPool_AssetPoolName' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	
	public ACTIONS_Repair AssetpoolNamePopupOk() throws InterruptedException {
		Common.click(assetpoolNamePopupOk);
		return PageFactory.initElements(driver, ACTIONS_Repair.class);
	}
	 
	 public ACTIONS_Repair AssignItemRepairCreateNew() throws InterruptedException {
			Common.click(assignItemRepairCreateNew);
			return PageFactory.initElements(driver, ACTIONS_Repair.class);
		}
	 
	 public ACTIONS_Repair ItemNamecheckbox(String data) throws InterruptedException {
			Common.click(driver.findElement(By.xpath("//div[@id='ItemRepair']//td[@aria-describedby='gridItemRepair_SerialNumber' and text()='"+data+"']")));
			/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
			return PageFactory.initElements(driver, ACTIONS_Repair.class);
		}
	 
	 public ACTIONS_Repair SelectFirstvalueFromPopup() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemRepair_')]"));

		    WebElement Element = links.get(0);
		    Common.click(Element);
			return PageFactory.initElements(driver, ACTIONS_Repair.class);
		}
	 
	 public ACTIONS_Repair SelectAssetsToRepairAddItem() throws InterruptedException {
			Common.click(selectAssetsToRepairAddItem);
			return PageFactory.initElements(driver, ACTIONS_Repair.class);
		}
	 
	 public ACTIONS_Repair EnterRepairCost(String repair_Cost) throws InterruptedException {
			Common.Enterdata(repair_Cost,repairCost);
			return PageFactory.initElements(driver, ACTIONS_Repair.class);
		}
	 
	 public ACTIONS_Repair ClickRepairCostCurrency() throws InterruptedException {
			Common.click(repairCostCurrency);
			return PageFactory.initElements(driver, ACTIONS_Repair.class);
		}
	 
	 public ACTIONS_Repair ClickRepairCostValue() throws InterruptedException {
			Common.click(repairCostCurrencyValue);
			return PageFactory.initElements(driver, ACTIONS_Repair.class);
		}
	 
	 public ACTIONS_Transfer PopupOK() throws InterruptedException {
			Common.click(okpopup);
			return PageFactory.initElements(driver, ACTIONS_Transfer.class);
		}

}
