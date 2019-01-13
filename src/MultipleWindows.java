import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://accounts.google.com/signup");
		
		driver.findElement(By.xpath("//div[@class='clearfix']/div/p/a")).click();
		
		System.out.println(driver.getTitle());
		Set<String> ids =driver.getWindowHandles();
		Iterator<String> it =ids.iterator();
		String parent = it.next();
		String chiledid = it.next();
		driver.switchTo().window(chiledid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
		
	}

}
