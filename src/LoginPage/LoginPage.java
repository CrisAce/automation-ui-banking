package LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.cyclos.org/#login");

		String getUrl = driver.getCurrentUrl();
		System.out.println(getUrl);

		// Click on Username:

		driver.findElement(By.cssSelector("input.inputField:nth-child(3)")).sendKeys("demo");
		driver.findElement(By.cssSelector(".inputField.passwordField.authenticationInput.medium")).sendKeys("1234");
		
		//div[@class='loginFormContainer']/div/input - relative xpath
		//div/div/div/div/div/input ->absolute xpath
		
		//.inputField.passwordField.authenticationInput.medium
		//input.inputField:nth-child(1)
		driver.findElement(By.className("actionButtonText")).click();
		
		//go to Home and click on Pay to user icon
		driver.findElement(By.xpath("//div[@class='dashboardContainer']/div/a[3]")).click();
		
		//fill the mandatory fileds with valid data and click on Submit button
		

		WebElement toDropdown =driver.findElement(By.xpath("//div[@class='selectionField']/div[2]/img"));
		toDropdown.click();
		
		
			
		}

		

		

	}


