package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageLawtonBrodyADLWeb {

    public PageLawtonBrodyADLWeb(Page page){
    }

    public WebElement getLawtonBrodyADLsubtabHeadings(String lawtonBrodyADLsubtabHeadingLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//span[contains(., '%s')]", lawtonBrodyADLsubtabHeadingLocatorString)));
    }
    public WebElement getLawtonBrodyADLOptionsRadioButtons(String radioButtonOption) {
        return WebConnector.driver.findElement(By.cssSelector(String.format("span[datatestid='%s']", radioButtonOption)));
    }
    public WebElement getLawtonBrodyADLButtons(String buttonLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//button[contains(., '%s')]", buttonLocatorString)));
    }
    public WebElement getLawtonBrodyADLSuccessAlerts(String successAlertsLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//h3[contains(., '%s')]", successAlertsLocatorString)));
    }
    public WebElement getLawtonBrodyADLCloseIcon(){
            return WebConnector.driver.findElement(By.cssSelector(String.format("path[d='M19 6.41 17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z']")));
    }
    public WebElement getLawtonBrodyADLIncompleteTag(String successAlertsLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//p[contains(., '%s')]", successAlertsLocatorString)));
    }
}