package orangedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoregistration {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Documents\\Harika\\Maventest\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Harika");
		driver.findElement(By.name("lastName")).sendKeys("Yangala");
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Harika@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='userName']//following::input[@name='address1']")).sendKeys("jude");
		driver.findElement(By.xpath("//input[@name='address1']//following::input[@name='city']")).sendKeys("street");
		
		driver.findElement(By.xpath("//input[@name='postalCode']//preceding::input[@name='state']")).sendKeys("TN");
		driver.findElement(By.name("postalCode")).sendKeys("1234");
		
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA");
		
		//driver.findElement(By.name("postalCode")).sendKeys("1234");
		//driver.findElement(By.name("postalCode")).sendKeys("1234");
		//driver.findElement(By.name("postalCode")).sendKeys("1234");
		
		
	}

}
