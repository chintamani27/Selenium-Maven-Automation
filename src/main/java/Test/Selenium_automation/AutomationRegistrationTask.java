package Test.Selenium_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationRegistrationTask {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://demo.automationtesting.in/Register.html");
		
		//ACCESSING FIRST NAME FIELD
		d.findElement(By.xpath("//input[@type='text' and @placeholder='First Name']")).sendKeys("6758439");
		
		//ACCESSING LAST NAME FIELD
		d.findElement(By.xpath("//input[@type='text' and @placeholder='Last Name']")).sendKeys("675748");
		
		//ACCESSING ADDRESS FIELD
		d.findElement(By.xpath("//textarea[starts-with(@class,'form-control ng-pristine ng-untouched ng-valid')]")).sendKeys("MG Road , Pune");
		
		//ACCESSING EMAIL FIELD
		d.findElement(By.xpath("//input[@type='email']")).sendKeys("chintamani@gmail.com");
		
		//ACCESSING PHONE FIELD
		d.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("8767928388");
		
		//ACCESSING RADIO BUTTON
		d.findElement(By.xpath("//input[@type='radio' and @name='radiooptions']")).click();
		
		//ACCESSING CHECKBOXES
		List<WebElement> checkboxes = d.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement checkbox : checkboxes) {
			checkbox.click();
		}
		
		//ACCESSING LANGUAGES FIELD
		d.findElement(By.id("msdd")).click();
		
		d.findElement(By.xpath("//a[normalize-space()='English']")).click();
		Thread.sleep(1000);
		
		//ACCESSING DROPDOWN
		Select sel =new Select(d.findElement(By.xpath("//select[@id='Skills']")));
		sel.selectByVisibleText("Excel");
		
		Select selC = new Select(d.findElement(By.xpath("//select[@id='countries']")));
		selC.selectByVisibleText("Select Country");
		
		//Accessing Country
		d.findElement(By.xpath("//span[contains(@class,'select2-selection--single')]")).click();
		Select s = new Select(d.findElement(By.xpath("//select[@id='country']")));
		s.selectByValue("India");
		d.findElement(By.xpath("//span[contains(@class,'select2-selection--single')]")).click();
		
		
		//ACCESSING DOB FIELDS
		Select dobYear = new Select(d.findElement(By.xpath("//select[@id='yearbox']")));
		dobYear.selectByVisibleText("2004");
		
		Select dobMonth = new Select(d.findElement(By.xpath("//select[@Placeholder='Month']")));
		dobMonth.selectByVisibleText("January");
		
		Select dobDate = new Select(d.findElement(By.xpath("//select[@id='daybox']")));
		dobDate.selectByVisibleText("24");
		
		
		
		//ACCESSING PASSWORD FIELD
		d.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Pass123");
		
		//ACCESSING CONFIRM PASSWORD FIELD
		d.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Pass123");
		
		//ACCESING SUBMIT BUTTON
		
		d.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		d.close();
	}

}
