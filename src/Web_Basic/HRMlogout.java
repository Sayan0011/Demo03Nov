package Web_Basic;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class HRMlogout {	
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;


@BeforeTest
public void setUp() {
	System.setProperty("webdriver.chrome.driver","D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
 driver = new ChromeDriver();
 js = (JavascriptExecutor) driver;
 vars = new HashMap<String, Object>();
}
@AfterTest
public void tearDown() {
 driver.quit();
}
@Test
public void logout() {
 driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
 driver.findElement(By.id("welcome")).click();
 driver.findElement(By.linkText("Logout")).click();
}
}

