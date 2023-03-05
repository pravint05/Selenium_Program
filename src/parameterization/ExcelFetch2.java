package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFetch2 {
	// How to fetch/read/retrive the data from excelsheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// To reach to the Excelsheet
		FileInputStream F1 = new FileInputStream("C:\\Users\\Tellstar\\Desktop\\Dont Move File\\parameterization.xlsx");

		// To fetch Information
		String info = WorkbookFactory.create(F1).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(info);
	}

}
