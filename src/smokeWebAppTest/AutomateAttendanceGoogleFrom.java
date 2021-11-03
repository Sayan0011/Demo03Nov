package smokeWebAppTest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomateAttendanceGoogleFrom {

	@Test
	public void AmazonSearchTest() throws Exception {

		System.setProperty("webdriver.chrome.driver", ".\\jar\\chromedriver_90.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://docs.google.com/forms/d/1Ethyt5qOUNR-X84G7hc1d3J27OsoXh3jqPDq_pRx_pE/edit");
		
		driver.findElement(By.xpath("//div[text()='Employee ID']//following::input[1]")).sendKeys("42342wr");
		driver.findElement(By.xpath("//div[text()='First Name']//following::input[1]")).sendKeys("FirstName1");
		driver.findElement(By.xpath("//div[text()='Last Name']//following::input[1]")).sendKeys("LastName1");
		driver.findElement(By.xpath("//div[text()='Email ID']//following::input[1]")).sendKeys("EmailID@mail1.com");
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		/*
		 * String message = driver.findElement(By.
		 * xpath("//div[text()='ATTENDANCE SHEET']//parent::div/div[3]")).getText();
		 * System.out.println("Message after submitting attendance form " + message);
		 * Assert.assertTrue(message.contains("Thanks"),
		 * "Form Submission Vailidation get failed");
		 */
		
	}

}
