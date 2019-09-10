package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovementconcept {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Softares\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Maximize the browser
		driver.manage().deleteAllCookies();//Delete all cookies
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='header-addons']/ul/li[6]/a")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("The title is" +title);
		
		driver.close();
		

	}

}
