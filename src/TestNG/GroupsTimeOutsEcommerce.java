package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupsTimeOutsEcommerce {
	WebDriver d;
	 
	 
	  @Test(groups={"smoke"},timeOut=30000)
	  public void paytm() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://paytm.com/"); 
		     d.quit();
	  }
	  @Test(groups={"regression"},timeOut=40000)
	  public void flipkart() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://www.flipkart.com/"); 
		     d.quit();
	  }
	  @Test(groups={"smoke"},timeOut=5000)
	  public void shop() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://www.shop.com/"); 
		     d.quit();
	  }
	  @Test(groups={"integration"},timeOut=2000)
	  public void snapdeal() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://www.snapdeal.com/"); 
		     d.quit();
	  }
}