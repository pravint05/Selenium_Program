package pom_wo_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboard.playboxtv.in/login");
		
		//Create Object of POM-1 Class	
		Loginpage L1=new Loginpage(driver);
		L1.EnterMailID();
		L1.EnterPSW();
		L1.ClickBtn();
		
		Thread.sleep(3000);
		//Create Object of POM-II Class	
		Homepage H1=new Homepage(driver);
		H1.Name();
		
	}

}
