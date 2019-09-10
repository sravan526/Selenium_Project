package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Commands 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Selenium Softares\\chromedriver.exe\\");
		WebDriver  driver= new ChromeDriver();
		String url="https://shop.demoqa.com/";
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("the url is "+url);
		String title= driver.getTitle();
		System.out.println("the title is "+title);
		int titlelength =driver.getTitle().length();
		System.out.println("the title length is"+titlelength);
		String pageurl=driver.getCurrentUrl();
		System.out.println("the current url is"+pageurl);
		if (pageurl.equals(url)) 
		{
			System.out.println("verification is successful");
		}
		else {
			System.out.println("verification is falied");
		}
		String pagesource= driver.getPageSource();
		System.out.println("the page source is " +pagesource);
		int pagelength=driver.getPageSource().length();
		System.out.println("the page source"+pagelength);
		driver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[1]/a")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
