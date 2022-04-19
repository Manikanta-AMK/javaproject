package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	
	
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='app_logo']") WebElement app_Logo;
	
	
	public boolean application_logo()
	{
		return app_Logo.isDisplayed();
	}
	
	
}
