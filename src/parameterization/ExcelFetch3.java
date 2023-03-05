package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFetch3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// To fetch Numeric information(Integer type)
		FileInputStream F1 = new FileInputStream("C:\\Users\\Tellstar\\Desktop\\Dont Move File\\parameterization.xlsx");

		Sheet Sh = WorkbookFactory.create(F1).getSheet("Sheet2");

		double D1 = Sh.getRow(0).getCell(0).getNumericCellValue();
		System.out.println(D1);

		// To fetch Numeric information(decimal type)
		double D2 = Sh.getRow(1).getCell(0).getNumericCellValue();
		System.out.println(D2);

		// To fetch Boolean data
		boolean D3 = Sh.getRow(0).getCell(1).getBooleanCellValue();
		System.out.println(D3);

		// To fetch Boolean data
		boolean D4 = Sh.getRow(1).getCell(1).getBooleanCellValue();
		System.out.println(D4);

		// To read numeric data as string (integer type)
		String D5 = Sh.getRow(2).getCell(0).getStringCellValue();
		System.out.println(D5);

		// To read numeric data as string
		String D6 = Sh.getRow(3).getCell(0).getStringCellValue();
		System.out.println(D6);

	}

}
