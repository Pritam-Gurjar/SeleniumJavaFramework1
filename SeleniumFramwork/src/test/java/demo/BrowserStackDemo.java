package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackDemo 
{
	public static final String AUTOMATE_USERNAME = "pritamgurjar1";
	public static final String AUTOMATE_ACCESS_KEY = "6CUzyjiQq9VPt5PHFt5D";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	public static void main(String[] args) throws Exception 
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", "iPhone");
		caps.setCapability("device", "iPhone 11");
		caps.setCapability("realMobile", "true");
		caps.setCapability("os_version", "13.0");
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("BrowserStack");
		element.submit();
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
