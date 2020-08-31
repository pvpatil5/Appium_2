package com.appium.pac.gestures;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Zoom_Pinch 
{

	AndroidDriver dr;
	DesiredCapabilities cap;
	@Test
	public void zoom_pinch() throws Throwable 
	{
		cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("app", "D:\\APPIUM_Suff\\APK\\com.davemorrissey.labs.subscaleview.sample.apk");
		URL url = new URL("http://localhost:4723/wd/hub");
		dr =  new AndroidDriver(url,cap);

		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		dr.findElementById("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures").click();

		WebElement image = dr.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageView");

		/*Inbuilt method*/
		//dr.zoom(image);


		Thread.sleep(5000);
		int x = dr.manage().window().getSize().getWidth()/2;
		int y = dr.manage().window().getSize().getHeight()/2;
		dr.zoom(x, y);
		Thread.sleep(5000);

		//dr.pinch(image);
		int x1 = dr.manage().window().getSize().getWidth()/2;
		int y1 = dr.manage().window().getSize().getHeight()/2;
		dr.pinch(x, y);
	}
	@AfterTest
	public void afterTest() throws InterruptedException{
		Thread.sleep(5000);
		dr.quit();
	}
}
