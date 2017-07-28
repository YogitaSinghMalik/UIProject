package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import Pages.ResultPage;
import Pages.SearchPage;

public class Google_Search_Result {
	public static WebDriver wd;
	static SearchPage SP;	
	static ResultPage RP;
	public static final Logger LOG = Logger.getLogger(Google_Search_Result.class);
	
@BeforeClass
public static void setup() 
{
	System.setProperty("webdriver.gecko.driver", "D:\\Eclipse Mars\\MarsWorkspace\\Yogita_Workspace\\FirstWebProject\\DriverExe\\geckodriver.exe");
	wd = new FirefoxDriver();
	wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	wd.get("http://google.com"); 
   }	

	
@Test (priority=1)
public static void SearchPageVerification() throws Throwable {
try {
	//Google_Search_Page.GOOGLELOGO.isDisplayed();
	SP = new SearchPage(wd);
	Assert.assertTrue("Google Logo is not Present at search Page", SP.isGoogleLogoPresent());
	Assert.assertTrue("Search Box is not Present at search Page", SP.isSEARCHBOXPresent());
	Assert.assertTrue("Search Button is not Present at search Page", SP.isSEARCHBUTTONPresent());
 	System.out.println("All OK");	
	SP.PerformSearch();
} catch (Throwable e) {
	LOG.error(e.getMessage(), e);
	throw e;
}

}

@Test (priority=2)
public static void ResultPageVerification() throws Throwable {
try {

    RP = new ResultPage(wd);
	Assert.assertTrue("Google Logo is not Present at Result Page", RP.isGoogleLogoPresent());
	Assert.assertTrue("Search Box is not Present at Result Page", RP.isSEARCHBOXPresent());
	Assert.assertTrue("Footer is not Present at Result Page", RP.isFOOTERPresent());
	Assert.assertTrue("All Tab is not Present at Result Page", RP.isAll_TabPresent());
	
	  //	result = wd.findElement(By.xpath("//*[@id='hdtb-msb-vis']/div[1]")).getText();
	 //AssertJUnit.assertEquals(result, "All");
		 	 	 	
	 	System.out.println("Google search performed successfully");


} catch (Throwable e) {
	LOG.error(e.getMessage(), e);
	throw e;
}

}


@AfterClass
public static void teardown()  
	{
 	wd.quit();
	}

}

