import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Scope: Enter the letter BENG
//Verify if Airport option is displayed in the suggestive box


public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.ksrtc.in/oprs-web/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		
		//javascript DOM can extract hidden elements
		//because Selenium cannot identify hidden elements - (ajax implementation)
		//investigate the properties of object if it have any hidden text 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script ="return document.getElementById(\"fromPlaceName\").value;";
		
		String text = (String) js.executeScript(script);
		
		
		
		while(!text.equalsIgnoreCase("BENGALURU INTERNATIO AIPORT")) {
			
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			//break;
			
		}
		
	}

}
