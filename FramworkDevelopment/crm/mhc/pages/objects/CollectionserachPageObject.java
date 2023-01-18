package crm.mhc.pages.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CollectionserachPageObject extends LoginPageObject{
	
public CollectionserachPageObject (WebDriver driver)

{
	super(driver);
	
}


//Fill the all text box type info//
@FindBy(css="input[name='100012']")
public static WebElement ent_InputCitizenID;

@FindBy(css="input[name='100008']")
public static WebElement ent_AccountNumber;


@FindBy(css="input[name='100009']")
public static WebElement ent_CardNumber;


@FindBy(css="input[name='100013']")
public static WebElement ent_MobileNumber;


@FindBy(css="input[name='100011']")
public static WebElement ent_LastName;


@FindBy(css="input[name='100010']")
public static WebElement ent_FirstName;


@FindBy(css="input[name='100015']")
public static WebElement ent_OfficePhone;

@FindBy(css="input[name='100014']")
public static WebElement ent_Homephone;



@FindBy(css="span[class='acd-link-text']")
public static WebElement clk_topCollectionId;

}