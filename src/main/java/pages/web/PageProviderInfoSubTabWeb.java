package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageProviderInfoSubTabWeb {

    private String providerInfoSubTabCss = "#tab-1";
    private String doctor1HeadingCss = "form>div:nth-child(1) h4";
    private String dentist1HeadingCss = "form>div:nth-child(2) h4";
    private String doctor1SpecialtyDropdownXpath = "//*[@id=\"mui-component-select-doctor[0].[speciality]\"]";
    private String doctor1SelectChiropractorCss = "ul li:nth-child(7)";
    private String addDoctorButtonCss = "form > div:nth-child(1) button";
    private String doctor2HeadingCss = "form>div:nth-child(2) h4";
    private String dentist1SpecialtyDropdownXpath = "//*[@id=\"mui-component-select-dentist[0].[speciality]\"]";
    private String dentist1SelectEndodontistCss = "ul li:nth-child(3)";
    private String addDentistButtonCss = "form > div:nth-child(1) button";
    private String dentist2HeadingCss = "form > div:nth-child(2) h4";
    private String saveButtonCss = "form > div:nth-child(3) > button:nth-child(2)";
    private String providerInfoSavedSuccessfullyAlertXpath = "//*[@id=\"root\"]/div[1]";
    private String saveButtonXpath = "//button[contains(., 'Save')]";
    public PageProviderInfoSubTabWeb(Page page) {
    }
    public WebElement getDoctor1Heading() {
        { return WebConnector.driver.findElement(By.cssSelector(doctor1HeadingCss));}
    }
    public WebElement getDentist1Heading() {
        { return WebConnector.driver.findElement(By.cssSelector(dentist1HeadingCss));}
    }
    public WebElement getDoctorNameInput(String doctorNameInput) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", doctorNameInput)));}
    }
    public WebElement getDoctorSpecialtyDropdown(String doctorSpecialityDropdownLocator) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@id, '%s')]", doctorSpecialityDropdownLocator)));}
    }
    public WebElement getDoctor1SelectSpeciality(String doctorSpeciality) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("li[data-value='%s']", doctorSpeciality)));}
    }
    public WebElement getDoctorContact$EmailInput(String doctorContact$EmailInput) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", doctorContact$EmailInput)));}
    }
    public WebElement getProviderInfoButtons(String providerInfoButtons) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//button[contains(., '%s')]", providerInfoButtons)));}
    }
    public WebElement getDoctor2Heading() {
        { return WebConnector.driver.findElement(By.cssSelector(doctor2HeadingCss));}
    }
    public WebElement getDentistNameInput(String dentistNameInput) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", dentistNameInput)));}
    }
    public WebElement getDentist1SpecialtyDropdown(String dentistSpecialityDropdownLocator) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@id, '%s')]", dentistSpecialityDropdownLocator)));}
    }
    public WebElement getDentist1Endodontist(String dentistSpeciality) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("li[data-value='%s']", dentistSpeciality)));}
    }
    public WebElement getDentist1ContactPhone(String dentistContactLocator) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", dentistContactLocator)));}
    }
    public WebElement getDentist1EmailAddress(String dentistEmailAddressLocator) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", dentistEmailAddressLocator)));}
    }
    public WebElement getAddDentistButton() {
        { return WebConnector.driver.findElement(By.cssSelector(addDentistButtonCss));}
    }
    public WebElement getDentist2Heading() {
        { return WebConnector.driver.findElement(By.cssSelector(dentist2HeadingCss));}
    }
    public WebElement getSavedSuccessfullyAlert(String providerInfoSavedSuccessfullyAlert) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@class, '%s')]", providerInfoSavedSuccessfullyAlert)));}
    }
}