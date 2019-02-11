package ExtentReportListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ExtentReporterNG implements IReporter {
	private static ExtentReports extent;
	static ExtentTest test;
	static WebDriver driver;

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
			String outputDirectory) {
		/*extent = new ExtentReports(outputDirectory + File.separator
				+ "Extent.html", true);*/
		extent = new ExtentReports("E:/Tomcat Server/tomcat7/webapps/testReports/NewReport/Extent/OrsusTestReport_Assets"+new SimpleDateFormat("HHmmss").format(Calendar.getInstance().getTime()).toString()+".html", true);

		for (ISuite suite : suites) {
			Map<String, ISuiteResult> result = suite.getResults();

			for (ISuiteResult r : result.values()) {
				ITestContext context = r.getTestContext();

				buildTestNodes(context.getPassedTests(), LogStatus.PASS);
				buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
				
			}
		}

		extent.flush();
		extent.close();
	}
	

	private void buildTestNodes(IResultMap tests, LogStatus status) {
		ExtentTest test;

		if (tests.size() > 0) {
			for (ITestResult result : tests.getAllResults()) {
				test = extent.startTest(result.getMethod().getMethodName());

				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));

				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);

				if (result.getThrowable() != null) {
					test.log(status, result.getThrowable());
					test.log(status, "Test " + status.toString().toLowerCase()
							+ "ed");
				} else {
					test.log(status, "Test " + status.toString().toLowerCase()
							+ "ed");
				}

				extent.endTest(test);
			}
		}
		
	}

	private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}
	 public static void startReport(){
		 //ExtentReports(String filePath,Boolean replaceExisting) 
		 //filepath - path of the file, in .htm or .html format - path where your report needs to generate. 
		 //replaceExisting - Setting to overwrite (TRUE) the existing file or append to it
		 //True (default): the file will be replaced with brand new markup, and all existing data will be lost. Use this option to create a brand new report
		 //False: existing data will remain, new tests will be appended to the existing report. If the the supplied path does not exist, a new file will be created.
		 extent = new ExtentReports ("E:/Tomcat Server/tomcat7/webapps/testReports/NewReport/OrsusTestReport_Assets"+new SimpleDateFormat("HHmmss").format(Calendar.getInstance().getTime()).toString()+".html", false);
		 //extent.addSystemInfo("Environment","Environment Name")
		 extent
		                .addSystemInfo("Host Name", "ISSQUARED")
		                .addSystemInfo("Environment", "QA")
		                .addSystemInfo("Application", "ORSUS");
		                //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
		                //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
		                extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		 }
	
	/*public void generateReport() {
		extent = new ExtentReports("E:/Tomcat Server/tomcat7/webapps/testReports/NewReport/OrsusTestReport_Assets"+new SimpleDateFormat("HHmmss").format(Calendar.getInstance().getTime()).toString()+".html", true);
    extent
    .addSystemInfo("Host Name", "ISSQUARED")
    .addSystemInfo("Environment", "QA")
    .addSystemInfo("Application", "ORSUS");
    extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
    extent.config();
    }*/
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
//		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+dateName+".png";
//		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
	    String destination = "./FailedTestsScreenshots/"+dateName+".png";
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

	public ExtentTest startTest2(String testname) {
		return test = extent.startTest(testname);
	}

	
}
