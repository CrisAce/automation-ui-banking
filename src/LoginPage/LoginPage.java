package LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

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
	/*	WebElement toDropdown =driver.findElement(By.xpath("//div[@class='selectionField']/div[2]/img"));
		toDropdown.click();*/
		
		
		//fill the User in quick search
		
		driver.findElement(By.xpath("//div[@class='autoCompleteFieldContainer']/input")).sendKeys("demo");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='autoCompleteFieldContainer']/input")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//div[@class='autoCompleteFieldContainer']/input")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//div[@class='autoCompleteFieldContainer']/input")).sendKeys(Keys.DOWN);
		
		WebElement userQckSrch = driver.findElement(By.xpath("//div[@class='autoCompleteFieldContainer']/input"));
		System.out.println(userQckSrch.getText());
		
		
		//javascript DOM can extract hidden elements
		//because Selenium cannot identify hidden elements - (ajax implementation)
		//investigate the properties of object if it have any hidden text 
		
		//JavascriptExecutor
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		((JavascriptExecutor) driver).executeScript("arguments[0].className='autoCompleteFieldContainer']/input'",userQckSrch);
		
		
		//fill the amount and press Submit button
		
		/*driver.findElement(By.cssSelector("input.inputField.large.rightAligned")).sendKeys("200");
		driver.findElement(By.cssSelector("textarea.inputField.full")).sendKeys("This is just a text");
		*/
		Thread.sleep(2000);
		/*
		System.out.println(driver.findElement(By.xpath("//button[@type='button']")).isDisplayed());
		driver.findElement(By.xpath("//div[@class='actionButtonText']")).click();
		
		
		
		String PaymentReviewMessageExpected = "Please, review the payment below and click the confirm button";
		
		
		WebElement banner =driver.findElement(By.cssSelector("div.notificationText.notificationText-singleLine"));
		
		
		if (banner.isDisplayed()) {
			
			System.out.println("test valid " + banner.getText());
		}
		*/
	
			}
		
		
		
			
		}

		

		



