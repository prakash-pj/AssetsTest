package com.issquared.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;
import com.issquared.Common.Common;
import com.issquared.Common.Driver;
import com.issquared.Methods.ActionsDispose_Method;
import com.issquared.Methods.ActionsHold_Method;
import com.issquared.Methods.ActionsOnboard_Method;
import com.issquared.Methods.ActionsRelease_Method;
import com.issquared.Methods.ActionsRepair_Method;
import com.issquared.Methods.ActionsTransfer_Method;
import com.issquared.Methods.AssetBundles_Method;
import com.issquared.Methods.Assetpool_Method;
import com.issquared.Methods.AssignUserToManagerRole_Method;
import com.issquared.Methods.Assign_Method;
import com.issquared.Methods.Attribute_Method;
import com.issquared.Methods.Customers_Method;
import com.issquared.Methods.EmailTemplates_Method;
import com.issquared.Methods.InsuranceContract_Method;
import com.issquared.Methods.Inventory_Method;
import com.issquared.Methods.ItemClass_Method;
import com.issquared.Methods.ItemSubtype_Method;
import com.issquared.Methods.ItemType_Method;
import com.issquared.Methods.Items_Method;
import com.issquared.Methods.LifecycleDispose_Method;
import com.issquared.Methods.LifecycleHold_Method;
import com.issquared.Methods.LifecycleRepair_Method;
import com.issquared.Methods.MaintenanceContract_Method;
import com.issquared.Methods.OnboardRequests_Method;
import com.issquared.Methods.PurchaseOrders_Method;
import com.issquared.Methods.RequestedAssets_Method;
import com.issquared.Methods.TransferRequests_Method;
import com.issquared.Methods.Recertification_Method;
import com.issquared.Methods.Warehouse_Method;
import com.issquared.Methods.WarrantyContract_Method;
import com.issquared.Methods.Workflows_Method;
import com.issquared.Methods.loginMethod;



public class ASSETS_Testcase extends BaseTest {
	
	WebDriver driver;
	
	loginMethod login=new loginMethod(driver);
	AssignUserToManagerRole_Method userToManagerRole = new AssignUserToManagerRole_Method(driver);
	Inventory_Method inventory = new Inventory_Method(driver);
	Customers_Method customers = new Customers_Method(driver);
	
	
	ItemClass_Method itemClass = new ItemClass_Method(driver);
	ItemType_Method itemType=new ItemType_Method(driver);
	ItemSubtype_Method itemSubType=new ItemSubtype_Method(driver);
	Attribute_Method attribute=new Attribute_Method(driver);
	Items_Method items=new Items_Method(driver);
	
	Warehouse_Method warehouse=new Warehouse_Method(driver);
	Assetpool_Method assetPool=new Assetpool_Method(driver);
	
	PurchaseOrders_Method pOrder=new PurchaseOrders_Method(driver);
	
	EmailTemplates_Method emailTemplate = new EmailTemplates_Method(driver);
	
	Workflows_Method workflows=new Workflows_Method(driver);
	Recertification_Method recertification=new Recertification_Method(driver);
	
	MaintenanceContract_Method mContract=new MaintenanceContract_Method(driver);
	InsuranceContract_Method iContract=new InsuranceContract_Method(driver);
	WarrantyContract_Method wContract=new WarrantyContract_Method(driver);
	
	Assign_Method assign=new Assign_Method(driver);
	LifecycleRepair_Method repair=new LifecycleRepair_Method(driver);
	LifecycleHold_Method hold=new LifecycleHold_Method(driver);
	LifecycleDispose_Method dispose=new LifecycleDispose_Method(driver);
	
	ActionsOnboard_Method onboard=new ActionsOnboard_Method(driver);
	ActionsTransfer_Method transfer=new ActionsTransfer_Method(driver);
	ActionsHold_Method actions_Hold=new ActionsHold_Method(driver);
	ActionsRepair_Method actions_Repair=new ActionsRepair_Method(driver);
	ActionsDispose_Method actions_Dispose=new ActionsDispose_Method(driver);
	ActionsRelease_Method actions_Release=new ActionsRelease_Method(driver);
	
