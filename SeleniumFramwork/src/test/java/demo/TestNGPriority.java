package demo;
import org.testng.annotations.Test;

public class TestNGPriority 
{
	@Test(priority=-2)
	public void one()
	{ 
		System.out.println("i'm inside the first method : ");
	}
	@Test(priority=0)
	public void two()
	{
		System.out.println("i'm inside the second method : ");
	}
	@Test(priority=-1)
	public void three()
	{
		System.out.println("i'm inside the third method : ");
	}
	@Test(priority=1)
	public void four()
	{
		System.out.println("i'm inside the fourth method : ");
	}
}
