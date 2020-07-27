package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeDemo 
{
	public static void main(String[] args) 
	{
		test();
	}
	public static void test()
	{
		System.setProperty("webdriver.chrome.driver","E:/Automation/SeleniumFramwork/drivers/chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("...headless...");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).click();
		driver.close();
		driver.quit();
		System.out.println("This Test Completed");
	}
}
