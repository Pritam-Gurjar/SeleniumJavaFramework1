package listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListners implements ITestListener
{
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test is successfull : "+result.getName());
	}
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test is failed : "+result.getName());
	}
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test is skipped : "+result.getName());
	}
	public void onFinish(ITestResult context) 
	{
		System.out.println("Test is complited : "+context.getName());
	}
}
