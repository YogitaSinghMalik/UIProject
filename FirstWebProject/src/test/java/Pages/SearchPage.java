package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import PageObjects.Google_Search_Page;

public class SearchPage {
	

    WebDriver wd;

		// This initElements method will create all WebElements			
		public SearchPage(WebDriver wd) {
			PageFactory.initElements(wd, Google_Search_Page.class);
		}		
		
		public boolean isGoogleLogoPresent() throws Throwable {
			return Google_Search_Page.GOOGLELOGO.isDisplayed();
		}
		
		public boolean isSEARCHBOXPresent() throws Throwable {
			return Google_Search_Page.SEARCHBOX.isDisplayed();
		}
		
		public boolean isSEARCHBUTTONPresent() throws Throwable {
			return Google_Search_Page.SEARCHBUTTON.isDisplayed();
		}
		
		
	public void PerformSearch() throws Throwable {
		try {
		
		Google_Search_Page.SEARCHBOX.sendKeys("Software Testing");
		//Google_Search_Page.SEARCHBUTTON.click();
		Google_Search_Page.SEARCHBOX.sendKeys(Keys.RETURN); 		
	 	Thread.sleep(5000);		
	} catch (Exception e) {
		System.out.println("No Search Performed");
		throw e;
	}
}
	
}






