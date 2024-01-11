package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebForgotPasswordPage extends Page {

    @Then("^\\[Web Forgot Password Page] User should see the (.*) heading$")
    public void userSeesForgotPasswordPageH1Headings(String forgotPasswordPageHeadingLocatorString) throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(getPageForgotPassword().getForgotPasswordH1Heading(forgotPasswordPageHeadingLocatorString).isDisplayed());
    }
    @When("^\\[Web Forgot Password Page] User enters recovery email address (.*)$")
    public void enterRecoveryEmailAddress(String recoveryEmail) throws InterruptedException {
        Thread.sleep(500);
        getPageForgotPassword().getEnterRecoveryEmail().sendKeys(recoveryEmail);
    }
    @When("^\\[Web Forgot Password Page] User clicks on (.*) button$")
    public void clickOnResetPasswordButton(String forgotPasswordButtonLocatorString) throws InterruptedException {
        Thread.sleep(500);
        getPageForgotPassword().getResetPasswordButton(forgotPasswordButtonLocatorString).click();
    }
    @Then("^\\[Web Forgot Password Page] User should see the (.*) alert$")
    public void userSeesForgotPasswordPageSuccessAlert(String forgotPasswordPageSuccessAlertLocatorString) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(getPageForgotPassword().getForgotPasswordSuccessAlert(forgotPasswordPageSuccessAlertLocatorString).isDisplayed());
    }
    @When("^\\[Web Forgot Password Page] User clicks on cross button to close the alert$")
    public void userClicksOnResetPasswordSuccessAlertCrossButton() throws InterruptedException {
        Thread.sleep(500);
        getPageForgotPassword().getResetPasswordSuccessAlertCrossButton().click();
    }
    @Then("^\\[Web Forgot Password Page] User should see the (.*) inputbox$")
    public void userSeesForgotPasswordInputboxes(String forgotPasswordPageInputboxLocatorString) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(getPageForgotPassword().getForgotPasswordInputbox(forgotPasswordPageInputboxLocatorString).isDisplayed());
    }
}
