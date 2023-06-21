package TestNGPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class ListenerClass implements ITestListener {
	public void onStart(ITestContext Result)
	{
		System.out.println("On start method...");
	}
	public void onFinish(ITestContext Result)
	{
		System.out.println("On finish method..");
	}
	public void onTestFailure(ITestContext Result)
	{
		System.out.println("Name of failed method"+Result.getName());
	}
	public void onTestSuccess(ITestContext Result)
	{
		System.out.println("Name of success method"+Result.getName());
	}
	public void onTestStart(ITestContext Result)
	{
		System.out.println("On Test start method ...");
	}
	public void onTestSkipped()
	{
		System.out.println("on Test skipped method...");
	}
	public void onTestFailedButWithingSuccessPercentage()
	{
		
	}

}
