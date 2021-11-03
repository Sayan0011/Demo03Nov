package Web_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class PayTM_Frame {
	WebDriver driver;
	
	@BeforeTest
	public void openApp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://paytm.com");

	}
	
	@Test
	public void handleFrame() throws Exception {
		
		driver.findElement(By.xpath("//SPAN[text()='Sign In']")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().frame(0); //Switch to the first frame
		
		//iframe handling
		String headingText = driver.findElement(By.cssSelector(".heading")).getText();
		
		Assert.assertEquals(headingText, "To Login into your Paytm Web account", "verify heading information");
		driver.findElement(By.xpath("//span[contains(text(),\"Watch Video\")]")).click();
	}


}
