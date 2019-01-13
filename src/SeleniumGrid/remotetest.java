package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class remotetest {

	public static void main(String[] args) throws MalformedURLException {

		
		//DesiredCapabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.6.150:4444/wd/hub"),dc);
		driver.get("http://nba.com");
		
		
		
	}

}
