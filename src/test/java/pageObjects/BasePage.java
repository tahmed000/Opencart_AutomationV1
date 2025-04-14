package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
WebDriver driver;

public BasePage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void scrollAndClick(WebElement element) {
    try {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000); // Give time if needed
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(element)).click();
    } catch (Exception e) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
}

}
