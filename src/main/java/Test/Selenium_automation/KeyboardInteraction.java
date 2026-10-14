package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardInteraction {

	public static void main(String[] args) {
		EdgeDriver d = new EdgeDriver();
		d.manage().window().maximize();
		
		d.get("https://testautomationpractice.blogspot.com/");
		WebElement search = d.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		
		search.sendKeys("Chintamani");
		
		//pressing enter in keyboard
		search.sendKeys(Keys.ENTER);
		
		//selecting all content which entered in search field
		search.sendKeys(Keys.CONTROL+"A");
		
		//Copying content from search box
		search.sendKeys(Keys.CONTROL+"C");
		
		//pasting content from search field to name field
		WebElement name = d.findElement(By.id("name"));
		name.sendKeys(Keys.CONTROL+"v");
		
		//pressing start button
		WebElement button = d.findElement(By.xpath("//button[@name='start']"));
		System.out.println("Is button displays :"+button.isDisplayed());
		System.out.println("button Text :"+button.getText());
		button.click();
		System.out.println("button Text :"+button.getText());
		
		
		//hovering over button
		WebElement pointmeButton = d.findElement(By.xpath("//button[@class='dropbtn']"));
		Actions act = new Actions(d);
		act.moveToElement(pointmeButton).perform();
		String h = pointmeButton.getText();
		System.out.println(h);
		
		
		
		
		

	}

}
