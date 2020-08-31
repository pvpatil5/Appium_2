package com.appium.pac.webapps;

import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Chrome_ 
{

	AndroidDriver dr;
	DesiredCapabilities cap;
	@Test
	public void launchchrome() throws Throwable 
	{
		cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		//cap.setCapability("browserName", "Chrome");
		cap.setCapability("noReset", true);
		cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");

		URL url = new URL("http://localhost:4723/wd/hub");
		dr =  new AndroidDriver(url,cap);

		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("https://www.facebook.com");
		
		
	}
	@AfterTest
	public void afterTest() throws InterruptedException{
		Thread.sleep(5000);
		dr.quit();
	}
}
