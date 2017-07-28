package Tests;

import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;


import Pages.LoginPage;
import utils.OrionUtils;

public class Login extends OrionUtils {
	
	public static final Logger LOG = Logger.getLogger(Login.class);
	static LoginPage loginpage = new LoginPage(wd);
		
	@BeforeClass(alwaysRun = true)
	public void LoginPageOpen() throws Throwable {
		OrionUtils.OpenBrowserFF();
		wd.get("https://app.firstrain.com");		
	}
	
	
	@Test(priority = 1)
	public static void LOGIN_FirstRainLOGO_Verification() throws Throwable {
		try {
			//Constructor-- Initiate the creation of an object
			LoginPage loginpage= new LoginPage(wd);
			assertTrue("FirstRain Logo is not present", loginpage.isFirstRainLogoPresent());
			//assertTrue("FirstRain Logo is not present", LoginPageObject.FIRSTRAINLOGO.isDisplayed());
			System.out.println("FirstRain Logo is present");		
			
		} catch (Throwable e) {
			LOG.error(e.getMessage(), e);
			throw e;
		}

	}
	
	
	@Test(priority = 5)
	public static void LOGIN_PrimaryHeading_Verification() throws Throwable {
		try {
			assertTrue("Primary Heading is not present", loginpage.isPrimaryHeadingPresent());
			System.out.println("Primary Heading is present");		
			
		} catch (Throwable e) {
			LOG.error(e.getMessage(), e);
			throw e;
		}

	}
	
	@Test(priority = 10)
	public static void LOGIN_PrimaryTextPresent_Verification() throws Throwable {
		try {
			assertTrue("PrimaryText is not present", loginpage.isPrimaryTextPresent());
			assertTrue("PrimaryText_Tick1 is not present", loginpage.isPrimaryTextTick1Present());
			assertTrue("PrimaryText_Tick2 is not present", loginpage.isPrimaryTextTick2Present());
			assertTrue("PrimaryText_Tick3 is not present", loginpage.isPrimaryTextTick3Present());
			System.out.println("Primary Text present");		
			
		} catch (Throwable e) {
			LOG.error(e.getMessage(), e);
			throw e;
		}
		
		
	}

}
