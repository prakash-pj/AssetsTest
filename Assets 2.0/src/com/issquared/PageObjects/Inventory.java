package com.issquared.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class Inventory {
	
	private WebDriver driver;
	Common commonUtil;
	
	/*Constructor */
	public Inventory(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	@FindBy(xpath="//a[@id='Assests' and @href='/DefaultLanding/Assets']//div[@class='div-text']")
    public WebElement selectassets;
	
	@FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
	public WebElement Dashboard; 
	
	@FindBy(xpath="//a[@href='/Inventary']//span[contains(text(),'Inventory')]")
    public WebElement inventory;
	
	@FindBy(xpath="//*[@id='searchfilter']")
    public WebElement searchBox;
	
	@FindBy(xpath="//*[@id='searchbtn']")
    public WebElement searchButton;
	
	@FindBy(xpath="//*[@id='tblAgencyRegulations']/tbody/tr[1]/td[1]")
    public WebElement firstValue;
	
	@FindBy(xpath="//*[@id='holdItems']")
    public WebElement hold_RadioButton;
	
	@FindBy(xpath="//*[@id='repairItems']")
    public WebElement repair_RadioButton;
	
	@FindBy(xpath="//*[@id='disposalItems']")
    public WebElement disposal_RadioButton;
	
	@FindBy(xpath="//*[@id='exportpdf']")
    public WebElement exportPDF;
	
	@FindBy(xpath="//*[@id='exportexcel']")
    public WebElement exportExcel;
	
	@FindBy(xpath="//*[@id='pendingItems']")
    public WebElement pending_RadioButton;
	
	@FindBy(xpath="//*[@id='inprocessItems']")
    public WebElement inProcess_RadioButton;
	
	@FindBy(xpath="//*[@id='recertifiedItems']")
    public WebElement recertified_RadioButton;
	
	@FindBy(xpath="//*[@id='RejectedItems']")
    public WebElement rejected_RadioButton;
	
	@FindBy(xpath="//*[@id='exportrecpdf']")
    public WebElement rec_ExportPDF;
	
	@FindBy(xpath="//*[@id='exportrecexcel']")
    public WebElement rec_ExportExcel;
	
	@FindBy(xpath="//*[@id='cancel']")
    public WebElement back;
	
	public Inventory selectAssets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, Inventory.class);
	}
	
	public Inventory SelectAssetsDashboard() throws InterruptedException
	{
		Common.click(Dashboard);
		return PageFactory.initElements(driver, Inventory.class);
	}
	public Inventory selectInventory() throws InterruptedException {
		Common.click(inventory);
		return PageFactory.initElements(driver, Inventory.class);
	}
	
	public Inventory clickSearchBox() throws InterruptedException {
		Common.click(searchBox);
		return PageFactory.initElements(driver, Inventory.class);
	}
	
	public Inventory clickSearchButton() throws InterruptedException {
		Common.click(searchButton);
		return PageFactory.initElements(driver, Inventory.class);
	}
	
    public  Inventory EnterSearchItemName(String search_ItemName) throws InterruptedException {
		
		Common.Enterdata(search_ItemName, searchBox);
		return PageFactory.initElements(driver,Inventory.class);
	}

    public Inventory ClickOnFirstValue() throws InterruptedException {
		Common.click(firstValue);
		return PageFactory.initElements(driver, Inventory.class);
	}
    
   /* public Inventory clickonHold() throws InterruptedException {
		Common.click(hold_RadioButton);
		return PageFactory.initElements(driver, Inventory.class);
	}*/
    
    public Inventory clickonHold() throws InterruptedException {
    	List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'holdItems')]"));

        WebElement Element = links.get(1);
        Common.click(Element);
		return PageFactory.initElements(driver, Inventory.class);
	}
    
    
   /* public Inventory clickonRepair() throws InterruptedException {
		Common.click(repair_RadioButton);
		return PageFactory.initElements(driver, Inventory.class);
	}*/
  
    public Inventory clickonRepair() throws InterruptedException {
    	List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'repairItems')]"));

        WebElement Element = links.get(1);
        Common.click(Element);
		return PageFactory.initElements(driver, Inventory.class);
	}
    
    
    
    public Inventory clickonDisposal() throws InterruptedException {
		Common.click(disposal_RadioButton);
		return PageFactory.initElements(driver, Inventory.class);
	}
    
    public Inventory clickonExportPDF() throws InterruptedException {
		Common.click(exportPDF);
		return PageFactory.initElements(driver, Inventory.class);
	}
    
    public Inventory clickonExportExcel() throws InterruptedException {
		Common.click(exportExcel);
		return PageFactory.initElements(driver, Inventory.class);
	}
    
    public Inventory clickonRec_Pending() throws InterruptedException {
		Common.click(pending_RadioButton);
		return PageFactory.initElements(driver, Inventory.class);
	}
    
    public Inventory clickonRec_InProcess() throws InterruptedException {
		Common.click(inProcess_RadioButton);
		return PageFactory.initElements(driver, Inventory.class);
	}
    
    public Inventory clickonRec_Recertified() throws InterruptedException {
		Common.click(recertified_RadioButton);
		return PageFactory.initElements(driver, Inventory.class);
	}
    
    public Inventory clickonRec_Rejected() throws InterruptedException {
		Common.click(rejected_RadioButton);
		return PageFactory.initElements(driver, Inventory.class);
	}
    
    public Inventory clickonRec_ExportPDF() throws InterruptedException {
		Common.click(rec_ExportPDF);
		return PageFactory.initElements(driver, Inventory.class);
	}
    
    public Inventory clickonRec_ExportExcel() throws InterruptedException {
		Common.click(rec_ExportExcel);
		return PageFactory.initElements(driver, Inventory.class);
	}
    
    public Inventory clickonBack() throws InterruptedException {
		Common.click(back);
		return PageFactory.initElements(driver, Inventory.class);
	}
}

