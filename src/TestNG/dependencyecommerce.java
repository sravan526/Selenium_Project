package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dependencyecommerce {
	WebDriver d;
	 
		 
	  @Test(dependsOnMethods={"flipkart"})
	  public void paytm() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		  d = new ChromeDriver();
		  d.manage().window().maximize();
		  d.get("https://paytm.com/"); 
		  d.quit();
	  }
	  @Test(dependsOnMethods={"shop"})
	  public void flipkart() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		  d = new ChromeDriver();
		  d.manage().window().maximize();
		  d.get("https://www.flipkart.com/"); 
		  d.quit();
	  }
	  @Test(dependsOnMethods={"snapdeal"})
	  public void shop() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
		   d.manage().window().maximize();
		   d.get("https://www.amazon.in/ref=nav_logo/262-0259970-2310954"); 
		   d.quit();
	  }
	  @Test
	  public void snapdeal() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
		   d.manage().window().maximize();
		   d.get("https://www.snapdeal.com/"); 
		   d.quit();
	  }
	  

	 
	}
