package AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Cal_HybridApp_PayTM {

	public static AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();
		// unique ID for device
		// Platform
		// Android version
		// Apppackage & App Activity

		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "10.0");
		cap.setCapability("automationName", "UiAutomator2");
		/*
		 * cap.setCapability("appPackage", "com.android.contacts");
		 * cap.setCapability("appActivity",
		 * "com.android.contacts.activities.PeopleActivity");
		 */

		cap.setCapability("appPackage", "com.paytmmoney");
		cap.setCapability("appActivity", "com.paytmmoney.profilesection.userdetail.UserDetailActivity");
		
		driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

	}

	@Test
	public void cal_Add_Test() throws Exception {
		System.out.println("Application - PayTm App launched successfully");
		Thread.sleep(2000);
		
		
		
		

	}

}
