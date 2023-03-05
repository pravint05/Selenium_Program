package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFetch6 {

	// To fetch data of perticular Column

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream F1 = new FileInputStream("C:\\Users\\Tellstar\\Desktop\\Dont Move File\\parameterization.xlsx");
		Sheet Sh = WorkbookFactory.create(F1).getSheet("Sheet3");
		int RowIndex = Sh.getLastRowNum();

		for (int i = 0; i <= RowIndex; i++) {
			String info = Sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(info);
		}

	}

}
