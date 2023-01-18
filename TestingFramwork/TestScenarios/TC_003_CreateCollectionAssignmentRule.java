package TestScenarios;
import org.testng.annotations.Test;


import crm.mhc.common.ListnersClassAnotation;
import crm.mhc.common.Screenshot;
import crm.mhc.common.TestDataFromExcel;
import crm.mhc.pages.methods.CollectDocsLeadPageMethod;
import crm.mhc.pages.methods.CollectionAssignmentRulePageMethod;
import crm.mhc.pages.methods.CollectionDetailPageMethod;
import crm.mhc.pages.methods.CollectionSerachPageMethod;
import crm.mhc.pages.methods.CustomerSerachPageMethod;
import crm.mhc.pages.methods.HomePageMethod;
import crm.mhc.pages.methods.LeadObjectPageMethod;
import org.testng.Assert;
import org.testng.annotations.Listeners;		


//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

   public class TC_003_CreateCollectionAssignmentRule extends HomePageMethod
   {
	//Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();
    CollectionSerachPageMethod COSPM=new CollectionSerachPageMethod();
    CollectionDetailPageMethod CDPM=new CollectionDetailPageMethod();
    HomePageMethod home=new HomePageMethod();
	//ListnersClassAnotation css=new ListnersClassAnotation(); 
    CollectionAssignmentRulePageMethod CARM=new CollectionAssignmentRulePageMethod();
    @Test(priority=1)
	public void CollectionPromiseToPayTermCodeUpdate() throws Exception
	{   
	   
    	//launchBrowser();
    	TDFX.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.userCRMNEXT_COL07);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_PromiseToPay-");
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_PromiseToPay-");
        ClickOnwidget();
        ClickOnCollectionAssignmenthWidget();
        CARM.clickOnNew();
        CARM.clickOnNewdefult();
        Thread.sleep(1000);
        CARM.selactiverulestatus(TestDataFromExcel.active);
        CARM.rulesequence(TestDataFromExcel.sequence);
        CARM.servicename();
        CARM.actionchannel(TestDataFromExcel.actionchannel);
        CARM.priority(TestDataFromExcel.priority);
        CARM.strategyname();
        CARM.outputdesc();
        home.Save();
        
        
        Thread.sleep(99999);
        COSPM.CollectionSerachInputCitizenID(TestDataFromExcel.Citizen_ID);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_PromiseToPay-");
        Thread.sleep(1000);
        ClickonSerach();
        COSPM.ChooseCollectionfromList();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_PromiseToPay-");
        CDPM.ClickOnArrowButtonCollection();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_PromiseToPay-");
        CDPM.FindTermCodeList("PP/Promise to Pay");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_PromiseToPay-");
        CDPM.GetWindowsIDs();
        CDPM.MovetoChildWindow();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_PromiseToPay-");
        CDPM.Save();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_PromiseToPay-");
        Thread.sleep(1000);
        //QuiteBrowser();
        
        
	}
    
   
    
  //screen shot using listner class
	/*
	 * @Test public void TestToPass() {
	 * System.out.println("This method to Check Fail Or Pass");
	 * Assert.assertTrue(true);
	 * 
	 * }
	 */

      
}
