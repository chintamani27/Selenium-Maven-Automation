package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Form {
	EdgeDriver d = new EdgeDriver();

	@Given("user should launch website")
	public void launch() {
		d.manage().window().maximize();
		d.get("https://demoqa.com/automation-practice-form");
	}
	
	@When("user enters name and email")
	public void enterData() {
		d.findElement(By.id("firstName")).sendKeys("chintamani");
		d.findElement(By.id("lastName")).sendKeys("Adak");
		d.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		d.findElement(By.id("gender-radio-1")).click();
		d.findElement(By.id("userNumber")).sendKeys("1234567890");
//		d.findElement(By.id("subjectsInput")).click();
//		d.findElement(By.id("react-select-3-input")).click();
	}
	
	@Then("it should accept values")
	public void verify() {
		System.out.println("URL :" +d.getCurrentUrl());
	}
}
