package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("u_0_h")).click();
		System.out.println("The output of the IsSeleted" +driver.findElement(By.id("u_0_h")).isSelected());
		Thread.sleep(1000);
		System.out.println("the output is is enabled" +driver.findElement(By.id("u_0_h")).isEnabled());
		Thread.sleep(1000);
		System.out.println("the out put is displayed " +driver.findElement(By.id("u_0_h")).isDisplayed());
		Thread.sleep(1000);
		driver.close();
		

	}

}
