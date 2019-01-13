import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import sun.nio.ch.WindowsAsynchronousChannelProvider;

public class HandlingHTTPCertificates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SSL Certificates
		
		
		//Desired capabilities =
		//general chrome profile
		DesiredCapabilities ch= DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts(); ==> another way to  accept SSL certificate
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		
		//Belows to your local browser
		ChromeOptions c =new ChromeOptions();
		c.merge(ch);
		WebDriver driver = new ChromeDriver(c);
		
		
		
		
	
		
		
	}

}
