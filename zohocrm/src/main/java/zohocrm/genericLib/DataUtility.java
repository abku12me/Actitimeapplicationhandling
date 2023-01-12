package zohocrm.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	
	public String datafrompro(String key) throws IOException
	{
		FileInputStream fil=new FileInputStream("C:\\Users\\mishr\\OneDrive\\Desktop\\pagecreation\\zoho.txt"); 
		Properties poj=new Properties();
		poj.load(fil);
		String value=poj.getProperty(key);
		return value;
		
	}
	
	public String datafromexcel(String sheetname,int num, int index) throws EncryptedDocumentException, IOException
	{
		FileInputStream fil=new FileInputStream("C:\\Users\\mishr\\OneDrive\\Desktop\\pagecreation\\zell.xlsx");
		Workbook book=WorkbookFactory.create(fil);
		Sheet se=book.getSheet(sheetname);
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(se.getRow(num).getCell(index));
		return value;
		
	}

}
