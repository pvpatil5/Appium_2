package pac1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Time 
{
	DesiredCapabilities cap = new DesiredCapabilities();
	@Test
	public void dropdown() throws Throwable 
	{
		//cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =  new AndroidDriver(url,cap);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement element=driver.findElementByAccessibilityId("Views");

		driver.tap(1, element, 500);

		WebElement DateWidgets=driver.findElementByAccessibilityId("Date Widgets");

		driver.tap(1, DateWidgets, 500);

		driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@content-desc='2']").click();
		
		





	}
}
