package com.appium.pac.gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Myntra 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("appPackage", "com.myntra.android");
		cap.setCapability("appActivity", "SplashActivity");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =  new AndroidDriver(url,cap);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"search\"]\r\n" + "").click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.EditText[@content-desc=\"search_default_search_text_input\"]").sendKeys("watches"); 
		//Enter
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);


	}
}
