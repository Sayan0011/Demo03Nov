package lastTry;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class screenShot {
	
	public WebDriver driver;
	
	public void openBrowser() throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		try {
			driver.findElement(By.name("q")).sendKeys("Galaxy s21 Ultra");
			getScreenshot();
		} catch (Exception e) {
			
			System.out.println("There is an Exception");
			
		}
		Thread.sleep(4000);
	}

	private void getScreenshot() throws IOException {
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./screenshot/Screenshot_current.png"));

	}

}
