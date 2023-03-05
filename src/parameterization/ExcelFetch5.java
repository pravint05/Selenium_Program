package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFetch5 {

	// To fetch data of perticular Row

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream F1 = new FileInputStream("C:\\Users\\Tellstar\\Desktop\\Dont Move File\\parameterization.xlsx");

		Sheet Sh = WorkbookFactory.create(F1).getSheet("Sheet3");

		int CellIndex = Sh.getRow(0).getLastCellNum() - 1;

		for (int i = 0; i <= CellIndex; i++) {
			String info = Sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(info);
		}
	}

}
