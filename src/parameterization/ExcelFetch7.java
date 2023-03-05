package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFetch7 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// To fetch all data from excel

		FileInputStream F1 = new FileInputStream("C:\\Users\\Tellstar\\Desktop\\Dont Move File\\parameterization.xlsx");
		Sheet Sh = WorkbookFactory.create(F1).getSheet("Sheet3");

		int RowIndex = Sh.getLastRowNum();

		for (int i = 0; i <= RowIndex; i++) {
			int CellIndex = Sh.getRow(i).getLastCellNum() - 1;
			for (int a = 0; a <= CellIndex; a++) {
				String info = Sh.getRow(i).getCell(a).getStringCellValue();
				System.out.print("  " + info);
			}
			System.out.println();
		}

	}

}
