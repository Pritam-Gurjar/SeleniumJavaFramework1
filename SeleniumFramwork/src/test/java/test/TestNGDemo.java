package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNGDemo 
{
	     WebDriver driver = null;
	     public static String browserName = null; 
	     
	    @BeforeTest
		public void setUpTest()
		{
			System.setProperty("webdriver.chrome.driver","E:\\Automation\\SeleniumFramwork\\drivers\\chromedriver.exe");
			PropertiesFile.getProperties();
			if(browserName.equalsIgnoreCase("chrome"))
			{
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
			    driver = new FirefoxDriver();
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
		}
	    @Test
		public void googleTestScript()
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
