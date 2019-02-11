package com.issquared.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class REQUESTS_TransferRequests {
	private WebDriver driver;
	Common commonUtil;
	
	/*Constructor */
	public REQUESTS_TransferRequests(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	
	@FindBy(xpath="//*[@id='side-menu']/li[1]/a/span")
    public WebElement selectAssetsDashboard;
	
	@FindBy(xpath="//div[1]/div/div/div[1]/div[1]/a/div/div")
    public WebElement selectassets;
	
	
	@FindBy(xpath="//*[text()='Requests' and @class='nav-label']")
    public WebElement requestsDropdown;
	
	@FindBy(xpath="//*[@id='717']/a")
    public WebElement transferRequests;
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement PageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement PageCountValue;
	
	@FindBy(xpath="//*[@id='50140']/td[12]/a")
    public WebElement transferButton;
	
	@FindBy(xpath="//*[@id='TransferCost']")
    public WebElement transferCost;
	
	@FindBy(xpath="//*[@id='TransferCostCurrency']")
    public WebElement transferCurrency;
	
	@FindBy(xpath="//*[@id='TransferCostCurrency']/option[126]")
    public WebElement transferCurrencyValue;
	
	@FindBy(xpath="//*[@id='Transfer']/div")
    public WebElement transferRequests_Transferbutton;
	
	@FindBy(xpath="//*[@id='cancel']/div")
    public WebElement transferRequests_Back;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	public REQUESTS_TransferRequests SelectAssetsDashboard() throws InterruptedException {
		Common.click(selectAssetsDashboard);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
	
	public REQUESTS_TransferRequests selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
	
	public REQUESTS_TransferRequests SelectREQUESTSdropdown() throws InterruptedException {
		Common.click(requestsDropdown);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
	
	public REQUESTS_TransferRequests TransferRequests() throws InterruptedException {
		Common.click(transferRequests);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
	
	public REQUESTS_TransferRequests ClickPageCount() throws InterruptedException {
		Common.click(PageCount);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
	
	public REQUESTS_TransferRequests SelectPageCountValue() throws InterruptedException {
		Common.click(PageCountValue);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
	
	/*public REQUESTS_TransferRequests TransferButton() throws InterruptedException {
		Common.click(transferButton);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}*/
	
	 public REQUESTS_TransferRequests TransferButton() throws InterruptedException {
			//Common.click(assign);
		 Thread.sleep(1000);
			driver.findElements(By.xpath("//a[contains(@href,'/TransferRequests/TransferRequest')]")).get(1).click();
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
		}
	
	public REQUESTS_TransferRequests TransferCost(String transferCost1) throws InterruptedException {
		transferCost.sendKeys(transferCost1);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
	
	public REQUESTS_TransferRequests TransferCurrency() throws InterruptedException {
		Common.click(transferCurrency);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
	
	public REQUESTS_TransferRequests TransferCurrencyValue() throws InterruptedException {
		Common.click(transferCurrencyValue);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
	
	public REQUESTS_TransferRequests TransferRequests_Transferbutton() throws InterruptedException {
		Common.click(transferRequests_Transferbutton);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
	
	public REQUESTS_TransferRequests PopupOK() throws InterruptedException {
		Common.click(okpopup);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}
	public REQUESTS_TransferRequests TransferRequests_Back() throws InterruptedException {
		Common.click(transferRequests_Back);
		return PageFactory.initElements(driver, REQUESTS_TransferRequests.class);
	}

}
