package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	//Part 1: Constructor
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Part 2: Locators
	@FindBy(xpath = "//h2[text()='My Account']")
	WebElement headingMyAccount;
	
	@FindBy(xpath = "//*[@id='column-right']//a[text()='Logout']")
	WebElement lnkLogoutFromPage;
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement lnkLogoutFromDropDownLink;
	
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement lnkMyAccount;
	
	//Part 3: Actions
	public boolean isMyAccountHeadingVisible() {
	    return headingMyAccount.isDisplayed();
	}
	
	public void clickLogoutFromPage() {
		lnkLogoutFromPage.click();
	}
	
	public void clickLogoutFromDD() {
	    lnkMyAccount.click();
	    lnkLogoutFromDropDownLink.click();
	}
}
