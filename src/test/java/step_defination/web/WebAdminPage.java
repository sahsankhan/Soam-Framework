package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebAdminPage extends Page {

    @Then("^\\[Web Admin Page] User should see (.*) tab in the header$")
    public void userShouldSeeAdminPageTabs(String adminPageTabLocatorString) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageAdminWeb().getAdminPageTabs(adminPageTabLocatorString).isDisplayed());
    }
    @And("^\\[Web Admin Page] User should see (.*) heading$")
    public void userShouldSeeAdminPageHeadings(String adminPageHeadingLocatorString) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageAdminWeb().getAdminPageHeadings(adminPageHeadingLocatorString).isDisplayed());
    }
    @When("^\\[Web Admin Page] User clicks on (.*) button from admin tab$")
    public void userClicksOnAdminPageTabs(String adminPageTabLocatorString) throws InterruptedException {
        Thread.sleep(3000);
        getPageAdminWeb().getAdminPageTabs(adminPageTabLocatorString).click();
    }
    @When("^\\[Web Admin Page] User clicks on Profile dropdown from Admin page$")
    public void userClicksOnAdminPageProfileDropdown() throws InterruptedException {
        Thread.sleep(3000);
//        String profileDropdownLocatorString = "M16.59 8.59 12 13.17 7.41 8.59 6 10l6 6 6-6z";
//        getPageAdminWeb().getAdminPageProfileDropdown(profileDropdownLocatorString).click();
        getPageAdminWeb().getAdminPageProfileDropdown().click();
    }
    @When("^\\[Web Admin Page] User clicks on (.*) button from Admin page$")
    public void userClicksOnAdminPageLogout$ChangePasswordButtons(String adminPageProfileDropdownButtonsLocatorString) throws InterruptedException {
        Thread.sleep(1000);
        getPageAdminWeb().getAdminPageProfileDropdownButtons(adminPageProfileDropdownButtonsLocatorString).click();
    }

    @When("^\\[Web Admin Page]  User clicks on add user button$")
    public void clickOnAddUserTab() throws InterruptedException {
        Thread.sleep(3000);
        getPageAdminWeb().getAddUserTab().click();
    }

}
