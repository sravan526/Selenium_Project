package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrioritiesMail {
	WebDriver d;
	
	  @Test(groups={"smoke"},priority=1)
	  public void gmail() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1");
		     d.quit();
	  }
	  @Test(groups={"regression"},priority=2)
	  public void yahoo() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("https://in.yahoo.com/");
		     d.quit();
	  }
	  @Test(groups={"integration"},priority=0)
	  public void rediff() 
	  {
		  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
		     d.get("http://www.rediffmail.com/cgi-bin/login.cgi");
		     d.quit();
	  }
	  

	  

	}
