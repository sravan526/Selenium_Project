package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Selenium Softares\\chromedriver.exe\\" );
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Get page Title and Print
		String title = driver.getTitle();
		System.out.println("the Title is"+title);
		//Print selected value and text
		Select s= new Select(driver.findElement(By.xpath("//select[@id='day']")));
		s.selectByVisibleText("15");
		WebElement option = s.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);
	    //Print all the values in dropdown with Text
		List<WebElement> count = s.getOptions();
		System.out.println(count.size());
		
		int iSize = count.size();

		for(int i =0; i<iSize ; i++){
			String sValue = count.get(i).getText();
			System.out.println(sValue);
			}
		
//		Thread.sleep(1000);
//		Select e= new Select(driver.findElement(By.xpath("//select[@id='month']")));
//		e.selectByVisibleText("Jul");
//		Thread.sleep(1000);
//		Select f= new Select(driver.findElement(By.xpath("//select[@id='year']")));
//		f.selectByVisibleText("1996");
//		Thread.sleep(1000);
//		//driver.findElement(By.xpath("//input[@id='u_0_9']")).click();
//		
		
		
		driver.close();
	}

}
