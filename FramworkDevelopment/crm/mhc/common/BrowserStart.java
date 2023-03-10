package crm.mhc.common;

import crm.mhc.pages.methods.CustomerSerachPageMethod;

import crm.mhc.pages.objects.CollectDocsLeadPageObject;
import crm.mhc.pages.objects.CollectionAssignmentRulePageObject;
import crm.mhc.pages.objects.CollectionDetailPageObject;
import crm.mhc.pages.objects.CollectionserachPageObject;
import crm.mhc.pages.objects.CustomerSearchPageObject;
import crm.mhc.pages.objects.HomePageObject;
import crm.mhc.pages.objects.LeadObjectPageObject;
import crm.mhc.pages.objects.LoginPageObject;
import crm.mhc.repository.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BrowserStart implements Properties{
	public static WebDriver driver=null;
	
	@BeforeClass
	public void launchBrowser()
	{
		
    System.setProperty(ChromeWebDriver, ChromeDriverPath);
	driver =new ChromeDriver();
	//driver.close();
	ChromeOptions option= new ChromeOptions();
	option.addArguments("--start-maximized");
	driver.get(URL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	new LoginPageObject(driver);
	new HomePageObject(driver);
	new LeadObjectPageObject(driver);
	new CustomerSearchPageObject(driver);	
	new CollectDocsLeadPageObject(driver);
	new CollectionserachPageObject(driver);
	new CollectionDetailPageObject(driver);
	new CollectionAssignmentRulePageObject(driver);
	}
	
	
	
	 
	public void LoginPageRedircet()
	
	{
		driver.navigate().to(URL);
	}
	
	@AfterClass
	public void QuiteBrowser()
	
	{
		driver.quit();
	}
	
}


