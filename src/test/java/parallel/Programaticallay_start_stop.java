package parallel;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Programaticallay_start_stop {

	AppiumDriverLocalService service;
	AppiumDriver<MobileElement> driver;
	public void setUP()
	{
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		System.out.println("Server is started");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("appPackage", "com.mrvoonik.android");
		cap.setCapability("appActivity", ".splashsection.Splash");
		
		driver = new AndroidDriver<MobileElement>(service.getUrl(), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void validateText()
	{
		System.out.println("App launched");
	}

	public void tearDown()
	{
		driver.quit();
		service.stop();
	}

	
	public static void main(String[] args) 
	{
		Programaticallay_start_stop p1 = new Programaticallay_start_stop();
		p1.setUP();
		p1.validateText();
		p1.tearDown();

	}


}
