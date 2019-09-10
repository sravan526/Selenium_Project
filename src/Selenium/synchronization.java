package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//thread.sleep synchronization
		Thread.sleep(1000);
		//Explicit waits
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement DynamicElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("sanju")));
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Fluent wait
		driver.quit();
	
		

	}

}
