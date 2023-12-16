package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space() = '6 months or less')]")
    WebElement lessThanSixMonths;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

//    public void selectLengthOfStay(String moreOrLess) {
//        switch (moreOrLess) {
//            case "1":
//                clickOnElement(lessThanSixMonths);
//                break;
//            case "2":
//                clickOnElement(moreThanSixMonths);
//                break;
//        }
//    }

    public void clickOnLongerThan6Months(){
        clickOnElement(moreThanSixMonths);

    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
    }
}
