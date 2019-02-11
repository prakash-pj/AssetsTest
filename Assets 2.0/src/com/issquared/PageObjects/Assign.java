package com.issquared.PageObjects;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class Assign {
	
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public Assign(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}

	
	
	
	@FindBy(xpath="//div[1]/div/div/div[1]/div[1]/a/div/div")
    public WebElement selectassets;
	
	
	@FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
	public WebElement Dashboard; 
	
	@FindBy(xpath="//*[text()='Life Cycle' and @class='nav-label']")
    public WebElement selectLIFECYCLEdropdown;
	
	/*@FindBy(xpath="//*[@id='741']/a")
    public WebElement clickAssign;*/   
	
	@FindBy(xpath="//*[@id='765']/a")
    public WebElement clickAssign;
	
	@FindBy(xpath="//a[@id='btn_New']")
    public WebElement selectNew;
	
	@FindBy(xpath="//*[@id='btnItemName']/b")
    public WebElement itemName; 
	
	@FindBy(xpath="//*[@id='chkAdvancedSearch']")
    public WebElement advancedSearchcheckbox;   

	@FindBy(xpath="//*[@id='modal-container']/div/div/div[3]/div[2]/div/div/div/div[1]/div[1]/div/span/a/b")
    public WebElement itemSKUName; 
	
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement PageCount;
	
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement PageCountValue;
	
	@FindBy(xpath="//*[@id='Ok-ItemSKUPopup']/div")
    public WebElement ItemSKUOk;
	
	 @FindBy(xpath="//select[@role='listbox']")
	  public WebElement RoleResourcesRSRSListBox;
	   
	@FindBy(xpath="//select[@role='listbox']/option[4]")
	public WebElement RoleResourcesRSRSListBoxValue;
	
	@FindBy(xpath="//*[@id='Ok-AssetInfoNamePopup']/div")
    public WebElement serchwinokbtn;
	
	@FindBy(xpath="//*[@id='SerialNumber']")  
    public WebElement enterSerialNumber;
	
	@FindBy(xpath="//*[@id='btnOwnerName']/b")
    public WebElement OwnerNamesearch;
	
	@FindBy(xpath="//select[@role='listbox']")
	    public WebElement RoleResourcesRSRSListBox1;
	   
    @FindBy(xpath="//select[@role='listbox']/option[4]")
	    public WebElement RoleResourcesRSRSListBoxValue1;

	
	@FindBy(xpath="//*[@id='Ok-AssetReqestedBy']/div")
    public WebElement OwnerNameserachwinokbtn;
	
	@FindBy(xpath="//*[@id='OwnershipType']")
    public WebElement ownershipType;
	
	@FindBy(xpath="//select[@id='OwnershipType']/option[2]")
    public WebElement ownershipTypeValue;
	
	@FindBy(xpath="//*[@id='AssignmentStartDate']")
    public WebElement assignmentStartDat;
	
	@FindBy(xpath="//*[@id='AssignmentReturnDate']")
    public WebElement assignmentReturnDat;
	
	@FindBy(xpath="//*[@id='ExpectedEndDate']")
    public WebElement expectedEndDat;
	
	@FindBy(xpath="//*[@id='ActualReturnDate']")
    public WebElement actualReturnDat;
	
	@FindBy(xpath="//*[@id='CurrentOwnershipStatus']")
    public WebElement currentOwnershipStatus;
	
	@FindBy(xpath="//select[@id='CurrentOwnershipStatus']/option[2]")
    public WebElement currentOwnershipStatusValue;
	
	@FindBy(xpath="//*[@class='note-editable panel-body']")
    public WebElement notess;
	
	
	@FindBy(xpath="//*[@id='save']/div")
    public WebElement save;
	
	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveandnew;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement okpopup;
	
	@FindBy(xpath="//*[@id='Ok-ItemPopup']/div")
    public WebElement itemsOk;
	
	@FindBy(xpath="//*[@id='step2-content']/strong")
    public WebElement assignUsersTab;
	
	@FindBy(xpath="//*[@id='newUsers']/strong")
    public WebElement addUsers;
	
	@FindBy(xpath="//*[@id='AddUserPopup']/div")
    public WebElement usersPopupok;
	
	@FindBy(xpath="//*[@id='Cancel-AssetPoolPopup']/div")
    public WebElement cancel;
	
	//***********************************************************************************************
	
	

public Assign selectassets() throws InterruptedException {
	Common.click(selectassets);
	return PageFactory.initElements(driver, Assign.class);
}

public ItemClass SelectAssetsDashboard() throws InterruptedException
{
	Common.click(Dashboard);
	return PageFactory.initElements(driver, ItemClass.class);
}



public Assign clickLIFECYCLEdropdown() throws InterruptedException {
	Common.click(selectLIFECYCLEdropdown);
	return PageFactory.initElements(driver, Assign.class);
}


public Assign clickOnAssign() throws InterruptedException {
	Common.click(clickAssign);
	return PageFactory.initElements(driver, Assign.class);
}
public Assign clickNew() throws InterruptedException {
	Common.click(selectNew);
	return PageFactory.initElements(driver, Assign.class);
}

public Assign itemNameSelection() throws InterruptedException {
	Common.click(itemName);
	return PageFactory.initElements(driver, Assign.class);
}
public Assign advancedSearch() throws InterruptedException {
	Common.click(advancedSearchcheckbox);
	return PageFactory.initElements(driver, Assign.class);
}

public Assign itemSKUNameSelection() throws InterruptedException {
	Common.click(itemSKUName);
	return PageFactory.initElements(driver, Assign.class);
}
public Assign itemSKUNamecheckbox(String data) throws InterruptedException {
	Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItemSKU_ItemName' and text()='"+data+"']")));
	//Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
	return PageFactory.initElements(driver, Assign.class);
}

/*public Assign itemSKUNamecheckbox() throws InterruptedException {
	
    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemSKU')]"));
    WebElement Element = links.get(0);
    Common.click(Element);
	return PageFactory.initElements(driver, Assign.class);
}*/

public Assign itemOwnerNamecheckbox(String data) throws InterruptedException {
	Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
	/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
	return PageFactory.initElements(driver, Assign.class);
}
public ItemClass SelectOwnerNameFromPopup() throws InterruptedException {
	
    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy')]"));

    WebElement Element = links.get(0);
    Common.click(Element);
	return PageFactory.initElements(driver, ItemClass.class);
}


 public Assign itemSKUOk() throws InterruptedException {
	Common.click(ItemSKUOk);
	return PageFactory.initElements(driver, Assign.class);
}

 public Assign selectitem(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridItem_SerialNumber' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, Assign.class);
	}
 public Assign SelectFirstvalueFromPopup() throws InterruptedException {
		
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItem_')]"));
	 
	    WebElement Element = links.get(0);
	    Common.click(Element);
		return PageFactory.initElements(driver, Assign.class);
	}
 
 public Assign itemsOkButton() throws InterruptedException {
	Common.click(itemsOk);
	return PageFactory.initElements(driver, Assign.class);
}


 public Assign OwnerNamesearchSelection() throws InterruptedException {
		Common.click(OwnerNamesearch);
		return PageFactory.initElements(driver, Assign.class);
	}
 public Assign OwnerNameCheckbox(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcont']//td[@aria-describedby='gridAssetReqestedBy_ObjectValue' and text()='"+data+"']")));
		/*Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));*/
		return PageFactory.initElements(driver, Assign.class);
	}
 
 public Assign OwnerNamesearchOK() throws InterruptedException {
		Common.click(OwnerNameserachwinokbtn);
		return PageFactory.initElements(driver, Assign.class);
	}
 public Assign OwnershipType() throws InterruptedException {
		Common.click(ownershipType);
		return PageFactory.initElements(driver, Assign.class);
	}
 public Assign OwnershipTypeValue() throws InterruptedException {
		Common.click(ownershipTypeValue);
		return PageFactory.initElements(driver, Assign.class);
	}
 
 public Assign Save() throws InterruptedException {
		Common.click(save);
		return PageFactory.initElements(driver, Assign.class);
	}
 
 public Assign SaveAndNew() throws InterruptedException {
		Common.click(saveandnew);
		return PageFactory.initElements(driver, Assign.class);
	}
	public Assign PopupOK() throws InterruptedException {
		Common.click(okpopup);
		return PageFactory.initElements(driver, Assign.class);
	}

	public Assign AssignmentStartDate(String assignmentStartDate) throws InterruptedException {
		assignmentStartDat.sendKeys(assignmentStartDate);
		return PageFactory.initElements(driver, Assign.class);
	}
	public Assign AssignmentReturnDate(String assignmentReturnDate) throws InterruptedException {
		assignmentReturnDat.sendKeys(assignmentReturnDate);
		return PageFactory.initElements(driver, Assign.class);
	}
	public Assign ExpectedEndDate(String expectedEndDate) throws InterruptedException {
		expectedEndDat.sendKeys(expectedEndDate);
		return PageFactory.initElements(driver, Assign.class);
	}
	public Assign ActualReturnDate(String actualReturnDate) throws InterruptedException {
		actualReturnDat.sendKeys(actualReturnDate);
		return PageFactory.initElements(driver, Assign.class);
	}
	
	public Assign CurrentOwnershipStatus() throws InterruptedException {
		Common.click(currentOwnershipStatus);
		return PageFactory.initElements(driver, Assign.class);
	}
    public Assign CurrentOwnershipStatusValue() throws InterruptedException {
		Common.click(currentOwnershipStatusValue);
		return PageFactory.initElements(driver, Assign.class);
	}
    
    public Assign Notes(String notes) throws InterruptedException {
		notess.sendKeys(notes);
		return PageFactory.initElements(driver, Assign.class);
	}
	
	/*public  Assign SelectRoleResourcesRSRSListBox() throws InterruptedException  {
		RoleResourcesRSRSListBox1.click();
		return PageFactory.initElements(driver,Assign.class);
		}
		public  Assign SelectRoleResourcesRSRSListBoxValue() throws InterruptedException  {
			RoleResourcesRSRSListBoxValue1.click();
		return PageFactory.initElements(driver,Assign.class);
		}*/
	/*public Assign clickAllCheckboxesownername()
	{
		 Random r = new java.util.Random();
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy_')]"));

		    WebElement randomElement = links.get(r.nextInt(links.size()));
		    
		    randomElement.click();

	return PageFactory.initElements(driver, Assign.class); 
	}
	public Assign OwnerNameserachwinokbtn() throws InterruptedException {
		Common.click(OwnerNameserachwinokbtn);
		return PageFactory.initElements(driver, Assign.class);
	}
	public Assign saveandnew() throws InterruptedException {
		Common.click(saveandnew);
		return PageFactory.initElements(driver, Assign.class);
	}
	public Assign okpopup() throws InterruptedException {
		Common.click(okpopup);
		return PageFactory.initElements(driver, Assign.class);
	}
*/
public ItemClass ClickPageCount() throws InterruptedException {
	Common.click(PageCount);
	return PageFactory.initElements(driver, ItemClass.class);
}
public ItemClass SelectPageCountValue() throws InterruptedException {
	Common.click(PageCountValue);
	return PageFactory.initElements(driver, ItemClass.class);
}

public ItemClass EnterItemtypename(String ITEMSKU) throws InterruptedException {
/*		Common.Enterdata(ITMTYNME, Itemtypename);*/
	ItemSKUOk.sendKeys(ITEMSKU);
	return PageFactory.initElements(driver, ItemClass.class);
}






public  Ownership SelectRoleResourcesRSRSListBox() throws InterruptedException  {
	RoleResourcesRSRSListBox.click();
	return PageFactory.initElements(driver,Ownership.class);
	}
	public  Ownership SelectRoleResourcesRSRSListBoxValue() throws InterruptedException  {
		RoleResourcesRSRSListBoxValue.click();
	return PageFactory.initElements(driver,Ownership.class);
	}

public Ownership clickAllCheckboxes()
{
	 Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetInfo_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	    
	    randomElement.click();

return PageFactory.initElements(driver, Ownership.class); 
}
public Ownership serchwinokbtn() throws InterruptedException {
	Common.click(serchwinokbtn);
	return PageFactory.initElements(driver, Ownership.class);
}
public Ownership  enterSerialNumber(String dn)  {
	enterSerialNumber.sendKeys(dn);
	return PageFactory.initElements(driver, Ownership.class);
}

/*public Ownership OwnerNameserachwin() throws InterruptedException {
	Common.click(OwnerNameseachwin);
	return PageFactory.initElements(driver, Ownership.class);
}*/

public  ProcureInventory SelectRoleResourcesRSRSListBox1() throws InterruptedException  {
	RoleResourcesRSRSListBox1.click();
	return PageFactory.initElements(driver,ProcureInventory.class);
	}
	public  ProcureInventory SelectRoleResourcesRSRSListBoxValue1() throws InterruptedException  {
		RoleResourcesRSRSListBoxValue1.click();
	return PageFactory.initElements(driver,ProcureInventory.class);
	}


public Ownership clickAllCheckboxesownername()
{
	 Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridAssetReqestedBy_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	    
	    randomElement.click();

return PageFactory.initElements(driver, Ownership.class); 
}
public Ownership OwnerNameserachwinokbtn() throws InterruptedException {
	Common.click(OwnerNameserachwinokbtn);
	return PageFactory.initElements(driver, Ownership.class);
}
public Ownership saveandnew() throws InterruptedException {
	Common.click(saveandnew);
	return PageFactory.initElements(driver, Ownership.class);
}
public Ownership okpopup() throws InterruptedException {
	Common.click(okpopup);
	return PageFactory.initElements(driver, Ownership.class);
}

public Ownership AssignUsersTab() throws InterruptedException {
	Common.click(assignUsersTab);
	return PageFactory.initElements(driver, Ownership.class);
}

public Ownership AddUsers() throws InterruptedException {
	Common.click(addUsers);
	return PageFactory.initElements(driver, Ownership.class);
}

public Assign SelectFirstUserFromPopup() throws InterruptedException {
	
    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridUserPopup')]"));
 
    WebElement Element = links.get(0);
    Common.click(Element);
	return PageFactory.initElements(driver, Assign.class);
}

public Ownership UsersPopupOK() throws InterruptedException {
	Common.click(usersPopupok);
	return PageFactory.initElements(driver, Ownership.class);
}

public Ownership UsersPopupCancel() throws InterruptedException {
	Common.click(cancel);
	return PageFactory.initElements(driver, Ownership.class);
}

//*******************************Scroll Methods********************

public Ownership Scrolldown() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
return PageFactory.initElements(driver, Ownership.class);
}
//up
public Ownership ScrollUp() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
return PageFactory.initElements(driver, Ownership.class);
}

public Ownership Scrollmiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,250)","");
return PageFactory.initElements(driver, Ownership.class);
}
public Ownership ScrollUpMiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(-0,-250)","");
return PageFactory.initElements(driver, Ownership.class);
}
public Ownership Scrolldownlast() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(250)","");
return PageFactory.initElements(driver, Ownership.class);
}
/*public Ownership InViewPortTab() throws Exception
{
	inViewPortt(clickWarrantyContract);
	clickWarrantyContract.click();
	return PageFactory.initElements(driver, Ownership.class);
}*/
public static void inViewPortt(WebElement e) throws Exception
{
	Coordinates ord = ((Locatable)e).getCoordinates();
	ord.inViewPort();

	Thread.sleep(500);
}
//*****************************************************

}
