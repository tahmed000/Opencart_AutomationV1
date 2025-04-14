package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountConfirmationPage extends BasePage{

	//Part 1: Constructor
	public AccountConfirmationPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	//Part 2: Locators
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	WebElement YourAccountHasBeenCreatedPage;
	
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement btnContinue;
	
	
	
	//Part 3: Actions
	public boolean isYourAccountHasBeenCreatedPageDisplayed() {
	    return YourAccountHasBeenCreatedPage.isDisplayed();
	}
	
	public String getConfirmationMessage() {
	    return msgConfirmation.getText();
	}
	
	public void clickContinueButton() {
	    btnContinue.click();
	}
}
