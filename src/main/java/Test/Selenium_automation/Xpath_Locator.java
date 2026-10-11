package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Xpath_Locator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://demoqa.com/register");
		
		//1. xpath using tag name and attribute
		d.findElement(By.xpath("//input[@placeholder = 'First Name']")).sendKeys("Chintamani");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@placeholder = 'Last Name']")).sendKeys("Adak");
		
		//2 xpath using tagname and multiple attritube
		d.findElement(By.xpath("//input[@placeholder='UserName' and @type='text']")).sendKeys("chintamani@27");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass@123");
		Thread.sleep(1000);
		
		
		WebElement registerButton = d.findElement(
			    By.xpath("//button[@type='button' and @id='register']")
			);

			System.out.println("Is displayed: " + registerButton.isDisplayed());
			System.out.println("Is enabled: " + registerButton.isEnabled());
			registerButton.click();
		
			 
			WebElement login = d.findElement(By.xpath("//button[@id='gotologin']"));
			System.out.println("Is displayed: " + login.isDisplayed());
			System.out.println("Is enabled: " + login.isEnabled());
			login.click();
			
			 
		
		//d.close();
	}

}
