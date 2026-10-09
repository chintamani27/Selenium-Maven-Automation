package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1_FirefoxDriver {

	public static void main(String[] args) {
		
		FirefoxDriver d = new FirefoxDriver();
		
		d.manage().window().maximize();
		
		d.get("https://practicetestautomation.com/practice-test-login/");
		
		d.findElement(By.id("username")).sendKeys("student");
		
		d.findElement(By.id("password")).sendKeys("abc");
		
		d.findElement(By.id("submit")).click();
		
        WebElement errorMessage = d.findElement(By.id("error"));
        System.out.println("Error Message: "+errorMessage.getText());
		
        

	}

}
