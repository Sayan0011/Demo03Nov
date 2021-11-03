package Tests;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage; //import package.class;


public class LoginPageTest {
	public WebDriver driver;
	public Properties prop;
	public LoginPage login;
	
	@BeforeTest
	public void openApp() throws Exception { //**Ask**
		FileInputStream fis = new FileInputStream("D:\\Highradius_winter\\Workspace\\BCJ-Demo\\configFile.properties");
		prop = new Properties();
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverPath")); //prop.getProperty("edgedriverPath")
		driver = new ChromeDriver();
		login = new LoginPage(driver);
		driver.get(prop.getProperty("url"));
		
	}
	@Test
	public void Login_with_valid_userdetails() {
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyTitle() {
		login.verifyTitle("HRM");
	}
	
//	@Test
//	public void verifyForgot() {
//		login.verifyforgotlink()
//	}
	
}
