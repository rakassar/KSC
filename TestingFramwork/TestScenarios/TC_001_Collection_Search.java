package TestScenarios;
import org.testng.annotations.Test;


import crm.mhc.common.ListnersClassAnotation;
import crm.mhc.common.Screenshot;
import crm.mhc.common.TestDataFromExcel;
import crm.mhc.pages.methods.CollectDocsLeadPageMethod;
import crm.mhc.pages.methods.CollectionSerachPageMethod;
import crm.mhc.pages.methods.CustomerSerachPageMethod;
import crm.mhc.pages.methods.HomePageMethod;
import crm.mhc.pages.methods.LeadObjectPageMethod;
import org.testng.Assert;
import org.testng.annotations.Listeners;		


//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

   public class TC_001_Collection_Search extends HomePageMethod
   {
	//Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();
    CollectionSerachPageMethod COSPM=new CollectionSerachPageMethod();

	//************************Fill the Info for SD process*****************************-------------//
	//ListnersClassAnotation css=new ListnersClassAnotation(); 
    @Test(priority=1)
	public void CollectionSerachByCitizenID() throws Exception
	{   
	   
    	//launchBrowser();
    	TDFX.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.userCRMNEXT_COL02);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_Search CitizenId-");
        EnterPassword(TestDataFromExcel.Password); 
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_Search By CitizenId-");
        ClickOnwidget();
        ClickOnCollectionSearchWidget();
        Thread.sleep(9999);
        COSPM.CollectionSerachInputCitizenID(TestDataFromExcel.Citizen_ID);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_Search By CitizenId-");
        Thread.sleep(1000);
        ClickonSerach();
        COSPM.ChooseCollectionfromList();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_Search By CitizenId-");
        Thread.sleep(9000);
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_001_Collection_Search By CitizenId-");
		
	}
    
    
    @Test(priority=2)
   	public void CollectionSerachAccountNumber() throws Exception
   	{   
   	   
       	//launchBrowser();
       	    TDFX.DataRead();
       	    Thread.sleep(5000);
    		screen.ScreenshotMethod("TC_001_Collection_Search Account Number-");
           ClickOnwidget();
           ClickOnCollectionSearchWidget();
           Thread.sleep(9999);
           COSPM.CollectionSerachInputAccountNumber(TestDataFromExcel.AccountNumber);
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Account Number-");
           Thread.sleep(1000);
           ClickonSerach();
           COSPM.ChooseCollectionfromList();
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Account Number-");
           Thread.sleep(9000);
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Account Number-");
   		
   	}
       
    @Test(priority=3)
   	public void CollectionSerachCardNumber() throws Exception
   	{   
   	   
       	//launchBrowser();
       	TDFX.DataRead();
       	Thread.sleep(5000);
    	
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Card Number-");
           ClickOnwidget();
           ClickOnCollectionSearchWidget();
           Thread.sleep(9999);
           COSPM.CollectionSerachInputCardnumber(TestDataFromExcel.CardNumber);
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Card Number-");
           Thread.sleep(1000);
           ClickonSerach();
           COSPM.ChooseCollectionfromList();
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Card Number-");
           Thread.sleep(9000);
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Card Number-");
   		
   	}
       
    @Test(priority=4)
   	public void CollectionSerachMobileNumber() throws Exception
   	{   
   	   
       	//launchBrowser();
       	TDFX.DataRead();
       	Thread.sleep(5000);
    		
           screen.ScreenshotMethod("TC_001_Collection_Search Mobile Number-");
           ClickOnwidget();
           ClickOnCollectionSearchWidget();
           Thread.sleep(9999);
           COSPM.CollectionSerachInputMobileNumber(TestDataFromExcel.MobileNumber);
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Mobile Number-");
           Thread.sleep(1000);
           ClickonSerach();
           COSPM.ChooseCollectionfromList();
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Mobile Number-");
           Thread.sleep(9000);
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Mobile Number-");
   		
   	}
       
    @Test(priority=5)
   	public void CollectionSerachFirstName() throws Exception
   	{   
   	   
       	//launchBrowser();
       	TDFX.DataRead();
       	Thread.sleep(5000);
    		
           screen.ScreenshotMethod("TC_001_Collection_Search-");
           ClickOnwidget();
           ClickOnCollectionSearchWidget();
           Thread.sleep(9999);
           COSPM.CollectionSerachInputFirstname(TestDataFromExcel.Firstname);
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Mobile Number-");
           Thread.sleep(1000);
           ClickonSerach();
           COSPM.ChooseCollectionfromList();
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Mobile Number-");
           Thread.sleep(9000);
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Mobile Number-");
   		
   	}
       
    @Test(priority=6)
   	public void CollectionSerachLastName() throws Exception
   	{   
   	   
       	//launchBrowser();
       	TDFX.DataRead();
       	Thread.sleep(5000);
    		
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Last Name-");
           ClickOnwidget();
           ClickOnCollectionSearchWidget();
           Thread.sleep(9999);
           COSPM.CollectionSerachInputLastname(TestDataFromExcel.Lastname);
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Last Name-");
           Thread.sleep(1000);
           ClickonSerach();
           COSPM.ChooseCollectionfromList();
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Last Name-");
           Thread.sleep(9000);
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Last Name-");
   		
   	}
       
    @Test(priority=7)
   	public void CollectionSerachHomePhone() throws Exception
   	{   
   	   
       	//launchBrowser();
       	TDFX.DataRead();
       	Thread.sleep(5000);
    		
           screen.ScreenshotMethod("TC_001_Collection_Search Home Phone-");
           ClickOnwidget();
           ClickOnCollectionSearchWidget();
           Thread.sleep(9999);
           COSPM.CollectionSerachInputHomePhone(TestDataFromExcel.HomePhone);
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Home Phone-");
           Thread.sleep(1000);
           ClickonSerach();
           COSPM.ChooseCollectionfromList();
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Home Phone-");
           Thread.sleep(9000);
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Home Phone-");
   		
   	}
       
    @Test(priority=8)
   	public void CollectionSerachOfficePhone() throws Exception
   	{   
   	   
       	//launchBrowser();
       	
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search Office Phone-");
           ClickOnwidget();
           ClickOnCollectionSearchWidget();
           Thread.sleep(9999);
           COSPM.CollectionSerachInputOfficePhone(TestDataFromExcel.OfficePhone);
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search  Office Phone-");
           Thread.sleep(1000);
           ClickonSerach();
           COSPM.ChooseCollectionfromList();
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search  Office Phone-");
           Thread.sleep(9000);
           Thread.sleep(1000);
           screen.ScreenshotMethod("TC_001_Collection_Search  Office Phone -");
   		
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
