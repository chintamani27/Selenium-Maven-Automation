package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Test case 1: Positive LogIn test

public class Task1_ChormeDriver {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		driver.findElement(By.id("submit")).click();
		
		
		System.out.println("URL after login: "+driver.getCurrentUrl());
		
		WebElement greet_text = driver.findElement(By.tagName("strong"));
		
		System.out.println("greet Text after login"+greet_text.getText());
		
		WebElement logoutText = driver.findElement(By.linkText("Log out"));
		
		System.out.println("logout text: "+logoutText.getText());
	}

}
