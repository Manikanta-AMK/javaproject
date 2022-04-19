package testclass;

import org.testng.Assert;
import org.testng.annotations.Test;
import testpages.homepage;
import genriclib.basetest;

public class homepageTest extends logintest {

	homepage hp;
	logintest lt;
	@Test(priority=1)
	public void login() throws Throwable
	{
		lt = new logintest();
		lt.loginpagetest();
	}
	
	@Test(priority=2)
	public void homepage()
	{
		 hp = new homepage(driver);
		Assert.assertTrue(hp.application_logo());
	}
}
