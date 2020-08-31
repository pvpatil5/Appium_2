package com.appium.pac.gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Orientation_2 {

	public static void main(String[] args) throws Throwable 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
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
		
		System.out.println("The initial screen orientation is ----->"+driver.getOrientation());
		Thread.sleep(2000);
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		Thread.sleep(2000);
		System.out.println("The orientation of screen after rotation is ---->"+driver.getOrientation());
		Thread.sleep(3000);
		driver.rotate(ScreenOrientation.PORTRAIT);
		
		Thread.sleep(2000);
		System.out.println("The orientation of screen after rotation is ---->"+driver.getOrientation());
	}

}
