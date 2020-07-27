
public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Strated - Hello World!!!");
		
		System.out.println("Hello World!!!");
		
		try
		{
			int a = 10 ;
		    int b = a/0;
		}
		catch(ArithmeticException exp) 
		{
			System.out.println("msg is ="+ exp.getMessage());
			System.out.println("cause is ="+ exp.getCause());
			exp.printStackTrace();
		}
		System.out.println("Program Ended - Hello World!!!");
		
	}
}
