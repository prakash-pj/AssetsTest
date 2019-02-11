package com.issquared.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class LIFECYCLE_Repair {
	
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public LIFECYCLE_Repair(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	
	@FindBy(xpath="//*[@id='side-menu']/li[1]/a/span")
    public WebElement selectAssetsDashboard;
	
	@FindBy(xpath="//div[1]/div/div/div[1]/div[1]/a/div/div")
    public WebElement selectassets;
	
	
	@FindBy(xpath="//*[text()='Life Cycle' and @class='nav-label']")
    public WebElement selectLIFECYCLEdropdown;
	
	/*@FindBy(xpath="//*[@id='741']/a")
    public WebElement clickAssign;*/   
	
	@FindBy(xpath="//*[@id='742']/a")
    public WebElement clickRepair;
	
	@FindBy(xpath="//*[@id='btn_New']")
    public WebElement selectNew;
	
	/*@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[1]/div/span/a/b")
    public WebElement itemName;*/
	
	@FindBy(xpath="//*[@id='RepairForm']/div/div/div[2]/div/div[1]/div/span/a/b")
    public WebElement itemName; 
	
	@FindBy(xpath="//*[@id='chkAdvancedSearch']")
    public WebElement advancedSearchcheckbox;   

	@FindBy(xpath="//*[@id='modal-container']/div/div/div[3]/div[2]/div/div/div/div[1]/div[1]/div/span/a/b")
    public WebElement itemSKUName; 
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement PageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement PageCountValue;
	
	@FindBy(xpath="//*[@id='pagerItem_center']/table/tbody/tr/td[8]/select")
    public WebElement itemsPageCount;
	
	@FindBy(xpath="//*[@id='pagerItem_center']/table/tbody/tr/td[8]/select/option[4]")
    public WebElement itemsPageCountValue;
	
	@FindBy(xpath="//*[@id='Ok-ItemSKUPopup']/div")
    public WebElement ItemSKUOk;
	
	@FindBy(xpath="//*[@id='Ok-ItemPopup']/div")
    public WebElement ItemOk;
	
	@FindBy(xpath="//*[@id='RepairType']")
    public WebElement repairType;
	
	@FindBy(xpath="//select[@id='RepairType']/option[2]")
    public WebElement ownershipTypeValueNew;
	
	@FindBy(xpath="//select[@id='RepairType']/option[3]")
    public WebElement repairTypeValueOutofWarranty;
	
	@FindBy(xpath="//select[@id='RepairType']/option[4]")
    public WebElement repairTypeValueEmergencyRepair;
	
	@FindBy(xpath=".//*[@id='RepairReason']")
    public WebElement repairReason;
	
	@FindBy(xpath="//select[@id='RepairReason']/option[2]")
    public WebElement repairReasonTypeValueDamaged;
	
	@FindBy(xpath="//select[@id='RepairReason']/option[3]")
    public WebElement repairReasonTypeValueNotWorking;
	
	@FindBy(xpath="//select[@id='RepairReason']/option[4]")
    public WebElement repairReasonTypeValueManufactururFault;
	
	
	
	/*@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[5]/div/span/a/b")
    public WebElement requestedBySelection;*/
	
	@FindBy(xpath="//*[@id='RepairForm']/div/div/div[2]/div/div[3]/div/span/a/b")
    public WebElement requestedBySelection;
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedBy']/div")
    public WebElement requestedByPopupOk;
	
	/*@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[6]/div/span/a/b")
    public WebElement requestedForSelection;*/ 
	
	@FindBy(xpath="//*[@id='RepairForm']/div/div/div[2]/div/div[4]/div/span/a/b")
    public WebElement requestedForSelection;
	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedFor']/div")
    public WebElement requestedForPopupOk;
	
	/*@FindBy(xpath="//*[@id='step0']/div/div[2]/div/div[7]/div/span/a/b")
    public WebElement vendorNameSelection;*/ 
	
	@FindBy(xpath="//*[@id='RepairForm']/div/div/div[2]/div/div[9]/div/span/a/b")
    public WebElement vendorNameSelection;
	
    @FindBy(xpath="//*[@id='Ok-OrganizationNamePopup']/div")
    public WebElement vendorNamePopupOk;
	
	@FindBy(xpath="//*[@id='TicketID']")
    public WebElement ticketID;
	
	@FindBy(xpath="//*[@id='RepairFees']")
    public WebElement repairfee;
	
	@FindBy(xpath="//*[@id='RepairFeeCurrency']/option[126]")
    public WebElement repairFeeCurrency;
	
	@FindBy(xpath="//*[@id='VendorTicketDate']")
    public WebElement vendorTicketDate;
	
	@FindBy(xpath="//*[@id='VendorRMA']")
    public WebElement vendorRMA;
	
	@FindBy(xpath="//*[@id='save-BasicInfo']/div")
    public WebElement save;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveAndNew;
	
	@FindBy(xpath="//*[@id='cancel']/div")
    public WebElement back;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	
	public LIFECYCLE_Repair SelectAssetsDashboard() throws InterruptedException {
		Common.click(selectAssetsDashboard);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}

	
	public LIFECYCLE_Repair selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}


	public LIFECYCLE_Repair clickLIFECYCLEdropdown() throws InterruptedException {
		Common.click(selectLIFECYCLEdropdown);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}


	public LIFECYCLE_Repair clickOnRepair() throws InterruptedException {
		Common.click(clickRepair);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	public LIFECYCLE_Repair clickNew() throws InterruptedException {
		Common.click(selectNew);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	public LIFECYCLE_Repair itemInfoSelection() throws InterruptedException {
		Common.click(itemName);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	public LIFECYCLE_Repair itemSKUSelection() throws InterruptedException {
		Common.click(itemSKUName);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	public LIFECYCLE_Repair itemSKUNamecheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemSKU_ItemName' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	/*public LIFECYCLE_Repair itemSKUNamecheckbox() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemSKU')]"));
	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}*/
	
	public LIFECYCLE_Repair itemSKUPopupOK() throws InterruptedException {
		Common.click(ItemSKUOk);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	public LIFECYCLE_Repair itemNamecheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItem_SerialNumber' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
    public LIFECYCLE_Repair SelectFirstvalueFromPopup() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItem_')]"));

	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	public LIFECYCLE_Repair itemPopupOK() throws InterruptedException {
		Common.click(ItemOk);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	public LIFECYCLE_Repair RepairType() throws InterruptedException {
		Common.click(repairType);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	public LIFECYCLE_Repair RepairTypeValueNew() throws InterruptedException {
		Common.click(ownershipTypeValueNew);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	public LIFECYCLE_Repair RepairTypeValueOutofWarranty() throws InterruptedException {
		Common.click(repairTypeValueOutofWarranty);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	public LIFECYCLE_Repair RepairTypeValueEmergencyRepair() throws InterruptedException {
		Common.click(repairTypeValueEmergencyRepair);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	
	public LIFECYCLE_Repair RepairReasonType() throws InterruptedException {
		Common.click(repairReason);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	public LIFECYCLE_Repair RepairReasonTypeValueDamaged() throws InterruptedException {
		Common.click(repairReasonTypeValueDamaged);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	public LIFECYCLE_Repair RepairReasonTypeValueNotWorking() throws InterruptedException {
		Common.click(repairReasonTypeValueNotWorking);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	public LIFECYCLE_Repair RepairReasonTypeValueManufactururFault() throws InterruptedException {
		Common.click(repairReasonTypeValueManufactururFault);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	public LIFECYCLE_Repair RequestedBySelection() throws InterruptedException {
		Common.click(requestedBySelection);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	/*public LIFECYCLE_Repair RequestedByUserCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
		Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}*/
	 public LIFECYCLE_Repair RequestedByUserCheckbox() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy')]"));
		    WebElement Element = links.get(1);
		    Common.click(Element);
			return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
		}
	
	public LIFECYCLE_Repair RequestedByPopupOk() throws InterruptedException {
		Common.click(requestedByPopupOk);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	
	public LIFECYCLE_Repair RequestedForSelection() throws InterruptedException {
		Common.click(requestedForSelection);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	/*public LIFECYCLE_Repair RequestedForUserCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedFor_ObjectValue' and text()='"+data+"']")));
		Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}*/
	
	 public LIFECYCLE_Repair RequestedForUserCheckbox() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedFor')]"));
		    WebElement Element = links.get(1);
		    Common.click(Element);
			return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
		}
	
	public LIFECYCLE_Repair RequestedForPopupOk() throws InterruptedException {
		Common.click(requestedForPopupOk);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	
	
	public LIFECYCLE_Repair VendorNameSelection() throws InterruptedException {
		Common.click(vendorNameSelection);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	/*public LIFECYCLE_Repair VendorNameCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcontorg']//td[@aria-describedby='gridOrganization_ObjectValue' and text()='"+data+"']")));
		Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}*/
	
	 public LIFECYCLE_Repair VendorNameCheckbox() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridOrganization')]"));
		 
		    WebElement Element = links.get(0);
		    Common.click(Element);
			return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
		}
	
	public LIFECYCLE_Repair VendorNamePopupOk() throws InterruptedException {
		Common.click(vendorNamePopupOk);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	public LIFECYCLE_Repair ClickPageCount() throws InterruptedException {
		Common.click(PageCount);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	public LIFECYCLE_Repair SelectPageCountValue() throws InterruptedException {
		Common.click(PageCountValue);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	public LIFECYCLE_Repair ItemsClickPageCount() throws InterruptedException {
		Common.click(itemsPageCount);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	public LIFECYCLE_Repair ItemsSelectPageCountValue() throws InterruptedException {
		Common.click(itemsPageCountValue);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	
	public LIFECYCLE_Repair TicketID(String ticket_ID) throws InterruptedException {
		/*		Common.Enterdata(ITMTYNME, Itemtypename);*/
		ticketID.sendKeys(ticket_ID);
			return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
		}
	public LIFECYCLE_Repair  RepairFee(String repairFee) throws InterruptedException {
		/*		Common.Enterdata(ITMTYNME, Itemtypename);*/
		repairfee.sendKeys(repairFee);
			return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
		}
	public LIFECYCLE_Disposal RepairFeeCurrency() throws InterruptedException {
		Common.click(repairFeeCurrency);
		return PageFactory.initElements(driver, LIFECYCLE_Disposal.class);
	}
	
	
	public LIFECYCLE_Repair VendorTicketDate(String vendorTicket_Date) throws InterruptedException {
		/*		Common.Enterdata(ITMTYNME, Itemtypename);*/
		vendorTicketDate.sendKeys(vendorTicket_Date);
			return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
		}
	public LIFECYCLE_Repair VendorRMA(String vendor_RMA) throws InterruptedException {
		/*		Common.Enterdata(ITMTYNME, Itemtypename);*/
		vendorRMA.sendKeys(vendor_RMA);
			return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
		}
	public LIFECYCLE_Repair Save() throws InterruptedException {
		Common.click(save);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	public LIFECYCLE_Repair SaveAndNew() throws InterruptedException {
		Common.click(saveAndNew);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	public LIFECYCLE_Repair Back() throws InterruptedException {
		Common.click(back);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
	public LIFECYCLE_Repair PopupOK() throws InterruptedException {
		Common.click(okpopup);
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}
}
