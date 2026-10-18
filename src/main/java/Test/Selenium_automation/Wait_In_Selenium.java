package Test.Selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_In_Selenium {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver d = new EdgeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		WebElement n = d.findElement(By.xpath("//input[@placeholder='Username']"));
		n.sendKeys("Admin");
		
		d.findElement(By.name("password")).sendKeys("admin123");
		
		d.findElement(By.xpath("//button[@type='submit']")).click();
		
		//explicitly wait
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(2));
		WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")));
		logout.click();
		
		d.findElement(By.linkText("Logout")).click();		
		
	}

}
