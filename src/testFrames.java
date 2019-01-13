import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testFrames {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://jqueryui.com/droppable/");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size()); //how many frame are in this webpage
		driver.switchTo().frame(0); //switch frame by index
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		WebElement box1 = driver.findElement(By.id("draggable"));
		WebElement box2 = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(box1, box2).build().perform(); //drag and drop
		driver.switchTo().defaultContent(); //came back to initial state

	}

}
