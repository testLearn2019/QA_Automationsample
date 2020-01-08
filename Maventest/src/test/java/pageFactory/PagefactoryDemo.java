package pageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PagefactoryDemo {
	
	WebDriver driver;

	@BeforeClass
	public void browserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Documents\\Harika\\Maventest\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void runningTestcase() {
		
		Logindemo aobj = PageFactory.initElements(driver, Logindemo.class);
		aobj.loginTestcase("Harika", "Password");

  }
}