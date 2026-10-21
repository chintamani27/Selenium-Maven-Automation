package Test.Selenium_automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class LaunchSauceDemo {

	ChromeDriver d ;
	@BeforeMethod
	public void launch() {
		d= new ChromeDriver();
		d.get("https://www.saucedemo.com/");
	}
}