	AssetBundles_Method bundle = new AssetBundles_Method(driver);
	
	RequestedAssets_Method requestedAssets =new RequestedAssets_Method(driver);
	OnboardRequests_Method onboardRequests =new OnboardRequests_Method(driver);
	TransferRequests_Method transferRequests=new TransferRequests_Method(driver);
	
	@BeforeClass
	public void login(XmlTest config) throws Exception {
		driver = Driver.getDriver(config);
		login = PageFactory.initElements(driver,loginMethod.class);
		Common.logWarn("**************Automation Started***************");
		login.loginIntoApplication();
	}
	
	@Test (priority=0)
	public void testAssignUserToManagerRole() throws Exception
	{
		userToManagerRole = PageFactory.initElements(driver,AssignUserToManagerRole_Method.class);
		userToManagerRole.createAssignUserToManagerRole();
	}
	
	@Test(priority=1)
	public void testCustomers() throws Exception
	{
		customers = PageFactory.initElements(driver,Customers_Method.class);
		customers.createCustomers();
	}
	
	@Test(priority=2)
	public void testInventory() throws Exception
	{
		inventory = PageFactory.initElements(driver,Inventory_Method.class);
		inventory.createInventory();
	}
	
	@Test(priority=3)
	public void testItemClass()  throws Exception
	{
		itemClass = PageFactory.initElements(driver,ItemClass_Method.class);
		itemClass.createItemClass();
	}
	
	@Test(priority=4)
	public void testItemType() throws Exception
	{
		itemType = PageFactory.initElements(driver,ItemType_Method.class);
		itemType.createItemType();
	}
	
	@Test(priority=5)
	public void testItemSubType()  throws Exception
	{
		
		itemSubType = PageFactory.initElements(driver,ItemSubtype_Method.class);
		itemSubType.createitemSubType();
	}
	
	@Test(priority=6)
	public void testSKUItems() throws Exception
	{
		items = PageFactory.initElements(driver,Items_Method.class);
		items.createSKUItems();
	}
	
	@Test(priority=7)
	public void testItemTypesAttributes()  throws Exception
	{
		attribute = PageFactory.initElements(driver, Attribute_Method.class);
		attribute.createItemTypesAttributes();
	}
	
	@Test(priority=8)
	public void testWarehouse()  throws Exception
	{
		warehouse = PageFactory.initElements(driver,Warehouse_Method.class);
		warehouse.createWareHouses();
	}
	
	@Test(priority=9)
	public void testAssetpool() throws Exception
	{
		
		assetPool = PageFactory.initElements(driver,Assetpool_Method.class);
		assetPool.createAssetPoolTest();
		
	}
	
	@Test(priority=10)
	public void testPurchaseOrder() throws Exception
	{
		
		pOrder = PageFactory.initElements(driver,PurchaseOrders_Method.class);
		pOrder.createPurchaseOrder();
	}
	
	@Test(priority=11)
	public void testACTIONS_onboard() throws Exception
	{
		
		onboard = PageFactory.initElements(driver,ActionsOnboard_Method.class);
		onboard.createACTIONS_onboard();
	}
	
	@Test(priority=12)
	public void testEmailTemplates() throws Exception
	{
		
		emailTemplate = PageFactory.initElements(driver,EmailTemplates_Method.class);
		emailTemplate.createEmailTemplates();
	}
	
	@Test(priority=13)
	public void testWorkflow() throws Exception
	{
		
		workflows = PageFactory.initElements(driver,Workflows_Method.class);
		workflows.createWorkflowRequest_7Level();
	}
	
