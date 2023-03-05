package withoutDDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://dashboard.playboxtv.in/login");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ceo@tellstar.in");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//button[@class='login100-form-btn']")).click();

		Thread.sleep(2000);

		String ExpectedText = "TELLSTAR";
		WebElement title = driver.findElement(By.xpath("//h6[text()='TELLSTAR']"));
		String ActualText = title.getText();

		if (ExpectedText.equals(ActualText)) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}

	}

}
