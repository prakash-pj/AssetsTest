package com.issquared.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;

public class AssignUserToManagerRole {
	private WebDriver driver;
	Common commonUtil;

	/*Constructor */
	public AssignUserToManagerRole(WebDriver driver) {
		this.driver = driver;
		commonUtil = new Common(driver);
	}
	
	
	@FindBy(xpath="//a[@title='Global' and @href='/']")
    public WebElement selectGlobal;
	
	@FindBy(xpath="//a[@href='/Dashboard']//span[contains(text(),'Dashboard')]")
	public WebElement dashboard; 
	
	@FindBy(xpath="//*[@title='Modules']")
	public WebElement selectTopMenu;
	
	@FindBy(xpath="//*[@title='Global']")
	public WebElement selectGlobalFromTopMenu;
	
	@FindBy(xpath="//*[@id='side-menu']/li[6]/a")
    public WebElement clickAdministration;
	
	@FindBy(xpath="//*[@id='144']/a")
    public WebElement applicationRiles;
	
	@FindBy(xpath="//*[@id='btn_New']")
    public WebElement createNew;
	
	@FindBy(xpath="//*[@title='Records per Page']")
    public WebElement recordsperPage;
	
	@FindBy(xpath="//*[@title='Records per Page']/option[4]")
    public WebElement recordsperPageValue;
	
	@FindBy(xpath="//*[@id='btn_Edit']")
    public WebElement edit;
	
	@FindBy(xpath="//*[@href='/Roles/_addRoleMembersPopup']")
    public WebElement managerMemberAssignedCreateNew;
	
	@FindBy(xpath="//*[@id='ok']/div")
    public WebElement popupSave;
	
	@FindBy(xpath="//*[@id='canceljoblisting']/div")
    public WebElement back;
	
	@FindBy(xpath="//*[@id='save']/div")
    public WebElement save;
	
	@FindBy(xpath=".//*[@id='cancel']/div")
    public WebElement ItemSubtypeCancel;


	@FindBy(xpath="//*[@id='SaveNew']/div")
    public WebElement saveandnew;
	
	@FindBy(xpath="//button[@class='confirm']")
    public WebElement successMessageOK;
	
	
	public AssignUserToManagerRole SelectGlobal() throws InterruptedException {
		Common.click(selectGlobal);
		return PageFactory.initElements(driver, AssignUserToManagerRole.class);
	}

	
	public AssignUserToManagerRole Dashboard() throws InterruptedException {
		Common.click(dashboard);
		return PageFactory.initElements(driver, AssignUserToManagerRole.class);
	}
	
	public AssignUserToManagerRole selectTopMenu() throws InterruptedException {
		Common.click(selectTopMenu);
		return PageFactory.initElements(driver, AssignUserToManagerRole.class);
	}

    public AssignUserToManagerRole selectGlobalFromTopMenu() throws InterruptedException {
		Common.click(selectGlobalFromTopMenu);
		return PageFactory.initElements(driver, AssignUserToManagerRole.class);
	}
	 
	
	public AssignUserToManagerRole ClickAdministration() throws InterruptedException {
		Common.click(clickAdministration);
		return PageFactory.initElements(driver, AssignUserToManagerRole.class);
	}
	
	public AssignUserToManagerRole ApplicationRoles() throws InterruptedException {
		Common.click(applicationRiles);
		return PageFactory.initElements(driver, AssignUserToManagerRole.class);
	}
	
	public AssignUserToManagerRole RecordsperPage() throws InterruptedException {
		Common.click(recordsperPage);
		return PageFactory.initElements(driver, AssignUserToManagerRole.class);
	}
	
	public AssignUserToManagerRole RecordsperPageValue() throws InterruptedException {
		Common.click(recordsperPageValue);
		return PageFactory.initElements(driver, AssignUserToManagerRole.class);
	}
	
	public AssignUserToManagerRole Edit() throws InterruptedException {
		Common.click(edit);
		return PageFactory.initElements(driver, AssignUserToManagerRole.class);
	}
	
	public AssignUserToManagerRole ManagerMemberAssignedCreateNew() throws InterruptedException {
		Common.click(managerMemberAssignedCreateNew);
		return PageFactory.initElements(driver, AssignUserToManagerRole.class);
	}
	
	 public AssignUserToManagerRole SelecUsersToRole() throws InterruptedException {
			//Common.click(ContractItemSelection);
			List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[contains(@id,'jqg_grid')]"));
			 int iSize = oCheckBox.size();
			 System.out.println(iSize);
			 for(int i=0; i < iSize ; i++ )
			 {
				 oCheckBox.get(i).click();
			 } 
			return PageFactory.initElements(driver, AssignUserToManagerRole.class);
		}
	 
	 public AssignUserToManagerRole SelectAssetManager(String data) throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("(//*[contains(text(),'"+data+"')])[1]"));
		   // List<WebElement> links = driver.findElements(By.xpath("//div[@id='grid']//td[@aria-describedby='grid_AppRoleName' and //*[contains(text(),'"+data+"')]]"));
		    WebElement Element = links.get(0);
		    Common.click(Element);
			return PageFactory.initElements(driver, AssignUserToManagerRole.class);
		}
	 
	 public AssignUserToManagerRole SelectWarehouseManager(String data) throws InterruptedException {
			
		    List<WebElement> links = driver.findElements(By.xpath("(//*[contains(text(),'"+data+"')])[1]"));
		   // List<WebElement> links = driver.findElements(By.xpath("//div[@id='grid']//td[@aria-describedby='grid_AppRoleName' and //*[contains(text(),'"+data+"')]]"));
		    WebElement Element = links.get(0);
		    Common.click(Element);
			return PageFactory.initElements(driver, AssignUserToManagerRole.class);
		}
	
	public AssignUserToManagerRole PopupSave() throws InterruptedException {
		Common.click(popupSave);
		return PageFactory.initElements(driver, AssignUserToManagerRole.class);
	}
	
	public AssignUserToManagerRole Back() throws InterruptedException {
		Common.click(back);
		return PageFactory.initElements(driver, AssignUserToManagerRole.class);
	}
	
	public AssignUserToManagerRole Save() throws InterruptedException {
		Common.click(save);
		return PageFactory.initElements(driver, AssignUserToManagerRole.class);
	}
	
	public AssignUserToManagerRole Saveandnew() throws InterruptedException {
		Common.click(saveandnew);
		return PageFactory.initElements(driver, AssignUserToManagerRole.class);
	}
	
	public AssignUserToManagerRole SuccessMessageOK() throws InterruptedException {
		Common.click(successMessageOK);
		return PageFactory.initElements(driver, AssignUserToManagerRole.class);
	}
	
	

}
