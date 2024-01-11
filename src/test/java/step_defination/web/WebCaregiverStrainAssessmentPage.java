package step_defination.web;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebCaregiverStrainAssessmentPage extends Page {

    CommonFunctions commonFunctions = new CommonFunctions();

    @Then("^\\[Web Caregiver Strain Assessment Page] User should see the (.*) heading$")
    public void userSeesCaregiverStrainAssessmentHeadings(String headingsLocatorString) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageCaregiverStrainAssessment().getCGStrainsAssessmentHeadings(headingsLocatorString).isDisplayed());
    }
    @When("^\\[Web Caregiver Strain Assessment Page] User clicks on (.*) dropdown$")
    public void userClicksOnCGAssessmentDropdowns(String dropdownLocatorString) throws InterruptedException {
        Thread.sleep(500);
        getPageCaregiverStrainAssessment().getCGAssessmentDropdowns(dropdownLocatorString).click();
    }
    @And("^\\[Web Caregiver Strain Assessment Page] User clicks on '(.*)' option$")
    public void userClicksOnCGAssessmentDropdownOptions(String dropdownOptionsLocatorString) throws InterruptedException {
        Thread.sleep(500);
        getPageCaregiverStrainAssessment().getCGAssessmentDropdownOptions(dropdownOptionsLocatorString).click();
    }
    @And("^\\[Web Caregiver Strain Assessment Page] User clicks on (.*) option for question (.*)$")
    public void userClicksOnCGAssessmentOptionsRadioButton(String optionsRadioButtonLocatorString1, String optionsRadioButtonLocatorString2) throws InterruptedException {
        Thread.sleep(200);
        String resultLocator = commonFunctions.decrementStringNumber(optionsRadioButtonLocatorString2);
        System.out.println(resultLocator);
        getPageCaregiverStrainAssessment().getCGAssessmentOptionsRadioButton(resultLocator, optionsRadioButtonLocatorString1).click();
    }
    @And("^\\[Web Caregiver Strain Assessment Page] User clicks on (.*) button$")
    public void userClicksOnCGAssessmentButtons(String buttonsLocatorString) throws InterruptedException {
        Thread.sleep(500);
        getPageCaregiverStrainAssessment().getCGAssessmentButtons(buttonsLocatorString).click();
    }
    @Then("^\\[Web Caregiver Strain Assessment Page] User should see the '(.*)' alert$")
    public void userSeesCGAssessmentSuccessAlert(String successAlertLocatorString) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageCaregiverStrainAssessment().getCGStrainsAssessmentSuccessAlert(successAlertLocatorString).isDisplayed());
    }
    @And("^\\[Web Caregiver Strain Assessment Page] User clicks on the close icon$")
    public void userClicksOnCGAssessmentCloseIcon() throws InterruptedException {
        Thread.sleep(500);
        getPageCaregiverStrainAssessment().getCGAssessmentCloseIcon().click();
    }
    @And("^\\[Web Caregiver Strain Assessment Page] User should see an (.*) Tag on top right corner of page$")
    public void userClicksOnCGAssessmentIncompleteTag(String incompleteTagLocatorString) throws InterruptedException {
        Thread.sleep(1000);
        getPageCaregiverStrainAssessment().getCGAssessmentIncompleteTag(incompleteTagLocatorString).click();
    }
}