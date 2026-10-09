package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1_EdgeDriver {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver  d = new EdgeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://practicetestautomation.com/practice-test-login/");
		
		d.findElement(By.id("username")).sendKeys("stud");
		//Thread.sleep(1000);
		d.findElement(By.id("password")).sendKeys("Password123");
		//Thread.sleep(1000);
		d.findElement(By.id("submit")).click();
		
		WebElement errorMessage = d.findElement(By.id("error"));
		
		if(errorMessage.isDisplayed()) {
			//verify that error msg is displaying or not
			System.out.println("Error message is displayed.");
			
			//verify that expected error message is displayed or not
			System.out.println("Error Message: "+errorMessage.getText());
			
			
		}else {
			System.out.println("Error msg is not displyed");
		}
		
		
		
		
	}

}
