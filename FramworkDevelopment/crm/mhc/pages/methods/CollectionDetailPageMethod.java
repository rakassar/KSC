package crm.mhc.pages.methods;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CollectDocsLeadPageObject;
import crm.mhc.pages.objects.CollectionDetailPageObject;
import crm.mhc.pages.objects.CollectionserachPageObject;
import crm.mhc.pages.objects.CustomerSearchPageObject;

public class CollectionDetailPageMethod extends HomePageMethod{

	String SDmobilenumber;
	public static String leadid;
	public static String Employeetype;
	public static String mainWindow;
	public static String ChildWindow;
	
//************************Fill the Info for new lead process*****************************-------------//
	
	
	public void ClickOnArrowButtonCollection()
	{

		CollectionDetailPageObject.clk_ClickOnArrowButtonCollection.click();
	}
	
	
	public void FindTermCodeList(String termcodename)
	{
		
		List<WebElement> termcodlist=(CollectionDetailPageObject.fin_FindTermCodeList);
	      for(int i=0;i<termcodlist.size();i++)
	      {
	          String customActionButtonList =termcodlist.get(i).getText();
	          if(customActionButtonList.equalsIgnoreCase(termcodename))
	          {
	        	  termcodlist.get(i).click();
	        	  //break;
	          }
	      }
	}
	
	
	
	public void GetWindowsIDs()

	{
		mainWindow = driver.getWindowHandle();
		System.out.println("Main Window"+mainWindow);
		Set<String> multiplewindows=driver.getWindowHandles();
		Iterator<String> iterator = multiplewindows.iterator();
	    String mainWindows = iterator.next();
	    ChildWindow = iterator.next();
	    System.out.println("Child Window"+ ChildWindow);
	   }
	
	
	public void MovetoMainWindow()

	{
		 driver.switchTo().window(mainWindow);
		 System.out.println("Move on Mainwindow"+ mainWindow);
	   }
	
	public void MovetoChildWindow()

	{
		 driver.switchTo().window(ChildWindow);
		 System.out.println("Already on Child Window"+ ChildWindow);
	   }
	
	
	public void othertermcode(String othertermcode)
	
	{
	Select sel1 = new Select(CollectionDetailPageObject.clk_OtherTermCode);
	sel1.selectByVisibleText(othertermcode);
	}
	
	
	
public void CollcectionclickActivity()
	
	{
	CollectionDetailPageObject.clk_colactivitytab.click();

	}
	
	
}
