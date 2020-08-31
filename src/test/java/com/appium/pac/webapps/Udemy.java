package com.appium.pac.webapps;

import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Udemy
{

	AndroidDriver dr;
	DesiredCapabilities cap;
	@Test
	public void launchudemy() throws Throwable 
	{
		cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("browserName", "chrome");
		URL url = new URL("http://localhost:4723/wd/hub");
		dr =  new AndroidDriver(url,cap);

		dr.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//dr.findElementById("com.android.chrome:id/url_bar").sendKeys("http://google.co.in");
		Set<String> contexts = dr.getContextHandles();
		System.out.println(contexts.size());
		for(String context : contexts){
			System.out.println(context);
		}
		dr.context("WEBVIEW_1");
		dr.get("https://www.udemy.com/");
		dr.findElementByXPath("//*[@id='udemy']/div[2]/div[1]/div[2]/form/div/input").sendKeys("ISTQB");
		//dr.findElementByXPath("//*[@id='udemy']/div[2]/div[1]/div[2]/form/button").click();
		dr.findElementByXPath("//*[@class='home-search-btn']").click();
		dr.findElementByXPath("//*[@id='courses']/li[1]").click();
		dr.findElementByLinkText("Take This Course").click();
		dr.findElementById("//*[@id='id_fullname']").sendKeys("Pavan");
	}

	@AfterTest
	public void afterTest() throws InterruptedException{
		Thread.sleep(5000);
		dr.quit();
	}
}


