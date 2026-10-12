package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchTo_Atomation_Ragistration {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://demo.automationtesting.in/Register.html");
		
		d.findElement(By.xpath("//a[text()='SwitchTo']")).click();
		
		d.findElement(By.xpath("//a[text()='Alerts']")).click();
		
		d.findElement(By.linkText("Alert with OK")).click();
		d.findElement(By.xpath("//button[@class='btn btn-danger' and @onclick='alertbox()']")).click();
		d.switchTo().alert().accept();
		Thread.sleep(1000);
		
		
		d.findElement(By.linkText("Alert with OK & Cancel")).click();
		d.findElement(By.xpath("//button[@class='btn btn-primary' and @onclick='confirmbox()']")).click();
		Thread.sleep(1000);
		d.switchTo().alert().dismiss();
		
		Thread.sleep(1000);
		d.findElement(By.linkText("Alert with Textbox")).click();
		d.findElement(By.xpath("//button[@class='btn btn-info' and @onclick='promptbox()']")).click();
		Thread.sleep(1000);
		d.switchTo().alert().sendKeys("Chintamani");
		d.switchTo().alert().accept();
		
		//using actions class also we can access element
		
//		WebElement x = d.findElement(By.linkText("Alert with Textbox"));
//		Actions act = new Actions(d);
//		act.moveToElement(x).click().perform();
//		d.findElement(By.xpath("//button[@class='btn btn-info' and @onclick='promptbox()']")).click();
//		d.switchTo().alert().sendKeys("Chintamani");
//		d.switchTo().alert().accept();
		
		
		Thread.sleep(5000);
		d.close();

	}

}
