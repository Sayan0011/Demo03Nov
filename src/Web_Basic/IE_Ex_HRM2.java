package Web_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


public class IE_Ex_HRM2 {

	public static void main(String args[]) throws InterruptedException {
		
//		System.setProperty("webdriver.ie.driver", "D:\\Coforge\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
		
//		 System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
//		 WebDriver driver = new ChromeDriver();
		
		
		
		System.setProperty("webdriver.edge.driver", "D:\\Coforge\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
		
	}

}