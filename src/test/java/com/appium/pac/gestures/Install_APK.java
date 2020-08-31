package com.appium.pac.gestures;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Install_APK 


{
	@Test
	public void Install() throws Throwable {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "Redmi");
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "7.0");
	cap.setCapability("UDID", "d6c768cf9804");
	cap.setCapability("app", "D:\\APPIUM_VIDEOS\\Appium_Udemy\\Apk\\Android UI Programming_v1.0_apkpure.com.apk");
	//	cap.setCapability("appPackage", "com.mobeta.android.demodslv");
	//cap.setCapability("appActivity", ".Launcher");

	cap.setCapability("noReset", true);//to use app without resetting it in automation script
	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver =  new AndroidDriver(url,cap);

	Thread.sleep(2000);

	System.out.println("Returns false if app is not available="+driver.isAppInstalled("com.mobeta.android.demodslv"));
	}
}
