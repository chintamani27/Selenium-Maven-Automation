package Test.Selenium_automation;

import org.openqa.selenium.edge.EdgeDriver;

public class BasicDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		//initalize driver
		EdgeDriver driver= new EdgeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//initialize website
		driver.get("https://cravitaindia.com/");
		Thread.sleep(1000);
		
		//navigate to other website
		driver.navigate().to("https://www.fortunecloudindia.com/");
		Thread.sleep(1000);
		
		//navigate back
		driver.navigate().back();
		Thread.sleep(1000);
		
		//navigate forward
		driver.navigate().forward();
		Thread.sleep(1000);
		
		//refresh page
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		//close webapp
		driver.close();
	}

}
