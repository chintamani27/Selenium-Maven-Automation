package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTabOpen {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		
		d.get("https://testautomationpractice.blogspot.com/");
		
		//new tab
		d.switchTo().newWindow(WindowType.TAB).get("https://testautomationpractice.blogspot.com/");
		
		//new Window
		d.switchTo().newWindow(WindowType.WINDOW).get("https://testautomationpractice.blogspot.com/");
		
		
		//quit and close commands
		//d.quit();//it closes all opened window 
		//d.close();//it closes only current window
		 

	}

}
