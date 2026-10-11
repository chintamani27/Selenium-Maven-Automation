package Test.Selenium_automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssSelector_BlogSpot {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://testautomationpractice.blogspot.com/");
		
		d.findElement(By.cssSelector("input[id='name']")).sendKeys("Chintamani");
		
		
//		
		d.findElement(By.cssSelector("input[id='email']")).sendKeys("abc@gmail.com");
//		
//		
//		
		d.findElement(By.cssSelector("input#phone")).sendKeys("473892");
//		
//		
		d.findElement(By.cssSelector("textarea")).sendKeys("Pune");
//		
//		
//		
		d.findElement(By.cssSelector("input[id='male'][name='gender']")).click();
//		
		
//		d.findElement(By.xpath("//input[@id='sunday' or @value='sunday']")).click();
//		
//		d.findElement(By.xpath("//input[contains(@id ,'monday')]")).click();
//		
//		d.findElement(By.xpath("//input[starts-with(@id,'tuesday')]")).click();
//		
//		d.findElement(By.xpath("//input[@id='wednesday']")).click();
//		
//		d.findElement(By.xpath("//input[@id='thursday' and @value='thursday']")).click();
//		
//		d.findElement(By.xpath("//input[@id='friday' and @value='friday']")).click();
//		
//		d.findElement(By.xpath("//input[@id='saturday' and @value='saturday']")).click();
		
//		List<WebElement> checkboxes = d.findElements(By.xpath("//input[@class='form-check-input']"));
//		
//		for (WebElement checkbox : checkboxes) {
//		    System.out.println(checkbox.getAttribute("id"));
//		    checkbox.click();
//		}
		
		
//		Iterator<WebElement> it = checkboxes.iterator();
//		
//		while(it.hasNext()) {
//			WebElement check = it.next();
//			check.click();
//		}
		

	

	}

}
