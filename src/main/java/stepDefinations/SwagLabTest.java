package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabTest {

	EdgeDriver d ;
	
	@Given("launch swaglab website")
	public void launch_swaglab_website() {
	    d = new EdgeDriver();
	    d.manage().window().maximize();
	    d.get("https://www.saucedemo.com/");
	}

	@When("enter username as {string} and password as {string} and click on login and logout button")
	public void enter_username_as_and_password_as_and_click_on_login_and_logout_button(String un, String ps) {
	    d.findElement(By.id("user-name")).sendKeys(un);
	    d.findElement(By.id("password")).sendKeys(ps);
	    d.findElement(By.id("login-button")).click();
	}

	@Then("verify expected result as {string}")
	public void verify_expected_result_as(String string) {
	     System.out.println(d.getCurrentUrl());
	     d.quit();
	}
}
