package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenCart {
	EdgeDriver d = new EdgeDriver();
	
	@Given("page should be launched")
	public void launch() {
		d.manage().window().maximize();
		d.get("https://www.opencart.com");
		
	}
	
	@When("enter all required details correctly")
	public void register() {
		d.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[2]")).click();
		d.findElement(By.id("input-username")).sendKeys("Chintamani27");
		d.findElement(By.id("input-firstname")).sendKeys("Chintamani");
		d.findElement(By.id("input-lastname")).sendKeys("patil");
		d.findElement(By.id("input-email")).sendKeys("chintamani@gmail.com");
		Select sel = new Select(d.findElement(By.id("input-country")));
		sel.selectByVisibleText("India");
		d.findElement(By.id("input-password")).sendKeys("Pass@123");
		d.findElement(By.xpath("//*[@id=\"button-register\"]/button[1]")).click();
	}
	
	@Then("registration should be successfull")
	public void verifyRegistration() {
		String url = d.getCurrentUrl();
		if(url.contains("https://www.opencart.com/index.php?route=account/register/success")) {
			System.out.println("Registration successful");
		}
		else {
			System.out.println("Registration Failed");
		}
	}
	

	@When("user enters valid credentials")
	public void login() throws InterruptedException {
		
		d.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]")).click();
		
	
		d.findElement(By.id("input-email")).sendKeys("chintamani@gmail.com");
		d.findElement(By.id("input-password")).sendKeys("Pass@123");
		d.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]")).click();
	}
	@Then("login should be successful after entering valid credentials")
	public void verifyLogin() {
		String login = d.getCurrentUrl();
		
		if(login.contains("success")) {
			System.out.println("Successful login");
		}else {
			System.out.print("Login Failed");
		}
	}

}
