 package Facebook;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test_data 
{
	String Username;
	String Password;
 public void exceldata() throws EncryptedDocumentException, IOException
	{
		FileInputStream a1= new FileInputStream("D:\\Automation\\DataDriven\\Usernamepassword.xlsx\\");
		Workbook wb=WorkbookFactory.create(a1);
		//Sheet s=wb.getSheet("Login");
		Username=wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		Password=wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
	}
}
