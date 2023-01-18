package crm.mhc.pages.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CollectionAssignmentRulePageObject extends LoginPageObject{
	
public CollectionAssignmentRulePageObject (WebDriver driver)

{
	super(driver);
	
}


//Fill the all text box type info//
@FindBy(xpath="(//label[normalize-space()='New'])[1]")
public static WebElement clk_newrule;

@FindBy(css="a[title='Default']")
public static WebElement clk_newruledefault;

@FindBy(name="cust_2658")
public static WebElement sel_active;

@FindBy(name="cust_2836")
public static WebElement ent_rulesequence;

@FindBy(name="cust_1584")
public static WebElement sel_actionchannel;
@FindBy(name="cust_1583")
public static WebElement ent_servicename;
@FindBy(name="cust_1587")
public static WebElement ent_priority;
@FindBy(name="cust_1589")
public static WebElement ent_strategyname;
@FindBy(name="cust_1590")
public static WebElement ent_outputdesc;






}