package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

import java.util.Objects;

public class WebCallSchedulerPage extends Page {
    CommonFunctions commonFunctions = new CommonFunctions();
    String inputBoxLocatorString;
    String inputBoxData;

    @When("^\\[Web Scheduler Page] User clicks on (.*) dropdown$")
    public void userClicksOnSchedulerDropdowns(String schedulerSubtabDropdownsLocatorString) throws InterruptedException {
        Thread.sleep(1500);
        String dropdownLocatorPartString = null;
        if (Objects.equals(schedulerSubtabDropdownsLocatorString, "Who to call")) {
            String[] dropdownLocatorStringPart = schedulerSubtabDropdownsLocatorString.split(" ");
            String dropdownLocatorStringPart1 = dropdownLocatorStringPart[0];
            System.out.println(dropdownLocatorStringPart1);
            String dropdownLocatorStringPart2 = dropdownLocatorStringPart[1];
            System.out.println(dropdownLocatorStringPart2);
            String dropdownLocatorStringPart3 = dropdownLocatorStringPart[2];
            System.out.println(dropdownLocatorStringPart3);
            dropdownLocatorPartString = dropdownLocatorStringPart3 + "erList";
            System.out.println(dropdownLocatorPartString);
            getPageScheduler().getSchedulerDropdowns(dropdownLocatorPartString).click();
        }
        else getPageScheduler().getSchedulerDropdowns(schedulerSubtabDropdownsLocatorString).click();
    }

    @And("^\\[Web Scheduler Page] User clicks on (.*) option in list$")
    public void userClicksOnDropdownOptionInList(String schedulerSubtabDropdownOptionsLocatorString)throws InterruptedException {
        Thread.sleep(500);
        getPageScheduler().getSchedulerDropdownOption(schedulerSubtabDropdownOptionsLocatorString).click();
    }
    @And("^\\[Web Scheduler Page] User enters (.*) in the (.*) input box$")
    public void userEntersSchedulerDate$Time(String schedulerDate$TimeInputboxData, String schedulerDate$TimeLocatorString) throws InterruptedException {
        Thread.sleep(500);
        switch (schedulerDate$TimeLocatorString){
            case "Date":
                inputBoxLocatorString = "MM/DD/YYYY";
                inputBoxData = commonFunctions.todaysDateInMMDDYYYY();
            break;
            case "Time":
                inputBoxLocatorString = "HH:MM";
                inputBoxData = commonFunctions.currentTimeInHHMM();
            break;
        }
        getPageScheduler().getSchedulerDate$TimeInputs(inputBoxLocatorString).sendKeys(inputBoxData);
    }
    @And("^\\[Web Scheduler Page] User enters in the (.*) textbox (.*)$")
    public void userEntersSchedulerTextboxInputs(String schedulerSubtabInputboxLocatorString, String schedulerInputboxData) throws InterruptedException {
        Thread.sleep(500);
        System.out.println(inputBoxLocatorString);
        System.out.println(inputBoxData);
        getPageScheduler().getSchedulerInputBox(schedulerSubtabInputboxLocatorString).sendKeys(schedulerInputboxData);
    }

    @And("^\\[Web Scheduler Page] User clicks on (.*) button$")
    public void userClicksOnSchedulerButtons(String schedulerButtonLocatorString) throws InterruptedException {
        Thread.sleep(500);
        getPageScheduler().getSchedulerButtons(schedulerButtonLocatorString).click();
    }
    @Then("^\\[Web Scheduler Page] User should see a (.*) alert$")
    public void userSeesSchedulerSubtabSuccessAlert(String schedulerSavedSuccessfullyAlert) throws InterruptedException {
        Thread.sleep(3000);
        String savedSuccessfullyAlertLocatorInput = "MuiAlert-message') and contains(., '"+schedulerSavedSuccessfullyAlert;
        System.out.println(savedSuccessfullyAlertLocatorInput);
        Assert.assertTrue(getPageScheduler().getSchedulerSavedSuccessfullyAlert(savedSuccessfullyAlertLocatorInput).isDisplayed());
    }
}
