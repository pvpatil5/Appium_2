package parallel;

import java.net.URL;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Practtice1 
{


	AndroidDriver driver;

	@Test
	@Parameters({"deviceName","platformVersion","UDID","port"})
	public void tc_(String deviceName, String platformVersion, String UDID, String port ) throws Throwable 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName",deviceName );
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", platformVersion);
		cap.setCapability("UDID", UDID);
		cap.setCapability("appPackage", "com.mrvoonik.android");
		cap.setCapability("appActivity", ".splashsection.Splash");
		URL url = new URL("http://localhost:"+port+"/wd/hub");
		driver	 =  new AndroidDriver(url,cap);

	





	}
}
