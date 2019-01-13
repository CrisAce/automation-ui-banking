import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//open URL
		driver.get("http://spicejet.com/");
		
		//Locate the satic dropdown and select element
		WebElement staticDropdown = driver.findElement(By.cssSelector("select#ctl00_mainContent_ddl_Adult"));
		
		Select s = new Select(staticDropdown);
		//s.selectByValue("3");
		//s.selectByIndex(1);
		s.selectByVisibleText("4");
		
		//locate the dynamic dropdown and select element
		
		/*WebElement dynamicDropdown = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT"));
		dynamicDropdown.click();
		
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();		*/
		
		//Checkbox
		/*System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected()); //true/false
		*/
		
		
		//Radio Button
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		//How may radio button are? findElementsss!
		
	   int count =driver.findElements(By.xpath("//input[@type='radio']")).size();
	   
	   for (int i =0; i < count; i++) {
		   
		String text =   driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value"); 
		if(text.equals("OneWay")) {
			
			driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			
		}
		
	   }
		

	}

}
