package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//getText Method (get text of the webelement on the webpage)
		WebElement Text = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String T1 = Text.getText();
		System.out.println(T1);

		//isEnabled Method	(Forgotten password? link enabled or not)
		boolean Button = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).isEnabled();
		System.out.println(Button);

		//isDisplayed Method (facebook logo on login page displayed or not)
		boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		System.out.println(logo);

		  //SendKeys and clear method (Enter, clear and re-enter values in username field)
		WebElement UN = driver.findElement(By.xpath("//input[@name='email']"));
		UN.sendKeys("Pravin");		
		Thread.sleep(2000);
		UN.clear();					
		Thread.sleep(2000);
		UN.sendKeys("Ashwini");		 
		
		//click method (click on create new account button)
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _')]")).click();
		Thread.sleep(4000);

		//isSelected method (check radio button selected or not)
		boolean Radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
		System.out.println(Radio);

		Thread.sleep(4000);
		driver.quit();
		
	}

}
