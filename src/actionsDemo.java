import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.amazon.com/");
		
		WebElement AccountandList = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		Actions a = new Actions(driver);
		//moves to a specific element
		a.moveToElement(AccountandList).contextClick().build().perform(); //right click = contextClick()
		//insert in capital letters
		a.moveToElement(SearchBox).click().keyDown(Keys.SHIFT).sendKeys("Iphone 8").build().perform();
		
	}

}
