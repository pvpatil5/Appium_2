package com.appium.pac.gestures;

import org.testng.annotations.Test;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class Multitouch_ 
{

	AndroidDriver dr;
	DesiredCapabilities cap;
	@Test
	public void multitouch() throws Throwable 
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
		int x = dr.manage().window().getSize().getWidth()/2;
		int y = dr.manage().window().getSize().getHeight()/2;
		
		System.out.println(x);
		System.out.println(y);
		
		TouchAction finger1 = new TouchAction((MobileDriver)dr);
		finger1.press(x, y-20).moveTo(x, y-100);
		
		TouchAction finger2 = new TouchAction((MobileDriver)dr);
		finger2.press(x, y+20).moveTo(x, y+100);
		
		MultiTouchAction action = new MultiTouchAction((MobileDriver)dr);
		Thread.sleep(2000);
		action.add(finger1).add(finger2).perform();
		
		
//		WebElement image = dr.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageView");
//		int x = image.getLocation().getX() + image.getSize().getWidth()/2;
//		int y = image.getLocation().getY() + image.getSize().getHeight()/2;
//		
//		//Zoom
//		TouchAction finger1 = new TouchAction((MobileDriver)dr);
//		finger1.press(image, x, y-20).moveTo(image, x, y-100);
//		TouchAction finger2 = new TouchAction((MobileDriver)dr);
//		finger2.press(image, x, y+20).moveTo(image, x, y+100);
//		
//		MultiTouchAction action = new MultiTouchAction((MobileDriver)dr);
//		action.add(finger1).add(finger2).perform();
//		
//		Thread.sleep(5000);
//		//Pinch
//		finger1 = new TouchAction((MobileDriver)dr);
//		finger1.press(image, x, y-100).moveTo(image, x, y-20);
//		finger2 = new TouchAction((MobileDriver)dr);
//		finger2.press(image, x, y+100).moveTo(image, x, y+20);
//		action = new MultiTouchAction((MobileDriver)dr);
//		action.add(finger1).add(finger2).perform();
	}
	@AfterTest
	public void afterTest() throws InterruptedException{
		Thread.sleep(5000);
		dr.quit();
	}
}
