import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlerts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//open URL
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		//locate the confirmation alert button
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();//accept the pop up message
		//driver.switchTo().alert().dismiss();
	}

}
