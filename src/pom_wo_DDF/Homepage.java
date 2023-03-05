package pom_wo_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
//POM-II
	//1. Data members/Global Variables should be declared globally with access level private by using @findby
	
	@FindBy(xpath = "//h6[text()='TELLSTAR']")
	private WebElement title;

	
	  // 2. Initialize within a constructor with access level public using pagefactory 
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//3. Utilize within a method with access level public
	public void Name() {
		String ExpectedText = "TELLSTAR";
		String ActualText = title.getText();

		if (ExpectedText.equals(ActualText)) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}
	}

}
