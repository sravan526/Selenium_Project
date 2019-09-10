package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Mail
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
  public void gmail()
  {
	  driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&osid=1&service=mail&ltmpl=default&rm=false#identifier");
	  
  }
  @Test
  public void yahoo()
  {
	  driver.get("https://login.yahoo.com/");
  }
  @Test
  public void rediff()
  {
	  driver.get("http://www.rediffmail.com/cgi-bin/login.cgi");
  }
  

  @AfterMethod
  public void afterMethod()
  {
	  driver.quit();
  }

}
