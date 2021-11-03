package smokeWebAppTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class GoogleSearchTest {
	
	
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", ".\\jar\\chromedriver_90.exe");
		WebDriver driver = new ChromeDriver();
			
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 12 max pro");
		 
		
	}

}
