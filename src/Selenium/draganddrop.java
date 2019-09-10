package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\java soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://keenthemes.com/preview/metronic/theme/admin_1/ui_tree.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement From = driver.findElement(By.xpath("//*[@id=\"j2_7_anchor\"]"));
		WebElement To = driver.findElement(By.xpath("//*[@id=\"j3_2_anchor\"]"));
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release().build();
		dragAndDrop.perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"j3_2_anchor\"]")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
