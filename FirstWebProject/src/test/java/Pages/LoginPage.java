package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import PageObjects.LoginPageObject;
import utils.OrionUtils;

public class LoginPage extends OrionUtils {

	// Using Page Factory pattern to initialize web elements which are defined in Page Objects.
	public LoginPage(WebDriver wd) {
		PageFactory.initElements(wd, LoginPageObject.class);
	}

	public boolean isFirstRainLogoPresent() throws Throwable {
		return LoginPageObject.FIRSTRAINLOGO.isDisplayed();
	}
	public boolean isPrimaryHeadingPresent() throws Throwable {
		return LoginPageObject.PRIMARYHEADING.isDisplayed();
	}
	public boolean isPrimaryTextPresent() throws Throwable {
		return LoginPageObject.PRIMARYTEXT.isDisplayed();
	}
	public boolean isPrimaryTextTick1Present() throws Throwable {
		return LoginPageObject.PRIMARYTEXT_TICK1.isDisplayed();
	}
	public boolean isPrimaryTextTick2Present() throws Throwable {
		return LoginPageObject.PRIMARYTEXT_TICK2.isDisplayed();
	}
	public boolean isPrimaryTextTick3Present() throws Throwable {
		return LoginPageObject.PRIMARYTEXT_TICK3.isDisplayed();
	}

}
