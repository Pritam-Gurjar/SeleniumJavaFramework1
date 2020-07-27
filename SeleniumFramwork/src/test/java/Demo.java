import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo 
{

	public static void main(String[] args) 
	{
		
		System.out.println("before launching browser");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumFramwork\\drivers\\chromedriver.exe");
		
		WebDriverManager.chromedriver().browserVersion("83.0.4103.39").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		

        System.out.println("browser launching successfully done!!!"); 
		driver.close();
		driver.quit();
		
	}
}

