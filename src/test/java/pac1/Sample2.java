package pac1;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Sample2 
{
	DesiredCapabilities cap = new DesiredCapabilities();
	@Test
	public void dropdown() throws Throwable 
	{
		//cap= new DesiredCapabilities();
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

		WebElement element=driver.findElementByAccessibilityId("Views");

		driver.tap(1, element, 500);

		WebElement control=driver.findElementByAccessibilityId("Controls");

		driver.tap(1, control, 500);

		WebElement dark=driver.findElementByAccessibilityId("2. Dark Theme");

		driver.tap(1, dark, 500);
		Thread.sleep(1000);
		driver.hideKeyboard();
		Thread.sleep(1000);

		//Identify text box and insert value
		driver.findElementById("io.appium.android.apis:id/edit").sendKeys("Appium");

		//Checkbox 
		MobileElement chkbox2=(MobileElement) driver.findElementByXPath("//android.widget.CheckBox[@resource-id='io.appium.android.apis:id/check2']");
		System.out.println("Chk box status before clicking="+chkbox2.getAttribute("checked"));
		chkbox2.click();
		System.out.println("Chk box status After clicking="+chkbox2.getAttribute("checked"));
		//RadioBtn
		Thread.sleep(2000);
		MobileElement radiobtn=(MobileElement) driver.findElementByXPath("//android.widget.RadioButton[@text='RadioButton 1']");
		System.out.println("radio btn status before clicking="+radiobtn.getAttribute("checked"));
		radiobtn.click();
		System.out.println("radio btn status After clicking="+radiobtn.getAttribute("checked"));
		Thread.sleep(2000);
		//click on drop down
		//driver.findElementByAccessibilityId("io.appium.android.apis:id/spinner1").click();
		driver.findElementByXPath("//android.widget.Spinner[@resource-id='io.appium.android.apis:id/spinner1']").click();
		//class name remains same so we are goin with it
		Thread.sleep(2000);
		List<WebElement> dropdown  = driver.findElementsByClassName("android.widget.CheckedTextView");

		System.out.println("Total options="+dropdown.size());

		Thread.sleep(3000);
		for(WebElement e:dropdown)
		{
			String val=e.getText();

			if(val.equalsIgnoreCase("Mars"))
			{
				e.click();
				break;
			}
		}

		
		
		
		//classname[@AN='Av']
		//	driver.findElementByXPath("//android.widget.CheckedTextView[@text='Saturn']").click();


	}


}