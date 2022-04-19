package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	public loginpage(WebDriver rdriver) {
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="user-name") WebElement un;
	@FindBy(id="password") WebElement pwd;
	@FindBy(xpath="//input[@value='Login']") WebElement lg_Btn;
	
	public void login(String username, String password)
	{
		un.sendKeys(username);
		pwd.sendKeys(password);
		lg_Btn.click();
	}
	
}
