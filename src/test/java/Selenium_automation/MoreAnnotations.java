package Selenium_automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MoreAnnotations {

	@Test
	public void test() {
		System.out.println("Test method");
	}
//	@Test
//	public void test2(){
//		System.out.println("TEst 2 ");
//	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method ");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before Method ");
	}
	@AfterTest()
	public void aTest() {
		System.out.println("After test");
	}
	@BeforeTest()
	public void bTest() {
		System.out.println("before test");
	}
	
	
	@AfterSuite
	public void aSuite() {
		System.out.println("after suite");
	}
	@BeforeSuite
	public void bSuite() {
		System.out.println("before suite");
	}
	@AfterClass
	public void aClass() {
		System.out.println("after class");
	}
	@BeforeClass
	public void bClass() {
		System.out.println("before class");
	}
	
}
