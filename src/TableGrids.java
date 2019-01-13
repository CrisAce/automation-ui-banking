import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrids {

	public static void main(String[] args) throws InterruptedException {
		
		int sum=0;
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/17860/rsa-vs-aus-2nd-test-australia-tour-of-south-africa-2018");
		
		Thread.sleep(9000);
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		Thread.sleep(9000);
		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] ")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for (int i =0; i < count-2; i++) {
		String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueinteger = Integer.parseInt(value);
			sum = sum + valueinteger;
		}
		
		//System.out.println(sum);
		
		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		//transform from String to int!!
		int extrasValue = Integer.parseInt(Extras);
		int totalSumValue = sum + extrasValue;
		
		System.out.println(totalSumValue);
		String totalValue = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		
		System.out.println(totalValue);
		int total = Integer.parseInt(totalValue);
		
		if (totalSumValue==total) {
			System.out.println("Values match!");
		}
		else {
			System.out.println("Values don t match!");
		}

	}

}
