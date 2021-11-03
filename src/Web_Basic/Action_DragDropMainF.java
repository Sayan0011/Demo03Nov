package Web_Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_DragDropMainF {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frameTest = driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
		driver.switchTo().frame(frameTest);	


		WebElement source1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target1 = driver.findElement(By.xpath("//div[@id='droppable']"));

		 Actions action = new Actions(driver);
		//action.dragAndDrop(source1, target1).build().perform();
		action.clickAndHold(source1).moveToElement(target1).release().build().perform();

	}

}
