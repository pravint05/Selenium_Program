package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// To enter URL on the webpage/To open an application
		driver.get("file:///E:/Velocity%20morning%20batch/Notes/Morning/Selenium/MultiselectableListbox.html");

		driver.manage().window().maximize();

		// Step-I:Identify Listbox(find Address of listbox)and store it into an Object
		WebElement E1 = driver.findElement(By.xpath("//select[@id='1234']"));

		// Step-II:Create object of Select Class
		Select S1 = new Select(E1);

		// To check whether listbox is multiselectable or not?
		boolean listbox = S1.isMultiple();
		System.out.println(listbox);

		// select multiple options
		S1.selectByVisibleText("Pak");
		S1.selectByVisibleText("Aus");
		S1.selectByVisibleText("Ind");

		// To get text of all selected option
		List<WebElement> A1 = S1.getAllSelectedOptions();

		for (WebElement L1 : A1) {
			System.out.println(L1.getText());
		}

		Thread.sleep(3000);

		// deselect particular option
		S1.deselectByVisibleText("Pak");

		Thread.sleep(2000);

		// deselect all options
		S1.deselectAll();

		Thread.sleep(2000);
		driver.quit();

	}

}
