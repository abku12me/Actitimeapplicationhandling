package zohocrm.testscript;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class excelsheet {
	@Test
	public void excel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fil=new FileInputStream("C:\\Users\\mishr\\OneDrive\\Desktop\\pagecreation\\exceldata.xlsx");
		Workbook book=WorkbookFactory.create(fil);
		Sheet sh=book.getSheet("Sheet1");
		sh.createRow(1).createCell(0).setCellValue("avinash");
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\mishr\\\\OneDrive\\\\Desktop\\\\pagecreation\\\\exceldata.xlsx");
		book.write(fos);
		fos.flush();
		
		
	}
	
	

}
