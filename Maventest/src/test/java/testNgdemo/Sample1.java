package testNgdemo;

//import org.testng.Assert;
import org.testng.annotations.*;

public class Sample1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println(" This is before suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println(" This is before test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println(" This is before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" This is before Method");
	}

	@Test(priority = 0)
	public void test_1() {
		System.out.println(" This is test case1");
	}
	
	@Test(priority = 2)
	public void test_2() {
		System.out.println(" This is test case2");
	}
	
	@Test(priority = 1)
	public void test_3() {
		System.out.println(" This is test case3");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println(" This is after Method");
	}

	
	@AfterClass
	public void afterClass() {
		System.out.println(" This is after Class");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println(" This is after test");
	}
	

	@AfterSuite
	public void afterSuite() {
		System.out.println(" This is after suite");
	}
	
		
 }