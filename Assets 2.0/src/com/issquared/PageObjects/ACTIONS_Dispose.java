package com.issquared.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class ACTIONS_Dispose {
	private WebDriver driver;
	Common commonUtil;
	
	/*Constructor */
	public ACTIONS_Dispose(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id='pagerAssetDisposal_center']/table/tbody/tr/td[8]/select")
    public WebElement disposeItemsPageCount;
	
	@FindBy(xpath="//*[@id='pagerAssetDisposal_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement disposeItemsPageCountValue;
	
	@FindBy(xpath="//*[text()='Actions' and @class='nav-label']")
    public WebElement selectACTIONSdropdown;
	  
	@FindBy(xpath="//*[@id='775']/a")
    public WebElement clickOnDispose;
	
	/*@FindBy(xpath="//*[@id='ItemHold']/div/div/div[2]/div/div/div/span/a/b")
    public WebElement assetpoolNameSelection;*/
	
	@FindBy(xpath="//*[@id='AssetPool']/div/div/div[2]/div/div[2]/div/span/a/b")
    public WebElement assetpoolNameSelection;
	
	@FindBy(xpath="//*[@id='Ok-AssetPoolPopup']/div")
    public WebElement assetpoolNamePopupOk;
	
	@FindBy(xpath="//*[@id='AssetPool']/div/div/div[2]/div/div[1]/div/span/a/b")
    public WebElement disposedBySelection;
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedBy']/div")
    public WebElement disposedByPopupOk;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select")
    public WebElement disposedByPageCount;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedBy_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement disposedByPageCountValue;
	
	@FindBy(xpath="//*[@id='AssetDisposalnew']/strong")
    public WebElement  disposeItemsCreateNewCreateNew;

	@FindBy(xpath="//*[@id='AddAssetDisposal']/div")
    public WebElement  selectAssetsToDisposeAddItem;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	@FindBy(xpath="//*[@id='Cancel-AssetDisposal']/div")
    public WebElement popupBack;
	
	public ACTIONS_Dispose SelectAssetsDashboard() throws InterruptedException {
		Common.click(selectAssetsDashboard);
		return PageFactory.initElements(driver, ACTIONS_Dispose.class);
	}

	
	public ACTIONS_Dispose selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, ACTIONS_Dispose.class);
	}


	public ACTIONS_Dispose SelectACTIONSdropdown() throws InterruptedException {
		Common.click(selectACTIONSdropdown);
		return PageFactory.initElements(driver, ACTIONS_Dispose.class);
	}


	public ACTIONS_Dispose ClickOnDispose() throws InterruptedException {
		Common.click(clickOnDispose);
		return PageFactory.initElements(driver, ACTIONS_Dispose.class);
	}
	
	public ACTIONS_Dispose AssetpoolNameSelection() throws InterruptedException {
		Common.click(assetpoolNameSelection);
		return PageFactory.initElements(driver, ACTIONS_Dispose.class);
	}
	
	public ACTIONS_Dispose ClickPageCount() throws InterruptedException {
		Common.click(PageCount);
		return PageFactory.initElements(driver, ACTIONS_Dispose.class);
	}
	public ACTIONS_Dispose SelectPageCountValue() throws InterruptedException {
		Common.click(PageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Dispose.class);
	}
	
	/*public ACTIONS_Dispose AssetPoolNamecheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetPool_AssetPoolName' and text()='"+data+"']")));
		Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ACTIONS_Dispose.class);
	}*/
	
	  public ACTIONS_Dispose AssetPoolNamecheckbox() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetPool')]"));
		    WebElement Element = links.get(1);
		    Common.click(Element);
			return PageFactory.initElements(driver, ACTIONS_Dispose.class);
		}
	
	public ACTIONS_Dispose AssetpoolNamePopupOk() throws InterruptedException {
		Common.click(assetpoolNamePopupOk);
		return PageFactory.initElements(driver, ACTIONS_Dispose.class);
	}
	
	
	
	
	
	
	
	public ACTIONS_Dispose DisposedBySelection() throws InterruptedException {
		Common.click(disposedBySelection);
		return PageFactory.initElements(driver, ACTIONS_Dispose.class);
	}
	/*public ACTIONS_Dispose DisposedBycheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
		Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, ACTIONS_Dispose.class);
	}*/
	
    public ACTIONS_Dispose DisposedBycheckbox() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy')]"));
	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, ACTIONS_Dispose.class);
	}
	
	public ACTIONS_Dispose DisposedByPopupOk() throws InterruptedException {
		Common.click(disposedByPopupOk);
		return PageFactory.initElements(driver, ACTIONS_Dispose.class);
	}
	
	public ACTIONS_Dispose DisposedByClickPageCount() throws InterruptedException {
		Common.click(disposedByPageCount);
		return PageFactory.initElements(driver, ACTIONS_Dispose.class);
	}
	public ACTIONS_Dispose DisposedBySelectPageCountValue() throws InterruptedException {
		Common.click(disposedByPageCountValue);
		return PageFactory.initElements(driver, ACTIONS_Dispose.class);
	}
	
	
	
	 public ACTIONS_Dispose DisposeItemsCreateNew() throws InterruptedException {
			Common.click(disposeItemsCreateNewCreateNew);
			return PageFactory.initElements(driver, ACTIONS_Dispose.class);
		}
	 
	 public ACTIONS_Dispose ItemNamecheckbox(String data) throws InterruptedException {
			Common.click(driver.findElement(By.xpath("//div[@id='gricountforactions']//td[@aria-describedby='gridAssetDisposal_SerialNumber' and text()='"+data+"']")));
			/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
			return PageFactory.initElements(driver, ACTIONS_Dispose.class);
		}
	 
	 public ACTIONS_Dispose SelectFirstvalueFromPopup() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetDisposal_')]"));

		    WebElement Element = links.get(0);
		    Common.click(Element);
			return PageFactory.initElements(driver, ACTIONS_Dispose.class);
		}
	 
	 public ACTIONS_Dispose SelectAssetsToDisposeAddItem() throws InterruptedException {
			Common.click(selectAssetsToDisposeAddItem);
			return PageFactory.initElements(driver, ACTIONS_Dispose.class);
		}
	 public ACTIONS_Dispose DisposeItemsClickPageCount() throws InterruptedException {
			Common.click(disposeItemsPageCount);
			return PageFactory.initElements(driver, ACTIONS_Dispose.class);
		}
		public ACTIONS_Dispose DisposeItemsSelectPageCountValue() throws InterruptedException {
			Common.click(disposeItemsPageCountValue);
			return PageFactory.initElements(driver, ACTIONS_Dispose.class);
		}
	 
	 
	 public ACTIONS_Transfer PopupOK() throws InterruptedException {
			Common.click(okpopup);
			return PageFactory.initElements(driver, ACTIONS_Transfer.class);
		}
	 public ACTIONS_Transfer PopupBack() throws InterruptedException {
			Common.click(popupBack);
			return PageFactory.initElements(driver, ACTIONS_Transfer.class);
		}

}
