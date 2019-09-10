package Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploader_popup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Softares\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://html.com/input-type-file/");		
		driver.manage().window().maximize();
		driver.findElement(By.className("pm-cta pm-allow")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("F:\\Selenium\\Selenium Softares\\geckodriver-master.zip\\");
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
