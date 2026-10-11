package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://secure.facebook.com/login.php/");
		
		d.findElement(By.cssSelector("input[id='email']")).sendKeys("abc@gmail.com");
		d.findElement(By.cssSelector("input#pass")).sendKeys("Pass123");
		
		d.findElement(By.cssSelector("#loginbutton")).click();
		Thread.sleep(2000);
		
		d.findElement(By.cssSelector("a._97w4")).click();
		
		
		Thread.sleep(5000);
		d.close();

	}

}
