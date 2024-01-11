package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import pages.Page;

import java.util.Random;

public class WebAddSeniorPage extends Page {
//    Random randomGenerator = new Random();
    CommonFunctions commonFunctions = new CommonFunctions();
    @When("^\\[Web Add Senior Page] User enters in (.*) inputbox (.*)$")
    public void userEntersAddUserPageInputboxes(String addUserPageInputboxLocatorString, String addUserPageInputboxData) throws InterruptedException {
        Thread.sleep(1000);
        switch (addUserPageInputboxLocatorString) {
            case "Last Name":
                String suffixNumber = RandomStringUtils.randomNumeric(2);
                String last_Name_with_suffixNumber = addUserPageInputboxData + suffixNumber;
                System.out.println(last_Name_with_suffixNumber);
                getPageAddSenior().getAddUserPageInputboxes(addUserPageInputboxLocatorString).sendKeys(last_Name_with_suffixNumber);
                break;

            case "Mobile Phone":
                String randomNumbers = RandomStringUtils.randomNumeric(5);
                String mobileNo = addUserPageInputboxData+randomNumbers;
                getPageAddSenior().getAddUserPageInputboxes(addUserPageInputboxLocatorString).sendKeys(mobileNo);
                break;

            case "Date of Birth":
                String dateOfBirthLocatorString = "MM/DD/YYYY";
                getPageAddSenior().getAddUserPageInputboxes(dateOfBirthLocatorString).sendKeys(addUserPageInputboxData);
                break;

            case "Email":
                int randomInt = commonFunctions.randomEmialSuffix();
                String randomNumberString = String.valueOf(randomInt);
                getPageAddSenior().getAddUserPageInputboxes(addUserPageInputboxLocatorString).sendKeys(addUserPageInputboxData + randomNumberString +"@vimient.com");
                break;

            default:
                getPageAddSenior().getAddUserPageInputboxes(addUserPageInputboxLocatorString).sendKeys(addUserPageInputboxData);
                break;
        }
    }
    @When("^\\[Web Add Senior Page] User clicks on (.*) dropdown$")
    public void userClicksOnAddUserDropdowns(String addUserDropdownLocatorString) throws InterruptedException {
        Thread.sleep(1000);
        getPageAddSenior().getAddUserDropdowns(addUserDropdownLocatorString).click();
    }
    @When("^\\[Web Add Senior Page] User clicks on (.*) dropdown option$")
    public void userClicksOnAddUserDropdownOptions(String addUserDropdownOptionLocatorString) throws InterruptedException {
        Thread.sleep(1000);
        getPageAddSenior().getAddUserDropdownOptions(addUserDropdownOptionLocatorString).click();
    }
    @And("^\\[Web Add Senior Page] User clicks on (.*) button$")
    public void clickOnAddUserButtons(String addUserButtonLocatorString) throws InterruptedException {
        Thread.sleep(3000);
        getPageAddSenior().getAddUserButtons(addUserButtonLocatorString).click();
    }
    @Then("^\\[Web Add Senior Page] User should see the (.*) alert message in green below$")
    public void userShouldSeeAccountCreatedSuccessAlert(String addUserSuccessAlertLocatorString) throws InterruptedException {
        Thread.sleep(3000);
//        String addUserSuccessAlertLocatorString1 = "MuiAlert-message";
        Assert.assertTrue(getPageAddSenior().getAccountCreatedSuccessAlert(addUserSuccessAlertLocatorString).isDisplayed());
    }
}
