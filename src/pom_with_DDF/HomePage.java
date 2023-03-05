package pom_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//POM-2

	//1. Data members/Global Variables should be declared globally with access level private by using @findby.

	@FindBy(xpath = "//h6[text()='TELLSTAR']")
	private WebElement Title;

	  // 2. Initialize within a constructor with access level public using pagefactory        
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//3. Utilize within a method with access level public
	public void TitleGet(String ExpectedTitle) {
		String ActualTitle = Title.getText();

		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
