package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.junit.Assert;

public class LoginPage {
	
	public WebDriver driver;
	By editUserName = By.id("txtUsername");
	By editPass = By.id("txtPassword");
	By btnLogin = By.id("btnLogin");
	By lnk_forgot = By.xpath("//*[@id=\"forgotPasswordLink\"]");
	
	//constructor calling
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void login(String userName, String password) {
		
		driver.findElement(editUserName).sendKeys(userName);
		driver.findElement(editPass).sendKeys(password);
		driver.findElement(btnLogin).click();
		
	}
	
	public Boolean verifyforgotlink() {
		return driver.findElement(lnk_forgot).isEnabled();
	}
	
	public void verifyTitle(String title) {
		
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains(title));
	}
	
}
