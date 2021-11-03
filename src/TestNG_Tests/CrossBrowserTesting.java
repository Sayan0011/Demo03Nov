package TestNG_Tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	public WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	
	public void setup(String browser) throws Exception {
		
		//using Ifelse for each browser
		//check parameter passed from TestNG is 'Firefox'
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Coforge\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\Coforge\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.edge.driver", "D:\\Coforge\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else {
			throw new Exception("Browser ius not correct"); 
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 /*
		* driver.get("https://opensource-demo.orangehrmlive.com/");
		* driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		* driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		* driver.findElement(By.id("btnLogin")).click(); String actualTitle =
		* driver.getTitle(); Assert.assertEquals(actualTitle, "OrangeHRM");
		*/
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	/*
	* public void click_element(WebElement ele) {​​​ ele.click(); }​​​
	*
	* public void navigate_to(String url) {​​​ driver.navigate().to(url); }​​​
	*
	* public void send_keys(WebElement ele, String value) {​​​ ele.sendKeys(value); }​​​
	*/
	
	@Test
	public void verifyOrangeHRMLoginTest() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click(); 
		String actualTitle = driver.getTitle(); Assert.assertEquals(actualTitle, "OrangeHRM");
		Thread.sleep(4000);
	}
}