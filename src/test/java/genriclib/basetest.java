package genriclib;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basetest implements IAutoConst {

   public WebDriver driver;
    public fileLib flib;
    public static Logger log;
    
	@BeforeTest
	public void openBrowser() throws Throwable
	{
		flib = new fileLib();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        log = Logger.getLogger("logs are started");
        driver.manage().window().maximize();
        log.info("browser get maximised");
        PropertyConfigurator.configure("E:\\Eclipse\\sausLabs\\src\\test\\resources\\properties\\config.properties");
        log.info("chrome launched");
        String AppUrl = flib.readData(config_file, "url");
        driver.get(AppUrl);
        log.info("application launched");
	
	}
	
//	@AfterTest
	public void closebrowser()
	{
		driver.quit();
	}
}
