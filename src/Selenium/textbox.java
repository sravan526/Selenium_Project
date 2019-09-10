package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class textbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("9492205127");
		String resul =driver.findElement(By.id("email")).getAttribute("value");
		System.out.println("the vaiue is " +resul);
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("sanju26@A");
		Thread.sleep(1000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(1000);
		String result = driver.getCurrentUrl();
		System.out.println("the result is" +result);
		String sanju = driver.getTitle();
		System.out.println("the result is " +sanju);
		driver.quit();

	}

}
