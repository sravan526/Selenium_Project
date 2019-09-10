package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupsTimeOutsSocialMedia {
	WebDriver d;
	 @Test(groups={"smoke"})
	  public void facebook() 
	  {
		 System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://www.facebook.com/login/");
		     d.quit();
	  }

	  @Test(groups={"smoke"},timeOut=15000)
	  public void twitter() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://www.facebook.com/login/");
		     d.quit();
	  }
	  @Test(groups={"regression"},timeOut=15000)
	  public void shop()
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://www.facebook.com/login/https://twitter.com/login");
		     d.quit();
	  }
	  @Test(groups={"integration"},timeOut=8000)
	  public void instagram() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://www.instagram.com/?hl=en");
		     d.quit();
	  }
	 

	  
	  }
