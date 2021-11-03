package Web_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Buttoncontrol {
WebDriver driver;
	
	@BeforeTest
	public void openapp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void handlebutton() {
	    
		WebElement Btn_Login = driver.findElement(By.xpath("//INPUT[@id='btnLogin']"));
		System.out.println("Is Displayed: " + Btn_Login.isDisplayed());
		System.out.println("Is Enabled: " + Btn_Login.isEnabled());
		
		Btn_Login.click();
		

	}
}
