package testngpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Datadriventest 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream a1= new FileInputStream("C:\\Users\\aravi\\eclipse-workspace\\Selenium_Automation\\src\\Excell sheet\\Datadriven sample test.xlsx");
		Workbook wb=WorkbookFactory.create(a1);
		Sheet s=wb.getSheet("Login");
		Row r=s.getRow(0);
		Cell c=r.getCell(0);
		String username=c.getStringCellValue();
		System.out.println(username);
		Row r1=s.getRow(1);
		Cell c1=r1.getCell(0);
		String u1=c1.getStringCellValue();
		System.out.println(u1);
		
		String password=wb.getSheet("Login").getRow(3).getCell(0).getStringCellValue();
		System.out.println(password);
		String numbers=NumberToTextConverter.toText(wb.getSheet("Login").getRow(2).getCell(0).getNumericCellValue());
		System.out.println(numbers);
	}
}
