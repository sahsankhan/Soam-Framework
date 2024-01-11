package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebWellnessSurveyPage extends Page {
    @When("^\\[Web Wellness Survey Page] User should see the (.*) heading$")
    public void userSeesWellnessSurveyPageH3Heading(String wellnessSurveyPageH3HeadingsLocatorString) throws InterruptedException {
        Thread.sleep(2000);
        getPageWellnessSurvey().getWellnessSurveyPageMainHeading(wellnessSurveyPageH3HeadingsLocatorString).click();
    }
    @When("^\\[Web Wellness Survey Page] User clicks on wellness survey reset button$")
    public void userClicksOnWellnessSurveyResetButton() throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getWellnessSurveyResetButton().click();
    }
    @And("^\\[Web Wellness Survey Page] User clicks on wellness survey save button$")
    public void userClicksOnWellnessSurveySaveButton() throws InterruptedException {
        Thread.sleep(2000);
        getPageWellnessSurvey().getWellnessSurveySaveButton().click();
    }
    @Then("^\\[Web Wellness Survey Page] User should see limit reached alert popup$")
    public void userSeesWellnessSurveyLimitReachedAlertPopup() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageWellnessSurvey().getWellnessSurveyLimitReachedAlertPopup().isDisplayed());
    }
    @When("^\\[Web Wellness Survey Page] User clicks on alert popup okay button$")
    public void userClicksOnWellnessSurveyAlertPopupOkayButton() throws InterruptedException {
        Thread.sleep(2000);
        getPageWellnessSurvey().getWellnessSurveyAlertPopupOkayButton().click();
    }
    @When("^\\[Web Wellness Survey Page] User clicks on Wellness Survey (.*) button$")
    public void userClicksOnWellnessSurveyButtons(String SubmitButtonLocatorString) throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getWellnessSurveyButtons(SubmitButtonLocatorString).click();
    }
    @When("^\\[Web Wellness Survey Page] User Select (.*) radio button$")
    public void userClicksOnXxxRadioButtonOnWellnessSurveyForm(String ButtonName) throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getRadioButtonLocator(ButtonName).click();
    }
    @And("^\\[Web Wellness Survey Page] User Select (.*) answer/option for (.*)$")
    public void userClicksOnAnswerRadioButtons(String answerRadioButton, String questionFieldLocatorString) throws InterruptedException {
        Thread.sleep(500);
        String resultLocator = null;
        switch(questionFieldLocatorString) {
            case "relax":           resultLocator = "answer."+questionFieldLocatorString+".value";
                break;
            case "happiness":       resultLocator = "answer."+questionFieldLocatorString+".value";
                break;
            case "energy":          resultLocator = "answer."+questionFieldLocatorString+".value";
                break;
            case "purpose":         resultLocator = "answer."+questionFieldLocatorString+".value";
                break;
            case "engagement":      resultLocator = "answer."+questionFieldLocatorString+".value";
                break;
            case "social":          resultLocator = "answer."+questionFieldLocatorString+".value";
                break;
            case "comfort":         resultLocator = "answer."+questionFieldLocatorString+".value";
                break;
            default:
                break;
        }
        getPageWellnessSurvey().getAnswerRadioButtonLocator(answerRadioButton, resultLocator).click();
    }
    @And("^\\[Web Wellness Survey Page] User inputs (.*) in the comment for (.*)")
    public void userEntersComment(String commentInput, String questionFieldLocatorString) throws InterruptedException {
        Thread.sleep(500);
        String resultLocator = null;
        switch(questionFieldLocatorString) {
            case "relax":           resultLocator = "answer."+questionFieldLocatorString+".comment";
                break;
            case "happiness":       resultLocator = "answer."+questionFieldLocatorString+".comment";
                break;
            case "energy":          resultLocator = "answer."+questionFieldLocatorString+".comment";
                break;
            case "purpose":         resultLocator = "answer."+questionFieldLocatorString+".comment";
                break;
            case "engagement":      resultLocator = "answer."+questionFieldLocatorString+".comment";
                break;
            case "social":          resultLocator = "answer."+questionFieldLocatorString+".comment";
                break;
            case "comfort":         resultLocator = "answer."+questionFieldLocatorString+".comment";
                break;
            default:
                break;
        }
        getPageWellnessSurvey().getCommentInput(resultLocator).sendKeys(commentInput);
    }
    @Then("^\\[Web Wellness Survey Page] User should see the (.*) alert$")
    public void userSeesWellnessSurveySuccessAlert(String successAlertLocatorString) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageWellnessSurvey().getWellnessSurveySuccessAlert(successAlertLocatorString).isDisplayed());
    }
}
