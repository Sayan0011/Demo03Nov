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
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class Cal_RealDevice {

	public static AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();
		// unique ID for device
		// Platform
		// Android version
		// Apppackage & App Activity

		//Real devices ,
		cap.setCapability("udid", "e0f6dec0");
		cap.setCapability("deviceName", "Mi 4i");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "5.0");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		cap.setCapability("autoAcceptAlerts", true);
		/*
		 * cap.setCapability("appWaitForLaunch", false);
		 * cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
		 */
		driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

	}

	@Test
	public void cal_Add_Test() throws Exception {
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("Application - Calculator launched successfully");
		Thread.sleep(7000);
		//press - 9 button
		driver.findElement(By.id("com.miui.calculator:id/btn_9_s")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btn_9_s")).click();
		Thread.sleep(2000);
		// Plus operation
		driver.findElement(By.id("btn_plus_s")).click();
		// 8- butotn
		driver.findElement(By.id("btn_8_s")).click();
		driver.findElement(By.id("btn_8_s")).click();

		// click on equal button
		driver.findElement(By.id("btn_equal_s")).click();

		

	}

}
