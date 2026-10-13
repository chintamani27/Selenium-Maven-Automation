//practice to write automation script on websote => https://blazedemo.com/purchase.php

package Test.Selenium_automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class BlazeDemoTask {

	public static void main(String[] args) throws IOException, InterruptedException {
		EdgeDriver d = new EdgeDriver();
		
		d.manage().window().maximize();
		
		//get url
		d.get("https://blazedemo.com/purchase.php");
		
		//name field
		d.findElement(By.id("inputName")).sendKeys("Chintamani");
		
		//address field
		d.findElement(By.xpath("//input[@id='address']")).sendKeys("MG Road, Shivajinagar");
		
		//city field
		d.findElement(By.cssSelector("input[id='city']")).sendKeys("Pune");
		
		//state field
		d.findElement(By.cssSelector("input#state")).sendKeys("Maharastra");
		
		//zipcode field
		d.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("411002");
		
		//Card type dropdown
		Select sel = new Select(d.findElement(By.id("cardType")));
		
		sel.selectByIndex(0);
		
		//creditCardNumber field
		d.findElement(By.id("creditCardNumber")).sendKeys("98765434567");
		
		//creditCardMonth field
		WebElement month = d.findElement(By.id("creditCardMonth"));
		month.clear();
		month.sendKeys("4");
		
		//creditCardYear field
		WebElement year = d.findElement(By.id("creditCardYear"));
		year.clear();
		year.sendKeys("2028");
		
		//nameOnCard field
		d.findElement(By.name("nameOnCard")).sendKeys("Chingamani Adak");
		
		//rememberMe checkbox
		d.findElement(By.name("rememberMe")).click();
		
		//Purchase Flight button
		d.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
		//print the confirmation
		
		File src = (File)d.getScreenshotAs(OutputType.FILE);
		
		File Dest = new File("C:\\Users\\chint\\OneDrive\\Desktop\\7oct_Chintamani_Automtion_Testing\\Selenium_automation\\ScreenShots\\ticket.png");
		
		Files.copy(src, Dest);
		
		
		Thread.sleep(5000);
		d.close();
		
		

	}

}
