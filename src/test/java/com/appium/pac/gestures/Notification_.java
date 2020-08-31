package com.appium.pac.gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Notification_ 
{
	@Test
	public void notifyTest() throws Throwable 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("appPackage", "com.bhanu.notificationreminders");
		cap.setCapability("appActivity", ".MainDrawerActivity");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =  new AndroidDriver(url,cap);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String notimsg="notification generated";
		driver.findElementByXPath("//android.widget.EditText[@resource-id='com.bhanu.notificationreminders:id/txtNewNoteTitle']").sendKeys(notimsg);
		WebElement notify =driver.findElementByXPath("//android.widget.Button[@resource-id='com.bhanu.notificationreminders:id/btnNotify']");
		driver.tap(1, notify, 500);
		Thread.sleep(2000);
		
		
		// to open notifications
		driver.openNotifications();
		
		
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("Read").click();
		
		//driver.findElementById("android:id/notification_main_column").click();


	}








}
