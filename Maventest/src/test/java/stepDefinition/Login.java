package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	WebDriver driver;

	@Given("^Open chrome and launch url$")
	public void open_chrome_and_launch_url() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Documents\\Harika\\Maventest\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	    //throw new PendingException();
	}

	@When("^I enter login credentials$")
	public void i_enter_login_credentials() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//div[@id='logInPanelHeading']//following::input[@id='txtPassword']")).sendKeys("admin123");
	    //throw new PendingException();
	}

	@And("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	    //throw new PendingException();
	}

	@Then("^Homepage is displayed$")
	public void homepage_is_displayed() throws Throwable {
	    System.out.println("Homepage is displayed");
	   // throw new PendingException();
	}
}
