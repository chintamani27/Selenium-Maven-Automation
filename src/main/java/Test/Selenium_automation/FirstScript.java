package Test.Selenium_automation;

import org.openqa.selenium.edge.EdgeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. Set The properties of webdriver
		System.setProperty("webdriver.edge.driver","C:\\Users\\chint\\OneDrive\\Desktop\\7oct_Chintamani_Automtion_Testing\\Selenium_automation\\DriverResources\\msedgedriver.exe" );
		System.out.println("1.Webdriver configuration done");
		
		// 2. Create the object of edge webdriver /initialie webdirver
		EdgeDriver driver = new EdgeDriver();
		System.out.println("2.Initialize Edge Driver");
		
		driver.get("https://cravitaindia.com/");
		Thread.sleep(1000);
		driver.close();
	}

}
