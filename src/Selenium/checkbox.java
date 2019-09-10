package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Selenium Softares\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		driver.getTitle();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
		Thread.sleep(1000);
		System.out.println("the output is selected" +driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).isSelected());
		Thread.sleep(1000);
		String result =driver.getTitle();
		System.out.println("the title is" +result);
		driver.quit();

	}

}
