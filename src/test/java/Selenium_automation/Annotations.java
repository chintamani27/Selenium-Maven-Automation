package Selenium_automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@AfterTest
	public void name() {
		System.out.println("After Test: Chintamani"); 
		//it will run after @Test
	}
	@BeforeTest
	public void email() {
		System.out.println("Before test: Chintamani@gmail.com");
		//it will run before @Test
	}
	
	@Test
	public void surname() {
		System.out.println("Test : Adak");
		
	}
}
