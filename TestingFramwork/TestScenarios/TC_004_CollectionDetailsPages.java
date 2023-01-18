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

   public class TC_004_CollectionDetailsPages extends HomePageMethod
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
	public void CollectionDetailsPage() throws Exception
	{   
	   
    	//launchBrowser();
    	TDFX.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.userCRMNEXT_COL02);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("TC_004_CollectionDetailsPage-");
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_004_CollectionDetailsPage-");
        ClickOnwidget();
        ClickOnCollectionSearchWidget();
        Thread.sleep(1000);
        COSPM.CollectionSerachInputCitizenID(TestDataFromExcel.Citizen_ID);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_004_CollectionDetailsPage-");
        Thread.sleep(1000);
        ClickonSerach();
        COSPM.ChooseCollectionfromList();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_004_CollectionDetailsPage-");
        home.scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_004_CollectionDetailsPage-");
        home.scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_004_CollectionDetailsPage-");
        home.scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_004_CollectionDetailsPage-");
        home.scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_004_CollectionDetailsPage-");
        
	}
    

	
    @Test(priority=1)
	
    public void ClickonActivirtyTab() throws InterruptedException
    
    {
    
    	CDPM.CollcectionclickActivity();
        home.scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_004_CollectionDetailsPage-");
        Thread.sleep(100000);      
       
    	
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
