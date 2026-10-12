package Test.Selenium_automation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		
		WebElement drag = d.findElement(By.id("draggable"));
		WebElement drop = d.findElement(By.id("droppable"));//here we stored drag and drop in WebElement variable
		
		Actions act = new Actions(d);//Actions is class which is used to perform action using mouse  
		
		act.dragAndDrop(drag, drop).build().perform();
		
		//hover action
		WebElement hover = d.findElement(By.xpath("//button[@class='dropbtn']"));
		act.moveToElement(hover).perform();

		
	}

}
