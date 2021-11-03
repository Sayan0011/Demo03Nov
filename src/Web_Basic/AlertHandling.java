package Web_Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import jdk.internal.org.objectweb.asm.Handle;

public class AlertHandling {
	WebDriver driver;

@BeforeTest
public void openApp() {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");

}

@Test
public void handleAlert() throws Exception {
	
//	//click on element to generate Alert - Simple Alert
//	driver.findElement(By.xpath("//INPUT[@onclick='myFunction1()']")).click();
	
//	Handle Alert Alert simpleAlert = driver.switchTo().alert();
//	System.out.println("Text on Simple Alert : " + simpleAlert.getText());
//	Thread.sleep(3000); // Accept/Dismiss // simpleAlert.accept(); //click on OK
//    Button simpleAlert.dismiss();
//    
//    //Confirm Alert
//    //click on element to confirm Alert
//    driver.findElement(By.xpath("//button[contains(text(),'Confirmation')]")).click();
//    
//    Handle Alert Alert confirmAlert = driver.switchTo().alert();
//    System.out.println("Text on Confirm Alert : " + confirmAlert.getText());
//
//    Thread.sleep(3000); // Accept/Dismiss // confirmAlert.accept(); //click on OK
//    Button confirmAlert.dismiss();
    
//    // Prompt Alert
//    // click on element to generate Confirm Alert
//    driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
//    // Handle Alert
//    Alert PromptAlert = driver.switchTo().alert();
//    System.out.println("Text on Confirm Alert : " + PromptAlert.getText());
//    Assert.assertTrue(PromptAlert.getText().contains("Please"),"verify Alert Text");
//    Thread.sleep(3000);
//    // Accept/Dismiss
//    PromptAlert.accept(); //click on OK button
//    //PromptAlert.dismiss();


    
	
}


}