package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {

	@FindBy(xpath = "//a[@id='jq-fr-logo'][.='FirstRain']")
	public static WebElement FIRSTRAINLOGO;

	@FindBy(xpath = "//h1[@class='signup-primary-heading'][.='Get customized real-time insights that drive better business decisions.']")
	public static WebElement PRIMARYHEADING;

	@FindBy(xpath = "//p[@class='signup-primary-text']")
	public static WebElement PRIMARYTEXT;

	@FindBy(xpath = "//p[@class='signup-primary-text-tick'][.='Transform complex business decisions']")
	public static WebElement PRIMARYTEXT_TICK1;

	@FindBy(xpath = "//p[@class='signup-primary-text-tick'][.='Discover crucial facts in real time']")
	public static WebElement PRIMARYTEXT_TICK2;

	@FindBy(xpath = "//p[@class='signup-primary-text-tick'][.='Get insights that deliver revenue']")
	public static WebElement PRIMARYTEXT_TICK3;

}
