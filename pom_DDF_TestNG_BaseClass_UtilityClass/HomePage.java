package pom_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//h6[text()='TELLSTAR']")
	private WebElement Title;

	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	
}
