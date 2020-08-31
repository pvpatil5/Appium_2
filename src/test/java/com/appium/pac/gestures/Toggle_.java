package com.appium.pac.gestures;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Toggle_ 
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
		cap.setCapability("app", "D:\\APPIUM_VIDEOS\\Appium_Udemy\\Apk\\com.davemac327.gesture.tool.apk");
		URL url = new URL("http://localhost:4723/wd/hub");
		dr =  new AndroidDriver(url,cap);

		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement button = dr.findElementById("com.davemac327.gesture.tool:id/addButton");
		//dr.tap(1, button, 2);
		//dr.tap(1, 150, 1100, 1);
		System.out.println(button.getLocation().getX());//12
		System.out.println(button.getLocation().getY());//1771
		System.out.println(button.getSize().getWidth());//352
		System.out.println(button.getSize().getHeight());//144
		int xCentre = button.getLocation().getX() + button.getSize().getWidth()/2;
		int yCentre = button.getLocation().getY() + button.getSize().getHeight()/2;
		System.out.println(xCentre);//188
		System.out.println(yCentre);//1883
		dr.tap(1, xCentre, yCentre, 1);
	}
	@AfterTest
	public void afterTest() throws InterruptedException
	{
		Thread.sleep(5000);
		dr.quit();
	}
}