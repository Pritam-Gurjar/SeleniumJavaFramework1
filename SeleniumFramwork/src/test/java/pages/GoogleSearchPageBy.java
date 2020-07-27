package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageBy 
{
	WebDriver driver = null;
	
	public GoogleSearchPageBy(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By googleTextBox = By.name("q");
	By googleSearchButton = By.name("btnK");
	
	
	public void passTextIntoTextBox(String text) 
	{
		driver.findElement(googleTextBox).sendKeys(text);
	}
	
	public void clickOnButton()
	{
		driver.findElement(googleSearchButton).click();
	}
}
