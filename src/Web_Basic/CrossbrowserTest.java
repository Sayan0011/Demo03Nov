package Web_Basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class CrossbrowserTest{
	
	public void LoginTest() throws Exception {
		//public void main(String[] args) { //LoginTest() {​​​

	     // System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer_64.exe");
	     // WebDriver name = new InternetExplorerDriver();


	     System.setProperty("webdriver.edge.driver", "D:\\Coforge\\edgedriver_win64\\msedgedriver.exe");
	     WebDriver driver = new EdgeDriver();


	     //System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
	     //WebDriver name = new InternetExplorerDriver();

	     // System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	     // WebDriver name = new FirefoxDriver();

	     // System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     // WebDriver name = new ChromeDriver();


	      driver.get("https://opensource-demo.orangehrmlive.com/");
	      Thread.sleep(3000);
	      driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	      driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	      driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

	}
}
