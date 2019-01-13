import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reCaptcha {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.google.com/recaptcha/api2/demo");
		int number = findFramenumber(driver, By.xpath("//div[@class='recaptcha-checkbox-checkmark']"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();
		driver.switchTo().defaultContent();

		int number1 = findFramenumber(driver, By.xpath("//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();

	}

	public static int findFramenumber(WebDriver driver, By by) {

		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();
		for (i = 0; i < framecount; i++) {

			driver.switchTo().frame(i);

			int count = driver.findElements(by).size();

			if (count > 0) {
				break;
			} else {
				System.out.println("continue looping");
			}

		}

		driver.switchTo().defaultContent();
		return i;

	}

}
