package com.issquared.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class REQUESTS_OnboardRequests {
	private WebDriver driver;
	Common commonUtil;
	
	/*Constructor */
	public REQUESTS_OnboardRequests(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	
	@FindBy(xpath="//*[@id='side-menu']/li[1]/a/span")
    public WebElement selectAssetsDashboard;
	
	@FindBy(xpath="//div[1]/div/div/div[1]/div[1]/a/div/div")
    public WebElement selectassets;
	
	
	/*@FindBy(xpath="//*[@id='side-menu']/li[6]/a/span[1]")
    public WebElement requestsDropdown;*/
	
	@FindBy(xpath="//*[text()='Requests' and @class='nav-label']")
    public WebElement requestsDropdown;
	
	@FindBy(xpath="//*[@id='756']/a")
    public WebElement onboardRequests;
	
	@FindBy(xpath="//*[@id='RequestUnavailableItems-content']")
    public WebElement requestUnavailableItems;
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement PageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement PageCountValue;
	
	@FindBy(xpath="//*[@id='RequestUnavailableItemsPager_center']/table/tbody/tr/td[8]/select")
    public WebElement requestsforUnavailableItemsPageCount;
	
	@FindBy(xpath="//*[@id='RequestUnavailableItemsPager_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement requestsforUnavailableItemsPageCountValue;
	
	@FindBy(xpath="//*[@id='50140']/td[10]/a/i")
    public WebElement discoverButton;
	
	@FindBy(xpath="//*[@id='50191']/td[10]/a")
    public WebElement transferButton;
	
	@FindBy(xpath="//*[@id='pagerDiscoveredItems_center']/table/tbody/tr/td[8]/select")
    public WebElement discoveredItemsPageCount;
	
	@FindBy(xpath="//*[@id='pagerDiscoveredItems_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement discoveredItemsPageCountValue;
	
	@FindBy(xpath="//*[@id='liOnBoard']/a")
    public WebElement requestforOnboardingandAssigningtheItemsTab;
	
	@FindBy(xpath="//*[@id='liRequestUnavailableItems']")
    public WebElement requestsforUnavailableItems;
	
	@FindBy(xpath="//*[@id='30143']/td[9]/a")
    public WebElement onboardButton;
	
	@FindBy(xpath="//*[@id='AssetTag']")
    public WebElement assetTag;
	
	@FindBy(xpath="//*[@id='OnBoardCost']")
    public WebElement onBoardCost;
	
	@FindBy(xpath="//*[@id='OnBoardCostCurrency']")
    public WebElement onBoardCostCurrency;
	
	@FindBy(xpath="//*[@id='OnBoardCostCurrency']/option[126]")
    public WebElement onBoardCostCurrencyValue;
	
	@FindBy(xpath="//*[@id='Onboard']/div")
    public WebElement onBoardRequestPage_OnboardButton;
	
	@FindBy(xpath="//*[@id='divcan']")
    public WebElement onBoardRequestPage_Back;
	
	@FindBy(xpath="//*[@id='50205']/td[10]/a")
    public WebElement discoverItemsButton;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	public REQUESTS_OnboardRequests ClickPageCount() throws InterruptedException {
		Common.click(PageCount);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	public REQUESTS_OnboardRequests SelectPageCountValue() throws InterruptedException {
		Common.click(PageCountValue);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	
	
	
	public REQUESTS_OnboardRequests SelectAssetsDashboard() throws InterruptedException {
		Common.click(selectAssetsDashboard);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	
	public REQUESTS_OnboardRequests selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	
	public REQUESTS_OnboardRequests SelectREQUESTSdropdown() throws InterruptedException {
		Common.click(requestsDropdown);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	
	public REQUESTS_OnboardRequests OnboardRequests() throws InterruptedException {
		Common.click(onboardRequests);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	
	public REQUESTS_OnboardRequests RequestUnavailableItems() throws InterruptedException {
		Common.click(requestUnavailableItems);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	
	public REQUESTS_OnboardRequests RequestsforUnavailableItemsPageCount() throws InterruptedException {
		Common.click(requestsforUnavailableItemsPageCount);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	public REQUESTS_OnboardRequests RequestsforUnavailableItemsPageCountValue() throws InterruptedException {
		Common.click(requestsforUnavailableItemsPageCountValue);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	
	public REQUESTS_OnboardRequests DiscoverButton() throws InterruptedException {
		Common.click(discoverButton);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	
	public REQUESTS_OnboardRequests TransferButton() throws InterruptedException {
		Common.click(transferButton);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	
	public REQUESTS_OnboardRequests DiscoveredItemsPageCount() throws InterruptedException {
		Common.click(discoveredItemsPageCount);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	public REQUESTS_OnboardRequests DiscoveredItemsPageCountValue() throws InterruptedException {
		Common.click(discoveredItemsPageCountValue);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	
	 public REQUESTS_OnboardRequests ClickonOnboardButton() throws InterruptedException {
			//Common.click(assign);
		 Thread.sleep(1000);
			driver.findElements(By.xpath("//a[contains(@href,'/Onboard/ItemOnboardRequest')]")).get(0).click();
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
		}
	
	/*public REQUESTS_OnboardRequests OnboardButton() throws InterruptedException {
		Common.click(onboardButton);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}*/
	
	public REQUESTS_OnboardRequests AssetTag() throws InterruptedException {
		Common.click(assetTag);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	
	public REQUESTS_OnboardRequests OnBoardCost(String onboardCost) throws InterruptedException {
		onBoardCost.sendKeys(onboardCost);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	
	public REQUESTS_OnboardRequests onBoardCostCurrency() throws InterruptedException {
		Common.click(onBoardCostCurrency);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	
	public REQUESTS_OnboardRequests onBoardCostCurrencyValue() throws InterruptedException {
		Common.click(onBoardCostCurrencyValue);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	
	public REQUESTS_OnboardRequests OnBoardRequestPage_OnboardButton() throws InterruptedException {
		Common.click(onBoardRequestPage_OnboardButton);
		return PageFactory.initElements(driver, REQUESTS_OnboardRequests.class);
	}
	
	public REQUESTS_RequestedAssets PopupOK() throws InterruptedException {
		Common.click(okpopup);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}
	
	public REQUESTS_RequestedAssets OnBoardRequestPage_Back() throws InterruptedException {
		Common.click(onBoardRequestPage_Back);
		return PageFactory.initElements(driver, REQUESTS_RequestedAssets.class);
	}

}
