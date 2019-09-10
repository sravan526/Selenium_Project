/*package Java;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadData {

	
		
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
		//Reading data from excel sheet
		FileInputStream fis=new FileInputStream("C:\\Users\\sravan kumr annam\\Desktop\\sravan.xlsx");
		
	Workbook wb=WorkbookFactory.create(fis);
	
	Sheet s=wb.getSheet("Data");
		
		Row r=s.getRow(1);
	
	Cell c1=r.getCell(0);
			System.out.println(c1);
		
	Cell c2=r.getCell(1);
	
		System.out.println(c2);
	
	}

}*/
