package com.appium.pac.gestures;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Scrolling_ {
	@Test
	public void scroll() throws Throwable {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");

		// cap.setCapability("noReset", false);// App starting from zero
		cap.setCapability("noReset", true); // App will start as it is available in phone

		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, cap);


		Thread.sleep(3000); WebElement element
		=driver.findElementByAccessibilityId("Views");

		driver.tap(1, element, 500);

		 scrollToElement(driver, "text", "Lists");

		Thread.sleep(2000); 
		WebElement element1= driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Lists\"]");

		tapOnElement(element1, driver);

	}

	public static void scrollToElement(AndroidDriver driver, String an, String av) {
		try {
			Thread.sleep(3000);
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector()).scrollIntoView(" + an + "(\"" + av + "\"))");
		} catch (InterruptedException ie) {
		}
	}

	public static void tapOnElement(WebElement element, AndroidDriver driver) {
		try {
			Thread.sleep(3000);
			TouchAction act1 = new TouchAction(driver);
			act1.press(element).release().perform();

		} catch (InterruptedException ie) {

		}
	}
}
