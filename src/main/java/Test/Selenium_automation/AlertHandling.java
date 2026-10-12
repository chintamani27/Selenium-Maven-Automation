package Test.Selenium_automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://testautomationpractice.blogspot.com/");
		
		//handling simpple alert box
		d.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Alert al = d.switchTo().alert();
		al.accept();
		//or this way => //d.switchTo().alert().accept();
		
		//handling confirm alert box
		d.findElement(By.id("confirmBtn")).click();
		d.switchTo().alert().accept();

		//handling prompt alert
		d.findElement(By.id("promptBtn")).click();
		Alert al2 = d.switchTo().alert();
		al2.sendKeys("Chintamani");
		al2.accept();
		
		
		
		
		
		Thread.sleep(3000);
		d.close();
	}

}
