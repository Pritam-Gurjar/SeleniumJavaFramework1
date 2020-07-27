package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class TestNGIgnoreDemo 
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
	}
	
	@Ignore
	@Test
	public void test3() 
	{
		System.out.println("i'm inside the test3");
	}
}
