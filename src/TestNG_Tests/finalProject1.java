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

public class finalProject1 {
	
	public WebDriver driver;
	
   @BeforeTest
   @Parameters("browser")
   public void setup(String browser) throws Exception {
		
		//using Ifelse for each browser

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
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	@Test
	public void verifyTest() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Oppo Reno6 Pro 5G");
		driver.findElement(By.xpath("//div[.='OPPO Reno6 Pro 5G (Stellar Black, 256 GB)']")).click();
		driver.findElement(By.xpath("//ul[@class='_1q8vHb']/li[1]//div[@class='_2C41yO']")).click();
		driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/div[3]//button[@class='_2KpZ6l _1t_O3S _2ti6Tf _3AWRsL']/span[.='Add 3 Items to Cart']")).click();
		driver.findElement(By.xpath("//span[.='Place Order']")).click();
		driver.findElement(By.xpath("//img[@alt='Flipkart']")).click();
		String actualTitle = driver.getTitle(); Assert.assertEquals(actualTitle, "Oppo Reno6 Pro 5G");
		Thread.sleep(4000);
	}
}
