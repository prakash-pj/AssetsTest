package com.issquared.Common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ExtentReportListener.ExtentReporterNG;
public class Common {
	
static WebDriver driver;
public ITestResult result;
static ExtentReports extent;
static ExtentTest test;
static ExtentReporterNG extent2;

public Common(WebDriver driver) {
	Common.driver = driver;
}

public static Logger logger=Logger.getLogger("ORSUS ASSETS");

public static void logTrace(String data){
	logger.warn(data);
}

public static void logDebug(String data){
	logger.warn(data);
}

public static void logWarn(String data){
	logger.warn(data);
}

public static void logError(String data){
	logger.error(data);
}

public static void logFatal(String data){
	logger.fatal(data);
}

public static void mouseOver(WebElement element){
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
}

public static void wait(WebElement element1){
	
   	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);					
	element1.click();
	System.out.println("clicked on element");
	
}

/*public static void wedDriverwait(WebElement element1){
	
	WebDriverWait wait = new WebDriverWait(driver,30);
    
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("modal-link>b")));
	element1.sendKeys("john");
	
}*/

public static void wedDriverwait(WebElement element1){
	
	WebDriverWait wait = new WebDriverWait(driver,30);
    
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='chkAdvancedSearch']")));
	element1.click();
	
}

public static void Fluwait(WebElement element)
{
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(5000, TimeUnit.MILLISECONDS)
		       .ignoring(NoSuchElementException.class);
	wait.until(ExpectedConditions.visibilityOf(element));
}

public static void Enterdata(String data,WebElement element) throws InterruptedException{
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	logWarn("Enter on element "+element.toString().substring(element.toString().indexOf("]") + 2, element.toString().length()-1));
	JavascriptExecutor jse = ((JavascriptExecutor) driver);
	jse.executeScript("arguments[0].scrollIntoView({behavior: 'instant', block: 'center', inline: 'center'});", element);
	Fluwait(element);
	Thread.sleep(200);
	element.clear();
	Thread.sleep(200);
	element.sendKeys(data);
	Thread.sleep(250);
	System.out.println("clicked on element");
}

public static void click(WebElement element) throws InterruptedException{
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	logWarn("Click on element "+element.toString().substring(element.toString().indexOf("]") + 2, element.toString().length()-1));
	JavascriptExecutor jse = ((JavascriptExecutor) driver);
	jse.executeScript("arguments[0].scrollIntoView({behavior: 'instant', block: 'center', inline: 'center'});", element);
	Fluwait(element);
	element.click();
	Thread.sleep(250);
	System.out.println("clicked on element");
}


/*public static String getContent(WebElement element){
	
	System.out.println("Getting text from specified element");
	return element.getText();
		
}
*/

public static void verifyEqualText(String actual, String expected){
	System.out.println("Actual text : "+actual);
	System.out.println("Expected text : "+expected);
	Assert.assertEquals(actual, expected);
}


public static void verifyContainsText(String actual, String expected){
	System.out.println("Actual text : "+actual);
	System.out.println("Expected text : "+expected);
	Assert.assertTrue(actual.contains(expected),"Actual text is not contained the expected text");
}

public static void captureScreenshot(String testcaseName) throws IOException
{

				 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		         FileUtils.copyFile(scrFile, new File("E:/Automation/Assets 2.0/FailedTestsScreenshots"+testcaseName+  "_"+ new SimpleDateFormat("HHmmss").format(
	                        Calendar.getInstance().getTime()).toString() + ".jpeg"));
		  
}
public static void scrollcenter(WebElement element) throws InterruptedException
{
	JavascriptExecutor jse = ((JavascriptExecutor) driver);
	jse.executeScript("arguments[0].scrollIntoView({behavior: 'instant', block: 'center', inline: 'center'});", element);
	Thread.sleep(1000);
}
public static void scrollUp() throws InterruptedException
{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//jse.executeScript("window.scrollBy(0,-250)", "");
	jse.executeScript("scroll(0, -250);");
	Thread.sleep(1000);
}

public static String getUniqueID(int i)
{
	 return RandomStringUtils.random(i, true, true);
}

public static String getUniqueID()
{
	 return RandomStringUtils.random(5, true, true);
} 

public static void intReport()
{
	extent = new ExtentReports(System.getProperty("user.dir")+"/ExtentReport/OrsusTestReportIntegrated"+new SimpleDateFormat("HHmmss").format(Calendar.getInstance().getTime()).toString()+".html", false);
    extent
	/*extent = new ExtentReports("E:/Tomcat Server/tomcat7/webapps/testReports/OrsusTestReport_Assets"+new SimpleDateFormat("HHmmss").format(Calendar.getInstance().getTime()).toString()+".html", false);
	extent*/
    .addSystemInfo("Host Name", "ISSQUARED")
    .addSystemInfo("Environment", "QA")
    .addSystemInfo("Application", "ORSUS");
    extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
    extent.config();
}

public static void starttest(String testname)
{
	test = extent.startTest(testname);
}
public static void endtest()
{
	extent.endTest(test);
}
public static void endReport()
{
	extent.flush();
	extent.close();
}
public static void pass(String passnote)
{
	test.log(LogStatus.PASS,passnote);
}
public static void info(String passnote)
{
	test.log(LogStatus.INFO,passnote);
}
public static void failSc(WebDriver driver,String failnote) throws Exception
{
	String screenshotPath = getScreenshot(driver,failnote);
	test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
}
public static void failOnly(String failnote) throws Exception
{
	test.log(LogStatus.FAIL,failnote);
}
public static void fail(WebDriver driver,String failnote) throws Exception
{
	test.log(LogStatus.FAIL,failnote);
	String screenshotPath = getScreenshot(driver,failnote);
	test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
}
public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
	
    String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
    TakesScreenshot ts = (TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
//	String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+dateName+".png";
//	String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
   // String destination = "./FailedTestsScreenshots/"+dateName+".png";
    String destination = "E:\\Tomcat Server\\tomcat7\\webapps\\testReports\\FailedTestsScreenshots\\FailedTestsScreenshots"+ screenshotName +"_"+ new SimpleDateFormat("HHmmss").format(
            Calendar.getInstance().getTime()).toString() + ".jpeg";
	File finalDestination = new File(destination);
	FileUtils.copyFile(source, finalDestination);
	return destination;
}
public static void captureScreenShot(String fileName){
	
	  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	 FileUtils.copyFile(src, new File("E:\\Tomcat Server\\tomcat7\\webapps\\testReports\\FailedTestsScreenshots"+ fileName +"_"+ new SimpleDateFormat("HHmmss").format(
             Calendar.getInstance().getTime()).toString() + ".jpeg"));
	       }
	 
	catch (IOException e)
	 
	{
	 
	System.out.println(e.getMessage());
	 
	    }
	}
public static void assignCategory(String cat)
{
	test = test.assignCategory(cat);
}

public static void draganddrop(WebElement drag, WebElement drop){
	 Actions builder = new Actions(driver);

	 Action dragAndDrop = builder.clickAndHold(drag)
		.moveToElement(drop)
	    .release(drop)
	    .build();

	 dragAndDrop.perform();
	 
}


}