package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement resultMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement healthAndCareVisa;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement resultMessageYouMayNeedAVisa;

    public String getResultMessage() {
        return getTextFromElement(resultMessage);
    }
    public String getResultMessageForHealthAndCareVisa() {
        return getTextFromElement(healthAndCareVisa);
    }
    public String getResultMessageYouMayNeedAVisa() {
        return getTextFromElement(resultMessageYouMayNeedAVisa);
    }
}
