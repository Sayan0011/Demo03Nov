package Web_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Action_DragDrop {
	WebDriver driver;
	
	@BeforeTest
	public void openApp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

	}
	
	@Test
	public void handleFrame() throws Exception {
		
		//1st method
		//driver.switchTo().frame(2); //Switch to the 3rd frame
		//2nd method
		WebElement frameTest = driver.findElement(By.xpath("//iframe[contains(@data-src,'droppable/photo-manager.html')]")); /*We have to do 
		                                                                                                                       drag and drop inside 
		                                                                                                                       a perticular frame by 
		                                                                                                                       the locator of the iframe */
		driver.switchTo().frame(frameTest);		
		
		WebElement source = driver.findElement(By.xpath("//h5[contains(text(),'Tatras 3')]"));
		WebElement target = driver.findElement(By.cssSelector("div#trash"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
		
	}


}
