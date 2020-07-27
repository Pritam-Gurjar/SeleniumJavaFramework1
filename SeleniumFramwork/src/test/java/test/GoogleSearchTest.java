package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest
{
	private static WebDriver driver = null;
	public static void main(String[]args) throws InterruptedException
	{
		System.out.println("Test Execution Started");
		googleTestCase();
	}
		public static void googleTestCase() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","E:\\Automation\\SeleniumFramwork\\drivers\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("https://www.google.com/");
		    
		    GoogleSearchPage.googleTestBox(driver).sendKeys("Cleanest City of India");
		    
		    GoogleSearchPage.searchButton(driver).click();
		   
		    driver.close();
		    driver.quit();
		    
		    System.out.println("Test Successfully Executed");
		}
}

