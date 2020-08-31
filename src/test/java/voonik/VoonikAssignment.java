package voonik;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class VoonikAssignment
{
	@Test
	public void addtocart() throws Throwable
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("appPackage", "com.mrvoonik.android");
		cap.setCapability("appActivity", ".splashsection.Splash");
		cap.setCapability("noReset", true);//to use app without resetting it in automation script
		URL url = new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver =  new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Drawer Open']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='T-shirts']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String selectTitle =driver.findElementByXPath("//android.widget.TextView[@text='Black Printed Full Sleeve Round Neck T-shirt']").getText();

		driver.findElementByXPath("//android.widget.TextView[@text='Black Printed Full Sleeve Round Neck T-shirt']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Size : M']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.RelativeLayout[@resource-id='com.mrvoonik.android:id/main']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String cartTitle = driver.findElementByXPath("//android.widget.TextView[@resource-id='com.mrvoonik.android:id/productname']").getText();

		if(selectTitle.equals(cartTitle))
		{
			System.out.println("succesfuully added");
		}
		else
		{
			System.out.println("invalid ");
		}

	}
}
