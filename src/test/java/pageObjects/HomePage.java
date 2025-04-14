package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	//Part 1: Constructor
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	//Part 2: Locators
	@FindBy(xpath="//*[text()='Your Store']")
	WebElement homePageTitle;
	
	@FindBy(xpath="//*[@id='top']//span[text()='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement lnkLogin;

	
	//Part 3: Actions
	public boolean isHomePageDisplayed() 
	{
	    return homePageTitle.isDisplayed();
	}
	
	public void clickMyAccount() 
	{
		lnkMyAccount.click();
	}
	
	public void clickLogin() 
	{
		lnkLogin.click();
	}
	public void clickRegister() 
	{
		lnkRegister.click();
	}
}
