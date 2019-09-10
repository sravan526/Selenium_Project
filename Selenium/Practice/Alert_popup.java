package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Selenium Softares\\chromedriver.exe\\" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//Validation Point
		String text = alert.getText();
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("correct alert");
		}
		else
		{
			System.out.println("incorrect alert");
		}
		alert.accept();
		//alert.dismiss();
		
		driver.close();
		
		
		
		

	}

}
