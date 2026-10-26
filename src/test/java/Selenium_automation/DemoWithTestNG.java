package Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWithTestNG {
	static ChromeDriver d ;
	@Test
	 void launchWebsite() {
		
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/SignIn.html");
	}
	@Test
	void enterCredentials() {
		d.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys("abc@gmail.com");
		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc@123");
		
	}
	@Test
	static void pressBtn() {
		d.findElement(By.id("enterbtn")).click();
	}
}
