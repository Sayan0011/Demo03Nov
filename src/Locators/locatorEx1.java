package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorEx1 {

 public static void main(String[] args) throws Exception {

 System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com");
//Locator - id / name / tagname / className / linktext / partialLinkText / XPATH / CSS
//Objective - Identify the element uniqely.
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//Name
driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//ID
//driver.findElement(By.id("btnLogin")).click();
//Tagname
//ClassName
//driver.findElement(By.className("button")).click();
//LinkText
//driver.findElement(By.linkText("Forgot your password?")).click();
//PartialLinkText
//driver.findElement(By.partialLinkText("Forgot your ")).click();
//driver.findElement(By.partialLinkText("your password?")).click();
driver.findElement(By.partialLinkText("sword?")).click();
//XPATH
//driver.findElement(By.xpath("//input[@id=\"btnCancel\"]")).click();
//driver.findElement(By.xpath("//input[@id='btnCancel']")).click();
//CSSSelector
driver.findElement(By.cssSelector("input[id='btnCancel']")).click();
Thread.sleep(3000);
driver.quit();

 }

}