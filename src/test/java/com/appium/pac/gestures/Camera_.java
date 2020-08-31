package com.appium.pac.gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Camera_ 
{
	@Test
	public void camera() throws Throwable 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("appPackage", "com.android.camera");
		cap.setCapability("appActivity", ".Camera");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =  new AndroidDriver(url,cap);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Capture
		//	driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);

		Thread.sleep(3000);


		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);

		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);

		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_MUTE);

		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);

		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
		//
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		








	}



}
