package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Google_Result_Page {
	
	@FindBy(xpath="//*[@id='logo']/img")
	public static WebElement GOOGLELOGO; 
 
 	@FindBy(xpath="//*[@id='lst-ib']")
	public static WebElement SEARCHBOX;
  
	@FindBy(xpath="//*[@id='navcnt']")
	public static WebElement FOOTER;
	
	@FindBy(xpath="//*[@id='hdtb-msb-vis']/div[1]")
	public static WebElement ALL_TAB;
 
}
