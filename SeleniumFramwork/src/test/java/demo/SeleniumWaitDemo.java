package demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo 
{
	public static void main(String[] args) 
	{
		seleniumWaits();	
	}
	public static void seleniumWaits()
	{
		System.setProperty("webdriver.chrome.driver","E:/Automation/SeleniumFramwork/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		WebDriverWait wait = new WebDriverWait(driver,20);
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("abc")));
		driver.findElement(By.id("absgvc")).click();
		
		System.out.println("This script is executed successfully");
		driver.close();
		driver.quit();
	}
}
