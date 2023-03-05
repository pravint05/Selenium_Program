package pom_with_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboard.playboxtv.in/login");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//To reach upto Excelsheet
		FileInputStream file = new FileInputStream(
				"C:\\Users\\Tellstar\\Desktop\\Dont Move File\\parameterization.xlsx");
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet4");

		//Create Object of POM-1 Class	
		LoginPage L1 = new LoginPage(driver);
		//Enter MailID
		String MailID = Sh.getRow(2).getCell(1).getStringCellValue();
		L1.EnterMail(MailID);
		
		Thread.sleep(2000);
		
		//Enter password
		String Password = Sh.getRow(2).getCell(2).getStringCellValue();
		L1.EnterPSW(Password);
		
		Thread.sleep(2000);
		
		//Click Login Button
		L1.ClickLogin();
		
		Thread.sleep(2000);
		
		//Create Object of POM-2 Class	
		HomePage H1 = new HomePage(driver);
		String ExpectedTitle = Sh.getRow(2).getCell(3).getStringCellValue();
		H1.TitleGet(ExpectedTitle);

	}

}
