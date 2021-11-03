package Web_Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Action_DragDrop2 {
	
	WebDriver driver;
	
	@BeforeTest
	public void openApp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/droppable/");

	}
	
	@Test
	public void handleFrame() throws Exception {
		
		//1st method
		//driver.switchTo().frame(2); //Switch to the 3rd frame
		//2nd method
		WebElement frameTest = driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
		driver.switchTo().frame(frameTest);		
	


	WebElement source1 = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement target1 = driver.findElement(By.xpath("//div[@id='droppable']"));

	 Actions action = new Actions(driver);
	//action.dragAndDrop(source1, target1).build().perform();
	action.clickAndHold(source1).moveToElement(target1).release().build().perform();

		
	}
	
}
