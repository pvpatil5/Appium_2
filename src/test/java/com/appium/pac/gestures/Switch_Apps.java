package com.appium.pac.gestures;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Switch_Apps 
{

	@Test
	public void apps() throws Throwable 
	{
		String calculatorAppPackageName = "com.miui.calculator";
		String calculatorAppActivityName = ".cal.AllInOneCalculatorActivity";

		String myntraAppPackageName = "com.myntra.android";
		String myntraAppActivityName = "SplashActivity";


		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", myntraAppPackageName);
		cap.setCapability("appActivity", myntraAppActivityName);

		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =  new AndroidDriver(url,cap);

		Thread.sleep(4000);

		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"search\"]\r\n" + "").click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementByXPath( "//android.widget.EditText[@content-desc=\"search_default_search_text_input\"]" ).sendKeys("watches");
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);

		//launching calculator
		driver.startActivity(calculatorAppPackageName, calculatorAppActivityName);
		
		//driver.findElementById("android:id/button2").click();

		driver.findElementById("com.miui.calculator:id/btn_4_s").click();

		Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Re launch calculator App
		driver.launchApp();




	}

}
