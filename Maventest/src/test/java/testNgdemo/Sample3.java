/*package testNgdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample3 {

	
	@Parameters({ "browser" })
	
	@Test(priority=1)
	public void testCaseOne(String brow) {
		System.out.println("browser passed as :- " + brow);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Documents\\Harika\\Maventest\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@Parameters({ "browser" })
	@Test(priority=2)
	public void testCaseTwo(String brow) {
		System.out.println("browser passed as :- " + brow);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\OneDrive\\Documents\\Harika\\Maventest\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
}*/
