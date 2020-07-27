package listners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listners.TestNGListners.class)
public class TestNGListnersDemo 
{
	@Test
	public void test1()
	{
		System.out.println("i'm inside the test1");
	}
	@Test
	public void test2()
	{
		System.out.println("i'm inside the test2");
		Assert.assertTrue(false);
	}
	@Test
	public void test3()
	{
		System.out.println("i'm inside the test3");
		throw new SkipException("this test is skipped");
	}
	
}
