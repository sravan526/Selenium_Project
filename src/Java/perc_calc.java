package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class perc_calc //class Name
{
	private static WebElement element = null;
	//math calculator link
	public static WebElement math_calc(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='hcalc']/table/tbody/tr/td[2]/div[3]/a"));
		return element;
	}
	//percentage calc link
	public static WebElement per_calc(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='content']/ul[1]/li[3]/a"));
		return element;
	}
	//number 1 text box
	public static WebElement txt_num_1(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='cpar1']"));
		return element;
	}
	//nuber 2 text box
	public static WebElement txt_num_2(WebDriver driver)
	{
		element =driver.findElement(By.xpath(".//*[@id='cpar2']"));
		return element;
	}
	
	//calculate button
	public static WebElement button(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]"));
		return element;
	}
	//result 
		public static WebElement result(WebDriver driver)
		{
			element=driver.findElement(By.xpath(".//*[@id='content']/p[2]/font/b"));
			return element;
		}
	}


