package com.issquared.Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.Common.Constants;
import com.issquared.PageObjects.ItemClass;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;

public class loginMethod {
    WebDriver driver;
    ItemClass AC;
	TadminLogin TadminLogin;
	LoginPage login;
	
	public loginMethod(WebDriver driver) {
		this.driver = driver;
		login = new LoginPage(driver);
	}

	public void loginIntoApplication() throws Exception {
		 try
		 {
			Common.intReport();
			Common.starttest("Login into the Application");
	 		Common.assignCategory("Login");
	 		AC = PageFactory.initElements(driver,ItemClass.class);
	 		TadminLogin=PageFactory.initElements(driver, TadminLogin.class);
	 		TadminLogin.login(Constants.Tadminun,Constants.Tadminpw,Constants.Tadmindomain,Constants.Tadminimage);
	 		AC.selectassets();
	 		Common.info("Logged into the Application Successfully");
	 		Common.endtest();
		 }
	 catch(Exception e)
	 {
		 Common.fail(driver,"Login Failed");
		 Common.endtest();
		 throw e;
	 }	
		
	}
}
