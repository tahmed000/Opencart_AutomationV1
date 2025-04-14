package pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	//Part 1: Constructor
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Part 2: Locators
	@FindBy(xpath = "//h1[text()='Register Account']")
	WebElement headingRegisterAccount;
	
	@FindBy(id = "input-firstname")
	WebElement txtFirstName;

	@FindBy(id = "input-lastname")
	WebElement txtLastName;

	@FindBy(id = "input-email")
	WebElement txtEmail;

	@FindBy(id = "input-password")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkPrivacyPolicy;

	@FindBy(xpath = "//button[text()='Continue']")
	WebElement btnContinue;
	
	//Part 3: Actions
	public boolean isRegisterAccountPageDisplayed() {
	    return headingRegisterAccount.isDisplayed();
	}
	
	public void setFirstName(String fname) {
	    txtFirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
	    txtLastName.sendKeys(lname);
	}

	public void setEmail(String email) {
	    txtEmail.sendKeys(email);
	}

	public void setPassword(String password) {
	    txtPassword.sendKeys(password);
	}

//	public void agreeToPrivacyPolicy() {
//	    chkPrivacyPolicy.click();
//	}
	public void agreeToPrivacyPolicy() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", chkPrivacyPolicy);
	}

	public void clickContinue() {
		scrollAndClick(btnContinue);
	}
	


	
}
