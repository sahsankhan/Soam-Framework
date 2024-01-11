package step_defination.web;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebKatzIndexOfIndependenceInADL extends Page {
    @Then("^\\[Web Katz Index of Independence in ADL Page] User should see the (.*) heading$")
    public void userSeesKatzADLHeadings(String headingsLocatorString) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageKatzADL().getKatzADLHeadings(headingsLocatorString).isDisplayed());
    }
    @When("^\\[Web Katz Index of Independence in ADL Page] User clicks on '(.*)' option radiobutton$")
    public void userClicksOnKatzADLOptionsRadioButtons(String radioButtonsLocatorString) throws InterruptedException {
        Thread.sleep(100);
        getPageKatzADL().getKatzADLOptionsRadioButtons(radioButtonsLocatorString).click();
    }
    @And("^\\[Web Katz Index of Independence in ADL Page] User clicks on (.*) button$")
    public void userClicksOnKatzADLButtons(String buttonsLocatorString) throws InterruptedException {
        Thread.sleep(500);
        getPageKatzADL().getKatzADLButtons(buttonsLocatorString).click();
    }
    @Then("^\\[Web Katz Index of Independence in ADL Page] User should see the '(.*)' alert$")
    public void userSeesKatzADLSuccessAlert(String successAlertLocatorString) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageKatzADL().getKatzADLSuccessAlert(successAlertLocatorString).isDisplayed());
    }
    @When("^\\[Web Katz Index of Independence in ADL Page] User clicks on close icon$")
    public void userClicksOnKatzADLCloseIcon() throws InterruptedException {
        Thread.sleep(200);
        getPageKatzADL().getKatzADLCloseIcon().click();
    }
    @When("^\\[Web Katz Index of Independence in ADL Page] User clicks on View link$")
    public void userClicksOnKatzADLViewLink() throws InterruptedException {
        Thread.sleep(200);
        getPageKatzADL().getKatzADLViewLink();
    }
    @Then("^\\[Web Katz Index of Independence in ADL Page] User should see the (.*) button$")
    public void userSeesKatzADLButtons(String buttonsLocatorString) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageKatzADL().getKatzADLButtons(buttonsLocatorString).isDisplayed());
    }
}