package Selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Selenium_automation.Listner_script.class)
public class Listner_Execute {
	
	ChromeDriver d;
	
	@Test(priority = 1)
	void launch() {
		 d = new ChromeDriver();
		 d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
	}
	
	@Test(priority = 2)
	void verifyURL() {
		
		 String actual = d.getCurrentUrl();
		 String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		 
		Assert.assertEquals(actual, expected);
		 
		
	}
	@Test(priority=3)
	void login() {
		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
	
		d.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	

}
