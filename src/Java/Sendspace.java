package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendspace {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.sendspace.com/");
		driver.findElement(By.xpath(".//*[@id='upload_file']")).click();
			
		driver.findElement(By.xpath("//input[@id='files']")).sendKeys("C:\\Users\\sravan kumr annam\\Pictures\\sanju\\sanju.jpg");  
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='Upload']")).click();

	}

}
