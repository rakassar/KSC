package TestScenarios;
import org.testng.annotations.Test;


import crm.mhc.common.ListnersClassAnotation;
import crm.mhc.common.Screenshot;
import crm.mhc.common.TestDataFromExcel;
import crm.mhc.pages.methods.CollectDocsLeadPageMethod;
import crm.mhc.pages.methods.CollectionDetailPageMethod;
import crm.mhc.pages.methods.CollectionSerachPageMethod;
import crm.mhc.pages.methods.CustomerSerachPageMethod;
import crm.mhc.pages.methods.HomePageMethod;
import crm.mhc.pages.methods.LeadObjectPageMethod;
import org.testng.Assert;
import org.testng.annotations.Listeners;		


//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

   public class TC_002_TermCodeOnCollectionDetails extends HomePageMethod
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
    
    @Test(priority=1)
	public void CollectionPromiseToPayTermCodeUpdate() throws Exception
	{   
	   
    	//launchBrowser();
    	TDFX.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.userCRMNEXT_COL02);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_PromiseToPay-");
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_PromiseToPay-");
        ClickOnwidget();
        ClickOnCollectionSearchWidget();
        Thread.sleep(9999);
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
        home.Save();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_PromiseToPay-");
        Thread.sleep(1000);
        //QuiteBrowser();
        
        
	}
    
    

    @Test(priority=2)
	public void CollectionCTContact() throws Exception
	{       
    	Thread.sleep(1000);
    	CDPM.MovetoMainWindow();
        Thread.sleep(1000);
    	//launchBrowser();
        CDPM.ClickOnArrowButtonCollection();
        Thread.sleep(1000);
        //CDPM.FindTermCodeList("PP/Promise to Pay");
        CDPM.FindTermCodeList("CT/Contact but no Promise to Pay");
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_CTContact-");
        CDPM.GetWindowsIDs();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_CTContact-");
        Thread.sleep(1000);
        CDPM.MovetoChildWindow();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_CTContact-");
        home.Save();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_CTContact-");
        Thread.sleep(1000);
        CDPM.MovetoMainWindow();
        Thread.sleep(1000);
	}
    
    @Test(priority=3)
  	public void CollectionNANoAnswer() throws Exception
  	{   
    	
    	  Thread.sleep(1000);
      	  CDPM.MovetoMainWindow();
          Thread.sleep(1000);
      	  //launchBrowser();
          CDPM.ClickOnArrowButtonCollection();
          Thread.sleep(1000);
         // CDPM.FindTermCodeList("PP/Promise to Pay");
          CDPM.FindTermCodeList("NA/No Answer");
          Thread.sleep(1000);
          screen.ScreenshotMethod("TC_001_Collection_CTContact-");
          CDPM.GetWindowsIDs();
          Thread.sleep(1000);
          screen.ScreenshotMethod("TC_001_Collection_CTContact-");
          Thread.sleep(1000);
          CDPM.MovetoChildWindow();
          Thread.sleep(1000);
          screen.ScreenshotMethod("TC_001_Collection_CTContact-");
          home.Save();
          Thread.sleep(1000);
          screen.ScreenshotMethod("TC_001_Collection_CTContact-");
          Thread.sleep(1000);
          CDPM.MovetoMainWindow();
          Thread.sleep(1000);
  	}
    
    @Test(priority=4)
  	public void CollectionBZBuzy() throws Exception
  	{      
    	  Thread.sleep(1000);
      	  CDPM.MovetoMainWindow();
          Thread.sleep(1000);
      	  //launchBrowser();
          CDPM.ClickOnArrowButtonCollection();
          Thread.sleep(1000);
          //CDPM.FindTermCodeList("PP/Promise to Pay");
          CDPM.FindTermCodeList("BZ / Buzy");
          Thread.sleep(1000);
          screen.ScreenshotMethod("TC_001_Collection_CTContact-");
          CDPM.GetWindowsIDs();
          Thread.sleep(1000);
          screen.ScreenshotMethod("TC_001_Collection_CTContact-");
          Thread.sleep(1000);
          CDPM.MovetoChildWindow();
          Thread.sleep(1000);
          screen.ScreenshotMethod("TC_001_Collection_CTContact-");
          home.Save();
          Thread.sleep(1000);
          screen.ScreenshotMethod("TC_001_Collection_CTContact-");
          Thread.sleep(1000);
          CDPM.MovetoMainWindow();
          Thread.sleep(1000);
  	}
    
    @Test(priority=5)
  	public void CollectionNLNOLeaveMessage() throws Exception
  	{       
    	  Thread.sleep(1000);
      	  CDPM.MovetoMainWindow();
          Thread.sleep(1000);
      	  //launchBrowser();
          CDPM.ClickOnArrowButtonCollection();
          Thread.sleep(1000);
          //CDPM.FindTermCodeList("PP/Promise to Pay");
          CDPM.FindTermCodeList("NL/No Leave Message");
          Thread.sleep(1000);
          screen.ScreenshotMethod("TC_001_Collection_CTContact-");
          CDPM.GetWindowsIDs();
          Thread.sleep(1000);
          screen.ScreenshotMethod("TC_001_Collection_CTContact-");
          Thread.sleep(1000);
          CDPM.MovetoChildWindow();
          Thread.sleep(1000);
          screen.ScreenshotMethod("TC_001_Collection_CTContact-");
          home.Save();
          Thread.sleep(1000);
          screen.ScreenshotMethod("TC_001_Collection_CTContact-");
          Thread.sleep(1000);
          CDPM.MovetoMainWindow();
          Thread.sleep(1000);
  	}
    
    
    @Test(priority=6)
   	public void CollectionNTENoteinformation() throws Exception
   	{       
     	   Thread.sleep(1000);
       	   CDPM.MovetoMainWindow();
           Thread.sleep(1000);
       	   //launchBrowser();
           CDPM.ClickOnArrowButtonCollection();
           Thread.sleep(1000);
           //CDPM.FindTermCodeList("PP/Promise to Pay");
           CDPM.FindTermCodeList("NTE / Note information");
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_CTContact-");
           CDPM.GetWindowsIDs();
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_CTContact-");
           Thread.sleep(1000);
           CDPM.MovetoChildWindow();
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_CTContact-");
           home.Save();
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_CTContact-");
           Thread.sleep(1000);
           CDPM.MovetoMainWindow();
           Thread.sleep(1000);
   	}
    
    @Test(priority=7)
   	public void CollectionRVReviewAccount() throws Exception
   	{       
     	   Thread.sleep(1000);
       	   CDPM.MovetoMainWindow();
           Thread.sleep(1000);
       	   //launchBrowser();
           CDPM.ClickOnArrowButtonCollection();
           Thread.sleep(1000);
           //CDPM.FindTermCodeList("PP/Promise to Pay");
           CDPM.FindTermCodeList("RV / Review Account");
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_CTContact-");
           CDPM.GetWindowsIDs();
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_CTContact-");
           Thread.sleep(1000);
           CDPM.MovetoChildWindow();
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_CTContact-");
           home.Save();
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_CTContact-");
           Thread.sleep(1000);
           CDPM.MovetoMainWindow();
           Thread.sleep(1000);
   	}
    
    
    @Test(priority=8)
   	public void CollectionOtherTermCode() throws Exception
   	{       
     	   Thread.sleep(1000);
       	   CDPM.MovetoMainWindow();
           Thread.sleep(1000);
       	   //launchBrowser();
           CDPM.ClickOnArrowButtonCollection();
           Thread.sleep(1000);
           //CDPM.FindTermCodeList("PP/Promise to Pay");
           CDPM.FindTermCodeList("Other Term Code");
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_CTContact-");
           CDPM.GetWindowsIDs();
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_CTContact-");
           Thread.sleep(1000);
           CDPM.MovetoChildWindow();
           CDPM.othertermcode("PD/PAID UP");
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_CTContact-");
           home.NextButton();
           home.Save();
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_CTContact-");
           Thread.sleep(1000);
           CDPM.MovetoMainWindow();
           Thread.sleep(1000);
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
