package Exercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.ebay.com");
		
		//count of the links in the ENTIRE Page
		System.out.println("Links in whole page");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count the links in the FOOTER section of the page
		WebElement footer = driver.findElement(By.xpath("//*[@id='gf-BIG']")); 
		System.out.println("Links in footer section");
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//count the links in the FOOTER for section Sell and Tools & Apps only
		WebElement SellToolsAppsOnly = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println("Links in Sell Tools and Apps");
		System.out.println(SellToolsAppsOnly.findElements(By.tagName("a")).size());	
		//Print the links in the Sell Tool&Apps section
		System.out.println("print the links in SellToolsAppsOnly");
		for (int i=0;i<SellToolsAppsOnly.findElements(By.tagName("a")).size(); i++)
		{
		System.out.println(SellToolsAppsOnly.findElements(By.tagName("a")).get(i).getText());	
		}
		
		
	}

}
