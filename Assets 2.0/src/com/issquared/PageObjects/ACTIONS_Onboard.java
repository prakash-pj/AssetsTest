package com.issquared.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class ACTIONS_Onboard {
	
	private WebDriver driver;
	Common commonUtil;
	
	/*Constructor */
	public ACTIONS_Onboard(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id='pagerWarehouse_center']/table/tbody/tr/td[8]/select")
    public WebElement warehousePageCount;
	
	@FindBy(xpath="//*[@id='pagerWarehouse_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement warehousePageCountValue;
	
	@FindBy(xpath="//*[@id='pagerAssetPool_center']/table/tbody/tr/td[8]/select")
    public WebElement assetpoolPageCount;
	
	@FindBy(xpath="//*[@id='pagerAssetPool_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement assetpoolPageCountValue;
	
	@FindBy(xpath="//*[@id='pagerAssetPoolOrgns_center']/table/tbody/tr/td[8]/select")
    public WebElement organizationPageCount;
	
	@FindBy(xpath="//*[@id='pagerAssetPoolOrgns_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement organizationPageCountValue;
	
	@FindBy(xpath="//*[@id='pagerDepartment_center']/table/tbody/tr/td[8]/select")
    public WebElement departmentPageCount;
	
	@FindBy(xpath="//*[@id='pagerDepartment_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement departmentPageCountValue;
	
	@FindBy(xpath="//*[@id='pagerCostCenter_center']/table/tbody/tr/td[8]/select")
    public WebElement costCenterPageCount;
	
	@FindBy(xpath="//*[@id='pagerCostCenter_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement costCenterPageCountValue;
	
	
	@FindBy(xpath="//*[@id='pagerItemsToOnboard_center']/table/tbody/tr/td[8]/select")
    public WebElement itemOnboardPageCount;
	
	@FindBy(xpath="//*[@id='pagerItemsToOnboard_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement itemOnboardPageCountValue;
	
	@FindBy(xpath="//*[text()='Actions' and @class='nav-label']")
    public WebElement selectACTIONSdropdown;
	
	/*@FindBy(xpath="//*[@id='741']/a")
    public WebElement clickAssign;*/   
	
	@FindBy(xpath="//*[@id='771']/a")
    public WebElement clickOnboard;
	
	@FindBy(xpath="//*[@id='collapseOne']/div/div/div/div/div[1]/div/span/a/b")
    public WebElement wareHouseselection;
	
	@FindBy(xpath="//*[@id='Ok-WarehousePopup']/div")
    public WebElement wareHousePopupOk;
	
	@FindBy(xpath="//*[@id='lnkAssetPool']/b")
    public WebElement assetpoolselection;
	
	@FindBy(xpath="//*[@id='Ok-AssetPoolPopup']/div")
    public WebElement assetpoolPopupOk;
	
	@FindBy(xpath="//*[@id='lnkDepartment']/b")
    public WebElement departmenttoOnboardSelection;
	
	@FindBy(xpath="//*[@id='Ok-DepartmentNamePopup']/div")
    public WebElement departmentPopup_Ok;
	
	@FindBy(xpath="//*[@id='lnkOrg']/b")
    public WebElement organizationtoOnboardSelection;
	
	@FindBy(xpath="//*[@id='Ok-AssetPoolOrgPopup']/div")
    public WebElement organizationPopup_Ok;
	
	@FindBy(xpath="//*[@id='lnkCostCenter']/b")
    public WebElement costCentertoOnboardSelection;
	
	@FindBy(xpath="//*[@id='Ok-CostCenterNamePopup']/div")
    public WebElement costCenterPopup_OK;
	
	@FindBy(xpath="//*[@id='OnBoardDate']")
    public WebElement effectiveDate_OnBoardDate;
	
	@FindBy(xpath="//*[@id='OnBoardCost']")
    public WebElement onBoardCost;
	
	@FindBy(xpath="//*[@id='OnBoardCostCurrency']")
    public WebElement onBoardCostCurrency;
	
	@FindBy(xpath="//*[@id='OnBoardCostCurrency']/option[126]")
    public WebElement onBoardCostCurrencyValue;
	
	@FindBy(xpath="//*[@id='AddItemsToOboard']")
    public WebElement addItemsToOnboard;
	
	@FindBy(xpath="//*[@id='Ok-ItemsToOnboard']/div")
    public WebElement itemsPopup_OK;
	
	@FindBy(xpath="//*[@id='save-BasicInfo']/div")
    public WebElement save;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveAndNew;
	
	@FindBy(xpath="//*[@id='cancel']/div")
    public WebElement back;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	
	public ACTIONS_Onboard SelectAssetsDashboard() throws InterruptedException {
		Common.click(selectAssetsDashboard);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}

	
	public ACTIONS_Onboard selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}


	public ACTIONS_Onboard SelectACTIONSdropdown() throws InterruptedException {
		Common.click(selectACTIONSdropdown);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}


	public ACTIONS_Onboard ClickOnboard() throws InterruptedException {
		Common.click(clickOnboard);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard WareHouseselection() throws InterruptedException {
		Common.click(wareHouseselection);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard Warehousecheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridWarehouse_WarehouseName' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard WareHousePopupOk() throws InterruptedException {
		Common.click(wareHousePopupOk);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard assetpoolselection() throws InterruptedException {
		Common.click(assetpoolselection);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard assetpoolcheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetPool_AssetPoolName' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard assetpoolPopupOk() throws InterruptedException {
		Common.click(assetpoolPopupOk);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard OrganizationtoOnboardSelection() throws InterruptedException {
		Common.click(organizationtoOnboardSelection);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard Organizationcheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetPoolOrgns_OrganizationName' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard OrganizationPopup_Ok() throws InterruptedException {
		Common.click(organizationPopup_Ok);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	
	public ACTIONS_Onboard DepartmenttoOnboardSelection() throws InterruptedException {
		Common.click(departmenttoOnboardSelection);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard Departmentcheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridDepartment_ObjectValue' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard DepartmentPopup_Ok() throws InterruptedException {
		Common.click(departmentPopup_Ok);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard CostCentertoOnboardSelection() throws InterruptedException {
		Common.click(costCentertoOnboardSelection);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard CostCentercheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridCostCenter_ObjectValue' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard CostCenterPopup_OK() throws InterruptedException {
		Common.click(costCenterPopup_OK);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard EffectiveDate_OnBoardDate() throws InterruptedException {
		Common.click(effectiveDate_OnBoardDate);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ItemClass OnBoardCost(String onBoard_Cost) {
		onBoardCost.sendKeys(onBoard_Cost);
		return PageFactory.initElements(driver, ItemClass.class);
	}
	public ACTIONS_Onboard OnBoardCostCurrency() throws InterruptedException {
		Common.click(onBoardCostCurrency);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	public ACTIONS_Onboard OnBoardCostCurrencyValue() throws InterruptedException {
		Common.click(onBoardCostCurrencyValue);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard AddItemsToOnboard() throws InterruptedException {
		Common.click(addItemsToOnboard);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	public ACTIONS_Onboard GridItemsToOnboard(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemsToOnboard_SerialNumber' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
   public ACTIONS_Onboard SelectFirstvalueFromPopup() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemsToOnboard_')]"));

	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}

	public ACTIONS_Onboard ClickPageCount() throws InterruptedException {
		Common.click(PageCount);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	public ACTIONS_Onboard SelectPageCountValue() throws InterruptedException {
		Common.click(PageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard WarehouseClickPageCount() throws InterruptedException {
		Common.click(warehousePageCount);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	public ACTIONS_Onboard WarehouseSelectPageCountValue() throws InterruptedException {
		Common.click(warehousePageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard AssetpoolClickPageCount() throws InterruptedException {
		Common.click(assetpoolPageCount);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	public ACTIONS_Onboard AssetpoolSelectPageCountValue() throws InterruptedException {
		Common.click(assetpoolPageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard OrganizationClickPageCount() throws InterruptedException {
		Common.click(organizationPageCount);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	public ACTIONS_Onboard OrganizationSelectPageCountValue() throws InterruptedException {
		Common.click(organizationPageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard DepartmentClickPageCount() throws InterruptedException {
		Common.click(departmentPageCount);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	public ACTIONS_Onboard DepartmentSelectPageCountValue() throws InterruptedException {
		Common.click(departmentPageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard CostCenterClickPageCount() throws InterruptedException {
		Common.click(costCenterPageCount);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	public ACTIONS_Onboard CostCenterSelectPageCountValue() throws InterruptedException {
		Common.click(costCenterPageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	public ACTIONS_Onboard ItemOnboardClickPageCount() throws InterruptedException {
		Common.click(itemOnboardPageCount);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	public ACTIONS_Onboard ItemOnboardSelectPageCountValue() throws InterruptedException {
		Common.click(itemOnboardPageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
	}
	
	
	public ACTIONS_Onboard ItemsPopup_OK() throws InterruptedException {
		Common.click(itemsPopup_OK);
		return PageFactory.initElements(driver, ACTIONS_Onboard.class);
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
