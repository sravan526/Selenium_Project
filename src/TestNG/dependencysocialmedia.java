package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class dependencysocialmedia {
	WebDriver d;

  @Test
  public void facebook() 
  {
	  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		 d = new ChromeDriver();
		 d.manage().window().maximize();
	     d.get("https://www.facebook.com/login/");
	     d.quit();
  }
  @Test(dependsOnMethods={"facebook"})
  public void twitter() 
  {
	  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		 d = new ChromeDriver();
		 d.manage().window().maximize();
	     d.get("https://www.facebook.com/login/https://twitter.com/login");
	     d.quit();
  }
  @Test(dependsOnMethods={"twitter"})
  public void instagram() 
  {
	  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		 d = new ChromeDriver();
		 d.manage().window().maximize();
	     d.get("https://www.instagram.com/?hl=en");
	     d.quit();
  }
 

  
  }

