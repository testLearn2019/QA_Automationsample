package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Logindemo {
	
	WebDriver driver;

	@FindBy(how=How.XPATH, using="//input[@id='email']")
	WebElement username;
		
	@FindBy(how=How.XPATH, using="//input[@name='pass']")
	WebElement password;

	@FindBy(how=How.XPATH, using="//input[text()='login_form_login_button uiButton uiButtonConfirm']")
	WebElement submit;
	
	public Logindemo(WebDriver adriver) {
		this.driver = adriver;
	}
	
	public void loginTestcase(String uname, String Pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(Pwd);
		submit.click();
		
	}
}

