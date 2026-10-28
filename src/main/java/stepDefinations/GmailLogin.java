package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailLogin {
	
	@Given("User should be registered")
	public void preconditon() {
		System.out.println("Registered!");
	}
	
	@When("User opens Gmail page and enters valid credentials")
	public void enterCredentials() {
		System.out.println("Entered credentials correctly");
	}
	
	@Then("Gmail login should be successful")
	public void result() {
		System.out.println("Logged in successfully");
	}

}
