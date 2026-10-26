package Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EnterCredentialsSauceDemo extends LaunchSauceDemo{
	@Test(priority=1)
	public void firstCredential() {
		WebElement username = d.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = d.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement login = d.findElement(By.id("login-button"));
		login.click();
	}
	@Test(priority=2)
	public void secondCredential() {
		WebElement username = d.findElement(By.id("user-name"));
		username.sendKeys("locked_out_user");
		
		WebElement password = d.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement login = d.findElement(By.id("login-button"));
		login.click();
	}
	@Test(priority=3)
	public void thirdCredential() {
		WebElement username = d.findElement(By.id("user-name"));
		username.sendKeys("problem_user");
		
		WebElement password = d.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement login = d.findElement(By.id("login-button"));
		login.click();
	}
	
	@Test(priority=4)
	public void fourthCredential() {
		WebElement username = d.findElement(By.id("user-name"));
		username.sendKeys("performance_glitch_user");
		
		WebElement password = d.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement login = d.findElement(By.id("login-button"));
		login.click();
	}

	@Test(priority=5)
	public void fifthCredential() {
		WebElement username = d.findElement(By.id("user-name"));
		username.sendKeys("error_user");
		
		WebElement password = d.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement login = d.findElement(By.id("login-button"));
		login.click();
	}
	
	@Test(priority=6)
	public void sixthCredential() {
		WebElement username = d.findElement(By.id("user-name"));
		username.sendKeys("visual_user");
		
		WebElement password = d.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement login = d.findElement(By.id("login-button"));
		login.click();
	}
}
