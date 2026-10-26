package Selenium_automation;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class externalFileReading {
	
	@Test
	void filesreadTest() throws IOException {
		FileReader fr = new  FileReader("C:\\Users\\chint\\OneDrive\\Desktop\\7oct_Chintamani_Automtion_Testing\\Selenium_automation\\test-output\\base.properties");
		Properties pr = new Properties();
		pr.load(fr);
		
		EdgeDriver d = new EdgeDriver();
		d.get(pr.getProperty("fct"));
		d.close();
	}

}
