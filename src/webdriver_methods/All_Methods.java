package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Methods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); // get
		Dimension D1 = driver.manage().window().getSize(); // getsize
		System.out.println(D1);
		Thread.sleep(1000);
		driver.manage().window().minimize(); // minimize
		Thread.sleep(2000);
		driver.manage().window().maximize(); // maximize
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://gtmetrix.com/"); // navigate
		String C1 = driver.getCurrentUrl(); // getcurrentUrl
		System.out.println(C1);
		Dimension D2 = new Dimension(500, 1000);
		driver.manage().window().setSize(D2); // setsize
		Point P1 = new Point(300, 100);
		driver.manage().window().setPosition(P1); // setposition
		Thread.sleep(2000);
		driver.navigate().to("https://dashboard.playboxtv.in/");
		String T1 = driver.getTitle(); // getTitle
		System.out.println(T1);
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Point P2 = driver.manage().window().getPosition();// getPosition
		System.out.println(P2);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.close(); // close
		Thread.sleep(2000);
		driver.quit(); // quit

	}

}
