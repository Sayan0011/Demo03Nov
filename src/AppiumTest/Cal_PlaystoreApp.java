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

public class Cal_PlaystoreApp {

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
		cap.setCapability("appPackage", "com.dencreak.dlcalculator");
		cap.setCapability("appActivity", "com.dencreak.dlcalculator.DLCalculatorActivity");

		driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

	}

	@Test
	public void cal_Add_Test() throws Exception {
		System.out.println("Application - Calculator launched successfully");
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_c")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pad_btn_b_c")).click();
		Thread.sleep(2000);
		// Plus operation
		driver.findElement(By.id("pad_img_d_d")).click();
		// 8- butotn
		driver.findElement(By.id("pad_btn_b_b")).click();
		driver.findElement(By.id("pad_btn_b_b")).click();

		// click on equal button
		driver.findElement(By.id("pad_img_e_d")).click();

		Thread.sleep(2000);
		// Result - id lay_normal_body_val
		String result = driver.findElement(By.id("lay_normal_body_val")).getText();

		System.out.println("Result ========= " + result);
		Assert.assertTrue(result.equalsIgnoreCase("187"), "verify add test feature failed.");

	}

}
