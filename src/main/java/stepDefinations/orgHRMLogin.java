package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orgHRMLogin {
	
	EdgeDriver d;

	@Given("launch orgHRM website")
	public void launch_org_hrm_website() {
		d = new EdgeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("enter username as {string} and password as {string}")
	public void enter_username_as_and_password_as(String uname, String pass) {
	    d.findElement(By.name("username")).sendKeys(uname);
	    d.findElement(By.name("password")).sendKeys(pass);
	}

	@When("click on login button of orgHRM website")
	public void click_on_login_button_of_org_hrm_website() {
	    d.findElement(By.tagName("button")).click();
	}

	@Then("orgHRM login should be successful")
	public void org_hrm_login_should_be_successful() {
	    d.getCurrentUrl();
	    d.quit();
	}
}
