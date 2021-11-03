package Web_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipKartAppTest_Navigation {
	
	WebDriver driver;
	
	@BeforeTest
	public void openapp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");

		
	}
	
	@Test
	public void flipkart() throws InterruptedException {
		
		WebElement searchbox;
		searchbox=driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys(" Galaxy S20 FE 5G ");
		Thread.sleep(5000);
		
		//searchbox=driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		//System.out.println(searchbox);
		
		System.out.println("Current URl: " + driver.getCurrentUrl());
		System.out.println("========================================");
		
		//System.out.println("Current Page Source: " + driver.getPageSource());
		//System.out.println("========================================");
		
		System.out.println("Current Title: " + driver.getTitle());
		System.out.println("========================================");
		
		//Navigation Steps
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		//driver.quit();
	}

}
