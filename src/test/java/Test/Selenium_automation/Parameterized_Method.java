package Test.Selenium_automation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Method {
	@Parameters({"P"})//78 // seted in xml file in parameter tag
	@Test
	public void dislayNumber(int n) {
		System.out.println("Number is :"+n);
	}
}
