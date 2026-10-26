package Selenium_automation;

import org.testng.annotations.Test;

public class Priority {

	@Test
	public void launchWebsite() {
		System.out.println("Launched Website Successfully");
	}
	
	@Test(priority=0)
	public void enterCredentials() {
		System.out.println("Credentials entered !!");
	}

	@Test(priority=3)
	public void login() {
		System.out.println("logged in Website Successfully");
	}
	
//	@Test
//	public void LaunchWebsite() {
//		System.out.println("capital launcheWebsite");
//	}//for same name,same priority  but only one is capital and one is small then it will run based on ASCII character;
}
