package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import pages.Page;

import java.util.Objects;

public class WebCareCircleSubTabPage extends Page {

    CommonFunctions commonFunctions = new CommonFunctions();
    @Then("^\\[Web Care Circle SubTab Page] User should see the (.*) heading$")
    public void userSeesContact1Heading(String careCirclePageHeadingsString) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(getPageCareCircleSubTab().getCareCircleHeadings(careCirclePageHeadingsString).isDisplayed());
    }
    @When("^\\[Web Care Circle SubTab Page] User enters (.*) in (.*) input box in contact 1$")
    public void userEntersCareCircleContact1TextInputs(String textboxInput, String textboxInputLocatorString) throws InterruptedException {
        Thread.sleep(500);
//        String lowerCaseTextboxInputLocatorString = "caregivers[0].[basic_info."+commonFunctions.replaceSpaceWithUnderscore(textboxInputLocatorString)+"]";
//        System.out.println(lowerCaseTextboxInputLocatorString);
        if(Objects.equals(textboxInputLocatorString, "Mobile Phone")) {
            String randomNumbers = RandomStringUtils.randomNumeric(5);
            String mobileNo = textboxInput + randomNumbers;
            getPageCareCircleSubTab().getCareCircleContact1TextboxInputs(textboxInputLocatorString).sendKeys(mobileNo);
        }
        getPageCareCircleSubTab().getCareCircleContact1TextboxInputs(textboxInputLocatorString).sendKeys(textboxInput);
    }
    @And("^\\[Web Care Circle SubTab Page] User clicks on (.*) dropdown$")
    public void userClicksOnCareCircleDropdowns(String dropdownLocatorString) throws InterruptedException {
        Thread.sleep(700);
        getPageCareCircleSubTab().getCareCircleDropdowns(dropdownLocatorString).click();
    }
    @And("^\\[Web Care Circle SubTab Page] User clicks on (.*) option$")
    public void userClicksOnCareCircleDropdownOptions(String dropdownOptionLocatorString) throws InterruptedException {
        Thread.sleep(400);
        getPageCareCircleSubTab().getCareCircleDropdownOptions(dropdownOptionLocatorString).click();
    }
    @And("^\\[Web Care Circle SubTab Page] User clicks on (.*) contact radioButton$")
    public void clickOnCareCircleRadioButtons(String radioButtonLocatorString) throws InterruptedException {
        Thread.sleep(500);
        String[] radioButtonLocatorInputParts = radioButtonLocatorString.split(" ");
        String radioButtonLocatorInputFirstPart = radioButtonLocatorInputParts[0];
        System.out.println(radioButtonLocatorInputFirstPart);
        getPageCareCircleSubTab().getCareCircleRadioButtons(radioButtonLocatorInputFirstPart).click();
    }
    @And("^\\[Web Care Circle SubTab Page] User clicks on (.*) check box$")
    public void userClicksOnCheckBoxes(String checkBoxLocatorString) throws InterruptedException {
        Thread.sleep(500);
        getPageCareCircleSubTab().getCareCircleCheckBoxes(checkBoxLocatorString).click();
    }
    @And("^\\[Web Care Circle SubTab Page] User clicks on (.*) button$")
    public void userClicksOnCareCircleButtons(String buttonLocatorString) throws InterruptedException {
        Thread.sleep(500);
        getPageCareCircleSubTab().getCareCircleButtons(buttonLocatorString).click();
    }
    @Then("^\\[Web Care Circle SubTab Page] User should see a (.*) alert$")
    public void userSeesCareCircleSubtabSuccessAlert(String careCircleSavedSuccessfullyAlert) throws InterruptedException {
        Thread.sleep(3000);
        String savedSuccessfullyAlertLocatorString = "MuiAlert-message') and contains(., '"+careCircleSavedSuccessfullyAlert;
        System.out.println(savedSuccessfullyAlertLocatorString);
        Assert.assertTrue(getPageCareCircleSubTab().getCareCircleSavedSuccessfullyAlert(savedSuccessfullyAlertLocatorString).isDisplayed());
    }
//    @When("^\\[Web Care Circle SubTab Page] User enters (.*) in (.*) input box in contact 2$")
//    public void userEntersCareCircleContact2TextInputs(String textboxInput, String textboxInputLocatorString) throws InterruptedException {
//        Thread.sleep(500);
//        if(Objects.equals(textboxInputLocatorString, "Mobile Phone")) {
//            String randomNumbers = RandomStringUtils.randomNumeric(5);
//            String mobileNo = textboxInput + randomNumbers;
//            getPageCareCircleSubTab().getCareCircleContac1TextboxInputs(textboxInputLocatorString).sendKeys(mobileNo);
//        }
//        getPageCareCircleSubTab().getCareCircleTextboxInputs(textboxInputLocatorString).sendKeys(textboxInput);
//    }
}