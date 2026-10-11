package Test.Selenium_automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_BlogSpot {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://testautomationpractice.blogspot.com/");
		
		d.findElement(By.xpath("//input[@id='name']")).sendKeys("Chintamani");
		
		
		
		d.findElement(By.xpath("//input[@id='email' and @placeholder='Enter EMail']")).sendKeys("abc@gmail.com");
		
		
		
		d.findElement(By.xpath("//input[@id = 'phone']")).sendKeys("8776938176");
		
		
		
		d.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Pune");
		
		
		
		d.findElement(By.xpath("//input[@id='male' and @name='gender']")).click();
		
		
		
		
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
		
		List<WebElement> checkboxes = d.findElements(By.xpath("//input[@class='form-check-input']"));
		
//		for (WebElement checkbox : checkboxes) {
//		    System.out.println(checkbox.getAttribute("id"));
//		    checkbox.click();
//		}
		
		
		Iterator<WebElement> it = checkboxes.iterator();
		
		while(it.hasNext()) {
			WebElement check = it.next();
			check.click();
		}
		
		//accessing country field
		Select sel = new Select(d.findElement(By.id("country")));

		sel.selectByVisibleText("India");
		
		//accessing color field
		Select col = new Select(d.findElement(By.id("colors")));
		col.selectByVisibleText("Yellow");
		
		//accessing animal field
		Select animal = new Select(d.findElement(By.id("animals")));
		animal.selectByVisibleText("Fox");
		
		
		//accessing date1 field
		d.findElement(By.id("datepicker")).click();
		d.findElement(By.xpath("//a[@data-handler='prev']")).click();
		d.findElement(By.xpath(
			    "//td[@data-handler='selectDay' and @data-month='8' and @data-year='2026']//a[@data-date='15']"
			)).click();
		
		//accessing date2 field
		d.findElement(By.id("txtDate")).click();
		d.findElement(By.xpath("//td[@data-month='9' and @data-year='2026'] //a[@data-date='8']")).click();
		
		//accessing date 3 picker field
		d.findElement(By.id("start-date")).sendKeys("10-02-2023");
		
		d.findElement(By.id("end-date")).sendKeys("10-2/2024");  // it is working for 10/02/2024 format also 
		
		//accessing submit button
		d.findElement(By.xpath("//button[text()='Submit']")).click();
		
		//accesing choose file
		d.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("C:\\Users\\chint\\OneDrive\\文件\\stqa dinesh.pdf");
		
		//click() not works for this so we have used javascriptExecutor or directly sendKeys()
//		{//using javascript executor 
//		WebElement fileInput = d.findElement(By.id("singleFileInput"));
//		JavascriptExecutor js = (JavascriptExecutor) d;
//		js.executeScript("arguments[0].click();", fileInput);
//		}
//	
		
		d.findElement(By.id("multipleFilesInput")).sendKeys(
			    "C:\\Users\\chint\\OneDrive\\文件\\stqa dinesh.pdf\n" +
			    "C:\\Users\\chint\\OneDrive\\文件\\vishwajjet csdf.pdf"
			);
		
		//clicking upload buttons
		d.findElement(By.xpath("//button[text()='Upload Single File']")).click();
		d.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
		
		d.findElement(By.xpath("//button[@id='alertBtn']")).click();
		d.switchTo().alert().accept();
		
		WebElement staticTable = d.findElement(By.xpath("//table[@name='BookTable']"));
		System.out.println(staticTable.getText());
		
		//d.findElement(By.xpath("//button[text()='New Tab']")).click();
		//d.findElement(By.id("PopUp")).click();
		
		
		Thread.sleep(5000);
		d.close();

	}
	

}

//SelectorsHub
