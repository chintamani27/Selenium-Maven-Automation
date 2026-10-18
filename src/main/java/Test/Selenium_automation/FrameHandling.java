package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		EdgeDriver d = new EdgeDriver();
		d.get("https://demo.automationtesting.in/Frames.html");
		
		//switching to iframe
		d.switchTo().frame(0);
		
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("sdfghj");
		//task iframe in iframe
		
	}

}
