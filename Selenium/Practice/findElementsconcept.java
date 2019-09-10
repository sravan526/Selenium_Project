package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsconcept {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Softares\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Maximize the browser
		driver.manage().deleteAllCookies();//Delete all cookies
		driver.get("https://www.facebook.com/");
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links"+links.size());
		
		for(int i=0;i<links.size();i=i++) 
		{
			//System.out.println("The link name is"+i,links.size(),get(i),);
			
			String linktext= links.get(i).getText();
			System.out.println(linktext);
		}
		
		
		
		driver.quit();

	}

}
