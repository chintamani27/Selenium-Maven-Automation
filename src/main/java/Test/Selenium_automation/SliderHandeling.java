package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderHandeling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		
		WebElement leftslider = d.findElement(By.xpath("//span[@style='left: 15%;']"));
		WebElement rightslider = d.findElement(By.xpath("//span[@style='left: 60%;']"));
		Actions a = new Actions(d);
		
		a.dragAndDropBy(leftslider, 34, 0).build().perform();
		
		
		a.dragAndDropBy(rightslider, -12, 0).build().perform();
		
		
		
		Thread.sleep(5000);
		d.close();

	}

}
