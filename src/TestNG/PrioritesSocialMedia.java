package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrioritesSocialMedia {
	WebDriver d;

	  @Test(groups={"smoke"},priority=2)
	  public void facebook() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://www.facebook.com/login/");
		     d.quit();
	  }
	  @Test(groups={"regression"},priority=1)
	  public void twitter() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://www.facebook.com/login/https://twitter.com/login");
		     d.quit();
	  }
	  @Test(groups={"integration"},priority=0)
	  public void instagram() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://www.instagram.com/?hl=en");
		     d.quit();
	  }
	 

	  
	  }