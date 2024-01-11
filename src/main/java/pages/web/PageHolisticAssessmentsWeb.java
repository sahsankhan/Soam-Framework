package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageHolisticAssessmentsWeb {

    public PageHolisticAssessmentsWeb(Page page) {
    }

    public WebElement getHolisticAssessmentTabHeadings(String assessmentsTabHeadingLocatorString) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//span[contains(., '%s')]", assessmentsTabHeadingLocatorString)));}
    }
    public WebElement getHolisticAssessmentRadioButtonOptions(String radioButtonOption, String radioButtonid) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s'][value='%s']", radioButtonid, radioButtonOption)));}
    }
    public WebElement getHolisticAssessmentButtons(String buttonLocatorString) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//button[contains(., '%s')]", buttonLocatorString)));}
    }
    public WebElement getHolisticAssessmentSuccessAlert(String successAlertLocatorString) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//h3[contains(., '%s')]", successAlertLocatorString)));}
    }
    public WebElement getAssessmentSidetabs(String assessmentsSidetabLocatorString) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//li[contains(., '%s')]", assessmentsSidetabLocatorString)));}
    }
    public WebElement getHolisticAssessmentCloseIcon() {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("path[d='M19 6.41 17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z']")));}
    }
    public WebElement getHolisticAssessmentIncompleteTag(String incompleteTagLocatorString) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//p[contains(., '%s')]", incompleteTagLocatorString)));}
    }
}
