package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class multipleselection {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.id("ContentHolder_lbFeatures_LBI2T1")).click();
		driver.findElement(By.id("ContentHolder_lbFeatures_LBI4T1")).click();
		driver.findElement(By.id("ContentHolder_lbFeatures_LBI6T1")).click();
		Thread.sleep(5000);
		Actions builder = new Actions(driver);
		WebElement select = driver.findElement(By.id("ContentHolder_lbFeatures_LBT"));
		List<WebElement> options = select.findElements(By.tagName("td"));
		System.out.println(options.size());
		Action multipleSelect = builder.keyDown(Keys.CONTROL)
				.click(options.get(2))
				.click(options.get(4))
				.click(options.get(6))
				.build();
		multipleSelect.perform();
		Thread.sleep(5000);
		
		driver.quit();

	}

}
