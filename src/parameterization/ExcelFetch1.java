package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFetch1 {
	//How to fetch/read/retrive the data from excelsheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//To reach to the Excelsheet
		FileInputStream F1=new FileInputStream("C:\\Users\\Tellstar\\Desktop\\Dont Move File\\parameterization.xlsx");
		
		//To open Excelsheet
		Workbook W1=WorkbookFactory.create(F1);
	
		//To Enter perticular sheet
		Sheet S1=W1.getSheet("Sheet1");
		
	     //To highlight Row
		Row R1 =S1.getRow(0);
		
	     //To highlight Column/Cell
		Cell C1=R1.getCell(0);
		
	    //To fetch String Information    
		String info=C1.getStringCellValue();
		System.out.println(info);
		
		
	}

}
