package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;
import pageObjects.AccountConfirmationPage;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;


public class TC001_AccountRegistrationTest extends BaseClass {
	
	@Test
	public void verify_account_registration() throws InterruptedException
	{
		logger.info("***********Starting TC001 Test Case**********");
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount Link");
		hp.clickRegister();
		logger.info("Clicked on Register Link");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		regpage.isRegisterAccountPageDisplayed();
		
		regpage.setFirstName(randomString());
		regpage.setLastName(randomString());
		regpage.setEmail(randomAlphaNumeric()+".com");
		regpage.setPassword(randomString()+randomNumber());
		Thread.sleep(1000);
		regpage.agreeToPrivacyPolicy();
		Thread.sleep(1000);
		regpage.clickContinue();
		
		Thread.sleep(1000);
		AccountConfirmationPage AccConfPage=new AccountConfirmationPage(driver);
		String confmsg=AccConfPage.getConfirmationMessage();
		
		//Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		
		
		
	}
	
	

}
