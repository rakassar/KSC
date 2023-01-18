package crm.mhc.pages.methods;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CollectDocsLeadPageObject;
import crm.mhc.pages.objects.CollectionAssignmentRulePageObject;
import crm.mhc.pages.objects.CollectionDetailPageObject;
import crm.mhc.pages.objects.CollectionserachPageObject;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;

public class CollectionAssignmentRulePageMethod extends HomePageMethod{

	String SDmobilenumber;
	public static String leadid;
	public static String Employeetype;
	public static String mainWindow;
	public static String ChildWindow;
	
//************************Fill the Info for new lead process*****************************-------------//
	
	
	
	
	public void clickOnNew()

	{
		CollectionAssignmentRulePageObject.clk_newrule.click();
		 
	   }
	
	public void clickOnNewdefult()

	{
		CollectionAssignmentRulePageObject.clk_newruledefault.click();
		//Actions quick = new Actions(driver);
		//quick.moveToElement(CollectionAssignmentRulePageObject.clk_newruledefault).perform();
		 
	 }
	
	
	public void selactiverulestatus(String active)

	{
		Select sel=new Select(CollectionAssignmentRulePageObject.sel_active);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(active);
		 
	 }
	
	
	 public void rulesequence(String sequence)
	    {
		 CollectionAssignmentRulePageObject.ent_rulesequence.sendKeys(sequence);
	   }
	 
	 
	 public void actionchannel(String actionchannel)

		{
			Select sel=new Select(CollectionAssignmentRulePageObject.sel_actionchannel);
	    	//sel.selectByValue(Product);
	    	sel.selectByVisibleText(actionchannel);
			 
		 }
	 

	 public void priority(String priority)
	    {
		 CollectionAssignmentRulePageObject.ent_priority.sendKeys(priority);
	   }
	 
	 
	 
	 
	    public void strategyname()
			{
				   
		    	Random r = new Random();
				 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

				    final int N = 6;
				    StringBuilder sb = new StringBuilder();
				    for (int i = 0; i < N; i++) {
				        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
				    }
				    String firstname = sb.toString();
				
				    
				    CollectionAssignmentRulePageObject.ent_strategyname.sendKeys(firstname);
}
		 
	    
	    public void servicename()
		{
			   
	    	Random r = new Random();
			 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			    final int N = 6;
			    StringBuilder sb = new StringBuilder();
			    for (int i = 0; i < N; i++) {
			        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
			    }
			    String firstname = sb.toString();
			
			    
			    CollectionAssignmentRulePageObject.ent_servicename.sendKeys(firstname);
}
	    
	    
	    public void outputdesc()
			{
				   
		    	Random r = new Random();
				 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

				    final int N = 6;
				    StringBuilder sb = new StringBuilder();
				    for (int i = 0; i < N; i++) {
				        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
				    }
				    String firstname = sb.toString();
			
				    CollectionAssignmentRulePageObject.ent_outputdesc.sendKeys(firstname);
}
		    
	 
}
