package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Ecommerce
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
  public void Paytm() 
  {
	  driver.get("https://paytm.com/?gclid=CPHOsej78tACFQkjaAodggAL1w");
  }
  @Test
  public void Amazon()
  {
	  driver.get("https://www.amazon.in");
  }
  @Test
  public void Flipkart()
  {
	  driver.get("https://www.flipkart.com/");
  }
  @Test
  public void Snapdeal()
  {
	  driver.get("https://www.snapdeal.com/?utm_source=earth_brand&utm_campaign=snapdeal&utm_medium=brand%20term,1t1&utm_content=homepage&utm_term=e,snapdeal&s_kwcid=AL!660!3!165037479516!e!!g!!snapdeal&ef_id=WDbTlQAABFRCbqsg:20161214054411:s");
  }

  @AfterMethod
  public void afterMethod()
  {
	  driver.quit();
  }

}
