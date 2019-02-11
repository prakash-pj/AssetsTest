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

public class MaintenanceContract {
	private WebDriver driver;
	Common commonUtil;

	
	/*Constructor */
	public MaintenanceContract(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}

	
	/* Properties */
	

/*	@FindBy(id="username")
	public WebElement UserName;
	
	@FindBy(id="password")
	public WebElement Password;
	
	@FindBy(id="domainname")
	public WebElement DomainName;

	@FindBy(xpath="//button[@type='submit']")
    public WebElement Login;
	
	@FindBy(xpath="//input[@value='445']")
    public WebElement Imageselect;
	
	
	@FindBy(xpath="//a[@id='verify']")
    public WebElement clickVerify;*/
	
	
	/*@FindBy(xpath="//a[@id='Assests' and @href='/DefaultLanding/Assets']//div[@class='div-text']")
    public WebElement selectassets;*/     
	
	@FindBy(xpath="//*[@id='Assests']/div/div")
    public WebElement selectassets;
	
	/*@FindBy(xpath="//*[@id='side-menu']/li[5]/a")
    public WebElement selectcontractdropdwon;*/  
	
	@FindBy(xpath="//*[text()='Contracts' and @class='nav-label']")
    public WebElement selectcontractdropdown;
	
	@FindBy(xpath="//*[@id='721']/a")
    public WebElement clickMaintenanceContract;
	
	@FindBy(xpath="//*[@id='btn_New']")
    public WebElement selectNew;
	
	@FindBy(xpath="//*[@id='ContractName']")
    public WebElement Entercontractname;
	
	@FindBy(xpath="//*[@id='ContractNumber']")
    public WebElement Entercontractnumber;
	
	@FindBy(xpath="//*[@id='MaintenanceContractAmount']")
    public WebElement ContractAmount;
	
	@FindBy(xpath="//select[@id='MaintenanceContractsCurrency']")
    public WebElement ContractAmountType;
	@FindBy(xpath="//select[@id='MaintenanceContractsCurrency']/option[72]")
    public WebElement ContractAmountTypeValue;
	
	@FindBy(xpath="//select[@id='MaintenanceContractType']")
    public WebElement ContractType;
	@FindBy(xpath="//select[@id='MaintenanceContractType']/option[2]")
    public WebElement ContractTypeValue;
	
	@FindBy(xpath="//select[@id='ContractsType']")
    public WebElement ContractLevel;
	@FindBy(xpath="//select[@id='ContractsType']/option[2]")
    public WebElement ContractLevelValue;
	
	@FindBy(xpath="//select[@id='MainteanceContractLevel']")
    public WebElement PriortyLevel;
	@FindBy(xpath="//select[@id='MainteanceContractLevel']/option[2]")
    public WebElement PriortyLevelValue;
	
	@FindBy(xpath="//select[@id='MainteanceContractSubLevel']")
    public WebElement Prioritysublevel;
	@FindBy(xpath="//select[@id='MainteanceContractSubLevel']/option[2]")
    public WebElement Prioritysublevelvalue;
	
	@FindBy(xpath="//select[@id='MaintenanceStatus']")
    public WebElement MaintenanceStatus;
	@FindBy(xpath="//select[@id='MaintenanceStatus']/option[2]")
    public WebElement MaintenanceStatusValue;
	
	
	@FindBy(xpath="//*[@id='EffectiveDate']")
    public WebElement EffectiveDate;
	@FindBy(xpath="//*[@id='EndDate']")
    public WebElement Enddate;
	@FindBy(xpath="//*[@id='RemovalDate']")
    public WebElement Removaldate;
	
	/*@FindBy(xpath="//div[@class='note-editable']")
    public WebElement Notes;*/  
	
	@FindBy(xpath="//div[@class='note-editable panel-body']")
    public WebElement Notes;
	
