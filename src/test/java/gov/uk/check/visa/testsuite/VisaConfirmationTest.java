package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends BaseTest {

    StartPage startPage = new StartPage();
    ReasonForTravelPage reasonForTravelPage = new ReasonForTravelPage();
    SelectNationalityPage selectNationalityPage = new SelectNationalityPage();
    ResultPage resultPage = new ResultPage();
    DurationOfStayPage durationOfStayPage = new DurationOfStayPage();
    WorkTypePage workTypePage = new WorkTypePage();

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        startPage = new StartPage();
        reasonForTravelPage = new ReasonForTravelPage();
        selectNationalityPage = new SelectNationalityPage();
        resultPage = new ResultPage();
        durationOfStayPage = new DurationOfStayPage();
        workTypePage = new WorkTypePage();

    }


    @Test
    public void anAustralianComingToUKForTourism() {
        startPage.acceptAllCookies();
        startPage.clickOnHideThisMessage();
        // Click on start button
        startPage.clickStartNow();
        //	Select a Nationality 'Australia'
        selectNationalityPage.selectNationality("Australia");
        //	Click on Continue button
        selectNationalityPage.clickNextStepButton();
        //	Select reason 'Tourism'
        reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");
        //	Click on Continue button
        reasonForTravelPage.clickNextStepButton1();
        //	verify result 'You will not need a visa to come to the UK'
        String expectedMessage = "You will not need a visa to come to the UK";
        String actualMessage = resultPage.getResultMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void aChildrenComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
        startPage.acceptAllCookies();
        startPage.clickOnHideThisMessage();
        // Click on start button
        startPage.clickStartNow();
        //	Select a Nationality 'Chile'
        selectNationalityPage.selectNationality("Chile");
        //	Click on Continue button
        selectNationalityPage.clickNextStepButton();
        //	Select reason 'Work, academic visit or business'
        reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");
        //	Click on Continue button
        reasonForTravelPage.clickNextStepButton1();
        //	Select intent to stay for 'longer than 6 months'
        durationOfStayPage.clickOnLongerThan6Months();
        //	Click on Continue button
        durationOfStayPage.clickNextStepButton();
        //	Select have planning to work for 'Health and care professional'
        workTypePage.selectJobType("Health and care professional");
        //	Click on Continue button
        workTypePage.clickNextStepButton();
        //	verify result 'You need a visa to work in health and care'
        String expectedMessage = "You need a visa to work in health and care";
        String actualMessage = resultPage.getResultMessageForHealthAndCareVisa();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
    @Test
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.acceptAllCookies();
        startPage.clickOnHideThisMessage();
        // Click on start button
        startPage.clickStartNow();
        //	Select a Nationality 'Chile'
        selectNationalityPage.selectNationality("Colombia");
        //	Click on Continue button
        selectNationalityPage.clickNextStepButton();
        //	Select reason 'Join partner or family for a long stay'
        reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");
        //	Click on Continue button
        reasonForTravelPage.clickNextStepButton1();
        //	Select state My partner of family member have uk immigration status 'yes'
        //	Click on Continue button
        //	verify result 'You’ll need a visa to join your family or partner in the UK'
        String expectedResult = "You may need a visa";
        String actualResult = resultPage.getResultMessageYouMayNeedAVisa();
        Assert.assertEquals(actualResult,expectedResult);
    }


}
