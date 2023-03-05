package pom_wo_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//POM-I
	//1. Data members/Global Variables should be declared globally with access level private by using @findby
	@FindBy(xpath="//input[@name='email']") private WebElement Mail;
	@FindBy(xpath="//input[@type='password']") private WebElement PSW;
	@FindBy(xpath="//button[@class='login100-form-btn']") private WebElement Login;
	
	  // 2. Initialize within a constructor with access level public using pagefactory 
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	   //3. Utilize within a method with access level public
	public void EnterMailID()
	{
		Mail.sendKeys("ceo@tellstar.in");
	}
	
	public void EnterPSW()
	{
		PSW.sendKeys("Test@1234");
	}

	public void ClickBtn()
	{
		Login.click();
	}
}
