package crm.mhc.pages.objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CollectionDetailPageObject extends LoginPageObject{
	
public CollectionDetailPageObject (WebDriver driver)

{
	super(driver);
	
}


//Fill the all text box type info//
@FindBy(xpath="//div[@title='click here to see more actions']")
public static WebElement clk_ClickOnArrowButtonCollection;

@FindBy(css=".mb-24.flex.items-center.acd-link")
public static List<WebElement> fin_FindTermCodeList;


@FindBy(name="cust_597")
public static WebElement clk_OtherTermCode;


@FindBy(css="span[title='Activities']")
public static WebElement clk_colactivitytab;

}