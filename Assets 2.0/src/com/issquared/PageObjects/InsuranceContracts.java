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

		public class InsuranceContracts {
			private WebDriver driver;
			Common commonUtil;

			
			/*Constructor */
			public InsuranceContracts(WebDriver driver) {
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
			
			
			@FindBy(xpath="//*[text()='Contracts' and @class='nav-label']")
		    public WebElement selectcontractdropdwon;
			
			@FindBy(xpath="//*[@id='722']/a")
		    public WebElement clickInsuranceContract;
			
			@FindBy(xpath="//*[@id='btn_New']")
		    public WebElement selectNew;
			
			@FindBy(xpath="//*[@id='ContractName']")
		    public WebElement Entercontractname;
			
			@FindBy(xpath="//*[@id='ContractNumber']")
		    public WebElement Entercontractnumber;
			
			@FindBy(xpath=".//*[@id='ContractAmount']")
		    public WebElement ContractAmount;
			
			@FindBy(xpath="//select[@id='InsuranceContractAmtCurrency']")
		    public WebElement ContractAmountType;
			@FindBy(xpath="//select[@id='InsuranceContractAmtCurrency']/option[126]")
		    public WebElement ContractAmountTypeValue;
			
			@FindBy(xpath="//*[@id='InsuranceMaxCoverage']")
		    public WebElement MaximumCoverage;
			
			@FindBy(xpath="//select[@id='InsuranceMaxCoverageCurrency']")
		    public WebElement Maxcoveragecurrency;
			@FindBy(xpath="//select[@id='InsuranceMaxCoverageCurrency']/option[126]")
		    public WebElement Maxcoveragecurrencyvalue;
			
			@FindBy(xpath="//select[@id='ContractType']")
		    public WebElement InsuranceType;
			@FindBy(xpath="//select[@id='ContractType']/option[2]")
		    public WebElement InsuranceTypevalue;
			/*
			 * 
			
			
			@FindBy(xpath="//select[@id='InsuranceContractType']")
		    public WebElement ContractType;
			@FindBy(xpath="//select[@id='InsuranceContractType']/option[2]")
		    public WebElement ContractTypeValue;     */
			
			@FindBy(xpath="//select[@id='ContractsType']")
		    public WebElement ContractLevel;
			@FindBy(xpath="//select[@id='ContractsType']/option[2]")
		    public WebElement ContractLevelValue;
			
			@FindBy(xpath="//select[@id='InsuranceContractLevel']")
		    public WebElement PriortyLevel;
			@FindBy(xpath="//select[@id='InsuranceContractLevel']/option[2]")
		    public WebElement PriortyLevelValue;
			
			@FindBy(xpath="//select[@id='InsuranceContractSubLevel']")
		    public WebElement Prioritysublevel;
			@FindBy(xpath="//select[@id='InsuranceContractSubLevel']/option[2]")
		    public WebElement Prioritysublevelvalue;
			
			@FindBy(xpath="//select[@id='Insurancestatus']")
		    public WebElement MaintenanceStatus;
			@FindBy(xpath="//select[@id='Insurancestatus']/option[2]")
		    public WebElement MaintenanceStatusValue;
			
			
			@FindBy(xpath="//*[@id='EffectiveDate']")
		    public WebElement EffectiveDate;
			@FindBy(xpath="//*[@id='EndDate']")
		    public WebElement Enddate;
			@FindBy(xpath="//*[@id='RemovalDate']")
		    public WebElement Removaldate;
			
			@FindBy(xpath="//div[@class='note-editable panel-body']")
		    public WebElement Notes;
			
			@FindBy(xpath=".//*[@id='savedetails']/div")
		    public WebElement Save;
		    @FindBy(xpath="//button[@class='confirm']")
		    public WebElement Saveokpopup;
			
		    
		   ///**************Other Information**************************
		    @FindBy(xpath="//*[@id='InsuranceResponseTime']")
		    public WebElement ResponseTime;
		    @FindBy(xpath="//select[@id='InsuranceResponseTimeUnitOfMeasure']")
		    public WebElement ResponseTimeunit;
		    @FindBy(xpath="//select[@id='InsuranceResponseTimeUnitOfMeasure']/option[2]")
		    public WebElement ResponseTimeunitvalue;
		    
		    @FindBy(xpath="//select[@id='InsuranceContractProvidedBy']")
		    public WebElement Providedby;
		    @FindBy(xpath="//select[@id='InsuranceContractProvidedBy']/option[2]")
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
		    
		    @FindBy(xpath="//*[@id='InsuranceContractPremiumNextDueAmount']")
		    public WebElement PremiumDueAmount;
		    @FindBy(xpath="//select[@id='InsurancePremiumDueAmtCurrency']")
		    public WebElement PremiumDueCurrency;
		    @FindBy(xpath="//select[@id='InsurancePremiumDueAmtCurrency']/option[126]")
		    public WebElement PremiumDueCurrencyValue;
		    
		    @FindBy(xpath="//*[@id='InsuranceContractCoPayment']")
		    public WebElement InsuranceContractCoPayment;
		    @FindBy(xpath="//select[@id='InsuranceCoPaymentAmtCurrency']")
		    public WebElement InsuranceContractCoPaymentCurrency;
		    @FindBy(xpath="//select[@id='InsuranceCoPaymentAmtCurrency']/option[126]")
		    public WebElement InsuranceContractCoPaymentCurrencyvalue;
		    
		    @FindBy(xpath="//input[@data-attr='InsuranceContractCoversLoaner']")
		    public WebElement CoversLoaner;
		    @FindBy(xpath="//input[@data-attr='InsuranceContractCoverShippingCharges']")
		    public WebElement Coversshipping;
		    
		    @FindBy(xpath="//a[@id='savedetails']//div")
		    public WebElement OtherSave;
		    @FindBy(xpath="//button[@class='confirm']")
		    public WebElement OtherSaveokpopup;
		    
		    
		    
		    //*****************Extended Insurance****************************
		    @FindBy(xpath=".//*[@id='ExtendedInsuranceDetails']")
		    public WebElement ExtendedInsuranceTab;
		    @FindBy(xpath="//a[@href='/AssetProcurement/OrganizationGridPopup?Name=InsuranceContracts']")
		    public WebElement ExntedVendorSearch;
		    @FindBy(xpath=".//*[@id='jqg_gridOrganization_52443']")
		    public WebElement ExtendedVendorValue;
		    @FindBy(xpath=".//*[@id='Ok-OrganizationNamePopup']/div")
		    public WebElement ExtendedVendorOrganizationOk;
		    @FindBy(xpath="//input[@id='InsuranceCost']")
		    public WebElement InsuranceCost;
		    @FindBy(xpath="//select[@id='InsuranceCostCurrency']")
		    public WebElement InsuranceCostCurrency;
		    @FindBy(xpath="//select[@id='InsuranceCostCurrency']/option[126]")
		    public WebElement InsuranceCostCurrencyValue;
		    @FindBy(xpath="//input[@id='ExtendedInsuranceStartDate']")
		    public WebElement ExtendedInsuranceStartDate;
		    @FindBy(xpath="//input[@id='ExtendedInsuranceEndDate']")
		    public WebElement ExtendedInsuranceEndDate;
		    @FindBy(xpath="//*[@id='save']/div")
		    public WebElement ExtendedInsuranceSave; 
		    @FindBy(xpath="//button[@class='confirm']")
		    public WebElement ExtendedInsuranceSaveOK; 
		    
		    //**********Maintenance Contract Documents*****************
		    
		    @FindBy(xpath=".//*[@id='Documents']")
		    public WebElement DocumentsTab;
		    @FindBy(xpath="//a[@href='/InsuranceContractDocs/InsContractDocsNew']")
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
		    @FindBy(xpath="//a[@id='']//div")
		    public WebElement DocCancel; 
		    
		    
		  //**********Contract Items********************************
		    
		    @FindBy(xpath="//*[@id='CItems']")
		    public WebElement ContractItemsTab;
		    @FindBy(xpath="//a[@href='/InsuranceContract/ContractItems']")
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
		    
		   /* @FindBy(xpath="//a[@id='SaveNewDetails']//div")
		    public WebElement OtherInformationSavenew; */
		    
		    @FindBy(xpath="//*[@id='SaveNewDetails']/div")
		    public WebElement OtherInformationSavenew; 
		    
		    @FindBy(xpath="//button[@class='confirm']")
		    public WebElement OtherInformationSavenewOk;
		    
		    @FindBy(xpath="//a[@id='canceljoblisting']//div")
		    public WebElement OtherInformationCancel; 
			
		    @FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
			public WebElement Dashboard; 
		    
			@FindBy(xpath="//select[@role='listbox']")
		    public WebElement TypePageCount;
			@FindBy(xpath="//select[@role='listbox']/option[4]")
		    public WebElement TypePageCountValue;
			

		/***************************************************Methods**********************************************************************************/
		    
		/*public InsuranceContracts openurl(String url)
		{
			driver.get(url);
			return PageFactory.initElements(driver, InsuranceContracts.class);	
		}



		public InsuranceContracts UserName(String un) {
			UserName.sendKeys(un);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		public InsuranceContracts password(String pw) {
			Password.sendKeys(pw);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts  DomainName(String dn)  {
			DomainName.sendKeys(dn);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts sigin() throws InterruptedException {
			Common.click(Login);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		public InsuranceContracts selectImage() throws InterruptedException {
			Common.click(Imageselect);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		public InsuranceContracts clickVerifyButton() throws InterruptedException {
			Common.click(clickVerify);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}*/

		public InsuranceContracts selectassets() throws InterruptedException {
			Common.click(selectassets);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}


		public InsuranceContracts selectcontractdropdwon() throws InterruptedException {
			Common.click(selectcontractdropdwon);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}


		public InsuranceContracts clickInsuranceContracts() throws InterruptedException {
			Common.click(clickInsuranceContract);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts clickNew() throws InterruptedException {
			Common.click(selectNew);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts  Entercontractname(String dn)  {
			Entercontractname.sendKeys(dn);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		public InsuranceContracts  Entercontractnumber(String dn)  {
			Entercontractnumber.clear();
			Entercontractnumber.sendKeys(dn);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		 
		 public InsuranceContracts  EnterContractAmount(String Camt)  {
			 ContractAmount.clear();
			 ContractAmount.sendKeys(Camt);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		 }

		public InsuranceContracts ContractAmountType() throws InterruptedException {
			Common.click(ContractAmountType);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts ContractAmountTypeValue() throws InterruptedException {
			Common.click(ContractAmountTypeValue);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		
		
		public InsuranceContracts  EnterMaximumCoverage(String MCV)  {
			MaximumCoverage.clear();
			MaximumCoverage.sendKeys(MCV);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		 }

		public InsuranceContracts SelectMaxcoveragecurrency() throws InterruptedException {
			Common.click(Maxcoveragecurrency);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectMaxcoveragecurrencyvalue() throws InterruptedException {
			Common.click(Maxcoveragecurrencyvalue);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		
		public InsuranceContracts SelectInsuranceType() throws InterruptedException {
			Common.click(InsuranceType);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectInsuranceTypevalue() throws InterruptedException {
			Common.click(InsuranceTypevalue);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		
		
		
		/*public InsuranceContracts SelectContractType() throws InterruptedException {
			Common.click(ContractType);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectContractTypeValue() throws InterruptedException {
			Common.click(ContractTypeValue);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}*/
		public InsuranceContracts SelectContractLevel() throws InterruptedException {
			Common.click(ContractLevel);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectContractLevelValue() throws InterruptedException {
			Common.click(ContractLevelValue);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectPriortyLevel() throws InterruptedException {
			Common.click(PriortyLevel);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectPriortyLevelValue() throws InterruptedException {
			Common.click(PriortyLevelValue);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectPrioritysublevel() throws InterruptedException {
			Common.click(Prioritysublevel);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectPrioritysublevelvalue() throws InterruptedException {
			Common.click(Prioritysublevelvalue);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectMaintenanceStatus() throws InterruptedException {
			Common.click(MaintenanceStatus);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectMaintenanceStatusValue() throws InterruptedException {
			Common.click(MaintenanceStatusValue);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts EnterEffectiveDate(String Effdt) throws InterruptedException {
			EffectiveDate.sendKeys(Effdt);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts EnterEnddate(String Enddt) throws InterruptedException {
			Enddate.sendKeys(Enddt);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts EnterRemovaldate(String Remdte) throws InterruptedException {
			Removaldate.sendKeys(Remdte);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts EnterNotes(String Nts) throws InterruptedException {
			Notes.sendKeys(Nts);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		public InsuranceContracts BasicSave() throws InterruptedException {
			Common.click(Save);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts BasicSaveOk() throws InterruptedException {
			Common.click(Saveokpopup);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		//***********Other Information Methods****************
		 public InsuranceContracts EnterResponseTime(String Resptime) throws InterruptedException {
			 ResponseTime.clear();
			 ResponseTime.sendKeys(Resptime);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		public InsuranceContracts clickResponseTimeunit() throws InterruptedException {
			Common.click(ResponseTimeunit);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts clickResponseTimeunitvalue() throws InterruptedException {
			Common.click(ResponseTimeunitvalue);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		/*public InsuranceContracts clickVendorSearch() throws InterruptedException {
			Common.click(VendorSearch);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}*/
		public InsuranceContracts ClickTypePageCount() throws InterruptedException {
			Common.click(TypePageCount);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts ClickTypePageCountValue() throws InterruptedException {
			Common.click(TypePageCountValue);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectVendorSearchValue() throws InterruptedException {
			//Common.click(VendorSearchValue);
			Random r = new java.util.Random();
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridOrganization_')]"));

		    WebElement randomElement = links.get(r.nextInt(links.size()));
		    Common.click(randomElement);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		/*public InsuranceContracts SelectVendorSearchValueOK() throws InterruptedException {
			Common.click(VendorSearchValueOK);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		public InsuranceContracts EnterPhone1(String ph1) throws InterruptedException {
			Phone1.sendKeys(ph1);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts EnterPhone2(String ph2) throws InterruptedException {
			Phone2.sendKeys(ph2);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		public InsuranceContracts EnterEmailAddress(String EmaAddr) throws InterruptedException {
			EmailAddress.sendKeys(EmaAddr);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts EnterWebsite(String wbste) throws InterruptedException {
			Website.sendKeys(wbste);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

	*/
		public InsuranceContracts EnterStartDate(String Strdt) throws InterruptedException {
			StartDate.sendKeys(Strdt);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts EnterEndDate(String Enddt) throws InterruptedException {
			EndDate.sendKeys(Enddt);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts EnterRemovalDate(String Rmldt) throws InterruptedException {
			RemovalDate.sendKeys(Rmldt);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts EnterPremiumDueDate(String Premdte) throws InterruptedException {
			PremiumDueDate.sendKeys(Premdte);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts EnterPremiumDueAmount(String Premdamt) throws InterruptedException {
			PremiumDueAmount.clear();
			PremiumDueAmount.sendKeys(Premdamt);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts EnterPremiumDueCurrency() throws InterruptedException {
			Common.click(PremiumDueCurrency);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		public InsuranceContracts SelectPremiumDueCurrencyValue() throws InterruptedException {
			Common.click(PremiumDueCurrencyValue);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		public InsuranceContracts EnterInsuranceContractCoPayment(String MaintContrcopaymt) throws InterruptedException {
			InsuranceContractCoPayment.clear();
			InsuranceContractCoPayment.sendKeys(MaintContrcopaymt);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts EnterInsuranceContractCoPaymentCurrency() throws InterruptedException {
			Common.click(InsuranceContractCoPaymentCurrency);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectInsuranceContractCoPaymentCurrencyvalue() throws InterruptedException {
			//Common.click(InsuranceContractCoPaymentCurrencyvalue);
			InsuranceContractCoPaymentCurrencyvalue.click();
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts ClickCoversLoaner() throws InterruptedException {
//			Common.click(CoversLoaner);
			CoversLoaner.click();
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts ClickCoversshipping() throws InterruptedException {
//			Common.click(Coversshipping);
			Coversshipping.click();
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts ClickOtherSave() throws InterruptedException {
			Common.click(OtherSave);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts ClickOtherSaveokpopup() throws InterruptedException {
			Common.click(OtherSaveokpopup);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		/////***************************Documents Tab*************************
		public InsuranceContracts ClickDocumentsTab() throws InterruptedException {
			Common.click(DocumentsTab);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts clickDocumentsCreateNew() throws InterruptedException {
			//Common.click(DocumentsCreateNew);
			DocumentsCreateNew.click();
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		public InsuranceContracts EnterDocTitle(String Doctitle) throws InterruptedException {
			DocTitle.sendKeys(Doctitle);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts EnterDocVersionNo(String Docversn) throws InterruptedException {
			DocVersionNo.sendKeys(Docversn);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts EnterDocDescription(String DocDesc) throws InterruptedException {
			DocDescription.sendKeys(DocDesc);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts Documentupload(String Docupld) throws InterruptedException {
			UploadDoc.sendKeys(Docupld);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts clickDocSaveNew() throws InterruptedException {
			Common.click(DocSaveNew);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts clickDocSave() throws InterruptedException {
			Common.click(DocSave);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts clickDocSaveokpopup() throws InterruptedException {
			Common.click(DocSaveokpopup);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts clickDocCancel() throws InterruptedException {
			Common.click(DocCancel);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		//****************************Contract Items***********************************

		public InsuranceContracts clickContractItemsTab() throws InterruptedException {
			Common.click(ContractItemsTab);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts clickContractItemsCreateNew() throws InterruptedException {
			Common.click(ContractItemsCreateNew);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectContractItemSelection() throws InterruptedException {
			//Common.click(ContractItemSelection);
			List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridItemClassm_')]"));
			 int iSize = oCheckBox.size();
			 System.out.println(iSize);
			 for(int i=0; i < iSize ; i++ )
			 {
				 oCheckBox.get(i).click();
			 } 
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts ClickContractAddItemClass() throws InterruptedException {
			Common.click(ContractAddItemClass);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts clickContractAddItemokpopup() throws InterruptedException {
			Common.click(ContractAddItemokpopup);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts clickContractItemCancel() throws InterruptedException {
			Common.click(ContractItemCancel);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		//************************Other Information Save,Save&New and Back******************
		public InsuranceContracts clickOtherInformationSave() throws InterruptedException {
			Common.click(OtherInformationSave);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts clickOtherInformationSavenew() throws InterruptedException {
			Common.click(OtherInformationSavenew);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts clickOtherInformationSavenewOk() throws InterruptedException {
			Common.click(OtherInformationSavenewOk);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts clickOtherInformationCancel() throws InterruptedException {
			Common.click(OtherInformationCancel);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		//******************************************End********************************************************************************************************************************

		public InsuranceContracts Scrolldown() throws InterruptedException 
		{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		//up
		public InsuranceContracts ScrollUp() throws InterruptedException 
		{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		return PageFactory.initElements(driver, InsuranceContracts.class);
		}

		public InsuranceContracts Scrollmiddle() throws InterruptedException 
		{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,250)","");
		return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts ScrollUpMiddle() throws InterruptedException 
		{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(-0,-250)","");
		return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts Scrolldownlast() throws InterruptedException 
		{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(250)","");
		return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		/*public InsuranceContracts InViewPortTab() throws Exception
		{
			inViewPortt(SelectProgramIssues);
			SelectProgramIssues.click();
			return PageFactory.initElements(driver, InsuranceContracts.class);
		 }
		public static void inViewPortt(WebElement e) throws Exception
		{
			Coordinates ord = ((Locatable)e).getCoordinates();
			ord.inViewPort();

			Thread.sleep(500);
		}
		*/

		public InsuranceContracts SelectAssetsDashboard() throws InterruptedException
		{
			Common.click(Dashboard);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		
		
		
		public InsuranceContracts SelectProvidedby() throws InterruptedException
		{
			Common.click(Providedby);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectProvidedbyvalue() throws InterruptedException
		{
			Common.click(Providedbyvalue);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectExtendedInsuranceTab() throws InterruptedException
		{
			Common.click(ExtendedInsuranceTab);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectExntedVendorSearch() throws InterruptedException
		{
			Common.click(ExntedVendorSearch);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectExtendedVendorValue() throws InterruptedException
		{
			//Common.click(ExtendedVendorValue);
			Random r = new java.util.Random();
		    List<WebElement> links = driver.findElements(By.xpath("//*[contains(@id,'jqg_gridOrganization_')]"));

		    WebElement randomElement = links.get(r.nextInt(links.size()));
		    Common.click(randomElement);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectExtendedVendorOrganizationOk() throws InterruptedException
		{
			Common.click(ExtendedVendorOrganizationOk);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectInsuranceCost(String wrcost) throws InterruptedException
		{
			//Common.click(InsuranceCost);
			InsuranceCost.clear();
			InsuranceCost.sendKeys(wrcost);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectInsuranceCostCurrency() throws InterruptedException
		{
			Common.click(InsuranceCostCurrency);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectInsuranceCostCurrencyValue() throws InterruptedException
		{
			Common.click(InsuranceCostCurrencyValue);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectExtendedInsuranceStartDate(String Extwarrsdt) throws InterruptedException
		{
			//Common.click(ExtendedInsuranceStartDate);
			ExtendedInsuranceStartDate.sendKeys(Extwarrsdt);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectExtendedInsuranceEndDate(String Extwarredt) throws InterruptedException
		{
			//Common.click(ExtendedInsuranceStartDate);
			ExtendedInsuranceEndDate.sendKeys(Extwarredt);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectExtendedInsuranceSave() throws InterruptedException
		{
			Common.click(ExtendedInsuranceSave);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		public InsuranceContracts SelectExtendedInsuranceSaveOK() throws InterruptedException
		{
			Common.click(ExtendedInsuranceSaveOK);
			return PageFactory.initElements(driver, InsuranceContracts.class);
		}
		
		

	}	