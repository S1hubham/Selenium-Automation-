package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestHotelAppTest 
{
	public static WebDriver driver;
  @Test
  public void TestHotelApp() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("http://adactinHotelApp.com");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Opening Chrome Window");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
	  System.out.println("Closing Chrome browser");
  }

}
