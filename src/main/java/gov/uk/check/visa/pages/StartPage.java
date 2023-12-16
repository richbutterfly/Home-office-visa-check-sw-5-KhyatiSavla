package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNowButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Hide this message')]")
    WebElement hideTheMessage;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement acceptCookies;

    public void clickStartNow(){
        clickOnElement(startNowButton);
    }
    public void acceptAllCookies(){
        clickOnElement(acceptCookies);
    }
    public void clickOnHideThisMessage (){
        clickOnElement(hideTheMessage);
    }
}
