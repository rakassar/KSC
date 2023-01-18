package crm.mhc.pages.methods;

import java.text.DecimalFormat;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CollectDocsLeadPageObject;
import crm.mhc.pages.objects.CollectionserachPageObject;
import crm.mhc.pages.objects.CustomerSearchPageObject;

public class CollectionSerachPageMethod extends HomePageMethod{

	String SDmobilenumber;
	public static String leadid;
	public static String Employeetype;
	
//************************Fill the Info for new lead process*****************************-------------//
	
	
	public void CollectionSerachInputCitizenID(String InputCitizenID)
	{

		CollectionserachPageObject.ent_InputCitizenID.sendKeys(InputCitizenID);
	
		
	}
	public void CollectionSerachInputAccountNumber(String AccountNumber)
	{

		CollectionserachPageObject.ent_AccountNumber.sendKeys(AccountNumber);
	
		
	}
	public void CollectionSerachInputCardnumber(String CardNumber)
	{

		CollectionserachPageObject.ent_CardNumber.sendKeys(CardNumber);
	
		
	}
	public void CollectionSerachInputMobileNumber(String MobileNumber)
	{

		CollectionserachPageObject.ent_MobileNumber.sendKeys(MobileNumber);
	
		
	}
	public void CollectionSerachInputFirstname(String Firstname)
	{

		CollectionserachPageObject.ent_FirstName.sendKeys(Firstname);
	
		
	}
	public void CollectionSerachInputLastname(String lastname)
	{

		CollectionserachPageObject.ent_LastName.sendKeys(lastname);
	
		
	}
	
	public void CollectionSerachInputHomePhone(String HomePhone)
	{

		CollectionserachPageObject.ent_Homephone.sendKeys(HomePhone);
	
		
	}
		
	public void CollectionSerachInputOfficePhone(String OfficePhone)
	{

		CollectionserachPageObject.ent_OfficePhone.sendKeys(OfficePhone);
	
		
	}
				
	
	public void ChooseCollectionfromList()

	{
	 CustomerSearchPageObject.clk_topBBN.click();
	  
	}

	    
}

