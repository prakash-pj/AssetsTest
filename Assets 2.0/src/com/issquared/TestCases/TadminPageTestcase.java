package com.issquared.TestCases;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.bcel.classfile.Method;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Level;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import com.issquared.Common.Common;
import com.issquared.Common.Constants;
import com.issquared.Common.Driver;
import com.issquared.Common.ExcelDataRead;
import com.issquared.PageObjects.TadminPage;


public class TadminPageTestcase {

	WebDriver driver;
	TadminPage tadminpage;
		 
	ITestResult result;

	@BeforeClass
	public void beforeClass(XmlTest config) throws Exception {

		/**
		 * Step1) Open browser and enter URL.
		 */
		driver = Driver.getDriver(config);
		tadminpage = PageFactory.initElements(driver, TadminPage.class);
		tadminpage.openurl(Constants.Url);
		
		driver.manage().window().maximize();
		tadminpage.UserName(Constants.Tadminun);
		
		tadminpage.password(Constants.Tadminpw);
		
		tadminpage.DomainName(Constants.Tadmindomain);
		
		tadminpage.sigin();
		
		tadminpage.selectImage();
		
		tadminpage.clickVerifyButton();
		
		tadminpage.selectOrganization();
		
		tadminpage.selectOrganizationaValue();
		Thread.sleep(2000);
		tadminpage.clickOrganizationaList();
		Thread.sleep(2000);
		
		
		
	}


	@Test(dataProvider = "Tadmin",dataProviderClass =ExcelDataRead.class) 
	public void loginPageText(String orgname) throws Exception {
	
		
		tadminpage.clickNew();
		Thread.sleep(2000);
		tadminpage.enterOrganizationName(orgname);
		/*tadminpage.selectBrowserValue();
		Thread.sleep(2000);
		tadminpage.clickAllCheckboxes();
		Thread.sleep(2000);
		tadminpage.clickOK();*/
		Thread.sleep(2000);
		tadminpage.clickSave();
		Thread.sleep(1000);
		tadminpage.clickOKButton();
		Thread.sleep(2000);
		tadminpage.clickCancel();
		
		}
			
		

	
	@AfterMethod(alwaysRun=true )
	public void screenshot(ITestResult result) throws IOException  
	 {
			 System.out.println(result.getStatus());
			 if(ITestResult.SUCCESS==result.getStatus())
			 {
				 
				 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		         FileUtils.copyFile(scrFile, new File("E:/EIS-Organizations Module Script/Automation Framework for EIS Project/FailureScreenshot"+ result.getName() + "_"+ new SimpleDateFormat("HHmmss").format(
	                        Calendar.getInstance().getTime()).toString() + ".jpeg"));
		         
			 }

	//driver.quit();
}}
