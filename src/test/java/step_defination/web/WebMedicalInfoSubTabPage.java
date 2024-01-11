package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebMedicalInfoSubTabPage extends Page {

    CommonFunctions commonFunctions = new CommonFunctions();
    @Then("^\\[Web Medical Info SubTab Page] User should see the medical history heading$")
    public void userSeesDoctor1Heading() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageMedicalInfoSubTab().getMedicalHistoryHeading().isDisplayed());
    }
    @When("^\\[Web Medical Info SubTab Page] User clicks on (.*) dropdown$")
    public void userClicksOnMedicalInfoDropdowns(String medicalInfoPageDropdowns) throws InterruptedException {
        Thread.sleep(2000);
        String dropdownLocatorInput = "";
        switch (medicalInfoPageDropdowns){
            case "With or without food": dropdownLocatorInput = "food";
            break;
            default: dropdownLocatorInput = medicalInfoPageDropdowns;
            break;
        }
        getPageMedicalInfoSubTab().getMedicalInfoDropdowns(dropdownLocatorInput).click();
    }
    @And("^\\[Web Medical Info SubTab Page] User clicks on (.*) option$")
    public void userClicksOnMedicalInfoPageDropdownOptions(String medicalInfoPageDropdownOptions) throws InterruptedException {
        Thread.sleep(1000);
        getPageMedicalInfoSubTab().getMedicalInfoDropdownOptions(medicalInfoPageDropdownOptions).click();
    }
    @When("^\\[Web Medical Info SubTab Page] User enters today's date in (.*)$")
    public void userEntersMedicalInfoDateInputs(String medicalInfoDateInputs) throws InterruptedException {
        Thread.sleep(3000);
        String dateLocatorInput = "";
        switch (medicalInfoDateInputs) {
            case "Date Implemented":    dateLocatorInput = "mui-3";
            break;
            case "Last Physical Exam":  dateLocatorInput = "mui-4";
            break;
            case "Exam date":           dateLocatorInput = "mui-5";
            break;
            case "Injury date":         dateLocatorInput = "mui-6";
            break;
            case "Vaccines date":       dateLocatorInput = "mui-7";
            break;
            case "Date Diagnosed":      dateLocatorInput = "mui-8";
            break;
            case "Usage Date":          dateLocatorInput = "mui-9";
            break;
            case "Date Prescribed":     dateLocatorInput = "mui-10";
            break;
            case "Refill Date":         dateLocatorInput = "mui-11";
            break;
        }
        String dateInput = commonFunctions.todaysDateInMMDDYYYY();
        getPageMedicalInfoSubTab().getMedicalInfoDateInputs(dateLocatorInput).sendKeys(dateInput);
    }
    @And("^\\[Web Medical Info SubTab Page] User enters (.*) in (.*) input box$")
    public void userEntersMedicalInfoTextInputs(String medicalInfoText, String medicalInfoTextInputs) throws InterruptedException {
        Thread.sleep(1000);
        getPageMedicalInfoSubTab().getMedicalInfoTextInputs(medicalInfoTextInputs).sendKeys(medicalInfoText);
    }
    @And("^\\[Web Medical Info SubTab Page] User clicks on (.*) button$")
    public void userClicksOnMedicalInfoPageButtons(String medicalInfoButtonsLocatorInput) throws InterruptedException {
        Thread.sleep(3000);
        getPageMedicalInfoSubTab().getMedicalInfoButtons(medicalInfoButtonsLocatorInput).click();
    }
    @Then("^\\[Web Medical Info SubTab Page] User should see a (.*) alert$")
    public void userSeesMedicalInfoSubtabSuccessAlert(String medicalInfoSavedSuccessfullyAlert) throws InterruptedException {
        Thread.sleep(5000);
        String savedSuccessfullyAlertLocatorInput = "MuiAlert-message') and contains(., '"+medicalInfoSavedSuccessfullyAlert;
        System.out.println(savedSuccessfullyAlertLocatorInput);
        Assert.assertTrue(getPageMedicalInfoSubTab().getMedicalInfoSavedSuccessfullyAlert(savedSuccessfullyAlertLocatorInput).isDisplayed());
    }
}