	@FindBy(xpath=".//*[@id='save']/div")
    public WebElement Save;
    @FindBy(xpath="//button[@class='confirm']")
    public WebElement Saveokpopup;
	
    
   ///**************Other Information**************************
    @FindBy(xpath="//*[@id='ResponseTime']")
    public WebElement ResponseTime;
    @FindBy(xpath="//select[@id='MainteanceResponseTimeUnits']")
    public WebElement ResponseTimeunit;
    @FindBy(xpath="//select[@id='MainteanceResponseTimeUnits']/option[2]")
    public WebElement ResponseTimeunitvalue;
    
    @FindBy(xpath=".//*[@id='MaintanceInfo']/div/div/div[2]/div/div[3]/div/span")
    public WebElement VendorSearch;
    @FindBy(xpath="//*[@id='jqg_gridOrganization_52443']")
    public WebElement VendorSearchValue;
    @FindBy(xpath=".//*[@id='Ok-OrganizationNamePopup']/div")
    public WebElement VendorSearchValueOK;
    
    @FindBy(xpath="//*[@id='Phone1']")
    public WebElement Phone1;
    @FindBy(xpath=".//*[@id='Phone2']")
    public WebElement Phone2;
    
    @FindBy(xpath="//*[@id='EmailAddr']")
    public WebElement EmailAddress;
    @FindBy(xpath="//*[@id='Website']")
    public WebElement Website;
  
    
  
    
    @FindBy(xpath="//*[@id='StartDate']")
    public WebElement StartDate;
    @FindBy(xpath="//*[@id='EndDate']")
    public WebElement EndDate;
    
    @FindBy(xpath="//*[@id='RenewalDate']")
    public WebElement RemovalDate;
    @FindBy(xpath="//*[@id='PremiunDueDate']")
    public WebElement PremiumDueDate;
    
    @FindBy(xpath="//*[@id='PremiumDueAmount']")
    public WebElement PremiumDueAmount;
    
    @FindBy(xpath="//select[@id='MaintenanceContractPremiumNextDueAmountCurrency']")
    public WebElement PremiumDueCurrency;
    
    @FindBy(xpath="//select[@id='MaintenanceContractPremiumNextDueAmountCurrency']/option[126]")
    public WebElement PremiumDueCurrencyValue;
    
    @FindBy(xpath="//*[@id='MaintenanceContractCoPayment']")
    public WebElement MaintenanceContractCoPayment;
    
    @FindBy(xpath="//select[@id='MaintenanceContractCoPaymentCurrency']")
    public WebElement MaintenanceContractCoPaymentCurrency;
    
    @FindBy(xpath="//select[@id='MaintenanceContractCoPaymentCurrency']/option[72]")
    public WebElement MaintenanceContractCoPaymentCurrencyvalue;
    
    @FindBy(xpath="//input[@data-attr='MaintenanceContractCoversLoaner']")
    public WebElement CoversLoaner;
    
    @FindBy(xpath="//input[@data-attr='MaintenanceContractCoverShippingCharges']")
    public WebElement Coversshipping;
    
    @FindBy(xpath="//*[@id='save']/div")
    public WebElement OtherSave;
    @FindBy(xpath="//button[@class='confirm']")
    public WebElement OtherSaveokpopup;
    
    //**********Maintenance Contract Documents*****************
    
    @FindBy(xpath=".//*[@id='Documents']")
    public WebElement DocumentsTab;
    @FindBy(xpath="//a[@href='/MtnceContractDocuments/ContractDocumentpopupNew']")
    public WebElement DocumentsCreateNew;
    
    @FindBy(xpath=".//*[@id='DocumentTitle']")
    public WebElement DocTitle;
    @FindBy(xpath="//*[@id='txtDocVerNo']")
    public WebElement DocVersionNo;
    @FindBy(xpath="//*[@id='DocumentDescription']")
    public WebElement DocDescription;
    @FindBy(xpath="//*[@id='UploadDoc']")
    public WebElement UploadDoc;
    @FindBy(xpath="//*[@id='SaveNew-Documents']/div")
    public WebElement DocSaveNew;
    @FindBy(xpath="//*[@id='btn-Save']/div")
    public WebElement DocSave;
    @FindBy(xpath="//button[@class='confirm']")
    public WebElement DocSaveokpopup;
    @FindBy(xpath=".//*[@id='modal-container']/div/div/div[5]/a[1]/div")
    public WebElement DocCancel; 
    
    
  //**********Contract Items********************************
    
