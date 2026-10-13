package Test.Selenium_automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotCapture {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://testautomationpractice.blogspot.com/");
		
		File src = (File)d.getScreenshotAs(OutputType.FILE);
		
		File Dest = new File("C:\\Users\\chint\\OneDrive\\Desktop\\7oct_Chintamani_Automtion_Testing\\Selenium_automation\\ScreenShots\\ss.png");
		
		//partial ss
		
		WebElement ps = d.findElement(By.xpath("//table[@name='BookTable']"));
		
		File psrc = (File)ps.getScreenshotAs(OutputType.FILE);
		File pDest = new File("C:\\Users\\chint\\OneDrive\\Desktop\\7oct_Chintamani_Automtion_Testing\\Selenium_automation\\ScreenShots\\partialSS");
		
		Files.copy(psrc, pDest);
		
		
		//blazeDemo
		

	}

}
