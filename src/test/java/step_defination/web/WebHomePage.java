package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebHomePage extends Page {

    @Then("^\\[Web Home Page] User should see (.*) tab in heading")
    public void userShouldSeeHomePageTabs(String homePageTabLocatorString) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(getPageHomeWeb().getHomePageTabs(homePageTabLocatorString).isDisplayed());
    }
    @And("^\\[Web Home Page] User should see the (.*) heading$")
    public void userShouldSeeHomePageH2Headings(String h2HeadingLocatorString) throws InterruptedException {
        Thread.sleep(200);
        Assert.assertTrue(getPageHomeWeb().getWelcomeHeading(h2HeadingLocatorString).isDisplayed());
        Thread.sleep(3000);
    }
    @When("^\\[Web Home Page] User clicks on profile dropdown from home page$")
    public void userClicksOnHomePageProfileDropdown() throws InterruptedException {
        Thread.sleep(3000);
        getPageHomeWeb().getHomePageProfileDropdownHome().click();
    }
    @When("^\\[Web Home Page] User clicks on (.*) button from home page$")
    public void userClicksOnHomePageLogout$ChangePasswordButtons(String homePageProfileDropdownButtonsLocatorString) throws InterruptedException {
        Thread.sleep(1000);
        getPageHomeWeb().getHomePageProfileDropdownButtons(homePageProfileDropdownButtonsLocatorString).click();
    }
    @When("^\\[Web Home Page] User enters in the senior list search textbox (.*)$")
    public void userEntersSeniorNameInSearchTextbox(String seniorNameForSearch) throws InterruptedException {
        Thread.sleep(3000);
        getPageHomeWeb().getSeniorNameInSearchTextbox().sendKeys(seniorNameForSearch);
    }
    @And("^\\[Web Home Page] User clicks on the top senior Zubair (.*) after search$")
    public void clickOnTopSeniorAfterSearch(String seniorInList) throws InterruptedException {
        Thread.sleep(3000);
        getPageHomeWeb().getTopSeniorAfterSearch(seniorInList).click();
    }
}
