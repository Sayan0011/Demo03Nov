package Web_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleDemo_Keyboard {
	WebDriver driver;
	
@BeforeTest
public void openApp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");

	}
@Test
public void handleFrame() throws Exception {
	
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("galaxy s21 ultra");
	driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
	Thread.sleep(3000);
	
	//Keyboard operation
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("galaxy s21 ultra" + Keys.ENTER);
		

}
}
