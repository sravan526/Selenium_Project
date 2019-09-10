package Selenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Softares\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Maximize the browser
		driver.manage().deleteAllCookies();//Delete all cookies
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		driver.navigate().to("https://www.amazon.com");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		
		String URL= driver.getCurrentUrl();
		System.out.println("the current URL is"+URL);
		
		driver.navigate().refresh();
		
		driver.close();

	}

}
