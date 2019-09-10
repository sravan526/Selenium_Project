package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excludinggroupsecommerce {
	WebDriver d;
	 
		 
	  @Test(groups={"smoke"})
	  public void paytm() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
		  d.manage().window().maximize();
		  d.get("https://paytm.com/"); 
		  d.quit();
	  }
	  @Test(groups={"regression"})
	  public void flipkart() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
		  d.manage().window().maximize();
		  d.get("https://www.flipkart.com/"); 
		  d.quit();
	  }
	  @Test(groups={"smoke"})
	  public void shop() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
		   d.manage().window().maximize();
		   d.get("https://www.amazon.in/ref=nav_logo/262-0259970-2310954"); 
		   d.quit();
	  }
	  @Test(groups={"integration"})
	  public void snapdeal() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
		   d.manage().window().maximize();
		   d.get("https://www.snapdeal.com/"); 
		   d.quit();
	  }
	  

	 
	}
