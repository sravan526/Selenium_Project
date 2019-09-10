package Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class percnt_calculator {
	private static WebDriver driver=null;

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.calculator.net/");
		driver.manage().window().maximize();
		//use Page object library now
		perc_calc.math_calc(driver).click();
		perc_calc.per_calc(driver).click();
		perc_calc.txt_num_1(driver).clear();
		perc_calc.txt_num_1(driver).sendKeys("100");
		perc_calc.txt_num_2(driver).clear();
		perc_calc.txt_num_2(driver).sendKeys("500");
		perc_calc.button(driver).click();
		String result = perc_calc.result(driver).getText();
		if(result.equals("500"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test failed");
		}
		driver.quit();
	}

}
