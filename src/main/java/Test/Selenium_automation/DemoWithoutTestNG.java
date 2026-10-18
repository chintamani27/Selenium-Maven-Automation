package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWithoutTestNG {
	static ChromeDriver d ;//declared globally
	public static void main(String[] args) {
		//launchWebsite();
		DemoWithoutTestNG d1 = new DemoWithoutTestNG();
		launchWebsite();
		d1.enterCredentials();
		pressBtn();
		

	}
	static void launchWebsite() {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/SignIn.html");
	}
	void enterCredentials() {
		d.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys("abc@gmail.com");
		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc@123");
		
	}
	static void pressBtn() {
		d.findElement(By.id("enterbtn")).click();
	}
}
