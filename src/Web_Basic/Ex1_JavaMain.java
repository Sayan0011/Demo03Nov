package Web_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex1_JavaMain {

	public static void main(String[] args) throws Exception{
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver", "D:\\Coforge\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
		
		// Using IE......
				//System.setProperty("webdriver.ie.driver", "D:\\Coforge\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
				//WebDriver driver = new InternetExplorerDriver();
				
				driver1.get("https://opensource-demo.orangehrmlive.com/");
				driver1.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver1.findElement(By.id("txtPassword")).sendKeys("admin123");
				driver1.findElement(By.id("btnLogin")).click();
				driver1.findElement(By.id("welcome")).click();
				Thread.sleep(4000);
				driver1.findElement(By.linkText("Logout")).click();
				driver1.quit();

	}

}
