package demo;

import org.testng.annotations.Test;

public class TestNGGroupsDemo 
{
	@Test(groups ={"linux.sanity"})
	public void test1()
	{
		System.out.println("i'm inside the test 1");
	}
	@Test(groups ={"ubantu.smoke"})
	public void test2()
	{
		System.out.println("i'm inside the test 2");
	}
	@Test(groups ="linux.unit")
	public void test3()
	{
		System.out.println("i'm inside the test 3");
	}
	@Test(groups ="windows.regression")
	public void test4()
	{
		System.out.println("i'm inside the test 4");
	}
}
