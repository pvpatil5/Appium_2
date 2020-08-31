package voonik;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class VoonikAssignment1
{
	public static void main(String[] args) throws Throwable 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
		cap.setCapability(MobileCapabilityType.UDID, "d6c768cf9804");
		cap.setCapability("appPackage", "com.mrvoonik.android");
		cap.setCapability("appActivity", ".splashsection.Splash");

		cap.setCapability("noReset", true);//to use app without resetting it in automation script
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =  new AndroidDriver(url,cap);
		Dimension size=	driver.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getWidth();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement handBurger=	driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Drawer Open']");
		driver.tap(1, handBurger, 5);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement tshirt = driver.findElementByXPath("//android.widget.TextView[@text='T-shirts']");
		driver.tap(1, tshirt, 5);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String selectTitle =driver.findElementByXPath("//android.widget.TextView[@text='Black Printed Full Sleeve Round Neck T-shirt']").getText();

		WebElement select =driver.findElementByXPath("//android.widget.TextView[@text='Black Printed Full Sleeve Round Neck T-shirt']");
		driver.tap(1, select, 5);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		int startx = (int)(width*0.65);
		int endx=(width*0);
		int starty= (int)(height*0.85);
		int endy = (int)(height*0.85);
		
		driver.swipe(679, 1827, 0, 1827, 500);
		//driver.swipe(startx, starty, endx, endy, 500);
		WebElement tshirtsize =driver.findElementByXPath("//android.widget.TextView[@text='Size : XL']");

		driver.tap(1, tshirtsize, 5);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement addcart =driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
		driver.tap(1, addcart, 5);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement cart =driver.findElementByXPath("//android.widget.RelativeLayout[@resource-id='com.mrvoonik.android:id/main']");
		driver.tap(1, cart, 5);

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
