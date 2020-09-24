package com.appium.pac.gestures;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Drop_Down 
{

	DesiredCapabilities cap = new DesiredCapabilities();
//	AppiumDriverLocalService service;
//	AppiumServiceBuilder builder;
	@Test
	public void startserver() throws InterruptedException {

		//Set Capabilities

		//	cap.setCapability("noReset", "false");

		//Build the Appium service
		//
		//		builder = new AppiumServiceBuilder();
		//		builder.withIPAddress("127.0.0.1");
		//		builder.usingPort(4723);
		//		builder.withCapabilities(cap);
		//		builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
		//		builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
		//
		//		//Start the server with the builder
		//		service = AppiumDriverLocalService.buildService(builder);
		//		service.start();


		AppiumDriverLocalService service =  AppiumDriverLocalService.buildDefaultService();

		service.start();

		Thread.sleep(5000);

		service.stop();

	}

	//	@AfterMethod
	//	public void closeserver() {
	//		{
	//			service.stop();
	//		}
	//	}

	//	@Test
	//	public void dropdown() throws Throwable 
	//	{
	//		//cap= new DesiredCapabilities();
	//		cap.setCapability("deviceName", "Redmi");
	//		cap.setCapability("automationName", "Appium");
	//		cap.setCapability("platformName", "Android");
	//		cap.setCapability("platformVersion", "7.0");
	//		cap.setCapability("UDID", "d6c768cf9804");
	//		cap.setCapability("appPackage", "io.appium.android.apis");
	//		cap.setCapability("appActivity", "ApiDemos");
	//		URL url = new URL("http://localhost:4723/wd/hub");
	//		AndroidDriver driver =  new AndroidDriver(url,cap);
	//
	//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//
	//
	//
	//		WebElement element=driver.findElementByAccessibilityId("Views");
	//
	//		driver.tap(1, element, 500);
	//
	//
	//		WebElement control=driver.findElementByAccessibilityId("Controls");
	//
	//		driver.tap(1, control, 500);
	//
	//		WebElement dark=driver.findElementByAccessibilityId("2. Dark Theme");
	//
	//		driver.tap(1, dark, 500);
	//
	//		driver.hideKeyboard();
	//		Thread.sleep(1000);
	//
	//		//click on drop down
	//		//driver.findElementByAccessibilityId("io.appium.android.apis:id/spinner1").click();
	//		driver.findElementByXPath("//android.widget.Spinner[@resource-id='io.appium.android.apis:id/spinner1']").click();
	//		//class name remains same so we are goin with it
	//		Thread.sleep(2000);
	//		List<WebElement> dropdown  = driver.findElementsByClassName("android.widget.CheckedTextView");
	//
	//		System.out.println("Total options="+dropdown.size());
	//
	//		Thread.sleep(3000);
	//		for(WebElement e:dropdown)
	//		{
	//			String val=e.getText();
	//
	//			if(val.equalsIgnoreCase("Saturn"))
	//			{
	//				e.click();
	//				break;
	//			}
	//		}
	//
	//		//	driver.findElementByXPath("//android.widget.CheckedTextView[@text='Saturn']").click();
	//
	//
	//	}


}
