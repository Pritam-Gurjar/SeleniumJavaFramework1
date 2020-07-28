package demo;

import org.testng.annotations.Test;

public class AA
{
	public static void main(String[] args)
	{
		m1();
		m2();
	}
	@Test
	public static void m1()
	{
		System.out.println("user is inside m1 method");
	}
	
	@Test
	public static void m2()
	{
		System.out.println("user is inside m2 method");
	}
}
