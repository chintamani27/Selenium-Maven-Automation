package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://secure.facebook.com/login.php/");
		
		
		//get username/email field  by id
		driver.findElement(By.id("email")).sendKeys("chintamani_27");
		
		
		//get password field by id
		driver.findElement(By.id("pass")).sendKeys("F190420006");
		
		//get login button by id and click()
		driver.findElement(By.id("loginbutton")).click();
		
		
		// pracitcetestautomation
		//1st execute on chrome
		//2nd is on edge
		//3rd is on brave
	}

}
