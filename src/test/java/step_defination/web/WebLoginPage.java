package step_defination.web;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebLoginPage extends Page {

    @When("^\\[Web Login Page] User enters (.*) (.*)$")
    public void userEntersLoginPageInputboxes(String loginPageInputboxLocatorString, String password) throws InterruptedException {
        Thread.sleep(1000);
        getPageLoginWeb().getLoginPageInputbox(loginPageInputboxLocatorString).sendKeys(password);
    }
    @When("^\\[Web Login Page] User clicks on (.*) button$")
    public void clickOnLoginPageButtons(String loginPageButtonLocatorString) throws InterruptedException {
        Thread.sleep(1000);
        getPageLoginWeb().getLoginPageButtons(loginPageButtonLocatorString).click();
    }
    @When("^\\[Web Login Page] User clicks on Forgot your password link$")
    public void clickOnForgotPassword() throws InterruptedException {
        Thread.sleep(1000);
        getPageLoginWeb().getLoginPageForgotPassword().click();
    }
}
