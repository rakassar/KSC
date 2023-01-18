package crm.mhc.pages.methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import crm.mhc.pages.objects.CollectionDetailPageObject;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;

public class HomePageMethod extends LoginPageMethod{
	
	
	
	
	//Collection
	
	
	//quick link and sales journey option
	   public void ClickOnCollectionSearchWidget()
		
	  	{
		   HomePageObject.clk_ClickOnCollectionSearchWidget.click();
	  	}
	     //quick link and sales widget
   public void ClickOnwidget()
	
	{
		Actions quick = new Actions(driver);
		quick.moveToElement(HomePageObject.clk_homewidget).perform();
		
	}
   
   public void ClickonSerach()
   {
  		HomePageObject.Clk_searchButton.click();
  		
  	}
   
   public void NextButton()
   {
  		HomePageObject.Clk_nextbutton.click();
  		
  	}
  
   
 //quick link and sales journey option
   public void ClickOnCollectionAssignmenthWidget()
	
  	{
	   HomePageObject.clk_ClickOnCollectionAssignmentWidget.click();
  	}
   
   
   public void Save()

	{
	   HomePageObject.clk_Save.click();
		 
	   }
   
   
   public void scrolldown()

	{
	// scroll down by 500 pixels with Javascript Executor
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	  // js.executeScript("window.scrollBy(0,500)");
	   // identify element
	   System.out.println("scrolling down:");
	   // scroll down up 500 pixels with Javascript Executor
	  // js.executeScript("window.scrollBy(0,500)");
	   
	   
	   //till page end
	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 
	   }
   
   public void scrollup()

	{
	// scroll down by 500 pixels with Javascript Executor
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	  // js.executeScript("window.scrollBy(0,500)");
	   // identify element
	   System.out.println("scrolling down:");
	   // scroll down up 500 pixels with Javascript Executor
	   //js.executeScript("window.scrollBy(0,500)");
	   
	  //till page end
	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 
	   }
   
  

public void scrollBy()

	{
	// scroll down by 500 pixels with Javascript Executor
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	  // js.executeScript("window.scrollBy(0,500)");
	   // identify element
	   System.out.println("scrolling by down:");
	   // scroll down up 500 pixels with Javascript Executor
	   js.executeScript("window.scrollBy(0,500)");
	   
	   
	   //till page end
	   //js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 
	   }

}


  