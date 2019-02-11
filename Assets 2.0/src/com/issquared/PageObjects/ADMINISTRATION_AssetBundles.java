package com.issquared.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.issquared.Common.Common;

public class ADMINISTRATION_AssetBundles {
	private WebDriver driver;
	Common commonUtil;
	
	/*Constructor */
	public ADMINISTRATION_AssetBundles(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	
	@FindBy(xpath="//*[@id='side-menu']/li[1]/a/span")
    public WebElement selectAssetsDashboard;
	
	@FindBy(xpath="//div[1]/div/div/div[1]/div[1]/a/div/div")
    public WebElement selectassets;
	
	@FindBy(xpath="//*[@id='side-menu']/li[11]/a")
    public WebElement selectADMINISTRATIONdropdown;
	
	@FindBy(xpath="//*[@id='752']/a")
    public WebElement clickAssetBundle;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
