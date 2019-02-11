package com.issquared.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class LIFECYCLE_Hold {
	
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public LIFECYCLE_Hold(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	
	@FindBy(xpath="//*[@id='side-menu']/li[1]/a/span")
    public WebElement selectAssetsDashboard;
	
	@FindBy(xpath="//div[1]/div/div/div[1]/div[1]/a/div/div")
    public WebElement selectassets;
	
	
	@FindBy(xpath="//*[text()='Life Cycle' and @class='nav-label']")
    public WebElement selectLIFECYCLEdropdown;
	
	@FindBy(xpath="//*[@id='744']/a")
    public WebElement clickHold;
	
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
    public WebElement ownerNamePageCount;
	
	@FindBy(xpath="//*[@id='pagerAssetReqestedFor_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement ownerNamePageCountValue;
	
	@FindBy(xpath="//*[@id='Ok-ItemSKUPopup']/div")
    public WebElement ItemSKUOk;
	
	@FindBy(xpath="//*[@id='pagerItem_center']/table/tbody/tr/td[8]/select")
    public WebElement itemsPageCount;
	
	@FindBy(xpath="//*[@id='pagerItem_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement itemsPageCountValue;
	
	@FindBy(xpath="//*[@id='Ok-ItemPopup']/div")
    public WebElement ItemOk;
	
	@FindBy(xpath="//*[@id='HoldType']")
    public WebElement HoldType;
	
	@FindBy(xpath="//select[@id='HoldType']/option[2]")
    public WebElement HoldTypeValueNew;
	
	@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[4]/div/span/a/b")
    public WebElement ownerNameSelection;
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedFor']/div")
    public WebElement ownerNameOK;
	
	@FindBy(xpath="//*[@id='StartDate']")
    public WebElement startDate;
	
	@FindBy(xpath=".//*[@id='EndDate']")
    public WebElement endDate;
	
	@FindBy(xpath="//*[@class='note-editable panel-body']")
    public WebElement note;
	
	@FindBy(xpath="//*[@id='save-BasicInfo']/div")
    public WebElement save;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveAndNew;
	
	@FindBy(xpath="//*[@id='cancel']/div")
    public WebElement back;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	public LIFECYCLE_Hold SelectAssetsDashboard() throws InterruptedException {
		Common.click(selectAssetsDashboard);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}

	
	public LIFECYCLE_Hold selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}


	public LIFECYCLE_Hold clickLIFECYCLEdropdown() throws InterruptedException {
		Common.click(selectLIFECYCLEdropdown);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}


	public LIFECYCLE_Hold clickOnHold() throws InterruptedException {
		Common.click(clickHold);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
	public LIFECYCLE_Hold clickNew() throws InterruptedException {
		Common.click(selectNew);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
	public LIFECYCLE_Hold itemNameSelection() throws InterruptedException {
		Common.click(itemName);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
	public LIFECYCLE_Hold AdvanceSearch() throws InterruptedException {
		Common.click(advancedSearchcheckbox);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
	public LIFECYCLE_Hold itemSKUSelection() throws InterruptedException {
		Common.click(itemSKUName);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
	public LIFECYCLE_Hold ClickPageCount() throws InterruptedException {
		Common.click(PageCount);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	public LIFECYCLE_Hold SelectPageCountValue() throws InterruptedException {
		Common.click(PageCountValue);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
	public LIFECYCLE_Hold OwnerNameClickPageCount() throws InterruptedException {
		Common.click(ownerNamePageCount);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	public LIFECYCLE_Hold OwnerNameSelectPageCountValue() throws InterruptedException {
		Common.click(ownerNamePageCountValue);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
	
	public LIFECYCLE_Hold ItemSKUCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemSKU_ItemName' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
  /* public LIFECYCLE_Hold ItemSKUCheckbox() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemSKU')]"));
	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}*/

	public LIFECYCLE_Hold ItemSKUPopupOK() throws InterruptedException {
		Common.click(ItemSKUOk);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
	public LIFECYCLE_Hold ItemsClickPageCount() throws InterruptedException {
		Common.click(itemsPageCount);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	public LIFECYCLE_Hold ItemsSelectPageCountValue() throws InterruptedException {
		Common.click(itemsPageCountValue);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
	public LIFECYCLE_Hold ItemCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItem_SerialNumber' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
public LIFECYCLE_Hold SelectFirstvalueFromPopup() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItem_')]"));

	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}

	public LIFECYCLE_Hold ItemPopupOK() throws InterruptedException {
		Common.click(ItemOk);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
	public LIFECYCLE_Hold HoldType() throws InterruptedException {
		Common.click(HoldType);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
	public LIFECYCLE_Hold HoldTypeValueNew() throws InterruptedException {
		Common.click(HoldTypeValueNew);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
	public LIFECYCLE_Hold OwnerNameSelection() throws InterruptedException {
		Common.click(ownerNameSelection);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
	public LIFECYCLE_Hold OwnerNameCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedFor_ObjectValue' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	public LIFECYCLE_Hold OwnerNamePopupOK() throws InterruptedException {
		Common.click(ownerNameOK);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	
	
	public LIFECYCLE_Hold StartDate() throws InterruptedException {
		Common.click(startDate);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	public LIFECYCLE_Hold EndDate() throws InterruptedException {
		Common.click(endDate);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
	}
	public LIFECYCLE_Hold Notes() throws InterruptedException {
		Common.click(note);
		return PageFactory.initElements(driver, LIFECYCLE_Hold.class);
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
