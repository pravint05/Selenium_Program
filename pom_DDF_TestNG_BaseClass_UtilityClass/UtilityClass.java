package pom_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class UtilityClass {
	// fetch/read data from property file
	@Test
	public static String GetData(String key) throws IOException  {
		// To reach upto property file
		FileInputStream file = new FileInputStream(
				"C:\\Users\\Tellstar\\eclipse-workspace\\Selenium\\src\\pom_DDF_TestNG_BaseClass_UtilityClass\\PropertyFile.properties");

		// Create object of properties class
		Properties Prop = new Properties();

		// To open property file
		Prop.load(file);

		// To fetch/read data
		String Value1 = Prop.getProperty(key);
		return Value1;
	}

}
