package testclass;

import org.testng.annotations.Test;

import genriclib.basetest;
import genriclib.fileLib;
import testpages.loginpage;

public class logintest extends basetest {

	public loginpage lp;
	public basetest bt;
	public fileLib flib;
	
//	@Test
	public void loginpagetest() throws Throwable
	{
		lp = new loginpage(driver);
		lp.login(flib.readDataFromExcel(excel_path, "Sheet1", 1, 0), flib.readDataFromExcel(excel_path, "Sheet1", 1, 1));
        log.info("credentials are enterd");
	}
	
	@Test
	public void loginpagetest2() throws Throwable
	{
		lp = new loginpage(driver);
		lp.login(flib.readDataFromExcel(excel_path, "Sheet1", 1, 0), flib.readDataFromExcel(excel_path, "Sheet1", 1, 1));
        log.info("credentials are enterd");
        
       flib = new fileLib();
       flib.row_cell_count(excel_path, "Sheet2", );
       
       for(int i=1;i<)
       {
    	    
       }
        
        
        
	}
	
	
}
