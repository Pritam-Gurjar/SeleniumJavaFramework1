package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo2 
{
	     WebDriver driver = null;
	    @BeforeTest
		public void setUpBrowser()
		{
			System.setProperty("webdriver.chrome.driver","E:\\Automation\\SeleniumFramwork\\drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	    @Test
		public void googleTestScript2()
		{
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Prime Minister of India");
			driver.findElement(By.className("gNO89b")).click();
		}
	    public void googleTestScript3()
		{
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Prime Minister of India");
			driver.findElement(By.className("gNO89b")).click();
		}
	    @AfterTest
		public void testCloser()
		{
		    driver.quit(); 
		    System.out.println("Test Successfully Executed");
		}
}
