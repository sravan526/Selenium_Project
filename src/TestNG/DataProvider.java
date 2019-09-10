package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider 
{
	private static WebDriver d;
	@org.testng.annotations.DataProvider(name="Authentication")
	public static Object[][] Credentials()
{
		return new Object[][] { {"muthasrinu","9247355289"},{"username","652222552"}};
}

	
  @Test(dataProvider = "Authentication")
  public void test(String susername, String spwd) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","F:\\java soft\\chromedriver.exe");
		 d = new ChromeDriver();
	  d.manage().window().maximize();
	  d.get("https://www.google.co.in");
	  d.findElement(By.linkText("Gmail")).click();
	  d.findElement(By.id("Email")).sendKeys(susername);
	  Thread.sleep(5000);
	  d.findElement(By.id("next")).click();
	  Thread.sleep(4000);
	  d.findElement(By.id("Passwd")).sendKeys(spwd);
	  d.quit();
  }
}
  