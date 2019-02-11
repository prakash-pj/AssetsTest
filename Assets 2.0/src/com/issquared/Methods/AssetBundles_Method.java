package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.PageObjects.AssetBundles;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class AssetBundles_Method extends BaseTest{
	WebDriver driver;
	AssetBundles bundles;
	TadminLogin TadminLogin;
	LoginPage login;
	
	public AssetBundles_Method(WebDriver driver) {
		this.driver = driver;
		bundles = new AssetBundles(driver);
	}
	
	public void createAssetBundles() throws Exception {
		try{
			Common.starttest("creating Asset Bundles...");
			Common.assignCategory("creating Asset Bundles...");
			bundles = PageFactory.initElements(driver, AssetBundles.class);
			List<HashMap<String, String>> multipleTestData6 = getTestAssetBundles("Bundle","Sheet1");
			Common.logTrace("multipleTestData  : "+multipleTestData6);
			Common.logTrace("creating Asset Bundles InProgress");
			for (HashMap<String, String> testData6 : multipleTestData6) {
				
				bundles.SelectAssetsDashboard();
				Thread.sleep(500);
				bundles.selectAdministration();
				Thread.sleep(500);
				bundles.clickAssetBundle();
				Thread.sleep(500);
				bundles.clickNew();
				bundles.EnterBundleName(testData6.get("BundleName"));
				bundles.EnterDescription(testData6.get("Description"));
				bundles.Save();
				bundles.PopupOK();
				bundles.CreateNew();
				bundles.ClickonItemName();
				bundles.SelectFirstvalueFromPopup();
				bundles.ClickonitemNamePopupOK();
				bundles.EnterQuantity(testData6.get("Quantity"));
				bundles.ClickonitemNameSave();
				bundles.PopupOK();
				Thread.sleep(500);
				bundles.ClickonitemNameBack();
				bundles.saveandnew();
				bundles.PopupOK();
				
			}
				
			}
		catch(Exception e)
		{
			Common.fail(driver, "Test Failed");
			Common.endtest();
			throw e;
		}
		
	}
}
