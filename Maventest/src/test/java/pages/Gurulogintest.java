package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gurulogintest {

	WebDriver driver;
	@BeforeClass
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\git\\QA_Automationsample\\Maventest\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
	}
	
	@Test (priority=0)
	public void runTestcase() {
		
		Gurulogin aaobj = new Gurulogin(driver);
		aaobj.guruLoginpage("admin", "admin123");
 }
}