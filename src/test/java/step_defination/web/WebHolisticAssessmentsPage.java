package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebHolisticAssessmentsPage extends Page {
    @Then("^\\[Web Holistic Assessment Page] User should see the (.*) heading$")
    public void userSeesAssessmentsTabHeadings(String assessmentsTabHeadingLocatorString) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(getPageHolisticAssessments().getHolisticAssessmentTabHeadings(assessmentsTabHeadingLocatorString).isDisplayed());
    }
    @When("^\\[Web Holistic Assessment Page] User clicks on (.*) option in (.*)$")
    public void userClicksOnHolisticAssessmentRadiobuttons(String radioButtonOption, String radioButtonid) throws InterruptedException {
        Thread.sleep(100);
        getPageHolisticAssessments().getHolisticAssessmentRadioButtonOptions(radioButtonOption, radioButtonid).click();
    }
    @And("^\\[Web Holistic Assessment Page] User clicks on (.*) button$")
    public void userClicksOnHolisticAssessmentButtons(String buttonLocatorString) throws InterruptedException {
        Thread.sleep(500);
        getPageHolisticAssessments().getHolisticAssessmentButtons(buttonLocatorString).click();
    }
    @Then("^\\[Web Holistic Assessment Page] User should see the '(.*)' alert$")
    public void userSeesSuccessAlert(String successAlertLocatorString) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageHolisticAssessments().getHolisticAssessmentSuccessAlert(successAlertLocatorString).isDisplayed());
    }
    @When("^\\[Web Holistic Assessment Page] User clicks on (.*) side-tab$")
    public void userClicksOnADLAssessmentSidetab(String assessmentsSidetabLocatorString) throws InterruptedException {
        Thread.sleep(500);
        getPageHolisticAssessments().getAssessmentSidetabs(assessmentsSidetabLocatorString).click();
    }
    @And("^\\[Web Holistic Assessment Page] User clicks on the close icon$")
    public void userClicksOnCGAssessmentCloseIcon() throws InterruptedException {
        Thread.sleep(500);
        getPageHolisticAssessments().getHolisticAssessmentCloseIcon().click();
    }
    @And("^\\[Web Holistic Assessment Page] User should see the (.*) tag at the right top corner of page$")
    public void userSeesHolisticAssessmentIncompleteTag(String incompleteTagLocatorString) throws InterruptedException {
        Thread.sleep(1000);
        getPageHolisticAssessments().getHolisticAssessmentIncompleteTag(incompleteTagLocatorString).click();
    }
}