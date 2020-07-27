/*package demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import io.netty.util.Timeout;

public class FluentWaitDemo 
{
	public static void main(String[] args) throws Exception 
	{
		test();
	}
	public static WebElement test() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:/Automation/SeleniumFramwork/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).poolingEvery(3,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		WebElement element = wait.until(new Function<WebDriver, WebElement>);
		WebElement apply(WebDriver driver);
		WebElement linkElement = driver.findElement(By.id("MP_link")).click();
		{
			if(linkElement)
			{

			}
		}
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}*/
