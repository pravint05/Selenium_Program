package pom_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//POM-1

	//1. Data members/Global Variables should be declared globally with access level private by using @findby.

	@FindBy(xpath = "//input[@name='email']")
	private WebElement Mail;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement PSW;
	@FindBy(xpath = "//button[@class='login100-form-btn']")
	private WebElement Login;

	  // 2. Initialize within a constructor with access level public using pagefactory        
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//3. Utilize within a method with access level public
	public void EnterMail(String MailID) {
		Mail.sendKeys(MailID);
	}

	public void EnterPSW(String Password) {
		PSW.sendKeys(Password);
	}

	public void ClickLogin() {
		Login.click();
	}

}