	@Test(priority=14)
	public void testRecertification() throws Exception
	{
		
		recertification = PageFactory.initElements(driver,Recertification_Method.class);
		recertification.createRecertification();
	}
	
	@Test(priority=15)
	public void testMaintenanceContract() throws Exception
	{
		
		mContract = PageFactory.initElements(driver,MaintenanceContract_Method.class);
		mContract.createMaintenanceContract();
	}
	
	@Test(priority=16)
	public void testInsuranceContract() throws Exception
	{
		iContract = PageFactory.initElements(driver,InsuranceContract_Method.class);
		iContract.createInsuranceContract();
	}
	
	@Test(priority=17)
	public void testWarrantyContract() throws Exception
	{
		
		wContract = PageFactory.initElements(driver,WarrantyContract_Method.class);
		wContract.createWarrantyContract();
	}
	
	@Test(priority=18)
	public void testLIFECYCLE_Assign() throws Exception
	{
		
		assign = PageFactory.initElements(driver,Assign_Method.class);
		assign.createLIFECYCLE_Assign();
	}
	
	@Test(priority=19)
	public void testLIFECYCLE_Repair() throws Exception
	{
		
		repair = PageFactory.initElements(driver,LifecycleRepair_Method.class);
		repair.createLIFECYCLE_Repair();
	}
	
	@Test(priority=20)
	public void testLIFECYCLE_hold() throws Exception
	{
		
		hold = PageFactory.initElements(driver,LifecycleHold_Method.class);
		hold.createLIFECYCLE_hold();
	}
	
	@Test(priority=21)
	public void testLIFECYCLE_dispose() throws Exception
	{
		dispose = PageFactory.initElements(driver,LifecycleDispose_Method.class);
		dispose.createLIFECYCLE_dispose();
	}
	
	@Test(priority=22)
	public void testACTIONS_transfer() throws Exception
	{
		
		transfer = PageFactory.initElements(driver,ActionsTransfer_Method.class);
		transfer.createACTIONS_transfer();
	}
	
	@Test(priority=23)
	public void testACTIONS_hold() throws Exception
	{
		actions_Hold = PageFactory.initElements(driver,ActionsHold_Method.class);
		actions_Hold.createACTIONS_hold();
	}
	
	@Test(priority=24)
	public void testACTIONS_repair() throws Exception
	{
		actions_Repair = PageFactory.initElements(driver,ActionsRepair_Method.class);
		actions_Repair.createACTIONS_repair();
	}
	
	@Test(priority=25)
	public void testACTIONS_dispose() throws Exception
	{
		actions_Dispose = PageFactory.initElements(driver,ActionsDispose_Method.class);
		actions_Dispose.createACTIONS_dispose();
	}
	
	@Test(priority=26)
	public void testACTIONS_release() throws Exception
	{
		actions_Release = PageFactory.initElements(driver,ActionsRelease_Method.class);
		actions_Release.createACTIONS_release();
	}
	@Test(priority=27)
	public void testRequestedAssets() throws Exception
	{
		requestedAssets = PageFactory.initElements(driver,RequestedAssets_Method.class);
		requestedAssets.createRequestedAssets();
	}
	
	@Test(priority=28)
	public void testOnboardRequests() throws Exception
	{
		onboardRequests = PageFactory.initElements(driver,OnboardRequests_Method.class);
		onboardRequests.createOnboardRequests();
	}
	
	@Test(priority=29)
	public void testTransferRequests() throws Exception
	{
		transferRequests = PageFactory.initElements(driver,TransferRequests_Method.class);
		transferRequests.createTransferRequests();
	}
	
	@Test(priority=30)
	public void testAssetBundles() throws Exception
	{
		bundle = PageFactory.initElements(driver,AssetBundles_Method.class);
		bundle.createAssetBundles();
	}
	
	@AfterTest
	public void complete()
	{
		Common.endtest();
		Common.endReport();
		Common.logWarn("**************Automation Ended ***************");
	}
}
