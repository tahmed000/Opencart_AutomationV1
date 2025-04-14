package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	//Part 1: Constructor
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Part 2: Locators
	// Page Title: Login
	@FindBy(xpath = "//h2[text()='Returning Customer']")
	WebElement LoginPageTitle;

	// Email Input
	@FindBy(id = "input-email")
	WebElement txtEmail;

	// Password Input
	@FindBy(id = "input-password")
	WebElement txtPassword;

	// Login Button
	@FindBy(xpath = "//button[text()='Login']")
	WebElement btnLogin;

	// Continue Button for New Customer section (optional)
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement btnContinue;
	
	//Part 3: Actions
	public boolean isLoginPageTitleDisplayed() {
	    return LoginPageTitle.isDisplayed();
	}

	public void enterEmail(String email) {
	    txtEmail.sendKeys(email);
	}

	public void enterPassword(String password) {
	    txtPassword.sendKeys(password);
	}

	public void clickLogin() {
	    btnLogin.click();
	}

	public void clickContinueAsNewCustomer() {
	    btnContinue.click();
	}
	
	
}
