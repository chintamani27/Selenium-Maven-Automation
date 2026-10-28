package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQA {
	public static void clickElement(WebDriver d, By locator) {

	    WebElement element = d.findElement(locator);

	    ((JavascriptExecutor) d).executeScript(
	        "arguments[0].scrollIntoView({block:'center'});",
	        element
	    );

	    element.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://demoqa.com/automation-practice-form");
		
		d.findElement(By.id("firstName")).sendKeys("chintamani");
		d.findElement(By.id("lastName")).sendKeys("Adak");
		d.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		//d.findElement(By.id("gender-radio-1")).click();
		d.findElement(By.id("userNumber")).sendKeys("1234567890");
		
//		d.findElement(By.id("dateOfBirthInput")).click();
//		Select sel = new Select(d.findElement(By.className("react-datepicker__year-select")));
//		sel.selectByVisibleText("2020");
//		Select sel1 = new Select(d.findElement(By.className("react-datepicker__month-select")));
//		sel1.selectByVisibleText("Oct");
		//d.findElement(By.className("react-datepicker__day react-datepicker__day--014")).click();
		//System.out.println(d.findElement(By.id("dateOfBirthInput")).getClass());
		//d.findElement(By.id("dateOfBirthInput")).sendKeys("23 Sep 2024");
		
		
		
//		List<WebElement> h = d.findElements(By.xpath("//input[@className='form-check-input' and @type='checkbox']"));
//		for(WebElement hobby : h) {
//			hobby.click();
//		}
//		WebElement d1 = d.findElement(
//			    By.cssSelector("input[id='hobbies-checkbox-1']")
//			);
//			d1.click();\"C:\\Users\\chint\\OneDrive\\Pictures\\IMG_9200.jpg\"
		clickElement(d, By.id("gender-radio-1"));
		
		
		clickElement(d, By.id("hobbies-checkbox-1"));
		
		
		d.findElement(By.id("uploadPicture"))
	    .sendKeys("C:\\Users\\chint\\OneDrive\\Pictures\\IMG_9200.jpg");
		
		d.findElement(By.id("currentAddress")).sendKeys("MG road , pune , maharastra");
		
		clickElement(d,By.id("state"));
	}

}
