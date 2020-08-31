package com.appium.pac.gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Radio_chkboxes 
{

	AndroidDriver dr;
	@Test
	public void testApp() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("noReset", true);
		cap.setCapability("app", "D:\\APPIUM_Suff\\APK\\net.one97.paytm.apk");
		URL url = new URL("http://localhost:4723/wd/hub");
		dr =  new AndroidDriver(url,cap);


		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement rbtn=dr.findElementById("net.one97.paytm:id/radio_postpaid");
		System.out.println("Initial Radio btn="+rbtn.getAttribute("checked"));
		
		Thread.sleep(2000);
		rbtn.click();
		Thread.sleep(2000);
		System.out.println("After radio btn="+rbtn.getAttribute("checked"));

		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement chkbox=dr.findElementById("net.one97.paytm:id/radio_fast_forward");
		System.out.println("Initial chk box="+chkbox.getAttribute("checked"));
		Thread.sleep(2000);
		chkbox.click();
		Thread.sleep(2000);
		System.out.println("After chkbox="+chkbox.getAttribute("checked"));
	}
	@AfterTest
	public void afterTest() throws InterruptedException{
		Thread.sleep(5000);
		dr.quit();
	}
}

