package smokeWebAppTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {
	
	public WebDriver driver;


	@Test
	public void AmazonSearchTest() throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
		
		//CSSSelector
		
			
//		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("iphone 12");
//		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		 
		AmazonTest obj = new AmazonTest(); 
		
		WebElement userName = driver.findElement(By.cssSelector("input#twotabsearchtextbox")); //#twotabsearchtextbox
		userName.sendKeys("iphone 12");
		
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
        
        //driver.findElement(By.xpath("//div[@id='primeRefinements']//i[@class='a-icon a-icon-checkbox']")).click();
        
        driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium']/li[1]//i[@class='a-icon a-icon-checkbox']")).click();
        
        String text = driver.findElement(By.xpath("//span[.='New Apple iPhone 12 (64GB) - White']")).getText();
        System.out.println(text);
        //driver.findElement(By.xpath("//span[.='New Apple iPhone 12 (64GB) - White']")).click();
        
        String price = driver.findElement(By.xpath("//span[.='70,900']")).getText(); ////span[.='70,900']
        System.out.println(price);
        
        String discount = driver.findElement(By.xpath("//span[.='Save ₹9,000 (11%)']")).getText();
        System.out.println("Total discount is: " + discount);
        
        obj.getScreenshot();
        
        driver.quit();
        
        
       
        
		/*
		 * driver.get("https://www.google.com/"); //XPATH
		 * driver.findElement(By.xpath("//input[@name='q']")).sendKeys("test");
		 * driver.findElement(By.xpath("(//INPUT[@class='gNO89b'])[2]")).click();
		 */

	}
	
	public void getScreenshot() throws Exception {
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\Highradius_winter\\Workspace\\BCJ-Demo\\screenshot\\amazon1.png"));

	}



}
