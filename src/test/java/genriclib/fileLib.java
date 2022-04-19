package genriclib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fileLib {

	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow r;
	public static Properties prop;

	public String readDataFromExcel(String excel_path, String Sheet, int row, int cell) throws Throwable {
		fis = new FileInputStream(excel_path);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(Sheet);
		r = sh.getRow(row);
		String value = r.getCell(cell).toString();
		return value;
	}
	
	public void row_cell_count(String excel_path, String Sheet, int row) throws Throwable
	{
		fis = new FileInputStream(excel_path);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(Sheet);
		int rc= sh.getLastRowNum();
		int cc = sh.getRow(row).getLastCellNum();
		
	}

	public String readData(String config_file, String url) throws Throwable {
		fis = new FileInputStream(config_file);
		prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(url, "invalid key");
		return value;
	}

	public String logs(String Logs_Path) throws Throwable {
		fis = new FileInputStream(Logs_Path);
		prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(Logs_Path, "invalid key");
		return value;

	}

}
