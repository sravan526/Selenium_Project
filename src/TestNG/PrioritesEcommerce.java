package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrioritesEcommerce {
	WebDriver d;
	 
	 
	  @Test(groups={"smoke"},priority=0)
	  public void paytm() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://paytm.com/"); 
		     d.quit();
	  }
	  @Test(groups={"regression"},priority=1)
	  public void flipkart() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://www.flipkart.com/"); 
		     d.quit();
	  }
	  @Test(groups={"smoke"},priority=2)
	  public void shop() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://www.shop.com/"); 
		     d.quit();
	  }
	  @Test(groups={"integration"},priority=3)
	  public void snapdeal() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://www.snapdeal.com/"); 
		     d.quit();
	  }
}
