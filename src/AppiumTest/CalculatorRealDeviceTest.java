package AppiumTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorRealDeviceTest {

	public static AppiumDriver driver;
	public WebElement frameLayout;

	public static void main(String[] args) throws Exception {

		try {
			openCalcualtor();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void openCalcualtor() throws IOException, Exception {

		DesiredCapabilities capabilites = new DesiredCapabilities();
		// Phone - Real device
		/*
		 * capabilites.setCapability("udid", "e0f6dec0");
		 * capabilites.setCapability("deviceName", "Mi 4");
		 * capabilites.setCapability("platformName", "Android");
		 * capabilites.setCapability("platformVersion", "5.0.2");
		 * 
		 * capabilites.setCapability("appPackage", "com.miui.calculator");
		 * 
		 * capabilites.setCapability("appActivity",
		 * "com.miui.calculator.cal.CalculatorActivity");
		 */
		
		//Emulator
		capabilites.setCapability("udid", "emulator-5554");
		capabilites.setCapability("deviceName", "Nexus");
		capabilites.setCapability("platformName", "Android");
		capabilites.setCapability("platformVersion", "7.1.1");

		capabilites.setCapability("appPackage", "com.android.calculator2");

		capabilites.setCapability("appActivity", "com.android.calculator2.Calculator");

		driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilites);

		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		System.out.println("Application started......");

		Thread.sleep(3000);
//		WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
//		two.click();
//		
//		WebElement plus = driver.findElement(By.id("com.android.calculator2:id/op_add"));
//		plus.click();
//		WebElement four = driver.findElement(By.id("com.android.calculator2:id/digit_9"));
//		four.click();
//		WebElement equalTo = driver.findElement(By.id("com.android.calculator2:id/eq"));
//		equalTo.click();
		
		
		WebElement two = driver.findElement(By.id("btn_7_s"));
		two.click();
		WebElement plus = driver.findElement(By.id("btn_plus_s"));
		plus.click();
		WebElement four = driver.findElement(By.id("btn_9_s"));
		four.click();
		WebElement equalTo = driver.findElement(By.id("btn_equal_s"));
		equalTo.click();
		
		

	}

}
