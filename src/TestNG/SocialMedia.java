package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SocialMedia
{ 
	WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() 
	{
		System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
	 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	  }
  @Test
  public void Facebook()
  {
	  driver.get("https://www.facebook.com/");
  }
  @Test
  public void Twitter()
  {
	  driver.get("https://twitter.com/login");
  }
  @Test
  public void Instagram()
  {
	  driver.get("https://www.instagram.com/accounts/login/");
  }
  

  @AfterMethod
  public void afterMethod()
  {
	  driver.quit();
  }

}
