package webTesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class HomePageTest {
		public static final Logger LOG = Logger.getLogger(HomePageTest.class);
		public static WebDriver wd;
		public static String result;
		
@BeforeClass
	public static void setup() 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Eclipse Mars\\MarsWorkspace\\Yogita_Workspace\\FirstWebProject\\DriverExe\\geckodriver.exe");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		/*
		//code to initialize ff driver
		DesiredCapabilities dc=DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		FirefoxProfile profile = new FirefoxProfile();
		dc.setCapability(FirefoxDriver.PROFILE, profile);
		wd =  new FirefoxDriver(dc);
		//return wd;
	*/
	}

 @Test
 	public static void Testcase1() throws Throwable {
		try {
	 	//wd.get("file:///D:/Personal/MyHomePage.html");
	 	wd.get("http://google.com");
	 	LOG.info("Page Opens");
	 	wd.findElement(By.xpath("//*[@id='hplogo']"));
	 	WebElement SearchBox= wd.findElement(By.xpath("//*[@id='sb_ifc0']"));
	 	SearchBox.sendKeys("Software Testing");
	 	SearchBox.sendKeys(Keys.RETURN); 
	 	Thread.sleep(5000);		
	  	result = wd.findElement(By.xpath("//*[@id='hdtb-msb-vis']/div[1]")).getText();
	 	AssertJUnit.assertEquals(result, "All");
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
	 