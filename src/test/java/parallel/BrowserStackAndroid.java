package parallel;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class BrowserStackAndroid  

{

	public static String userName = "pavanpatil2";
	public static String accessKey = "CHAnHaZMHgmzKmpDweBN";

	public static void main(String args[]) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("device", "Samsung Galaxy S10e");
		caps.setCapability("os_version", "9.0");
		caps.setCapability("project", "My First Project");
		caps.setCapability("build", "My First Build");
		caps.setCapability("name", "Bstack-[Java] Sample Test");
		caps.setCapability("app", "bs://d63dd6e7025c6b8fba43246d0dde819d9a438b97");
		
		caps.setCapability("appPackage", "io.appium.android.apis");
		caps.setCapability("appActivity", "ApiDemos");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

		/* Write your Custom code here */

		
		
		WebElement element=driver.findElementByAccessibilityId("Views");

		driver.tap(1, element, 500);


		WebElement control=driver.findElementByAccessibilityId("Controls");

		driver.tap(1, control, 500);

		WebElement dark=driver.findElementByAccessibilityId("2. Dark Theme");

		driver.tap(1, dark, 500);

		driver.hideKeyboard();
		Thread.sleep(1000);

		//click on drop down
		//driver.findElementByAccessibilityId("io.appium.android.apis:id/spinner1").click();
		driver.findElementByXPath("//android.widget.Spinner[@resource-id='io.appium.android.apis:id/spinner1']").click();
		//class name remains same so we are goin with it
		Thread.sleep(2000);
		List<AndroidElement> dropdown  = driver.findElementsByClassName("android.widget.CheckedTextView");

		System.out.println("Total options="+dropdown.size());

		Thread.sleep(3000);
		for(WebElement e:dropdown)
		{
			String val=e.getText();

			if(val.equalsIgnoreCase("Saturn"))
			{
				e.click();
				break;
			}
		}
		driver.quit();
	}
}





