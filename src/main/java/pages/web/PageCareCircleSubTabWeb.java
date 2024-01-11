package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageCareCircleSubTabWeb {

    public PageCareCircleSubTabWeb(Page page){

    }

    public WebElement getCareCircleHeadings(String careCirclePageHeadingsString) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//h4[contains(., '%s')]", careCirclePageHeadingsString)));}
    }
    public WebElement getCareCircleContact1TextboxInputs(String careCircleTextboxInputLocatorString) {
        {return WebConnector.driver.findElement(By.cssSelector(String.format("input[id='%s']", careCircleTextboxInputLocatorString)));}
    }
    public WebElement getCareCircleDropdowns(String careCircleDropdownLocatorString) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@id, '%s')]", careCircleDropdownLocatorString)));}
    }
    public WebElement getCareCircleDropdownOptions(String careCircleDropdownOptionLocatorString) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//li[contains(., '%s')]", careCircleDropdownOptionLocatorString)));}
    }
    public WebElement getCareCircleRadioButtons(String careCircleRadioButtonsLocatorString) {
        {return WebConnector.driver.findElement(By.cssSelector(String.format("input[value='%s']", careCircleRadioButtonsLocatorString)));}
    }
    public WebElement getCareCircleCheckBoxes(String careCircleCheckBoxesLocatorString) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//input[contains(@name, '%s')]", careCircleCheckBoxesLocatorString)));}
    }
    public WebElement getCareCircleButtons(String careCircleButtonsLocatorString) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//button[contains(., '%s')]", careCircleButtonsLocatorString)));}
    }
    public WebElement getCareCircleSavedSuccessfullyAlert(String savedSuccessfullyAlertLocatorString) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@class, '%s')]", savedSuccessfullyAlertLocatorString)));}
    }
}