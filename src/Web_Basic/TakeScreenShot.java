package Web_Basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

@Test
public class TakeScreenShot {
	
	public WebDriver driver;
	
	public void openBrowser() throws Exception {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		try {
			driver.findElement(By.name("q")).sendKeys("Galaxy s21 Ultra");  //testing automation
			getScreenshot();

		} catch (Exception e) {
			System.out.println("There is an Exception");
		}
		Thread.sleep(3000);
		
		//getScreenshot();
		

	}

	
	private void getScreenshot() throws IOException {
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./screenshot/Screenshot_current.png"));
		//FileUtils.copyFile(scrFile, new File("./BCJ-Demo/screenshot"+name+".png"));
		
		 /*D:\\Highradius_winter\\Workspace\\BCJ-Demo\\screenshot\\Screenshot1.png*/
		
	}

}
