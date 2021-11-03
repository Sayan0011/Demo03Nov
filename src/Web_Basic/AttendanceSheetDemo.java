package Web_Basic;



import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class AttendanceSheetDemo {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
@Before
public void setUp() {
	
 System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
 driver = new ChromeDriver();
 //js = (JavascriptExecutor) driver;
 //vars = new HashMap<String, Object>();
 
}
@After
public void tearDown() {
 //driver.quit();
}
@Test
public void attendanceDemo() throws InterruptedException {
 driver.get("https://docs.google.com/forms/d/e/1FAIpQLSc4gcNbOQ4rQWaH1_fudt3io9y5EUjKJ92v5Uxe17tzNIB0fQ/viewform");
 driver.findElement(By.cssSelector(".quantumWizTextinputPaperinputEl:nth-child(2) .quantumWizTextinputPaperinputInput")).click();
 driver.findElement(By.cssSelector(".quantumWizTextinputPaperinputEl:nth-child(2) .quantumWizTextinputPaperinputInput")).sendKeys("21-07-0000");
 driver.findElement(By.cssSelector(".quantumWizTextinputPaperinputEl:nth-child(2) .quantumWizTextinputPaperinputInput")).sendKeys("21-07-2000");
 driver.findElement(By.cssSelector(".quantumWizTextinputPaperinputEl:nth-child(2) .quantumWizTextinputPaperinputInput")).sendKeys("21-07-2020");
 driver.findElement(By.cssSelector(".quantumWizTextinputPaperinputEl:nth-child(2) .quantumWizTextinputPaperinputInput")).sendKeys("21-07-2021"); //2021-07-20
 driver.findElement(By.cssSelector(".freebirdFormviewerViewNumberedItemContainer:nth-child(2) .quantumWizTextinputPaperinputInput")).sendKeys("91449");
 driver.findElement(By.cssSelector(".freebirdFormviewerViewNumberedItemContainer:nth-child(3) .quantumWizTextinputPaperinputInput")).sendKeys("Sayan");
 driver.findElement(By.cssSelector(".freebirdFormviewerViewNumberedItemContainer:nth-child(4) .quantumWizTextinputPaperinputInput")).sendKeys("Pal");
 driver.findElement(By.cssSelector(".freebirdFormviewerViewNumberedItemContainer:nth-child(5) .quantumWizTextinputPaperinputInput")).sendKeys("Sayan.Pal@coforgetech.com");
 driver.findElement(By.cssSelector(".freebirdFormviewerViewNumberedItemContainer:nth-child(6) .quantumWizTextinputPaperinputInput")).sendKeys("C/C++, ML, Basics of Java and Python");
 driver.findElement(By.cssSelector(".appsMaterialWizButtonPaperbuttonLabel")).click();
 Thread.sleep(40000);
}
}

