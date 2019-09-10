package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_handling {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Softares\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Maximize the browser
		driver.manage().deleteAllCookies();//Delete all cookies
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		driver.get("http://5elementslearning.com/iframe-practice-page.php");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.className("icon-align-justify")).click();
		
		driver.quit();
		
		
	}

}
