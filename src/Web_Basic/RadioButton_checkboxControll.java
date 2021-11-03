package Web_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButton_checkboxControll {
WebDriver driver;
	
	@BeforeTest
	public void openapp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	}
	
	@Test
	public void handlebutton() throws Exception {
	    
//		WebElement Btn_Login = driver.findElement(By.xpath("//INPUT[@id='btnLogin']"));
//		System.out.println("Is Displayed: " + Btn_Login.isDisplayed());
//		System.out.println("Is Enabled: " + Btn_Login.isEnabled());
//		
//		Btn_Login.click();
		Thread.sleep(3000);
		WebElement clk = driver.findElement(By.xpath("//input[@value='Bike']"));
		clk.click();
		
		
		//checkbox
		
		

	}
}
