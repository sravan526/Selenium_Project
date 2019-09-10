package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findlinks {
	 static int linkcount=0,textcount=0;
	 private static int btncount;
	 private static int divcount;
	 private static int ddncount;
	 private static int imgcount;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://paytm.com/");
		d.manage().window().maximize();
		//link
		List<WebElement> link= d.findElements(By.tagName("a"));
		
		System.out.println("total link"+link.size());
		/*for(WebElement a:link)
		{
			if(a.isEnabled());
			linkcount++;
		}*/
		System.out.println("enabled link"+linkcount);
		//textbox
		List<WebElement> textbox= d.findElements(By.xpath(".//input[@type='text']"));
		System.out.println("total textbox"+textbox.size());
		for(WebElement b:textbox)
		{
			if(b.isEnabled());
			textcount++;
		}
		System.out.println("enabled textbox"+textcount);
		
		
		List<WebElement> buttonbox= d.findElements(By.tagName("button"));
		System.out.println("total buttonbox"+buttonbox.size());
		for(WebElement c:buttonbox)
		{
			if(c.isEnabled());
			btncount++;
		}
		System.out.println("enabled buttonbox"+btncount);
		//div
		List<WebElement> div= d.findElements(By.tagName("div"));
		System.out.println("total div"+div.size());
		for(WebElement d1:div)
		{
			if(d1.isEnabled());
			divcount++;
		}
		System.out.println("enabled div"+divcount);
		//dropdown
		List<WebElement> dropdn= d.findElements(By.tagName("select"));
		System.out.println("total dropdn"+dropdn.size());
		for(WebElement ddn:div)
		{
			if(ddn.isEnabled());
			ddncount++;
		}
		System.out.println("enabled dropdn"+ddncount);
		//images
		List<WebElement> imgs= d.findElements(By.tagName("img"));
		System.out.println("total images"+imgs.size());
		for(WebElement i:div)
		{
			if(i.isEnabled());
			imgcount++;
		}
		System.out.println("enabled imgcount"+imgcount);
	     d.quit();
		}

	

	}


