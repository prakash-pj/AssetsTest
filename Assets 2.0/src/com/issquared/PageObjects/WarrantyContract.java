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

	public class WarrantyContract {
		private WebDriver driver;
		Common commonUtil;

		
		/*Constructor */
		public WarrantyContract(WebDriver driver) {
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
		
		
		@FindBy(xpath="//a[@id='Assests' and @href='/DefaultLanding/Assets']//div[@class='div-text']")
	    public WebElement selectassets;
		
		
		/*@FindBy(xpath="//*[@id='side-menu']/li[5]/a")
	    public WebElement selectcontractdropdwon;*/  
		
		@FindBy(xpath="//*[text()='Contracts' and @class='nav-label']")
	    public WebElement selectcontractdropdown;
		
//		@FindBy(xpath="//*[@id='723']/a")
//	    public WebElement clickWarrantyContract;
		
		@FindBy(xpath="//a[@id='Organization' and @href='/DefaultLanding/Organizations']")
		public WebElement Organization;
		
		@FindBy(xpath="//a[@href='/WarrantyContract/Manage' and contains(text(),'Warranty')]")
		public WebElement clickWarrantyContract;
		
		@FindBy(xpath="//*[@id='btn_New']")
	    public WebElement selectNew;
		
		@FindBy(xpath="//*[@id='ContractName']")
	    public WebElement Entercontractname;
		
		@FindBy(xpath="//*[@id='ContractNumber']")
	    public WebElement Entercontractnumber;
		
		@FindBy(xpath="//*[@id='WarrantyContractAmount']")
	    public WebElement ContractAmount;
		
		@FindBy(xpath="//select[@id='ContractAmountCurrancy']")
	    public WebElement ContractAmountType;
		@FindBy(xpath="//select[@id='ContractAmountCurrancy']/option[72]")
	    public WebElement ContractAmountTypeValue;
		
		@FindBy(xpath="//select[@id='WarrantyContractType']")
	    public WebElement ContractType;
		@FindBy(xpath="//select[@id='WarrantyContractType']/option[2]")
	    public WebElement ContractTypeValue;
		
		@FindBy(xpath="//select[@id='ContractsType']")
	    public WebElement ContractLevel;
		@FindBy(xpath="//select[@id='ContractsType']/option[2]")
	    public WebElement ContractLevelValue;
		
		@FindBy(xpath="//select[@id='WarrantyContractLevel']")
	    public WebElement PriortyLevel;
		@FindBy(xpath="//select[@id='WarrantyContractLevel']/option[2]")
	    public WebElement PriortyLevelValue;
		
		@FindBy(xpath="//select[@id='WarrantyContractSubLevel']")
	    public WebElement Prioritysublevel;
		@FindBy(xpath="//select[@id='WarrantyContractSubLevel']/option[2]")
	    public WebElement Prioritysublevelvalue;
		
		@FindBy(xpath="//select[@id='WarrantyStatus']")
	    public WebElement MaintenanceStatus;
		@FindBy(xpath="//select[@id='WarrantyStatus']/option[2]")
	    public WebElement MaintenanceStatusValue;
		
		
		@FindBy(xpath="//*[@id='EffectiveDate']")
	    public WebElement EffectiveDate;
		@FindBy(xpath="//*[@id='EndDate']")
	    public WebElement Enddate;
		@FindBy(xpath="//*[@id='RemovalDate']")
	    public WebElement Removaldate;
		
		@FindBy(xpath="//div[@class='note-editable panel-body']")
	    public WebElement Notes;
		
		@FindBy(xpath=".//*[@id='save']/div")
	    public WebElement Save;
	    @FindBy(xpath="//button[@class='confirm']")
	    public WebElement Saveokpopup;
		
	    
	   ///**************Other Information**************************
	    @FindBy(xpath="//*[@id='ResponseTime']")
	    public WebElement ResponseTime;
	    @FindBy(xpath="//select[@id='TimeUnits']")
	    public WebElement ResponseTimeunit;
	    @FindBy(xpath="//select[@id='TimeUnits']/option[2]")
	    public WebElement ResponseTimeunitvalue;
	    
	    @FindBy(xpath="//select[@id='ProvidedBy']")
	    public WebElement Providedby;
	    @FindBy(xpath="//select[@id='ProvidedBy']/option[2]")
	    public WebElement Providedbyvalue;
	    
	    /*@FindBy(xpath=".//*[@id='MaintanceInfo']/div/div/div[2]/div/div[3]/div/span")
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
	    public WebElement Website;*/
	  
	    
	  
	    
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
	    @FindBy(xpath="//select[@id='PremiumDueAmountCurrancyName']")
	    public WebElement PremiumDueCurrency;
	    @FindBy(xpath="//select[@id='PremiumDueAmountCurrancyName']/option[72]")
	    public WebElement PremiumDueCurrencyValue;
	    
	    @FindBy(xpath="//*[@id='WarrantyContractCoPayment']")
	    public WebElement WarrantyContractCoPayment;
	    @FindBy(xpath="//select[@id='CoPaymentCurrancyName']")
	    public WebElement WarrantyContractCoPaymentCurrency;
	    @FindBy(xpath="//select[@id='CoPaymentCurrancyName']/option[72]")
	    public WebElement WarrantyContractCoPaymentCurrencyvalue;
	    
	    @FindBy(xpath="//input[@data-attr='WarrantyContractCoversLoaner']")
	    public WebElement CoversLoaner;
	    @FindBy(xpath="//input[@data-attr='WarrantyContractCoverShippingCharges']")
	    public WebElement Coversshipping;
	    
	    @FindBy(xpath="//*[@id='save']/div")
	    public WebElement OtherSave;
	    @FindBy(xpath="//button[@class='confirm']")
	    public WebElement OtherSaveokpopup;
	    
	    
	    
	    //*****************Extended Warranty****************************
	    @FindBy(xpath=".//*[@id='ExtendedWarrantyDetails']")
	    public WebElement ExtendedWarrantyTab;
	    @FindBy(xpath="//a[@href='/Meta_Organizations/OrganizationGridPopup?Name=WarrantyContracts']")
	    public WebElement ExntedVendorSearch;
	    @FindBy(xpath="//*[@id='jqg_gridOrganization_52443']")
	    public WebElement ExtendedVendorValue;
	    @FindBy(xpath=".//*[@id='Ok-OrganizationNamePopup']/div")
	    public WebElement ExtendedVendorOrganizationOk;
	    @FindBy(xpath="//input[@id='WarrantyCost']")
	    public WebElement WarrantyCost;
	    @FindBy(xpath="//select[@id='WarrantyCostCurrency']")
	    public WebElement WarrantyCostCurrency;
	    @FindBy(xpath="//select[@id='WarrantyCostCurrency']/option[72]")
	    public WebElement WarrantyCostCurrencyValue;
	    @FindBy(xpath="//input[@id='ExtendedWarrantyStartDate']")
	    public WebElement ExtendedWarrantyStartDate;
	    @FindBy(xpath="//input[@id='ExtendedWarrantyEndDate']")
	    public WebElement ExtendedWarrantyEndDate;
	    @FindBy(xpath="//*[@id='save']/div")
	    public WebElement ExtendedWarrantySave; 
	    @FindBy(xpath="//button[@class='confirm']")
	    public WebElement ExtendedWarrantySaveOK; 
	    
	    //**********Maintenance Contract Documents*****************
	    
	    @FindBy(xpath=".//*[@id='Documents']")
	    public WebElement DocumentsTab;
	    @FindBy(xpath="//a[@href='/WarrantyContractDoc/WarntyContsDocsNew']")
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
	    @FindBy(xpath="//*[@id='modal-container']/div/div/div[5]/a[1]/div")
	    public WebElement DocCancel; 
	    
	    
	  //**********Contract Items********************************
	    
	    @FindBy(xpath="//*[@id='CItems']")
	    public WebElement ContractItemsTab;
	    @FindBy(xpath="//a[@href='/WarrantyContract/ContractItems']")
	    public WebElement ContractItemsCreateNew;
	    
	    @FindBy(xpath="//*[@id='jqg_gridItemClassm_148']")
	    public WebElement ContractItemSelection;
	    @FindBy(xpath="//*[@id='AddItemclass']/div")
	    public WebElement ContractAddItemClass;
	    @FindBy(xpath="//a[@id='Cancel-Itemclass']")
	    public WebElement ContractItemCancel;
	    
	    @FindBy(xpath="//button[@class='confirm']")
	    public WebElement ContractAddItemokpopup;
	  
		
	//*****************Other Info Save, Save&New and Back***********
	    @FindBy(xpath="//*[@id='save']/div")
	    public WebElement OtherInformationSave; 
	    @FindBy(xpath="//*[@id='SaveNew']/div")
	    public WebElement OtherInformationSavenew; 
	    @FindBy(xpath="//button[@class='confirm']")
	    public WebElement OtherInformationSavenewOk;
	    @FindBy(xpath="//*[@id='Cancel']/div")
	    public WebElement OtherInformationCancel; 
		
	    @FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
		public WebElement Dashboard; 
	    
		@FindBy(xpath="//select[@role='listbox']")
	    public WebElement TypePageCount;
		
		@FindBy(xpath="//select[@role='listbox']/option[4]")
	    public WebElement TypePageCountValue;
		
		@FindBy(xpath="//select[@role='listbox']/option[4]")
	    public WebElement vendorvalue;
		
		@FindBy(xpath="//*[@id='pagerOrganization_center']/table/tbody/tr/td[8]/select")
	    public WebElement vendorTypePageCount;
		
		@FindBy(xpath="//*[@id='pagerOrganization_center']/table/tbody/tr/td[8]/select/option[4]")
	    public WebElement vendorTypePageCountValue;

	/***************************************************Methods**********************************************************************************/
	    
	/*public WarrantyContract openurl(String url)
	{
		driver.get(url);
		return PageFactory.initElements(driver, WarrantyContract.class);	
	}



	public WarrantyContract UserName(String un) {
		UserName.sendKeys(un);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	public WarrantyContract password(String pw) {
		Password.sendKeys(pw);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract  DomainName(String dn)  {
		DomainName.sendKeys(dn);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract sigin() throws InterruptedException {
		Common.click(Login);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	public WarrantyContract selectImage() throws InterruptedException {
		Common.click(Imageselect);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	public WarrantyContract clickVerifyButton() throws InterruptedException {
		Common.click(clickVerify);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}*/

	public WarrantyContract selectassets() throws InterruptedException {
		Common.click(selectassets);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}


	public WarrantyContract selectcontractdropdwon() throws InterruptedException {
		Common.click(selectcontractdropdown);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}


	public WarrantyContract clickWarrantyContract() throws InterruptedException {
		Common.click(clickWarrantyContract);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract clickNew() throws InterruptedException {
		Common.click(selectNew);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract  Entercontractname(String dn)  {
		Entercontractname.sendKeys(dn);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	public WarrantyContract  Entercontractnumber(String dn)  {
		Entercontractnumber.clear();
		Entercontractnumber.sendKeys(dn);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	 
	 public WarrantyContract  EnterContractAmount(String Camt)  {
		 ContractAmount.clear();
		 ContractAmount.sendKeys(Camt);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	public WarrantyContract ContractAmountType() throws InterruptedException {
		Common.click(ContractAmountType);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract ContractAmountTypeValue() throws InterruptedException {
		Common.click(ContractAmountTypeValue);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectContractType() throws InterruptedException {
		Common.click(ContractType);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectContractTypeValue() throws InterruptedException {
		Common.click(ContractTypeValue);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectContractLevel() throws InterruptedException {
		Common.click(ContractLevel);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectContractLevelValue() throws InterruptedException {
		Common.click(ContractLevelValue);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectPriortyLevel() throws InterruptedException {
		Common.click(PriortyLevel);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectPriortyLevelValue() throws InterruptedException {
		Common.click(PriortyLevelValue);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectPrioritysublevel() throws InterruptedException {
		Common.click(Prioritysublevel);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectPrioritysublevelvalue() throws InterruptedException {
		Common.click(Prioritysublevelvalue);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectMaintenanceStatus() throws InterruptedException {
		Common.click(MaintenanceStatus);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectMaintenanceStatusValue() throws InterruptedException {
		Common.click(MaintenanceStatusValue);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract EnterEffectiveDate(String Effdt) throws InterruptedException {
		EffectiveDate.sendKeys(Effdt);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract EnterEnddate(String Enddt) throws InterruptedException {
		Enddate.sendKeys(Enddt);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract EnterRemovaldate(String Remdte) throws InterruptedException {
		Removaldate.sendKeys(Remdte);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract EnterNotes(String Nts) throws InterruptedException {
		Notes.sendKeys(Nts);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	public WarrantyContract BasicSave() throws InterruptedException {
		Common.click(Save);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract BasicSaveOk() throws InterruptedException {
		Common.click(Saveokpopup);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	//***********Other Information Methods****************
	 public WarrantyContract EnterResponseTime(String Resptime) throws InterruptedException {
		 ResponseTime.clear();
		 ResponseTime.sendKeys(Resptime);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	public WarrantyContract clickResponseTimeunit() throws InterruptedException {
		Common.click(ResponseTimeunit);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract clickResponseTimeunitvalue() throws InterruptedException {
		Common.click(ResponseTimeunitvalue);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	/*public WarrantyContract clickVendorSearch() throws InterruptedException {
		Common.click(VendorSearch);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}*/
	public WarrantyContract ClickTypePageCount() throws InterruptedException {
		Common.click(TypePageCount);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract ClickTypePageCountValue() throws InterruptedException {
		Common.click(TypePageCountValue);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract VendorClickTypePageCount() throws InterruptedException {
		Common.click(vendorTypePageCount);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract VendorClickTypePageCountValue() throws InterruptedException {
		Common.click(vendorTypePageCountValue);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	
	public WarrantyContract SelectVendorSearchValue() throws InterruptedException {
		//Common.click(VendorSearchValue);
		Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridOrganization_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	    Common.click(randomElement);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	/*public WarrantyContract SelectVendorSearchValueOK() throws InterruptedException {
		Common.click(VendorSearchValueOK);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	public WarrantyContract EnterPhone1(String ph1) throws InterruptedException {
		Phone1.sendKeys(ph1);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract EnterPhone2(String ph2) throws InterruptedException {
		Phone2.sendKeys(ph2);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	public WarrantyContract EnterEmailAddress(String EmaAddr) throws InterruptedException {
		EmailAddress.sendKeys(EmaAddr);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract EnterWebsite(String wbste) throws InterruptedException {
		Website.sendKeys(wbste);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

*/
	public WarrantyContract EnterStartDate(String Strdt) throws InterruptedException {
		StartDate.sendKeys(Strdt);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract EnterEndDate(String Enddt) throws InterruptedException {
		EndDate.sendKeys(Enddt);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract EnterRemovalDate(String Rmldt) throws InterruptedException {
		RemovalDate.sendKeys(Rmldt);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract EnterPremiumDueDate(String Premdte) throws InterruptedException {
		PremiumDueDate.sendKeys(Premdte);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract EnterPremiumDueAmount(String Premdamt) throws InterruptedException {
		PremiumDueAmount.clear();
		PremiumDueAmount.sendKeys(Premdamt);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract EnterPremiumDueCurrency() throws InterruptedException {
		Common.click(PremiumDueCurrency);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	public WarrantyContract SelectPremiumDueCurrencyValue() throws InterruptedException {
		Common.click(PremiumDueCurrencyValue);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	public WarrantyContract EnterWarrantyContractCoPayment(String MaintContrcopaymt) throws InterruptedException {
		WarrantyContractCoPayment.clear();
		WarrantyContractCoPayment.sendKeys(MaintContrcopaymt);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract EnterWarrantyContractCoPaymentCurrency() throws InterruptedException {
		Common.click(WarrantyContractCoPaymentCurrency);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectWarrantyContractCoPaymentCurrencyvalue() throws InterruptedException {
		//Common.click(WarrantyContractCoPaymentCurrencyvalue);
		WarrantyContractCoPaymentCurrencyvalue.click();
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract ClickCoversLoaner() throws InterruptedException {
//		Common.click(CoversLoaner);
		CoversLoaner.click();
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract ClickCoversshipping() throws InterruptedException {
//		Common.click(Coversshipping);
		Coversshipping.click();
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract ClickOtherSave() throws InterruptedException {
		Common.click(OtherSave);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract ClickOtherSaveokpopup() throws InterruptedException {
		Common.click(OtherSaveokpopup);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	/////***************************Documents Tab*************************
	public WarrantyContract ClickDocumentsTab() throws InterruptedException {
		Common.click(DocumentsTab);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract clickDocumentsCreateNew() throws InterruptedException {
		//Common.click(DocumentsCreateNew);
		DocumentsCreateNew.click();
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	public WarrantyContract EnterDocTitle(String Doctitle) throws InterruptedException {
		DocTitle.sendKeys(Doctitle);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract EnterDocVersionNo(String Docversn) throws InterruptedException {
		DocVersionNo.sendKeys(Docversn);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract EnterDocDescription(String DocDesc) throws InterruptedException {
		DocDescription.sendKeys(DocDesc);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract Documentupload(String Docupld) throws InterruptedException {
		UploadDoc.sendKeys(Docupld);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract clickDocSaveNew() throws InterruptedException {
		Common.click(DocSaveNew);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract clickDocSave() throws InterruptedException {
		Common.click(DocSave);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract clickDocSaveokpopup() throws InterruptedException {
		Common.click(DocSaveokpopup);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract clickDocCancel() throws InterruptedException {
		Common.click(DocCancel);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	//****************************Contract Items***********************************

	public WarrantyContract clickContractItemsTab() throws InterruptedException {
		Common.click(ContractItemsTab);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract clickContractItemsCreateNew() throws InterruptedException {
		Common.click(ContractItemsCreateNew);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectContractItemSelection() throws InterruptedException {
		//Common.click(ContractItemSelection);
		List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemClassm_')]"));
		 int iSize = oCheckBox.size();
		 System.out.println(iSize);
		 for(int i=0; i < iSize ; i++ )
		 {
			 oCheckBox.get(i).click();
		 } 
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract ClickContractAddItemClass() throws InterruptedException {
		Common.click(ContractAddItemClass);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract clickContractAddItemokpopup() throws InterruptedException {
		Common.click(ContractAddItemokpopup);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract clickContractItemCancel() throws InterruptedException {
		Common.click(ContractItemCancel);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	//************************Other Information Save,Save&New and Back******************
	public WarrantyContract clickOtherInformationSave() throws InterruptedException {
		Common.click(OtherInformationSave);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract clickOtherInformationSavenew() throws InterruptedException {
		Common.click(OtherInformationSavenew);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract clickOtherInformationSavenewOk() throws InterruptedException {
		Common.click(OtherInformationSavenewOk);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract clickOtherInformationCancel() throws InterruptedException {
		Common.click(OtherInformationCancel);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}

	//******************************************End********************************************************************************************************************************

	public WarrantyContract Scrolldown() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	return PageFactory.initElements(driver, WarrantyContract.class);
	}
	//up
	public WarrantyContract ScrollUp() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	return PageFactory.initElements(driver, WarrantyContract.class);
	}

	public WarrantyContract Scrollmiddle() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,250)","");
	return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract ScrollUpMiddle() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(-0,-250)","");
	return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract Scrolldownlast() throws InterruptedException 
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(250)","");
	return PageFactory.initElements(driver, WarrantyContract.class);
	}
	/*public WarrantyContract InViewPortTab() throws Exception
	{
		inViewPortt(SelectProgramIssues);
		SelectProgramIssues.click();
		return PageFactory.initElements(driver, WarrantyContract.class);
	 }
	public static void inViewPortt(WebElement e) throws Exception
	{
		Coordinates ord = ((Locatable)e).getCoordinates();
		ord.inViewPort();

		Thread.sleep(500);
	}
	*/

	public WarrantyContract SelectAssetsDashboard() throws InterruptedException
	{
		Common.click(Dashboard);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	
	
	
	public WarrantyContract SelectProvidedby() throws InterruptedException
	{
		Common.click(Providedby);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectProvidedbyvalue() throws InterruptedException
	{
		Common.click(Providedbyvalue);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectExtendedWarrantyTab() throws InterruptedException
	{
		Common.click(ExtendedWarrantyTab);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectExntedVendorSearch() throws InterruptedException
	{
		Common.click(ExntedVendorSearch);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	/*public WarrantyContract SelectExtendedVendorValue() throws InterruptedException
	{
		//Common.click(ExtendedVendorValue);
		Random r = new java.util.Random();
	    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridOrganization_')]"));

	    WebElement randomElement = links.get(r.nextInt(links.size()));
	    Common.click(randomElement);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}*/
	
	/*public WarrantyContract SelectExtendedVendorValue(String vendorValue) throws InterruptedException
	{
		//Common.click(WarrantyCost);
		vendorvalue.clear();
		vendorvalue.sendKeys(vendorValue);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}*/
	/*public LIFECYCLE_Repair SelectExtendedVendorValue(String data) throws InterruptedException {
		Common.click(driver.findElement(By.xpath("//div[@class='gridcontorg']//td[@aria-describedby='gridOrganization_ObjectValue' and text()='"+data+"']")));
		Common.click(driver.findElement(By.xpath("//div[@id='gridItemClass']//td[@aria-describedby='gridItemClass_ItemClassName' and text()='"+data+"']")));
		return PageFactory.initElements(driver, LIFECYCLE_Repair.class);
	}*/
	
	 public WarrantyContract SelectExtendedVendorValue() throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridOrganization')]"));
		 
		    WebElement Element = links.get(2);
		    Common.click(Element);
			return PageFactory.initElements(driver, WarrantyContract.class);
		}
	
	public WarrantyContract SelectExtendedVendorOrganizationOk() throws InterruptedException
	{
		Common.click(ExtendedVendorOrganizationOk);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectWarrantyCost(String wrcost) throws InterruptedException
	{
		//Common.click(WarrantyCost);
		WarrantyCost.clear();
		WarrantyCost.sendKeys(wrcost);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectWarrantyCostCurrency() throws InterruptedException
	{
		Common.click(WarrantyCostCurrency);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectWarrantyCostCurrencyValue() throws InterruptedException
	{
		Common.click(WarrantyCostCurrencyValue);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectExtendedWarrantyStartDate(String Extwarrsdt) throws InterruptedException
	{
		//Common.click(ExtendedWarrantyStartDate);
		ExtendedWarrantyStartDate.sendKeys(Extwarrsdt);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectExtendedWarrantyEndDate(String Extwarredt) throws InterruptedException
	{
		//Common.click(ExtendedWarrantyStartDate);
		ExtendedWarrantyEndDate.sendKeys(Extwarredt);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectExtendedWarrantySave() throws InterruptedException
	{
		Common.click(ExtendedWarrantySave);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	public WarrantyContract SelectExtendedWarrantySaveOK() throws InterruptedException
	{
		Common.click(ExtendedWarrantySaveOK);
		return PageFactory.initElements(driver, WarrantyContract.class);
	}
	
	

}