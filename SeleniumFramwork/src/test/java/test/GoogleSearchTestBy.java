package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageBy;

public class GoogleSearchTestBy 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("before opening google page");
		googleSearchTest();
	}
	
	public static void googleSearchTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\SeleniumFramwork\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		GoogleSearchPageBy googlepage = new GoogleSearchPageBy(driver);
		
		googlepage.passTextIntoTextBox("Prime Minister of India");
		
		googlepage.clickOnButton();
		Thread.sleep(2000);
		
		System.out.println("its successfully done!!!");
		driver.quit();
	}
}
