package TestNG;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GroupsSocialMedia {
	WebDriver d;

  @Test(groups={"smoke"})
  public void facebook() 
  {
	  System.setProperty("webdriver.chrome.driver","F:\\java soft\\chromedriver.exe");
		 d = new ChromeDriver();
		 d.manage().window().maximize();
	     d.get("https://www.facebook.com/login/");
	     d.quit();
  }
  @Test(groups={"regression"})
  public void twitter() 
  {
	  System.setProperty("webdriver.chrome.driver","F:\\java soft\\chromedriver.exe");
		 d = new ChromeDriver();
		 d.manage().window().maximize();
	     d.get("https://www.facebook.com/login/https://twitter.com/login");
	     d.quit();
  }
  @Test(groups={"integration"})
  public void instagram() 
  {
	  System.setProperty("webdriver.chrome.driver","F:\\java soft\\chromedriver.exe");
		 d = new ChromeDriver();
		 d.manage().window().maximize();
	     d.get("https://www.instagram.com/?hl=en");
	     d.quit();
  }
 

  
  }

