package utils;

import java.util.concurrent.TimeUnit;

//contains the WebDriver class needed to instantiate a new browser loaded with a specific driver
import org.openqa.selenium.WebDriver;
//contains the FirefoxDriver class needed to instantiate a Firefox-specific driver onto the browser instantiated by the WebDriver class
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//make OrionUtils class public
public class OrionUtils {
	public static WebDriver wd;

	@AfterClass(alwaysRun = true)
	public static void teardown() {
		wd.quit();
	}
	
	@BeforeClass(alwaysRun = true)
	public void LoginPageOpen() throws Throwable {
		OpenBrowserFF();
		wd.get("https://app.firstrain.com"); // launch a new browser session and directs it to the URL that you specify as its parameter.
	}

	// Make an object -- OOPs concept
	public static void OpenBrowserFF() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Eclipse Mars\\MarsWorkspace\\Yogita_Workspace\\FirstWebProject\\DriverExe\\geckodriver.exe"); // set system property for FF driver
		wd = new FirefoxDriver(); //driver object is instantiated.Initialize Firefox Driver: A FirefoxDriver class with no parameters means that the default Firefox profile will be launched by our Java program. The default Firefox profile is similar to launching Firefox in safe mode (no extensions are loaded).
		wd.manage().window().maximize(); // Maximize browser window
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // Set Timeout for 60 secs so that the page may load properly within that time

	}

	public static void OpenBrowserChrome() {
		

	}

}