package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select dropdown = new Select(driver.findElement(By.id("day")));
		dropdown.selectByIndex(22);
		Thread.sleep(1000);
		Select dropdown1 = new Select(driver.findElement(By.id("month")));
		dropdown1.selectByValue("9");
		Thread.sleep(1000);
		Select dropdown2 = new Select(driver.findElement(By.id("year")));
		dropdown2.selectByVisibleText("1991");
		Thread.sleep(1000);
		System.out.println("the result is IsSelected"+ driver.findElement(By.id("day")).isSelected());
		//System.out.println("the result is IsEnabled"+ driver.findElement(By.id("Month")).isEnabled());
		//System.out.println("the result is IsDisplayed"+ driver.findElement(By.id("year")).isDisplayed());
		driver.quit();
	
		

	}

}
