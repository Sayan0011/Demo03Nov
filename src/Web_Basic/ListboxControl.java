package Web_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ListboxControl {
WebDriver driver;
	
	@BeforeTest
	public void openapp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	}
	
	@Test
	public void handlebutton() throws Exception {
	    
		
		//checkbox
		// Listbox/dropdown - Single Selection
		WebElement list = driver.findElement(By.xpath("//select[@id=\"Carlist\"]"));
		
		Select list_ele = new Select(list);
		System.out.println("Is Multiple Selection enabled or not 1st Listbox: " + list_ele.isMultiple());
		
		WebElement mul_list = driver.findElement(By.name("FromLB")); // For multiple selection
		
		if(!list_ele.isMultiple()) {
			
			list_ele.selectByIndex(1);
			Thread.sleep(1000);
			list_ele.selectByValue("Audi Car");
			Thread.sleep(1000);
			list_ele.selectByVisibleText("Toyota");
			}
		
		//Multiple Selection
		Select Mul_list_ele = new Select(mul_list);
		System.out.println("Is Multiple Selection enabled or not for 2nd Listbox: " + Mul_list_ele.isMultiple());
		//Selection
		Mul_list_ele.selectByIndex(1);
		Thread.sleep(1000);
		Mul_list_ele.selectByValue("India");
		Thread.sleep(1000);
		Mul_list_ele.selectByVisibleText("Spain");
		Mul_list_ele.selectByVisibleText("USA");

		//DeSelection
		Thread.sleep(1000);
		Mul_list_ele.deselectByVisibleText("USA");
		Thread.sleep(1000);
		Mul_list_ele.deselectByValue("Spain");
		Thread.sleep(1000);
		Mul_list_ele.deselectByIndex(1);
		Mul_list_ele.selectByVisibleText("Spain");
		Mul_list_ele.selectByVisibleText("USA");
		Thread.sleep(2000);
		Mul_list_ele.deselectAll();
		Thread.sleep(1000);
		Mul_list_ele.selectByValue("India");	
		
			
	}
	
}
