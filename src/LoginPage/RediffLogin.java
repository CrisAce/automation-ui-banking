package LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.rediff.com/");
		//click on the sign in button
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		
		//insert  Username and Password and click Go
		driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("hello");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input#password")).sendKeys("1234");
		//click go button
		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
		

		
	}

}
