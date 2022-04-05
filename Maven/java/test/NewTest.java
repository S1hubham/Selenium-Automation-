package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest 
{
	public static WebDriver driver;
  @Test
  public void f() 
  {
	  WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("Shubham11");
		
		driver.findElement(By.id("password")).sendKeys("Shweta234");
		driver.findElement(By.id("login")).click();
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("http://adactinHotelApp.com");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}