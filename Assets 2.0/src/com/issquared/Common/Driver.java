package com.issquared.Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.xml.XmlTest;

public class Driver {

	private static WebDriver driver;
	
	public static WebDriver getDriver(XmlTest config) {
		String browser = config.getParameter("browser");
		String url = config.getParameter("url");
		switch(browser)
		{
		
		
		   case "firefox" :
			   System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
				DesiredCapabilities capabilities=DesiredCapabilities.firefox();
				capabilities.setCapability("marionette", true);
				capabilities.setJavascriptEnabled(true);
				driver = new FirefoxDriver(capabilities);
		      break;
		   
		   case "ie" :
			   System.setProperty("webdriver.ie.driver", "E:/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
		      break;
		   default : 
			   System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions(); 
				options.addArguments("disable-infobars"); 
				driver = new ChromeDriver(options);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}

	/*public static WebDriver getDriver(XmlTest config) {
		String browser = config.getParameter("browser");
		String url = config.getParameter("url");
		if (browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("ff"))
			driver = new FirefoxDriver();
		else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E://chromedriver1.exe");
			System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver_PrakashV\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}*/
}

