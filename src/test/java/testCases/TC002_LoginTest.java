package testCases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	
	@Test
	public void verify_login()
	{
		logger.info("*******Starting TC002_LoginTest**********");
		
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail(p.getProperty("email"));
		lp.enterPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targerPage=macc.isMyAccountHeadingVisible();
		Assert.assertEquals(targerPage, true, "Login Failed");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("*******Finished TC002_LoginTest**********");
	}

}
