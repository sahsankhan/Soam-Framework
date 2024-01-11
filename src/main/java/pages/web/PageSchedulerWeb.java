package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageSchedulerWeb {
    private String whoToCallDropdownXpath = "//*[@id=\"mui-component-select-callerList\"]";
    private String firstSeniorInListOfWhoToCallCss = "ul li:nth-child(2)";
    private String assignedCareAgentDropdownCss = "div:nth-child(12) div:nth-child(3) div div div";
    private String seniorZubairDogarCss = "ul li:nth-child(23)";
    private String callPriorityDropdownCss = "div:nth-child(13) div:nth-child(3) div div div";
    private String highCallPriorityCss = "ul li:nth-child(2)";
    private String callScheduledDateInputBoxCss = "div:nth-child(14) input";
    private String callScheduledTimeInputBoxCss = "div:nth-child(15) input";
    private String callDurationDropdownCss = "div:nth-child(16) div:nth-child(3) div div div";
    private String callDurationFirstOptionCss = "ul li:nth-child(2)";
    private String callReasonTextboxCss = "div:nth-child(17) input";
    private String callTypeDropdownCss = "div:nth-child(18) div:nth-child(3) div div div";
    private String callTypeFallDetectedCss = "ul li:nth-child(2)";
    private String callScheduleSubmitButtonXpath = "//*[@id=\"root\"]/div[1]/div/div/div[2]/form/div/div/div[2]";
    private String callScheduledSuccessAlertXpath = "//*[@id=\"root\"]/div[1]/div/div[2]";
    public PageSchedulerWeb(Page page) {
    }

    public WebElement getSchedulerDropdowns(String dropdownLocatorPartString) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@id, '%s')]", dropdownLocatorPartString)));}
    }
    public WebElement getSchedulerDate$TimeInputs(String schedulerDate$TimeLocatorString) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//input[@placeholder='%s']", schedulerDate$TimeLocatorString)));}
    }
    public WebElement getSchedulerDropdownOption(String schedulerSubtabDropdownOptionsLocatorString) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//li[contains(., '%s')]", schedulerSubtabDropdownOptionsLocatorString)));}
    }
    public WebElement getSchedulerInputBox(String schedulerSubtabDateInputLocatorString) {
        {return WebConnector.driver.findElement(By.cssSelector(String.format("input[id='%s']", schedulerSubtabDateInputLocatorString)));}
    }
    public WebElement getSchedulerButtons(String schedulerButtonLocatorString) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//button[contains(., '%s')]", schedulerButtonLocatorString)));}
    }
    public WebElement getSchedulerSavedSuccessfullyAlert(String savedSuccessfullyAlertLocatorInput) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@class, '%s')]", savedSuccessfullyAlertLocatorInput)));}
    }
}
