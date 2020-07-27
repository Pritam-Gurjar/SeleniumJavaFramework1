package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo 
{
	public static void main(String[] args) throws Exception 
	{
		test();
	}
	public static void test() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:/Automation/SeleniumFramwork/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tinyupload.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("E:\\Automation\\SeleniumFramwork\\FileUploadScript.exe");
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		System.out.println("This Test Completed");
	}

}
