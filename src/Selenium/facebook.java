package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("9492205127");
		driver.findElement(By.id("pass")).sendKeys("sanju26@A");
		driver.findElement(By.name("login")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(50000);
		driver.quit();
	}

}
