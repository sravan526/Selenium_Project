package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findalllinks1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on the page is "+links.size());
		for (int i=1;i<=links.size();i=i+1)
		{
			String lin= links.get(i).getText();
			System.out.println(lin);
		}
		
		driver.quit();

	}

}
