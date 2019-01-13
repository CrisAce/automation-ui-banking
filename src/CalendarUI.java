import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		//we need to click on March 21
		
		driver.findElement(By.id("travel_date")).click();
		
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("March 2019")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
	
		
		
		//grab common attribute//put into list
		List<WebElement> dates = driver.findElements(By.cssSelector(".day"));
		
		
		int count = dates.size();
		
		for ( int i=0;i<count;i++) {
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if ( text.equalsIgnoreCase("23")) {
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}
		

	}

}
