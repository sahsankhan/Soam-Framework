package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageMedicalInfoSubTabWeb {

    private String medicalHistoryHeadingCss = "form>div:nth-child(2) h4";

    public PageMedicalInfoSubTabWeb(Page page) {
    }
    public WebElement getMedicalHistoryHeading() {
        { return WebConnector.driver.findElement(By.cssSelector(medicalHistoryHeadingCss));}
    }
    public WebElement getMedicalInfoDropdowns(String medicalInfoPageDropdowns) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@id, '%s')]", medicalInfoPageDropdowns)));}
    }
    public WebElement getMedicalInfoDropdownOptions(String medicalInfoPageDropdownOptions) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//li[contains(., '%s')]", medicalInfoPageDropdownOptions)));}
    }
    public WebElement getMedicalInfoDateInputs(String medicalInfoDateInputs) {
        System.out.println("//input[contains(@id,'"+medicalInfoDateInputs+"')][contains(@placeholder, 'MM/DD/YYYY')]");
        {return WebConnector.driver.findElement(By.xpath(String.format("//input[contains(@id, '%s')][contains(@placeholder, 'MM/DD/YYYY')]", medicalInfoDateInputs)));}
    }
    public WebElement getMedicalInfoTextInputs(String medicalInfoTextInputs) {
//        System.out.println("input[id='"+medicalInfoTextInputs+"']");
        {return WebConnector.driver.findElement(By.cssSelector(String.format("input[id='%s']", medicalInfoTextInputs)));}
    }
    public WebElement getMedicalInfoButtons(String medicalInfoButtons) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//button[contains(., '%s')]", medicalInfoButtons)));}
    }
    public WebElement getMedicalInfoSavedSuccessfullyAlert(String medicalInfoSavedSuccessfullyAlert) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@class, '%s')]", medicalInfoSavedSuccessfullyAlert)));}
    }
}