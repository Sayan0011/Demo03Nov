package TestNG_Tests;

import org.testng.annotations.*;

public class TestOrder {

	@BeforeSuite
	public void Test1() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void Test2() {
		System.out.println("After Suite");
	}
	
	@AfterTest
	public void Test3() {
		System.out.println("After Test");
	}
	
}