    @FindBy(xpath="//*[@id='CItems']")
    public WebElement ContractItemsTab;
    
    @FindBy(xpath="//a[@href='/MaintenanceContracts/ContractItems']")
    public WebElement ContractItemsCreateNew;
    
    @FindBy(xpath="//*[@id='jqg_gridItemClassm_148']")
    public WebElement ContractItemSelection;
    @FindBy(xpath="//*[@id='AddItemclass']/div")
    public WebElement ContractAddItemClass;
    
    /*@FindBy(xpath="//a[@id='Cancel-Itemclass']")
    public WebElement ContractItemCancel;*/     
    
    @FindBy(xpath="//*[@id='canceljoblisting']/div")
    public WebElement ContractItemCancel;
    
    @FindBy(xpath="//button[@class='confirm']")
    public WebElement ContractAddItemokpopup;
  
	
//*****************Other Info Save, Save&New and Back***********
    @FindBy(xpath="//*[@id='save']/div")
    public WebElement OtherInformationSave; 
    @FindBy(xpath="//a[@id='SaveNew']//div")
    public WebElement OtherInformationSavenew; 
    @FindBy(xpath="//button[@class='confirm']")
    public WebElement OtherInformationSavenewOk;
    @FindBy(xpath="//*[@id='canceljoblisting']/div")
    public WebElement OtherInformationCancel; 
	
    @FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
	public WebElement Dashboard; 
    
