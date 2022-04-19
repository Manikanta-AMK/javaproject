package practice;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class filelib {
	
	public static void main(String[] args) throws Throwable {

		FileInputStream fis = 	new FileInputStream("E:\\Eclipse\\sausLabs\\src\\test\\resources\\properties\\Book1.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);	
        XSSFSheet sh = wb.getSheet("Sheet1");
        
        int rowcount = sh.getLastRowNum();
        int cellcount = sh.getRow(0).getLastCellNum();
        
        for(int i=1;i<rowcount;i++)
        {
        	XSSFRow currentrow = sh.getRow(i);
        	for(int j=0;j<cellcount;j++)
        	{
        		String value = currentrow.getCell(j).toString();
        		System.out.println(value);
        	}
        	System.out.println(" ");
        }
        
	}
}
