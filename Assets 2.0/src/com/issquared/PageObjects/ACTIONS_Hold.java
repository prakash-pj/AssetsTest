package com.issquared.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class ACTIONS_Hold {
	private WebDriver driver;
	Common commonUtil;
	
	/*Constructor */
	public ACTIONS_Hold(WebDriver driver) {
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
	
	
	@FindBy(xpath="//*[@id='pagerItemHold_center']/table/tbody/tr/td[8]/select")
    public WebElement itemsGridPageCount;
	
	@FindBy(xpath="//*[@id='pagerItemHold_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement itemsGridPageCountValue;
	
	@FindBy(xpath="//*[text()='Actions' and @class='nav-label']")
    public WebElement selectACTIONSdropdown;
	  
	@FindBy(xpath="//*[@id='773']/a")
    public WebElement clickOnHold;
	
	@FindBy(xpath="//*[@id='ItemHold']/div/div/div[2]/div/div/div/span/a/b")
    public WebElement assetpoolNameSelection;
	
	@FindBy(xpath="//*[@id='Ok-AssetPoolPopup']/div")
    public WebElement assetpoolNamePopupOk;
	
	@FindBy(xpath="//*[@id='AssetHoldnew']/strong")
    public WebElement  addAssetsToHold;
	
	@FindBy(xpath="//*[@id='AddItemHoldForActions']/div")
    public WebElement  selectAssetsToHoldPopupAddItem;
	
	@FindBy(xpath="//*[@id='Cancel-ItemHoldForActions']/div")
    public WebElement  selectAssetsToHoldPopupBack;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	public ACTIONS_Hold SelectAssetsDashboard() throws InterruptedException {
		Common.click(selectAssetsDashboard);
		return PageFactory.initElements(driver, ACTIONS_Hold.class);
	}

	
	public ACTIONS_Hold selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, ACTIONS_Hold.class);
	}


	public ACTIONS_Hold SelectACTIONSdropdown() throws InterruptedException {
		Common.click(selectACTIONSdropdown);
		return PageFactory.initElements(driver, ACTIONS_Hold.class);
	}


	public ACTIONS_Hold ClickOnHold() throws InterruptedException {
		Common.click(clickOnHold);
		return PageFactory.initElements(driver, ACTIONS_Hold.class);
	}
	
	public ACTIONS_Hold AssetpoolNameSelection() throws InterruptedException {
		Common.click(assetpoolNameSelection);
		return PageFactory.initElements(driver, ACTIONS_Hold.class);
	}
	
	public ACTIONS_Hold ClickPageCount() throws InterruptedException {
		Common.click(PageCount);
		return PageFactory.initElements(driver, ACTIONS_Hold.class);
	}
	public ACTIONS_Hold SelectPageCountValue() throws InterruptedException {
		Common.click(PageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Hold.class);
	}
	
	
	public ACTIONS_Hold AssetpoolPageCount() throws InterruptedException {
		Common.click(assetpoolPageCount);
		return PageFactory.initElements(driver, ACTIONS_Hold.class);
	}
	public ACTIONS_Hold AssetpoolPageCountValue() throws InterruptedException {
		Common.click(assetpoolPageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Hold.class);
	}
	
	public ACTIONS_Hold ItemsGridPageCount() throws InterruptedException {
		Common.click(itemsGridPageCount);
		return PageFactory.initElements(driver, ACTIONS_Hold.class);
	}
	public ACTIONS_Hold ItemsGridPageCountValue() throws InterruptedException {
		Common.click(itemsGridPageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Hold.class);
	}
	
	
	public ACTIONS_Hold AssetPoolNamecheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetPool_AssetPoolName' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, ACTIONS_Hold.class);
	}
	
	public ACTIONS_Hold AssetpoolNamePopupOk() throws InterruptedException {
		Common.click(assetpoolNamePopupOk);
		return PageFactory.initElements(driver, ACTIONS_Hold.class);
	}
	 
	 public ACTIONS_Hold AddAssetsToHold() throws InterruptedException {
			Common.click(addAssetsToHold);
			return PageFactory.initElements(driver, ACTIONS_Hold.class);
		}
	 
	 public ACTIONS_Hold ItemNamecheckbox(String data) throws InterruptedException {
			Common.click(driver.findElement(By.xpath("//div[@id='ItemHold']//td[@aria-describedby='gridItemHold_SerialNumber' and text()='"+data+"']")));
			/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
			return PageFactory.initElements(driver, ACTIONS_Hold.class);
		}
	 public ACTIONS_Hold SelectFirstvalueFromPopup() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemHold_')]"));

		    WebElement Element = links.get(0);
		    Common.click(Element);
			return PageFactory.initElements(driver, ACTIONS_Hold.class);
		}
	 
	 public ACTIONS_Hold SelectAssetsToHoldPopupAddItem() throws InterruptedException {
			Common.click(selectAssetsToHoldPopupAddItem);
			return PageFactory.initElements(driver, ACTIONS_Hold.class);
		}
	 public ACTIONS_Hold PopupOK() throws InterruptedException {
			Common.click(okpopup);
			return PageFactory.initElements(driver, ACTIONS_Hold.class);
		}
	 
	 public ACTIONS_Hold SelectAssetsToHoldPopupBack() throws InterruptedException {
			Common.click(selectAssetsToHoldPopupBack);
			return PageFactory.initElements(driver, ACTIONS_Hold.class);
		}
	

}
