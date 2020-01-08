package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gurulogin {
	
	WebDriver driver;
	
	By username = By.name("uid");
	By paassword = By.name("password");
	By login = By.name("btnLogin");
	
	public Gurulogin (WebDriver bdriver) {
		this.driver = bdriver;
	}
	
	public void guruLoginpage(String uname, String pwd) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(paassword).sendKeys(pwd);
		driver.findElement(login).click();
	}
		/*public void setUsername()
		{
			driver.findElement(username).sendKeys("admin");
		}		

		public void setPassword()
		{
			driver.findElement(paassword).sendKeys("admin123");
		}		
		
		public void button()
		{
			driver.findElement(login).click();
		}	*/	
		
}
