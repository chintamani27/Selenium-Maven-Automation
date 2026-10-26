package Selenium_automation;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner_script implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("ON test start");
			}

	@Override
	public void onTestSuccess(ITestResult result) {
			System.out.println("Test passes:"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("There is bug in method "+result);
			}
	

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("ON  start");
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	
}
