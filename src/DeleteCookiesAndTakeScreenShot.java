import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.remote.ScreenshotException;


public class DeleteCookiesAndTakeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//delete all cookies
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("bla bla"); //nominal cookie
		
		
		//kill process
		WindowsUtils.killByName("excel.exe");
		
		
		driver.get("http://www.nba.com");
		
		
		//take screenshot 
		/* you will have to import manually package from apache.org: org.apache.commons.io.FileUtils*/
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C://screenshot.png"));
		
		
		
		
	}

}
