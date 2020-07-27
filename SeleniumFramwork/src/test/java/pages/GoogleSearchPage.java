package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage
{
	static WebElement element = null;
	
	public static WebElement googleTestBox(WebDriver driver) throws InterruptedException
	{
		element = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		return element;
	}
	
	public static WebElement searchButton(WebDriver driver) throws InterruptedException
	{
		WebElement element = driver.findElement(By.id("gsr"));
		return element;
	}
}