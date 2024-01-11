package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebLawtonBrodyADLPage extends Page {
    @Then("^\\[Web Lawton-Brody ADL Page] User should see the (.*) heading$")
    public void userSeesLawtonBrodyADLSubtabHeadings(String lawtonBrodyADLsubtabHeadingLocatorString) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(getPageLawtonBrodyADL().getLawtonBrodyADLsubtabHeadings(lawtonBrodyADLsubtabHeadingLocatorString).isDisplayed());
    }
    @When("^\\[Web Lawton-Brody ADL Page] User clicks on '(.*)' option radiobutton$")
    public void userClicksOnLawtonBrodyADLOptionsRadioButtons(String radioButtonOption) throws InterruptedException {
        Thread.sleep(100);
        getPageLawtonBrodyADL().getLawtonBrodyADLOptionsRadioButtons(radioButtonOption).click();
    }
    @And("^\\[Web Lawton-Brody ADL Page] User clicks on (.*) button$")
    public void userClicksOnLawtonBrodyADLButtons(String buttonLocatorString) throws InterruptedException {
        Thread.sleep(500);
        getPageLawtonBrodyADL().getLawtonBrodyADLButtons(buttonLocatorString).click();
    }
    @Then("^\\[Web Lawton-Brody ADL Page] User should see the '(.*)' alert$")
    public void userSeesLawtonBrodyADLSuccessAlerts(String successAlertsLocatorString) throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(getPageLawtonBrodyADL().getLawtonBrodyADLSuccessAlerts(successAlertsLocatorString).isDisplayed());
    }
    @When("^\\[Web Lawton-Brody ADL Page] User clicks on the close icon$")
    public void userClicksOnLawtonBrodyADLCloseIcon() throws InterruptedException {
        Thread.sleep(100);
        getPageLawtonBrodyADL().getLawtonBrodyADLCloseIcon().click();
    }
    @Then("^\\[Web Lawton-Brody ADL Page] User should see the (.*) tag at the top right corner of page$")
    public void userSeesLawtonBrodyADLIncompleteTag(String successAlertsLocatorString) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(getPageLawtonBrodyADL().getLawtonBrodyADLIncompleteTag(successAlertsLocatorString).isDisplayed());
    }
}
