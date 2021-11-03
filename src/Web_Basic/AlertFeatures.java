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


 public class AlertFeatures {
	 
	 @Test
	 public void Alert_Handling_Test() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("file:///D:\\Coforge\\July_Training\\Workspace\\index.html"); //(Selenium/)
			driver.manage().window().maximize();
			
			/*
			 * //Simple Alert
			 * driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click()
			 * ; //button[contains(text(),'Generate Alert Box')]
			 * 
			 * //Alert - Simple driver.switchTo().alert(); //get text String Alert_text =
			 * driver.switchTo().alert().getText();
			 * Assert.assertTrue(Alert_text.contains("Automation Testing"),
			 * "Alert Validation failed !!");
			 * 
			 * Thread.sleep(3000); //Accept & dismiss //driver.switchTo().alert().accept();
			 * driver.switchTo().alert().dismiss();
			 

			// Confirm Alert
			
			/*
			 * driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click
			 * (); Alert confrim_alert = driver.switchTo().alert(); String confirm_text =
			 * driver.switchTo().alert().getText();
			 * Assert.assertTrue(confirm_text.contains("Press a button"
			 * ),"Confirm Alert Validation failed !!"); Thread.sleep(2000); //Accept &
			 * dismiss
			 * 
			 * confrim_alert.accept(); String ok_text =
			 * driver.findElement(By.id("demo")).getText();
			 * Assert.assertTrue(ok_text.contains("OK"),"Confirm Alert Validation failed !!"
			 * ); //confrim_alert.dismiss();
			 * 
			 * System.out.println(">>>>>>>>   " + confirm_text); confrim_alert.dismiss();
			 * String cancel_text = driver.findElement(By.id("demo")).getText();
			 * Assert.assertTrue(cancel_text.contains("Cancel")
			 * ,"Confirm Alert Validation failed !!");
			 */

			//prompt Alert
			
			driver.findElement(By.xpath("//button[text()='Generate Prompt Box']")).click();
			Alert prompt_alert = driver.switchTo().alert();
			String prompt_text = driver.switchTo().alert().getText();
			Assert.assertTrue(prompt_text.contains("Please enter your name"), "Prompt Alert Validation failed !! before action");
			Thread.sleep(2000);
			prompt_alert.sendKeys("Bootcamp Team");
			// Accept & dismiss

			Thread.sleep(3000);
			/*
			 * prompt_alert.accept(); Thread.sleep(2000); String ok_text
			 * =driver.findElement(By.id("demoPrompt")).getText();
			 * Assert.assertTrue(ok_text.contains("Bootcamp Team11"
			 * ),"Prompt Alert Validation failed !!" );
			 */
			//prompt_alert.dismiss();

			System.out.println(">>>>>>>>   " + prompt_text);
			prompt_alert.dismiss();
			String cancel_text = driver.findElement(By.id("demoPrompt")).getText();
			Assert.assertTrue(cancel_text.contains("User cancelled"), "Prompt Alert Validation failed !! after action");

	 }
	 
 }