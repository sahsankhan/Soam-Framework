package step_defination.web;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebOnboardingInfoPage extends Page {
    @Then("^\\[Web Onboarding Info Page] User should see the (.*) heading$")
    public void userSeesOnboardingInfoSubtabHeadings(String onboardingInfoSubtabHeadingLocatorInput) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageOnboardingInfo().getOnboardingInfoSubtabHeadings(onboardingInfoSubtabHeadingLocatorInput).isDisplayed());
    }
    @When("^\\[Web Onboarding Info Page] User clicks on (.*) subtab$")
    public void userClicksOnOnboardingInfoSubTabs(String onboardingInfoSubtabs) throws InterruptedException {
        Thread.sleep(2000);
        getPageOnboardingInfo().getOnboardingInfoSubTabs(onboardingInfoSubtabs).click();
    }
    @Then("^\\[Web Onboarding Info Page] User should see the provider info heading$")
    public void userSeesProviderInfoHeading() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageOnboardingInfo().getProviderInfoHeading().isDisplayed());
    }
}
