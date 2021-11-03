package connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel {
	public WebDriver driver;
	public WebDriverWait Wait;
	String appURL="http://demo.guru99.com/test/newtours/";
	
	private By byEmail= By.name("userName");
	private By byPassword= By.name("password");
	private By bySubmit=By.name("submit");
	
	
	@BeforeClass
	public void testSetup(){

		System.setProperty("webdriver.chrome.driver", "D:\\Coforge\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Wait= new WebDriverWait(driver,5);
	}
	
	@Test(dataProvider="RegressionData")
	public void VerifyInvalidLogin(String userName,String password) throws Exception{
		driver.navigate().to(appURL);
		driver.findElement(byEmail).sendKeys(userName);
		driver.findElement(byPassword).sendKeys(password);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
	}
	
	@DataProvider(name="empLogin")
	public Object[][] loginData(){
		Object[][] arrayObject= getExcelData("D:\\Coforge\\July_Training\\Workspace\\Sheet Data\\TestData.xls","Sheet1");
		return arrayObject;
	}
	
	@DataProvider(name="RegressionData")
	public Object[][] RegressionData(){
		Object[][] arrayObject= getExcelData("D:\\Coforge\\July_Training\\Workspace\\Sheet Data\\TestData.xls","RegressionData");
		return arrayObject;
	}
	
	
	
	
	
	
	/*
	 * @DataProvider(name="RegressionLogin") public Object[][] loginDataRegession(){
	 * Object[][] arrayObject= getExcelData("D:\\Coforge\\July_Training\\Workspace\\Sheet Data\\TestData.xls","RegressionData");
	 * return arrayObject; }
	 */
	public String[][] getExcelData(String fileName, String sheetName){
		String[][] arrayExcelData=null;
		try{
			FileInputStream fs= new FileInputStream(fileName);
			Workbook wb= Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);
			
			int totalNoOfCols=sh.getColumns();
			int totalNoOfRows=sh.getRows();
			
			arrayExcelData= new String[totalNoOfRows-1][totalNoOfCols];
			for(int i=1;i<totalNoOfRows;i++){
				for (int j=0;j<totalNoOfCols;j++){
					arrayExcelData[i-1][j]=sh.getCell(j,i).getContents();
					
				}
				
			}
		}
	catch(FileNotFoundException e){
		e.printStackTrace();
	}
		catch(IOException e){
			e.printStackTrace();
		}
		catch (BiffException e){
			e.printStackTrace();
		}
		
		return arrayExcelData;
	}
	
	@Test()
	public void tearDown(){
		driver.quit();
	
	
		
	}
}