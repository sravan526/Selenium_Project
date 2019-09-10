package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraganddropConcept {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Softares\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Maximize the browser
		driver.manage().deleteAllCookies();//Delete all cookies
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0); //Switch to frame if it is present
		
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).moveToElement
		(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
		
		//action,cickandhold,movetoelement,release,build,perform.
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
