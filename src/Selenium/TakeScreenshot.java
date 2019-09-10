package Selenium;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Softares\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// Maximize the browser
		driver.manage().deleteAllCookies();// Delete all cookies
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);

		driver.get("http://www.google.com");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(src, newFile("F:\\Sourcecode\\Selenium_Project\\src\\Selenium\\google.png"));

		Thread.sleep(1000);

		driver.quit();
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// driver.get("http://www.google.com");
		// File src1= ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(src,newFile("F:\\Sourcecode\\Selenium_Project\\src\\Selenium\\google.png"));

	}

}
