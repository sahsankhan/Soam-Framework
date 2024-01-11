package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageCaregiverStrainAssessmentWeb {

    public PageCaregiverStrainAssessmentWeb(Page page){
    }

    public WebElement getCGStrainsAssessmentHeadings(String headingsLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//span[contains(., '%s')]", headingsLocatorString)));
    }
    public WebElement getCGAssessmentDropdowns(String dropdownLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//div[@role='button' and contains(., '%s')]", dropdownLocatorString)));
    }
    public WebElement getCGAssessmentDropdownOptions(String dropdownOptionsLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//li[@role='option' and contains(., '%s')]", dropdownOptionsLocatorString)));
    }
    public WebElement getCGAssessmentOptionsRadioButton(String optionsRadioButtonLocatorString, String optionsRadioButtonLocatorString1){
        return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s'][value='%s']", optionsRadioButtonLocatorString,optionsRadioButtonLocatorString1)));
    }
    public WebElement getCGAssessmentButtons(String buttonsLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//button[contains(., '%s')]", buttonsLocatorString)));
    }
    public WebElement getCGStrainsAssessmentSuccessAlert(String successAlertLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//h3[contains(., '%s')]", successAlertLocatorString)));
    }
    public WebElement getCGAssessmentCloseIcon(){
        return WebConnector.driver.findElement(By.cssSelector(String.format("path[d='M19 6.41 17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z']")));
    }
    public WebElement getCGAssessmentIncompleteTag(String incompleteTagLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//p[contains(.,'%s')]", incompleteTagLocatorString)));
    }
}