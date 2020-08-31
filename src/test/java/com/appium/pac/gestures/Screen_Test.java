package com.appium.pac.gestures;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Screen_Test 
{
	AndroidDriver driver;
	Dimension dim;


	@BeforeMethod
	public void configApp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		cap.setCapability("noReset", "true");

		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	}

	@Test(enabled=false)
	public void swipe1() throws Throwable 
	{
		Dimension size=	driver.manage().window().getSize();

		int height=	size.getHeight();
		
		int width= size.getWidth();
		
		int startx = (int) (width*0.50);
		
		int starty = (int)(height*0.20);
		
		int endx = (int)(width*0.50);
		
		int endy = (int)(height*0.80);

		driver.swipe(startx, starty, endx, endy, 500);
		
		Thread.sleep(3000);
		
		driver.swipe(endx, endy, (int)(width*0.50), (int)(height*0.20), 500);

	}
	@Test
	public void swipeTest1() 
	{
		dim = driver.manage().window().getSize();
		driver.swipe((int) (dim.getWidth() * 0.20), (int) (dim.getHeight() * 0.20), (int) (dim.getWidth() * 0.80),
				(int) (dim.getHeight() * 0.20), 1000);
		driver.swipe((int) (dim.getWidth() * 0.20), (int) (dim.getHeight() * 0.20), (int) (dim.getWidth() * 0.20),
				(int) (dim.getHeight() * 0.80), 1000);
		driver.swipe((int) (dim.getWidth() * 0.80), (int) (dim.getHeight() * 0.20), (int) (dim.getWidth() * 0.80),
				(int) (dim.getHeight() * 0.80), 1000);
		driver.swipe((int) (dim.getWidth() * 0.20), (int) (dim.getHeight() * 0.80), (int) (dim.getWidth() * 0.80),
				(int) (dim.getHeight() * 0.80), 1000);
	}

}

