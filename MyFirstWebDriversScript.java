package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class MyFirstWebDriversScript 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://adactinhotelapp.com");
		//driver.quit();
		
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().minimize();
		driver.navigate().to("https://www.google.co.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(1000000,TimeUnit.SECONDS);
	}

}
