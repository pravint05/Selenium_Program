package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFetch4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// To find row index
		FileInputStream F1 = new FileInputStream("C:\\Users\\Tellstar\\Desktop\\Dont Move File\\parameterization.xlsx");
		int RowIndex = WorkbookFactory.create(F1).getSheet("Sheet3").getLastRowNum();
		System.out.println("Row Index = "+RowIndex);

		// To find size of row
		FileInputStream F2 = new FileInputStream("C:\\Users\\Tellstar\\Desktop\\Dont Move File\\parameterization.xlsx");
		int RowSize = WorkbookFactory.create(F2).getSheet("Sheet3").getLastRowNum() + 1;
		System.out.println("Row Size = "+RowSize);

		// To get size of column
		FileInputStream F3 = new FileInputStream("C:\\Users\\Tellstar\\Desktop\\Dont Move File\\parameterization.xlsx");
		int CellSize = WorkbookFactory.create(F3).getSheet("Sheet3").getRow(0).getLastCellNum();
		System.out.println("Cell Size = "+CellSize);

		// To get size of column
		FileInputStream F4 = new FileInputStream("C:\\Users\\Tellstar\\Desktop\\Dont Move File\\parameterization.xlsx");
		int CellIndex = WorkbookFactory.create(F4).getSheet("Sheet3").getRow(0).getLastCellNum() - 1;
		System.out.println("Cell Index = "+CellIndex);

	}
}
