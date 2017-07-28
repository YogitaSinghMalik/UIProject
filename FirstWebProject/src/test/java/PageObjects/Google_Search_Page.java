package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Google_Search_Page {	
	
	@FindBy(xpath="//*[@id='hplogo']") 
	public static WebElement GOOGLELOGO; 
	
	@FindBy(xpath=".//*[@id='lst-ib']") 
	public static WebElement SEARCHBOX; 
	
	@FindBy(xpath="//*[@id='tsf']//input[@value='Google Search']") 
	public static WebElement SEARCHBUTTON; 
 
}

