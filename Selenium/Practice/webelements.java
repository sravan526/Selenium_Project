package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class webelements {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Softares\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.manage().window().maximize();
		
		//String result=driver.getTitle();
		//System.out.println("the Title is "+result);
		//
		
		//Compare expected and actual values
		String expectedTitle = "Sign in or Register | eBay";
		String actualTitle = driver.getTitle();
		try {
		Assert.assertEquals(expectedTitle,actualTitle);
		System.out.println("Test case passed");
		}catch (Throwable e) {
			System.out.println("Testcase failed");
		}
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("sravan");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sanju26@SSSSS");
		driver.findElement(By.xpath("//button[@id='ppaFormSbtBtn']")).click();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.getCurrentUrl();
		
		driver.quit();

	}

}
