package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascript {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
//		driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//javascriptExecutor
		WebElement un = driver.findElement(By.xpath("//input[@data-test='username']"));
		
		JavascriptExecutor jsE = (JavascriptExecutor) driver;
//		WebElement username = (WebElement) jsE.executeScript(" return document.getElementById('user-name');");
//		username.sendKeys("standard_user");
		
		jsE.executeScript(" document.getElementById('user-name').setAttribute('style','border:8px red dash;background:yellow';color:blue)");
//		jsE.executeScript(" document.getElementById('user-name').value='standard_user';");
//		WebElement password = (WebElement)jsE.executeScript("return document.evaluate(\"//input[@placeholder='Password']\", document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;");
//	    password.sendKeys("secret_sauce");
//	    
//	    WebElement loginbtn = (WebElement) jsE.executeScript("return document.querySelectorAll('#login-button')[0];");
//	    loginbtn.click();
	
	
	}
}