	@FindBy(xpath="//select[@role='listbox']")
    public WebElement TypePageCount;
	@FindBy(xpath="//select[@role='listbox']/option[4]")
    public WebElement TypePageCountValue;
	

/***************************************************Methods**********************************************************************************/
    
/*public MaintenanceContract openurl(String url)
{
	driver.get(url);
	return PageFactory.initElements(driver, MaintenanceContract.class);	
}



public MaintenanceContract UserName(String un) {
	UserName.sendKeys(un);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

public MaintenanceContract password(String pw) {
	Password.sendKeys(pw);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract  DomainName(String dn)  {
	DomainName.sendKeys(dn);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract sigin() throws InterruptedException {
	Common.click(Login);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

public MaintenanceContract selectImage() throws InterruptedException {
	Common.click(Imageselect);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

public MaintenanceContract clickVerifyButton() throws InterruptedException {
	Common.click(clickVerify);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}*/

public MaintenanceContract selectassets() throws InterruptedException {
	Common.click(selectassets);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

public MaintenanceContract SelectAssetsDashboard() throws InterruptedException
{
	Common.click(Dashboard);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}


public MaintenanceContract selectcontractdropdown() throws InterruptedException {
	Common.click(selectcontractdropdown);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}


public MaintenanceContract clickMaintenanceContract() throws InterruptedException {
	Common.click(clickMaintenanceContract);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract clickNew() throws InterruptedException {
	Common.click(selectNew);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract  Entercontractname(String dn)  {
	Entercontractname.sendKeys(dn);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

public MaintenanceContract  Entercontractnumber(String dn)  {
	Entercontractnumber.sendKeys(dn);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

 
 public MaintenanceContract  EnterContractAmount(String Camt)  {
	ContractAmount.sendKeys(Camt);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

public MaintenanceContract ContractAmountType() throws InterruptedException {
	Common.click(ContractAmountType);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract ContractAmountTypeValue() throws InterruptedException {
	Common.click(ContractAmountTypeValue);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract SelectContractType() throws InterruptedException {
	Common.click(ContractType);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract SelectContractTypeValue() throws InterruptedException {
	Common.click(ContractTypeValue);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract SelectContractLevel() throws InterruptedException {
	Common.click(ContractLevel);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract SelectContractLevelValue() throws InterruptedException {
	Common.click(ContractLevelValue);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract SelectPriortyLevel() throws InterruptedException {
	Common.click(PriortyLevel);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract SelectPriortyLevelValue() throws InterruptedException {
	Common.click(PriortyLevelValue);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract SelectPrioritysublevel() throws InterruptedException {
	Common.click(Prioritysublevel);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract SelectPrioritysublevelvalue() throws InterruptedException {
	Common.click(Prioritysublevelvalue);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract SelectMaintenanceStatus() throws InterruptedException {
	Common.click(MaintenanceStatus);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract SelectMaintenanceStatusValue() throws InterruptedException {
	Common.click(MaintenanceStatusValue);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract EnterEffectiveDate(String Effdt) throws InterruptedException {
	EffectiveDate.sendKeys(Effdt);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract EnterEnddate(String Enddt) throws InterruptedException {
	Enddate.sendKeys(Enddt);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract EnterRemovaldate(String Remdte) throws InterruptedException {
	Removaldate.sendKeys(Remdte);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract EnterNotes(String Nts) throws InterruptedException {
	Notes.sendKeys(Nts);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

public MaintenanceContract BasicSave() throws InterruptedException {
	Common.click(Save);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract BasicSaveOk() throws InterruptedException {
	Common.click(Saveokpopup);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

//***********Other Information Methods****************
 public MaintenanceContract EnterResponseTime(String Resptime) throws InterruptedException {
	ResponseTime.sendKeys(Resptime);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

public MaintenanceContract clickResponseTimeunit() throws InterruptedException {
	Common.click(ResponseTimeunit);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract clickResponseTimeunitvalue() throws InterruptedException {
	Common.click(ResponseTimeunitvalue);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract clickVendorSearch() throws InterruptedException {
	Common.click(VendorSearch);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract ClickTypePageCount() throws InterruptedException {
	Common.click(TypePageCount);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract ClickTypePageCountValue() throws InterruptedException {
	Common.click(TypePageCountValue);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract SelectVendorSearchValue() throws InterruptedException {
	//Common.click(VendorSearchValue);
	Random r = new java.util.Random();
    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridOrganization_')]"));

    WebElement randomElement = links.get(r.nextInt(links.size()));
    Common.click(randomElement);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

public MaintenanceContract SelectVendorSearchValueOK() throws InterruptedException {
	Common.click(VendorSearchValueOK);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

public MaintenanceContract EnterPhone1(String ph1) throws InterruptedException {
	Phone1.sendKeys(ph1);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract EnterPhone2(String ph2) throws InterruptedException {
	Phone2.sendKeys(ph2);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

public MaintenanceContract EnterEmailAddress(String EmaAddr) throws InterruptedException {
	EmailAddress.sendKeys(EmaAddr);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract EnterWebsite(String wbste) throws InterruptedException {
	Website.sendKeys(wbste);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}


public MaintenanceContract EnterStartDate(String Strdt) throws InterruptedException {
	StartDate.sendKeys(Strdt);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract EnterEndDate(String Enddt) throws InterruptedException {
	EndDate.sendKeys(Enddt);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract EnterRemovalDate(String Rmldt) throws InterruptedException {
	RemovalDate.sendKeys(Rmldt);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract EnterPremiumDueDate(String Premdte) throws InterruptedException {
	PremiumDueDate.sendKeys(Premdte);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract EnterPremiumDueAmount(String Premdamt) throws InterruptedException {
	PremiumDueAmount.sendKeys(Premdamt);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract EnterPremiumDueCurrency() throws InterruptedException {
	Common.click(PremiumDueCurrency);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

public MaintenanceContract SelectPremiumDueCurrencyValue() throws InterruptedException {
	Common.click(PremiumDueCurrencyValue);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

public MaintenanceContract EnterMaintenanceContractCoPayment(String MaintContrcopaymt) throws InterruptedException {
	MaintenanceContractCoPayment.sendKeys(MaintContrcopaymt);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract EnterMaintenanceContractCoPaymentCurrency() throws InterruptedException {
	Common.click(MaintenanceContractCoPaymentCurrency);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract SelectMaintenanceContractCoPaymentCurrencyvalue() throws InterruptedException {
	//Common.click(MaintenanceContractCoPaymentCurrencyvalue);
	MaintenanceContractCoPaymentCurrencyvalue.click();
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract ClickCoversLoaner() throws InterruptedException {
//	Common.click(CoversLoaner);
	CoversLoaner.click();
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract ClickCoversshipping() throws InterruptedException {
//	Common.click(Coversshipping);
	Coversshipping.click();
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract ClickOtherSave() throws InterruptedException {
	Common.click(OtherSave);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract ClickOtherSaveokpopup() throws InterruptedException {
	Common.click(OtherSaveokpopup);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

/////***************************Documents Tab*************************
public MaintenanceContract ClickDocumentsTab() throws InterruptedException {
	Common.click(DocumentsTab);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract clickDocumentsCreateNew() throws InterruptedException {
	//Common.click(DocumentsCreateNew);
	DocumentsCreateNew.click();
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

public MaintenanceContract EnterDocTitle(String Doctitle) throws InterruptedException {
	DocTitle.sendKeys(Doctitle);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract EnterDocVersionNo(String Docversn) throws InterruptedException {
	DocVersionNo.sendKeys(Docversn);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract EnterDocDescription(String DocDesc) throws InterruptedException {
	DocDescription.sendKeys(DocDesc);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract Documentupload(String Docupld) throws InterruptedException {
	UploadDoc.sendKeys(Docupld);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract clickDocSaveNew() throws InterruptedException {
	Common.click(DocSaveNew);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract clickDocSave() throws InterruptedException {
	Common.click(DocSave);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract clickDocSaveokpopup() throws InterruptedException {
	Common.click(DocSaveokpopup);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract clickDocCancel() throws InterruptedException {
	Common.click(DocCancel);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

//****************************Contract Items***********************************

public MaintenanceContract clickContractItemsTab() throws InterruptedException {
	Common.click(ContractItemsTab);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract clickContractItemsCreateNew() throws InterruptedException {
	Common.click(ContractItemsCreateNew);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract SelectContractItemSelection() throws InterruptedException {
	//Common.click(ContractItemSelection);
	List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemClassm_')]"));
	 int iSize = oCheckBox.size();
	 System.out.println(iSize);
	 for(int i=0; i < iSize ; i++ )
	 {
		 oCheckBox.get(i).click();
	 } 
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract ClickContractAddItemClass() throws InterruptedException {
	Common.click(ContractAddItemClass);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract clickContractAddItemokpopup() throws InterruptedException {
	Common.click(ContractAddItemokpopup);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract clickContractItemCancel() throws InterruptedException {
	Common.click(ContractItemCancel);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

//************************Other Information Save,Save&New and Back******************
public MaintenanceContract clickOtherInformationSave() throws InterruptedException {
	Common.click(OtherInformationSave);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract clickOtherInformationSavenew() throws InterruptedException {
	Common.click(OtherInformationSavenew);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract clickOtherInformationSavenewOk() throws InterruptedException {
	Common.click(OtherInformationSavenewOk);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract clickOtherInformationCancel() throws InterruptedException {
	Common.click(OtherInformationCancel);
	return PageFactory.initElements(driver, MaintenanceContract.class);
}

//******************************************End********************************************************************************************************************************

public MaintenanceContract Scrolldown() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
return PageFactory.initElements(driver, MaintenanceContract.class);
}
//up
public MaintenanceContract ScrollUp() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
return PageFactory.initElements(driver, MaintenanceContract.class);
}

public MaintenanceContract Scrollmiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,250)","");
return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract ScrollUpMiddle() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(-0,-250)","");
return PageFactory.initElements(driver, MaintenanceContract.class);
}
public MaintenanceContract Scrolldownlast() throws InterruptedException 
{
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(250)","");
return PageFactory.initElements(driver, MaintenanceContract.class);
}
/*public MaintenanceContract InViewPortTab() throws Exception
{
	inViewPortt(SelectProgramIssues);
	SelectProgramIssues.click();
	return PageFactory.initElements(driver, MaintenanceContract.class);
 }
public static void inViewPortt(WebElement e) throws Exception
{
	Coordinates ord = ((Locatable)e).getCoordinates();
	ord.inViewPort();

	Thread.sleep(500);
}
*/


}