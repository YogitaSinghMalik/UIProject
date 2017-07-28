package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.Google_Result_Page;

public class ResultPage {
	
	public ResultPage(WebDriver wd) {
		PageFactory.initElements(wd, Google_Result_Page.class);
	}		
	
	public boolean isGoogleLogoPresent() throws Throwable {
		return Google_Result_Page.GOOGLELOGO.isDisplayed();
	}
	
	public boolean isSEARCHBOXPresent() throws Throwable {
		return Google_Result_Page.SEARCHBOX.isDisplayed();
	}
	
	public boolean isFOOTERPresent() throws Throwable {
		return Google_Result_Page.FOOTER.isDisplayed();
	}
	
	public boolean isAll_TabPresent() throws Throwable {
		return Google_Result_Page.ALL_TAB.isDisplayed();
	}

}
