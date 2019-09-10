package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersName 
{
	WebDriver d;
	
	@Parameters({"Username","Pwd"})
	@Test
  
  public void GmailLogin(String username,String pwd) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		 d = new ChromeDriver();
	  d.manage().window().maximize();
	  d.manage().deleteAllCookies();
	  d.get("https://www.google.co.in/?gfe_rd=cr&ei=pipRWOvmD7DT8gf9gIXQCw");
	  d.findElement(By.linkText("Gmail")).click();
	  d.findElement(By.id("Email")).sendKeys(username);
	  Thread.sleep(5000);
	  d.findElement(By.id("next")).click();
	  Thread.sleep(4000);
	  d.findElement(By.id("Passwd")).sendKeys(pwd);
	  d.quit();
	  
	  
  }
}
