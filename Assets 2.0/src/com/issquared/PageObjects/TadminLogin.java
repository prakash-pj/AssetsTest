package com.issquared.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;
import com.issquared.Common.Constants;

public class TadminLogin {
	private WebDriver driver;
	Common commonUtil;


	/*Constructor */
	public TadminLogin(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}


	/* Properties */


	@FindBy(id="username")
	public WebElement UserName;

	@FindBy(id="password")
	public WebElement Password;

	@FindBy(id="domainname")
	public WebElement DomainName;

	@FindBy(xpath="//button[@type='submit']")
    public WebElement Login;

	@FindBy(xpath="//input[@value='3082']")
    public WebElement Imageselect;


	@FindBy(xpath="//button[@id='verify']")
    public WebElement clickVerify;

	@FindBy(xpath="//select[@id='QuesText0']//option[2]")
	public WebElement QuesText;

	@FindBy(xpath="//input[@type='text' and contains(@id,'ans')]")
	public WebElement QuesTextAns;

	@FindBy(xpath="//select[@id='QuesNumeric0']//option[2]")
	public WebElement QuesNumeric;

	@FindBy(xpath="//input[@type='number' and contains(@id,'num')]")
	public WebElement QuesNumericAns;

	@FindBy(xpath="//select[@id='QuesDate0']//option[2]")
	public WebElement QuesDate;

	@FindBy(xpath="//input[@type='text' and contains(@id,'date')]")
	public WebElement QuesDateAns;

	/*@FindBy(xpath="//div[@id='divcontent']//img[@src='\\Images\\gallery\\ISSQ3.PNG']/..//input[@id='chkimg' and @type='radio']")
	public WebElement SelectImage3;

	@FindBy(xpath="//div[@id='divcontent']//img[@src='\\Images\\gallery\\ISSQ1.JPG']/..//input[@id='chkimg' and @type='radio']")
	public WebElement SelectImage1;

	@FindBy(xpath="//div[@id='divcontent']//img[@src='\\Images\\gallery\\ISSQ2.JPG']/..//input[@id='chkimg' and @type='radio']")
	public WebElement SelectImage2;*/

	@FindBy(xpath="//div[@id='divcontent']//img[@alt='Image3']/..//input[@id='chkimg' and @type='radio']")
	public WebElement SelectImage3;

	@FindBy(xpath="//div[@id='divcontent']//img[@alt='Image1']/..//input[@id='chkimg' and @type='radio']")
	public WebElement SelectImage1;

	@FindBy(xpath="//div[@id='divcontent']//img[@alt='Image2']/..//input[@id='chkimg' and @type='radio']")
	public WebElement SelectImage2;

	@FindBy(xpath="//div[@id='divcontent']//img[@alt='NoImage']/..//input[@id='chkimg' and @type='radio']")
	public WebElement MyImageNotHere;

	@FindBy(id="txtOldPassword")
	public WebElement OldPassword;

	@FindBy(id="txtNewPassword")
	public WebElement NewPassword;

	@FindBy(id="txtConfirmPassword")
	public WebElement ConfirmPassword;


	@FindBy(xpath="//button[@class='confirm']")
	public WebElement SaveOk;

	@FindBy(id="save")
	public WebElement save;

/*Methods */
	public TadminLogin openurl(String url)
	{
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return PageFactory.initElements(driver, TadminLogin.class);
	}



	public TadminLogin UserName(String un) throws InterruptedException
	{
		Common.Enterdata(un,UserName);
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin password(String pw) throws InterruptedException
	{
		Common.Enterdata(pw,Password);
		return PageFactory.initElements(driver, TadminLogin.class);
	}
	public TadminLogin  DomainName(String dn) throws InterruptedException
	{
		Common.Enterdata(dn,DomainName);
		return PageFactory.initElements(driver, TadminLogin.class);
	}
	public TadminLogin sigin() throws InterruptedException
	{
		Common.click(Login);
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin selectImage() throws InterruptedException
	{
		Common.click(Imageselect);
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin selectQuesText() throws InterruptedException
	{
		Common.click(QuesText);
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin  EnterQuesText(String name) throws InterruptedException
	{
		Common.Enterdata(name,QuesTextAns);
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin selectQuesNumber() throws InterruptedException
	{
		Common.click(QuesNumeric);
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin  EnterQuesNumber(String name) throws InterruptedException
	{
		Common.Enterdata(name,QuesNumericAns);
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin selectQuesDate() throws InterruptedException
	{
		Common.click(QuesDate);
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin  EnterQuesDate(String name) throws InterruptedException
	{
		Common.Enterdata(name,QuesDateAns);
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin  SelectImageByName(String name) throws InterruptedException
	{

		try
		{
			switch(name)
			{
			    case "Image1": Common.click(SelectImage1);break;
			    case "Image2": Common.click(SelectImage2);break;
			    case "Image3": Common.click(SelectImage3);break;
			    default : Common.click(MyImageNotHere);break;
			}
		}
		catch(Exception e)
		{
			Common.click(MyImageNotHere);
		}
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin  EnterOldPassword(String name) throws InterruptedException
	{
		Common.Enterdata(name,OldPassword);
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin  EnterNewPassword(String name) throws InterruptedException
	{
		Common.Enterdata(name,NewPassword);
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin  EnterConfirmPassword(String name) throws InterruptedException
	{
		Common.Enterdata(name,ConfirmPassword);
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin clickSave() throws InterruptedException
	{
		Common.click(save);
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin clickSaveOk() throws InterruptedException
	{
		Common.click(SaveOk);
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin clickVerifyButton() throws InterruptedException
	{
		Common.scrollcenter(clickVerify);
		Thread.sleep(1000);
		Common.click(clickVerify);
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin login(String UsrName,String pwd,String domain,String image) throws InterruptedException
	{

		openurl(Constants.Url);
		Thread.sleep(1000);
		UserName(UsrName);
		password(pwd);
		DomainName(domain);
		sigin();
		SelectImageByName(image);
		//selectImage();
		clickVerifyButton();
		return PageFactory.initElements(driver, TadminLogin.class);
	}

	public TadminLogin RegisterUser(String usrName,String text,String num,String date,String image,String oldpwd,String newpwd) throws InterruptedException
	{

		openurl(Constants.Url);
		Thread.sleep(1000);
		UserName(usrName);
		password(oldpwd);
		DomainName(Constants.Tadmindomain);
		sigin();
		selectQuesText();
		EnterQuesText(text);
		selectQuesNumber();
		EnterQuesNumber(num);
		selectQuesDate();
		EnterQuesDate(date);
		clickSave();
		SelectImageByName(image);
		clickSave();
		EnterOldPassword(oldpwd);
		EnterNewPassword(newpwd);
		EnterConfirmPassword(newpwd);
		clickSave();
		clickSaveOk();

		return PageFactory.initElements(driver, TadminLogin.class);
	}
}
