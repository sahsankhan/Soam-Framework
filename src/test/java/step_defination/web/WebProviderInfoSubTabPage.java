package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import pages.Page;

public class WebProviderInfoSubTabPage extends Page {

    CommonFunctions commonFunctions = new CommonFunctions();
    @Then("^\\[Web Provider Info SubTab Page] User should see the doctor1 heading$")
    public void userSeesDoctor1Heading() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageProviderInfoSubTab().getDoctor1Heading().isDisplayed());
    }
    @And("^\\[Web Provider Info SubTab Page] User should see the dentist1 heading$")
    public void userSeesDentist1Heading() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageProviderInfoSubTab().getDentist1Heading().isDisplayed());
    }
    @When("^\\[Web Provider Info SubTab Page] User enters Doctor (.*) practice name (.*)$")
    public void userEntersDoctor1PracticeName(String doctorNumber, String doctor1PracticeName) throws InterruptedException {
        String doctorPracticeNameLocator = commonFunctions.providerInfoDoctorNumber(doctorNumber)+"[provider_name]";
        System.out.println(doctorPracticeNameLocator);
        Thread.sleep(1000);
        getPageProviderInfoSubTab().getDoctorNameInput(doctorPracticeNameLocator).sendKeys(doctor1PracticeName);
    }
    @And("^\\[Web Provider Info SubTab Page] User enters Doctor (.*) first name (.*)$")
    public void userEntersDoctor1FirstName(String doctorNumber, String doctor1FirstName) throws InterruptedException {
        String doctorFirstNameLocator = commonFunctions.providerInfoDoctorNumber(doctorNumber)+"[name.first_name]";
        System.out.println(doctorFirstNameLocator);
        Thread.sleep(1000);
        getPageProviderInfoSubTab().getDoctorNameInput(doctorFirstNameLocator).sendKeys(doctor1FirstName);
    }
    @And("^\\[Web Provider Info SubTab Page] User enters Doctor (.*) last name (.*)$")
    public void userEntersDoctor1LastName(String doctorNumber, String doctor1LastName) throws InterruptedException {
        String doctorLastNameLocator = commonFunctions.providerInfoDoctorNumber(doctorNumber)+"[name.last_name]";
        System.out.println(doctorLastNameLocator);
        Thread.sleep(1000);
        getPageProviderInfoSubTab().getDoctorNameInput(doctorLastNameLocator).sendKeys(doctor1LastName);
    }
    @And("^\\[Web Provider Info SubTab Page] User clicks on Doctor (.*) specialty dropdown$")
    public void userClicksOnDoctor1Specialty(String doctorNumber) throws InterruptedException {
        Thread.sleep(1000);
        String doctorSpecialityDropdownLocator = "mui-component-select-"+commonFunctions.providerInfoDoctorNumber(doctorNumber)+"[speciality]";
        System.out.println(doctorSpecialityDropdownLocator);
        getPageProviderInfoSubTab().getDoctorSpecialtyDropdown(doctorSpecialityDropdownLocator).click();
    }
    @And("^\\[Web Provider Info SubTab Page] User clicks on Doctor 1 speciality (.*)$")
    public void userClicksOnDoctorSpecialityChiropractor(String doctorSpeciality) throws InterruptedException {
        Thread.sleep(1000);
        getPageProviderInfoSubTab().getDoctor1SelectSpeciality(doctorSpeciality).click();
    }
    @And("^\\[Web Provider Info SubTab Page] User enters Doctor (.*) contact phone (.*)$")
    public void userEntersDoctor1ContactPhone(String doctorNumber, String doctor1ContactPhone) throws InterruptedException {
        String doctorContactLocator = commonFunctions.providerInfoDoctorNumber(doctorNumber)+"[contact_phone]";
        System.out.println(doctorContactLocator);
        Thread.sleep(500);
        String phoneNumber = commonFunctions.random5NumberSuffix(doctor1ContactPhone);
        getPageProviderInfoSubTab().getDoctorContact$EmailInput(doctorContactLocator).sendKeys(phoneNumber);
    }
    @And("^\\[Web Provider Info SubTab Page] User enters Doctor (.*) email address (.*)$")
    public void userEntersDoctor1EmailAddress (String doctorNumber, String doctor1EmailAddress) throws InterruptedException {
        String doctorEmailAddressLocator = commonFunctions.providerInfoDoctorNumber(doctorNumber)+"[email_address]";
        System.out.println(doctorEmailAddressLocator);
        Thread.sleep(500);
        String number = commonFunctions.random2NumberSuffix();
        getPageProviderInfoSubTab().getDoctorContact$EmailInput(doctorEmailAddressLocator).sendKeys(doctor1EmailAddress+number+"@vimient.com");
    }
    @And("^\\[Web Provider Info SubTab Page] User clicks on (.*) button$")
    public void userClicksOnProviderInfoAddDoctor$SaveButton (String providerInfoButtons) throws InterruptedException {
        Thread.sleep(1000);
        getPageProviderInfoSubTab().getProviderInfoButtons(providerInfoButtons).click();
    }

    @Then("^\\[Web Provider Info SubTab Page] User should see doctor2 heading$")
    public void userSeesDoctor2Heading() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageProviderInfoSubTab().getDoctor2Heading().isDisplayed());
    }
    @When("^\\[Web Provider Info SubTab Page] User enters Dentist (.*) practice name (.*)$")
    public void userEntersDentist1PracticeName(String dentistNumber, String dentist1PracticeName) throws InterruptedException {
        String dentistPracticeNameLocator = commonFunctions.providerInfoDentistNumber(dentistNumber)+"[provider_name]";
        System.out.println(dentistPracticeNameLocator);
        Thread.sleep(1000);
        getPageProviderInfoSubTab().getDentistNameInput(dentistPracticeNameLocator).sendKeys(dentist1PracticeName);
    }
    @And("^\\[Web Provider Info SubTab Page] User enters Dentist (.*) first name (.*)$")
    public void userEntersDentist1FirstName(String dentistNumber, String dentist1FirstName) throws InterruptedException {
        String dentistFirstNameLocator = commonFunctions.providerInfoDentistNumber(dentistNumber)+"[name.first_name]";
        System.out.println(dentistFirstNameLocator);
        Thread.sleep(500);
        getPageProviderInfoSubTab().getDentistNameInput(dentistFirstNameLocator).sendKeys(dentist1FirstName);
    }
    @And("^\\[Web Provider Info SubTab Page] User enters Dentist (.*) last name (.*)$")
    public void userEntersDentist1LastName(String dentistNumber,String dentist1LastName) throws InterruptedException {
        String dentistLastNameLocator = commonFunctions.providerInfoDentistNumber(dentistNumber)+"[name.last_name]";
        System.out.println(dentistLastNameLocator);
        Thread.sleep(500);
        getPageProviderInfoSubTab().getDentistNameInput(dentistLastNameLocator).sendKeys(dentist1LastName);
    }
    @And("^\\[Web Provider Info SubTab Page] User clicks on Dentist (.*) specialty dropdown$")
    public void userClicksOnDentist1SpecialtyDropdown(String dentistNumber) throws InterruptedException {
        Thread.sleep(1000);
        String dentistSpecialityDropdownLocator = "mui-component-select-"+commonFunctions.providerInfoDentistNumber(dentistNumber)+"[speciality]";
        System.out.println(dentistSpecialityDropdownLocator);
        getPageProviderInfoSubTab().getDentist1SpecialtyDropdown(dentistSpecialityDropdownLocator).click();
    }
    @And("^\\[Web Provider Info SubTab Page] User clicks on Dentist 1 speciality (.*)$")
    public void userClicksOnDentist1Endodontist(String dentistSpeciality) throws InterruptedException {
        Thread.sleep(500);
        getPageProviderInfoSubTab().getDentist1Endodontist(dentistSpeciality).click();
    }
    @And("^\\[Web Provider Info SubTab Page] User enters Dentist (.*) contact phone (.*)$")
    public void userEntersDentist1ContactPhone(String dentistNumber, String dentist1PhoneContact) throws InterruptedException {
        String dentistContactLocator = commonFunctions.providerInfoDentistNumber(dentistNumber)+"[contact_phone]";
        System.out.println(dentistContactLocator);
        Thread.sleep(500);
        getPageProviderInfoSubTab().getDentist1ContactPhone(dentistContactLocator).sendKeys(dentist1PhoneContact);
    }
    @And("^\\[Web Provider Info SubTab Page] User enters Dentist (.*) email address (.*)$")
    public void userEntersDentist1EmailAddress (String dentistNumber, String dentist1EmailAddress) throws InterruptedException {
        String dentistEmailAddressLocator = commonFunctions.providerInfoDentistNumber(dentistNumber)+"[email_address]";
        System.out.println(dentistEmailAddressLocator);
        Thread.sleep(500);
        getPageProviderInfoSubTab().getDentist1EmailAddress(dentistEmailAddressLocator).sendKeys(dentist1EmailAddress);
    }
    @And("^\\[Web Provider Info SubTab Page] User clicks on add dentist button$")
    public void userEntersDentist1EmailContact() throws InterruptedException {
        Thread.sleep(500);
        getPageProviderInfoSubTab().getAddDentistButton().click();
    }
    @Then("^\\[Web Provider Info SubTab Page] User should see dentist2 heading$")
    public void userSeesDentist2Heading() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageProviderInfoSubTab().getDentist2Heading().isDisplayed());
    }
//    @When("^\\[Web Provider Info SubTab Page] User clicks on Provider Info (.*) button$")
//    public void userClicksOnProviderInfoSaveButton(String providerInfoSaveButton) throws InterruptedException {
//        Thread.sleep(200);
//        getPageProviderInfoSubTab().getProviderInfoSaveButton(providerInfoSaveButton).click();
//    }
    @Then("^\\[Web Provider Info SubTab Page] User should see a (.*) alert$")
    public void userSeesProviderInfoPageSuccessAlert(String providerInfoSavedSuccessfullyAlert) throws InterruptedException {
        Thread.sleep(3000);
        String savedSuccessfullyAlertLocatorInput = "MuiAlert-message') and contains(., '"+providerInfoSavedSuccessfullyAlert;
        System.out.println(savedSuccessfullyAlertLocatorInput);
        Assert.assertTrue(getPageProviderInfoSubTab().getSavedSuccessfullyAlert(savedSuccessfullyAlertLocatorInput).isDisplayed());
    }
}
