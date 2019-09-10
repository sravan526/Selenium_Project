package Java;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cast {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.castleconnolly.com/");
		driver.manage().window().maximize();
		 Thread.sleep(5000);
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("html/body/div[2]/div[1]/div[2]/div/div[2]/a[1]"));
		 action.moveToElement(we).build().perform();
		 driver.findElement(By.xpath(".//*[@id='m1']/a[4]")).click();
		 Thread.sleep(5000);
		 driver.quit();
		

	}

}
